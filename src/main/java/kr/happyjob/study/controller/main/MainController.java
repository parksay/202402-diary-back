package kr.happyjob.study.controller.main;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import kr.happyjob.study.service.main.MainService;
import kr.happyjob.study.vo.main.request.CalendarRequest;
import kr.happyjob.study.vo.main.request.ContentRequest;
import kr.happyjob.study.vo.main.response.CalendarVo;

@RestController
public class MainController {
 
	@Autowired
	MainService mainService;
	
	// 회원별 캘린더 조회 
	@PostMapping("/api/calendarList")
	public List<CalendarVo> calendarList(@RequestBody CalendarRequest params) {
		List<CalendarVo> calendarList = mainService.calendarList(params);
		return calendarList;
	}
	
	// 회원별 캘린더 조회 
	@PostMapping("/api/main/contentsList")
	public List<CalendarVo> contentsList(@RequestBody ContentRequest params) {
		List<CalendarVo> contentsList = mainService.contentsList(params);
		return contentsList;
	}
}
