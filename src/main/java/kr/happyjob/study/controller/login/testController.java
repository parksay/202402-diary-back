package kr.happyjob.study.controller.login;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class testController {
	
	@PostMapping("/api/test")
	public String test() {
		return "테스트 성공";
	}
}
