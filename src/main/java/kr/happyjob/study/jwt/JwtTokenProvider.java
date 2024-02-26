package kr.happyjob.study.jwt;

import io.jsonwebtoken.Claims;
import io.jsonwebtoken.ExpiredJwtException;
import io.jsonwebtoken.JwtException;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.io.Decoders;
import io.jsonwebtoken.security.Keys;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import javax.crypto.SecretKey;
import java.util.Date;

@Component
public class JwtTokenProvider {

    private final SecretKey key;

    private final long expireTime;

    public JwtTokenProvider(@Value("${jwt.token.secret-key}") final String secretKey,
                            @Value("${jwt.token.expire-time}") final long expireTime ) {
        this.key = Keys.hmacShaKeyFor(Decoders.BASE64.decode(secretKey));

        this.expireTime = expireTime;
    }



    public String createToken(final String subject) {
        Date nowDate = new Date();
        Date expireDate = new Date(nowDate.getTime() + expireTime);
        return Jwts.builder()
                .subject(subject)
                .issuedAt(nowDate)
                .expiration(expireDate)
                .signWith(key)
                .compact();
    }


    public boolean isValidToken(final String token) {
        try {
            Jwts.parser()
                    .verifyWith(key)
                    .build()
                    .parseSignedClaims(token);
            return true;
        } catch (ExpiredJwtException e ) {
            // 만료된 토큰
            return false;
        } catch (JwtException e) {
            e.printStackTrace();
            throw new IllegalStateException("올바른 토큰이 아닙니다");
        }
    }

    private Claims extractPayload(String token) {
        return Jwts.parser()
                .verifyWith(key)
                .build()
                .parseSignedClaims(token)
                .getPayload();
    }

    public String extractSubject(String token) {
        return this.extractPayload(token).getSubject();
    }

    public String extractIssuer(String token) {
        return this.extractPayload(token).getIssuer();
    }

    public Object extractClaim(String token, String key) {
        return this.extractPayload(token).get(key);
    }

}
