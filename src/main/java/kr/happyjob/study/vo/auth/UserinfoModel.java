package kr.happyjob.study.vo.auth;

import java.util.Date;

public class UserinfoModel {
	private Long memberSeq;
	private String userType;
	private String loginID;
	private String password;
	private String name;
	private Date createDate;
	private Date updateDate;


	public Long getMemberSeq() {
		return memberSeq;
	}

	public void setMemberSeq(Long memberSeq) {
		this.memberSeq = memberSeq;
	}

	public String getUserType() {
		return userType;
	}

	public void setUserType(String userType) {
		this.userType = userType;
	}

	public String getLoginID() {
		return loginID;
	}

	public void setLoginID(String loginID) {
		this.loginID = loginID;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Date getCreateDate() {
		return createDate;
	}

	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}

	public Date getUpdateDate() {
		return updateDate;
	}

	public void setUpdateDate(Date updateDate) {
		this.updateDate = updateDate;
	}

	@Override
	public String toString() {
		return "UserinfoModel{" +
				"memberSeq=" + memberSeq +
				", userType='" + userType + '\'' +
				", loginID='" + loginID + '\'' +
				", password='" + password + '\'' +
				", name='" + name + '\'' +
				", createDate=" + createDate +
				", updateDate=" + updateDate +
				'}';
	}
}
