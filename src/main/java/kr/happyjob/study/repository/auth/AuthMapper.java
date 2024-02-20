package kr.happyjob.study.repository.auth;

import kr.happyjob.study.vo.auth.UserinfoModel;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import java.util.Map;


@Mapper
public interface AuthMapper {
	// insert 문이나 update 문 등은 interface 에서부터 return type 을 void 로 선언해줘야 함. 아니면 return type 모르겠다고 mybatis 가 에러 냄
	public abstract UserinfoModel getLastInserted();
	public abstract UserinfoModel getUserinfo(Long memberSeq);
	public abstract UserinfoModel getUserinfoByLoginID(String loginID);
	public abstract List<UserinfoModel> getUserinfoList(Map<String, Object> paramMap);
	public abstract void updateUserinfo(UserinfoModel user);
	public abstract void insertUserinfo(UserinfoModel user);
	public abstract void deleteUserinfo(Long memberSeq);

}


