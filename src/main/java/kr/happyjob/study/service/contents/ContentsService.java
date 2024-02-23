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

	public int contentsCnt(Map<String, Object> paramMap) throws Exception {
		return contentsMapper.contentsCnt(paramMap);
	}

	public ContentsModel contentsDetail(ContentsModel params) {
		return contentsMapper.contentsDetail(params);
	}

	public int insertContents(Map<String, Object> paramMap) {
		return contentsMapper.insertContents(paramMap);		
	}

	public int updateContents(Map<String, Object> paramMap) {
		return contentsMapper.updateContents(paramMap);				
	}

	public int deleteContents(Map<String, Object> paramMap) {
		return contentsMapper.deleteContents(paramMap);					
	}

}
