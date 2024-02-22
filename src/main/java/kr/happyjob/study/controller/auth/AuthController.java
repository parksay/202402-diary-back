package kr.happyjob.study.controller.auth;

import kr.happyjob.study.service.auth.AuthServiceImpl;
import kr.happyjob.study.jwt.JwtTokenProvider;
import kr.happyjob.study.vo.auth.UserinfoModel;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/api")
public class AuthController {
	
	// Set logger
	private final Logger logger = LogManager.getLogger(this.getClass());

	@Autowired
	private AuthServiceImpl authService;

	@Autowired
	private JwtTokenProvider jwtProvider;



	@GetMapping("/auth/test")
	public String authGetTest() {
		System.out.println("###################################### auth get 테스트 #########################################");
		return "hello world!!!";
	}

	@PostMapping("/auth/test")
	public String authPostTest() {
		System.out.println("###################################### auth post 테스트 #########################################");
		return "hello world!!!";
	}

	@PostMapping("/auth/login")
	public Map<String,Object> authLogin(@RequestBody Map<String,String> param) {
		Map<String,Object> resultMap = new HashMap<>();
		String loginID = param.get("loginID");
		String password = param.get("password");
		try {
			UserinfoModel user = authService.login(loginID, password);
			if(user != null) {
				resultMap.put("accessToken", jwtProvider.createToken(user.getName()));
				resultMap.put("refreshToken", "hello world");
				resultMap.put("memberSeq", user.getMemberSeq());
				resultMap.put("loginID", user.getLoginID());
				resultMap.put("name", user.getName());
				resultMap.put("result", true);
				resultMap.put("expireTime", new Date());
				return resultMap;
			}
		} catch (Exception e) {
			logger.debug(e);
		}
		resultMap.put("result", false);
		return resultMap;
	}


}