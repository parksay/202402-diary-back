package kr.happyjob.study.vo.main.response;

public class CalendarVo {
	private String folder_seq;			// 폴더번호
	private String contents_seq;		// 글번호
	private String title;				// 글제목
	private String create_date;			// 글 생성일자	
	
	public String getFolder_seq() {
		return folder_seq;
	}
	public void setFolder_seq(String folder_seq) {
		this.folder_seq = folder_seq;
	}
	public String getContents_seq() {
		return contents_seq;
	}
	public void setContents_seq(String contents_seq) {
		this.contents_seq = contents_seq;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getCreate_date() {
		return create_date;
	}
	public void setCreate_date(String create_date) {
		this.create_date = create_date;
	}
	
	
}