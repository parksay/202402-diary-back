package kr.happyjob.study.vo.contents;

public class ContentsModel {
	
	private int contents_seq; //
	private int folder_seq;
	private String contents;
	private String title;
	private String is_del;
	private String del_date;
	private String create_date;
	private String update_date;
	
	
	public int getContents_seq() {
		return contents_seq;
	}
	public void setContents_seq(int contents_seq) {
		this.contents_seq = contents_seq;
	}
	public int getFolder_seq() {
		return folder_seq;
	}
	public void setFolder_seq(int folder_seq) {
		this.folder_seq = folder_seq;
	}
	public String getContents() {
		return contents;
	}
	public void setContents(String contents) {
		this.contents = contents;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getIs_del() {
		return is_del;
	}
	public void setIs_del(String is_del) {
		this.is_del = is_del;
	}
	public String getDel_date() {
		return del_date;
	}
	public void setDel_date(String del_date) {
		this.del_date = del_date;
	}
	public String getCreate_date() {
		return create_date;
	}
	public void setCreate_date(String create_date) {
		this.create_date = create_date;
	}
	public String getUpdate_date() {
		return update_date;
	}
	public void setUpdate_date(String update_date) {
		this.update_date = update_date;
	}


	public String toString() {
		return "ContentsModel [contents_seq=" + contents_seq + ", folder_seq=" + folder_seq + ", contents=" + contents
				+ ", title=" + title + ", is_del=" + is_del + ", del_date=" + del_date + ", create_date=" + create_date
				+ ", update_date=" + update_date + "]";
	}
	
	
}
