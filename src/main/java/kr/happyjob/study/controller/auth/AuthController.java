package kr.happyjob.study.controller.auth;

import kr.happyjob.study.service.auth.AuthServiceImpl;
import kr.happyjob.study.service.auth.JwtTokenProvider;
import kr.happyjob.study.vo.auth.UserinfoModel;
import kr.happyjob.study.vo.contents.ContentsModel;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
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
				resultMap.put("token", jwtProvider.createToken(user.getName()));
				resultMap.put("result", true);
			}
			System.out.println("resultMap = " + resultMap);
			return resultMap;
		} catch (Exception e) {
			resultMap.put("result", false);
			System.out.println("resultMap = " + resultMap);
			return resultMap;
		}
	}


}