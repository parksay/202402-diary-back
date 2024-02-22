package kr.happyjob.study.service.auth;


import kr.happyjob.study.repository.auth.AuthMapper;
import kr.happyjob.study.vo.auth.UserinfoModel;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class AuthServiceImpl {
    private final Logger logger = LogManager.getLogger(this.getClass());

    @Autowired
    private AuthMapper authMapper;


    public UserinfoModel getUserinfo(Long memberSeq) {
        return this.authMapper.getUserinfo(memberSeq);
    }

    public List<UserinfoModel> getUserinfoList(Map<String, Object> paramMap) {
        return this.authMapper.getUserinfoList(paramMap);
    }


    public UserinfoModel getUserinfoByLoginID(String loginID) {
        return this.authMapper.getUserinfoByLoginID(loginID);
    }

    public void updateUserinfo(UserinfoModel user) {
        this.authMapper.updateUserinfo(user);
    }

    public void insertUserinfo(UserinfoModel user) {
        this.authMapper.insertUserinfo(user);
    }

    public void deleteUserinfo(Long memberSeq) {
        this.authMapper.deleteUserinfo(memberSeq);
    }


    public UserinfoModel login(String loginID, String password) {
        UserinfoModel result = null;
        try{
            UserinfoModel user = this.authMapper.getUserinfoByLoginID(loginID);
            System.out.println("user = " + user);
            if(password != null && password.equals(user.getPassword())) {
                result = user;
            }
        } catch (Exception e) {
            System.out.println("############################### login catch ##########################");
            logger.debug(e);
        }
        return result;
    }


}
