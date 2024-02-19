package kr.happyjob.study.service.notice;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kr.happyjob.study.repository.notice.NoticeMapper;
import kr.happyjob.study.vo.notice.NoticeVO;

@Service
public class NoticeService {
	
	@Autowired
	private NoticeMapper noticeMapper;
	
	public List<NoticeVO> noticeList(){
		return noticeMapper.noticeList();
	}
}
