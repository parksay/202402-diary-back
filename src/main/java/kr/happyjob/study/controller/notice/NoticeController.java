package kr.happyjob.study.controller.notice;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
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
		return list;
	}

	@PostMapping("/api/oneNotice")
	public NoticeVO oneNotice(@RequestBody NoticeVO param){
		int notice_seq=param.getNotice_seq();
		NoticeVO oneNotices = service.oneNotice(notice_seq);
		return oneNotices;
	}
	
	@PostMapping("/api/maxSEQ")
	public Integer maxSEQ(){
		int result;
		if(service.maxSEQ() == null) {
			result = 0;
		}else {
			result = service.maxSEQ();
		}
		return result;
	}
	
	@PostMapping("/api/minSEQ")
	public Integer minSEQ(){
		int result;
		if(service.maxSEQ() == null) {
			result = 0;
			System.out.println(service.minSEQ());
			System.out.println(result);
		}else {
			result = service.minSEQ();
			System.out.println(result);
		}
		return result;
	}
	
	@PostMapping("/api/count")
	public int count(){
		int result = service.count();
		return result;
	}

	@PostMapping("/api/noticeWrite")
	public int noticeWrite(@RequestBody NoticeVO param){
		int result = service.noticeWrite(param);
		return result;
	}

	@PostMapping("/api/noticeUpdate")
	public int noticeUpdate(@RequestBody NoticeVO param){
		int result = service.noticeUpdate(param);
		return result;
	}

	@PostMapping("/api/noticeDelete")
	public int noticeDelete(@RequestBody NoticeVO param){
		int result = service.noticeDelete(param);
		return result;
	}

}