package kr.happyjob.study.vo.folder;

import java.util.ArrayList;
import java.util.List;

import kr.happyjob.study.vo.login.UsrMnuChildAtrtModel;

public class FolderModel {

	// 메뉴 ID
	private String folder_seq;
	
	// 부모 메뉴 ID
	private String parent_folder_seq;
	
	// 메뉴 명
	private String folder_name;
	
	// 로그인 seq
	private String member_seq;
	
	//자식 node List
	private List<FolderChildModel> nodeList = new ArrayList<FolderChildModel>();

	/**
	 * @return the folder_seq
	 */
	public String getFolder_seq() {
		return folder_seq;
	}

	/**
	 * @param folder_seq the folder_seq to set
	 */
	public void setFolder_seq(String folder_seq) {
		this.folder_seq = folder_seq;
	}

	/**
	 * @return the parent_folder_seq
	 */
	public String getParent_folder_seq() {
		return parent_folder_seq;
	}

	/**
	 * @param parent_folder_seq the parent_folder_seq to set
	 */
	public void setParent_folder_seq(String parent_folder_seq) {
		this.parent_folder_seq = parent_folder_seq;
	}

	/**
	 * @return the folder_name
	 */
	public String getFolder_name() {
		return folder_name;
	}

	/**
	 * @param folder_name the folder_name to set
	 */
	public void setFolder_name(String folder_name) {
		this.folder_name = folder_name;
	}

	/**
	 * @return the member_seq
	 */
	public String getMember_seq() {
		return member_seq;
	}

	/**
	 * @param member_seq the member_seq to set
	 */
	public void setMember_seq(String member_seq) {
		this.member_seq = member_seq;
	}

	/**
	 * @return the nodeList
	 */
	public List<FolderChildModel> getNodeList() {
		return nodeList;
	}

	/**
	 * @param nodeList the nodeList to set
	 */
	public void setNodeList(List<FolderChildModel> nodeList) {
		this.nodeList = nodeList;
	}
}
