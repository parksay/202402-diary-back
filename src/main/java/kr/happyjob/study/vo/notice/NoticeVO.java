package kr.happyjob.study.vo.notice;


public class NoticeVO {

	// 공지사항 ID
	private String notice_seq;

	// 공지사항 제목
	private String title;
	
	// 공지사항 내용
	private String contents;
	
	// 공지사항 삭제여부
	private String is_del;
	
	// 공지사항 삭제날짜
	private String del_date;
	
	// 공지사항 생성날짜
	private String create_date;
	
	// 로그인 seq
	private String member_seq;
	
	// 로그인 유저 권한
	private String user_status;
	

	/**
	 * @return the notice_seq
	 */
	public String getNotice_seq() {
		return notice_seq;
	}

	/**
	 * @param notice_seq the notice_seq to set
	 */
	public void setNotice_seq(String notice_seq) {
		this.notice_seq = notice_seq;
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

	/**
	 * @return the contents
	 */
	public String getContents() {
		return contents;
	}

	/**
	 * @param contents the contents to set
	 */
	public void setContents(String contents) {
		this.contents = contents;
	}
	
	/**
	 * @return the is_del
	 */
	public String getIs_del() {
		return is_del;
	}
	
	/**
	 * @param is_del the is_del to set
	 */
	public void setIs_del(String is_del) {
		this.is_del = is_del;
	}
	
	/**
	 * @return the del_date
	 */
	public String getDel_date() {
		return del_date;
	}
	
	/**
	 * @param del_date the del_date to set
	 */
	public void setDel_date(String del_date) {
		this.del_date = del_date;
	}
	
	/**
	 * @return the create_date
	 */
	public String getCreate_date() {
		return create_date;
	}
	
	/**
	 * @param create_date the create_date to set
	 */
	public void setCreate_date(String create_date) {
		this.create_date = create_date;
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
	 * @return the user_status
	 */
	public String getUser_status() {
		return user_status;
	}
	
	/**
	 * @param user_status the user_status to set
	 */
	public void setUser_status(String user_status) {
		this.user_status = user_status;
	}
}
