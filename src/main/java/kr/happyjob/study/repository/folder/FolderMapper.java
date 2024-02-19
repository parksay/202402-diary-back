package kr.happyjob.study.repository.folder;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;

import kr.happyjob.study.vo.folder.FolderChildModel;
import kr.happyjob.study.vo.folder.FolderModel;

@Mapper
public interface FolderMapper {
	List<FolderModel> folderView(Map<String, Object> vo);

	List<FolderChildModel> folderSubView(Map<String, Object> folderSubList);
	
	void folderCreate(Map<String, Object> vo);
	
	void folderModify(Map<String, Object> vo);
	
	void folderDelete(Map<String, Object> vo);
	
}

