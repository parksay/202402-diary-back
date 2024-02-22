package kr.happyjob.study.service.main;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kr.happyjob.study.repository.main.MainMapper;
import kr.happyjob.study.vo.main.request.CalendarRequest;
import kr.happyjob.study.vo.main.request.ContentRequest;
import kr.happyjob.study.vo.main.response.CalendarVo;

@Service
public class MainService {
	
	@Autowired
	MainMapper mainMapper;

	public List<CalendarVo> calendarList(CalendarRequest params) {
		List<CalendarVo> calendarList = mainMapper.calendarList(params);
		return calendarList;
	}

	public List<CalendarVo> contentsList(ContentRequest params) {
		List<CalendarVo> contentsList = mainMapper.contentsList(params);
		return contentsList;
	}


}
