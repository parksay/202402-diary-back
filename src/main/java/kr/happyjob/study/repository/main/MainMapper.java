package kr.happyjob.study.repository.main;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import kr.happyjob.study.vo.main.request.CalendarRequest;
import kr.happyjob.study.vo.main.response.CalendarVo;

@Mapper
public interface MainMapper {
	List<CalendarVo> calendarList(CalendarRequest params);
}
