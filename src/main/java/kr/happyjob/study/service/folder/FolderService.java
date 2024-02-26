package kr.happyjob.study.service.folder;

import java.util.List;
import java.util.Map;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kr.happyjob.study.repository.folder.FolderMapper;
import kr.happyjob.study.vo.folder.FolderChildModel;
import kr.happyjob.study.vo.folder.FolderModel;

@Service
public class FolderService {
	
	// Set logger
	private final Logger logger = LogManager.getLogger(this.getClass());

	// Get class name for logger
	private final String className = this.getClass().toString();
	   
	
	@Autowired
	private FolderMapper mapper;
	
	public List<FolderModel> folderView(Map<String, Object> vo) {
		return mapper.folderView(vo);
	}

	public List<FolderChildModel> folderSubView(Map<String, Object> folderSubList) {
		return mapper.folderSubView(folderSubList);
	}
	
	public void folderCreate(Map<String, Object> vo) {
		mapper.folderCreate(vo);
	}
	
	public void folderModify(Map<String, Object> vo) {
		mapper.folderModify(vo);
	}
	
	public void folderDelete(Map<String, Object> vo) {
		mapper.folderContentsDelete(vo);
		mapper.folderDelete(vo);
	}
	
}
