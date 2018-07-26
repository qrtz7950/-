package board.v2.u3.ui;

import board.v2.u3.vo.BoardVO;

public class AddUI extends BaseUI {
	
	public void execute() throws Exception {
		String title  = scanStr("������ �Է��ϼ��� : ");
		String writer = scanStr("�۾��̸� �Է��ϼ��� : ");
		
		BoardVO board = new BoardVO();
		board.setTitle(title);
		board.setWriter(writer);
		
		service.insertBoard(board);
		
		System.out.println("�Խñ��� ��ϵǾ����ϴ�.");
	}
}
