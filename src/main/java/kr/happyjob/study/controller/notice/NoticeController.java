package kr.happyjob.study.controller.notice;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import kr.happyjob.study.service.notice.NoticeService;
import kr.happyjob.study.vo.notice.NoticeVO;

@RestController
public class NoticeController {
	

	@Autowired
	private NoticeService service;

	@PostMapping("/api/noticePage")
	public List<NoticeVO> noticePage(){
		List<NoticeVO> list = service.noticeList();
		System.out.println(list + "+++++++++");
		return list;
	}

}