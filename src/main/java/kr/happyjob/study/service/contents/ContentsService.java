package kr.happyjob.study.service.contents;

import java.util.List;
import java.util.Map;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kr.happyjob.study.repository.contents.ContentsMapper;
import kr.happyjob.study.vo.contents.ContentsModel;

@Service
public class ContentsService {
	
	// Set logger
	private final Logger logger = LogManager.getLogger(this.getClass());

	// Get class name for logger
	private final String className = this.getClass().toString();
	   
	@Autowired
	private ContentsMapper contentsMapper;
	
	public List<ContentsModel> contentsList(Map<String, Object> paramMap) throws Exception{
		return contentsMapper.contentsList(paramMap);
	}

	public int contentsCnt(Map<String, Object> paramMap) throws Exception {
		return contentsMapper.contentsCnt(paramMap);
	}
	
	/*
	 * // 공지사항 단건 조회 public NoticeModel noticeDetail(Map<String, Object>
	 * paramMap)throws Exception{ return noticeMapper.noticeDetail(paramMap); }
	 * 
	 * // 공지사항 저장 public int insertNotice(Map<String, Object> paramMap) throws
	 * Exception{ return noticeMapper.insertNotice(paramMap); }
	 * 
	 * // 공지사항 수정 public int updateNotice(Map<String, Object> paramMap) throws
	 * Exception{ return noticeMapper.updateNotice(paramMap); }
	 * 
	 * // 공지사항 삭제 public int deleteNotice(Map<String, Object> paramMap) throws
	 * Exception{ return noticeMapper.deleteNotice(paramMap); }
	 */

}
