package board.v2.u1.ui;

import board.v2.u1.service.BoardService;
import board.v2.u1.vo.BoardVO;

public class AddUI extends BaseUI {
	private BoardService service;
	public AddUI () {
		service = new BoardService();
	}
	
	public void execute() throws Exception {
		String title  = scanStr("������ �Է��ϼ��� : ");
		String writer = scanStr("�۾��̸� �Է��ϼ��� : ");
		
		BoardVO board = new BoardVO();
		board.setTitle(title);
		board.setWriter(writer);
		
		service.insertBoard(board);
		
		System.out.println("�Խñ��� ��ϵǾ����ϴ�.\n");
	}
}
