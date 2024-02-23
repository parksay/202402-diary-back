package kr.happyjob.study.repository.contents;

import java.util.Map;

import org.apache.ibatis.annotations.Mapper;

import kr.happyjob.study.vo.contents.ContentsModel;

@Mapper
public interface ContentsMapper {
	
	public ContentsModel contentsDetail(ContentsModel params);
	
	public int contentsCnt(Map<String, Object> paramMap)throws Exception ;

	public int insertContents(Map<String, Object> paramMap);

	public int updateContents(Map<String, Object> paramMap);

	public int deleteContents(Map<String, Object> paramMap);
	
	}


