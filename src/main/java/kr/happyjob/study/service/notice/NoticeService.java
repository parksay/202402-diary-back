package kr.happyjob.study.service.notice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kr.happyjob.study.repository.notice.NoticeMapper;

@Service
public class NoticeService {
	
	@Autowired
	private NoticeMapper noticeMapper;
	

}
