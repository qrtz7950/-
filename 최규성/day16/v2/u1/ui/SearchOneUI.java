package board.v2.u1.ui;

import board.v2.u1.service.BoardService;
import board.v2.u1.vo.BoardVO;

public class SearchOneUI extends BaseUI  {
	
	private BoardService service;
	public SearchOneUI () {
		service = new BoardService();
	}
	
	public void execute() throws Exception {
		int no = scanInt("��ȸ�� �۹�ȣ�� �Է��ϼ��� : ");
		BoardVO board = new BoardVO();
		board.setNo(no);	
		
		// service �޼��� ȣ��
		BoardVO result = service.selectOneBoard(board);
		
		// ȭ�鿡 ��� ���
		System.out.println(result.getNo() + "�� �Խñ�");
		System.out.println("--------------------------------------------------");
		System.out.println("��  ȣ : " + result.getNo     ());
		System.out.println("�۾��� : " + result.getWriter ());
		System.out.println("��  �� : " + result.getTitle  ());
		System.out.println("����� : " + result.getRegDate());
		System.out.println("--------------------------------------------------");
	}
}
