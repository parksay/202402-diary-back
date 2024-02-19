package kr.happyjob.study.controller.notice;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import kr.happyjob.study.service.notice.NoticeService;

@Controller
public class NoticeController {
	

	@Autowired
	private NoticeService service;

	

}