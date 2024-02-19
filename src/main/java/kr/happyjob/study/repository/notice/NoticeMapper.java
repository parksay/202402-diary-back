package kr.happyjob.study.repository.notice;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import kr.happyjob.study.vo.notice.NoticeVO;


@Mapper
public interface NoticeMapper {
	List<NoticeVO> noticeList();
}

