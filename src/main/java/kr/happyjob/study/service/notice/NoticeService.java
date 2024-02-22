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
	public NoticeVO oneNotice(int notice_seq){
		return noticeMapper.oneNotice(notice_seq);
	}
	public Integer maxSEQ(){
		return noticeMapper.maxSEQ();
	}
	public Integer minSEQ(){
		return noticeMapper.minSEQ();
	}
	public int count(){
		return noticeMapper.count();
	}
	public int noticeWrite(NoticeVO param){
		return noticeMapper.noticeWrite(param);
	}
	public int noticeUpdate(NoticeVO param){
		return noticeMapper.noticeUpdate(param);
	}
	public int noticeDelete(NoticeVO param){
		return noticeMapper.noticeDelete(param);
	}
}
