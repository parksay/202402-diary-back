package kr.happyjob.study.vo.folder;

public class FolderChildModel {

	// 글 SEQ
	private String contents_seq;
	
	// 폴더 SEQ
	private String folder_seq;
	
	// 제목
	private String title;

	/**
	 * @return the contents_seq
	 */
	public String getContents_seq() {
		return contents_seq;
	}

	/**
	 * @param contents_seq the contents_seq to set
	 */
	public void setContents_seq(String contents_seq) {
		this.contents_seq = contents_seq;
	}

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
	 * @return the title
	 */
	public String getTitle() {
		return title;
	}

	/**
	 * @param title the title to set
	 */
	public void setTitle(String title) {
		this.title = title;
	}
}
