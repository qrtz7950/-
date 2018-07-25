package kr.co.mlec.board.vo;

/*
 	VO : Value Object
 	
 	alt + shift + s ���� ��  c ���� : �⺻������
 	alt + shift + s ���� ��  o ���� : �Ű������� ������ ������
 	alt + shift + s ���� ��  r ���� : getter/setter �޼ҵ�
 	alt + shift + s ���� ��  s ���� : toString() �޼ҵ� override
 */

public class BoardVO {
	private int 	no;			// �۹�ȣ
	private String 	title;		// ����
	private String 	writer;		// �۾���
	private int		viewCnt;	// ��ȸ��
	private String 	regDate;	// �����
	
	public BoardVO() {
		super();
	}

	public BoardVO(int no, String title, String writer, int viewCnt, String regDate) {
		super();
		this.no = no;
		this.title = title;
		this.writer = writer;
		this.viewCnt = viewCnt;
		this.regDate = regDate;
	}

	public int getNo() {
		return no;
	}

	public void setNo(int no) {
		this.no = no;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getWriter() {
		return writer;
	}

	public void setWriter(String writer) {
		this.writer = writer;
	}

	public int getViewCnt() {
		return viewCnt;
	}

	public void setViewCnt(int viewCnt) {
		this.viewCnt = viewCnt;
	}

	public String getRegDate() {
		return regDate;
	}

	public void setRegDate(String regDate) {
		this.regDate = regDate;
	}

	@Override
	public String toString() {
		return "BoardVO [no=" + no + ", title=" + title + ", writer=" + writer + ", viewCnt=" + viewCnt + ", regDate="
				+ regDate + "]";
	}
}










