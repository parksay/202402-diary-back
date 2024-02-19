package kr.happyjob.study.repository.contents;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;

import kr.happyjob.study.vo.contents.ContentsModel;

@Mapper
public interface ContentsMapper {
		
	// 공지사항 리스트 조회
	public List<ContentsModel> contentsList(Map<String, Object> paramMap)throws Exception ;
	
	// 공지사항 목록 카운트 조회
	public int contentsCnt(Map<String, Object> paramMap)throws Exception ;
	
	/*
	 * // 공지사항 단건 조회 public NoticeModel noticeDetail(Map<String, Object>
	 * paramMap)throws Exception ;
	 * 
	 * // 공지사항 저장 public int insertNotice(Map<String, Object> paramMap) throws
	 * Exception;
	 * 
	 * // 공지사항 수정 public int updateNotice(Map<String, Object> paramMap) throws
	 * Exception;
	 * 
	 * // 공지사항 삭제 public int deleteNotice(Map<String, Object> paramMap) throws
	 * Exception;
	 */	
	}


