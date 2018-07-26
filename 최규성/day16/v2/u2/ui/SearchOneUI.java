package board.v2.u2.ui;

import board.v2.u2.vo.BoardVO;

public class SearchOneUI extends BaseUI  {
	
	public void execute() throws Exception {
		int no = scanInt("��ȸ�� �۹�ȣ�� �Է��ϼ��� : ");
		BoardVO board = new BoardVO();
		board.setNo(no);	
		
		// service �޼��� ȣ��
		BoardVO result = service.selectOneBoard(board);
		
		// ȭ�鿡 ��� ���
		System.out.println(no + "�� �Խñ�");
		System.out.println("--------------------------------------------------");
		if (result != null) {
			System.out.println("��  ȣ : " + result.getNo     ());
			System.out.println("�۾��� : " + result.getWriter ());
			System.out.println("��  �� : " + result.getTitle  ());
			System.out.println("����� : " + result.getRegDate());
		} else {
			System.out.println(no + "�� �Խù��� �������� �ʽ��ϴ�.");
		}
		System.out.println("--------------------------------------------------");
	}
}
