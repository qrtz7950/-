package board.v2.u1.ui;

import board.v2.u1.service.BoardService;
import board.v2.u1.vo.BoardVO;

public class UpdateUI extends BaseUI {
	
	private BoardService service;
	public UpdateUI () {
		service = new BoardService();
	}
	
	public void execute() throws Exception {
		int no = scanInt("������ �۹�ȣ�� �Է��ϼ��� : ");
		String title  = scanStr("������ ������ �Է��ϼ��� : ");
		
		BoardVO board = new BoardVO();
		board.setNo(no);
		board.setTitle(title);
		
		service.updateBoard(board);
		
		System.out.println("�Խñ��� �����Ǿ����ϴ�.\n");
	}
}
