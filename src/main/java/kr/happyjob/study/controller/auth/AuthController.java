package kr.happyjob.study.controller.auth;

import kr.happyjob.study.service.auth.AuthServiceImpl;
import kr.happyjob.study.vo.contents.ContentsModel;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AuthController {
	
	// Set logger
	private final Logger logger = LogManager.getLogger(this.getClass());

	@Autowired
	private AuthServiceImpl authService;
	
	// 리스트 출력
	@PostMapping("/auth/test")
	public String authTest(ContentsModel params) {

		System.out.println("테스트 @@@@@@@@@@@@@@@@@@@@@@@@@" + params);
		return "hello world!!!";
	}
	

}