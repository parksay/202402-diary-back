package kr.happyjob.study.repository.main;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import kr.happyjob.study.vo.main.request.CalendarRequest;
import kr.happyjob.study.vo.main.request.ContentRequest;
import kr.happyjob.study.vo.main.response.CalendarVo;

@Mapper
public interface MainMapper {
	// 메인 캘린더 조회
	List<CalendarVo> calendarList(CalendarRequest params);
	// 메인 최근작성글 조회
	List<CalendarVo> contentsList(ContentRequest params);
}
