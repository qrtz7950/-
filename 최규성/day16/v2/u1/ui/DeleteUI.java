package board.v2.u1.ui;

import board.v2.u1.service.BoardService;
import board.v2.u1.vo.BoardVO;

public class DeleteUI extends BaseUI {

	private BoardService service;
	public DeleteUI () {
		service = new BoardService();
	}
	
	public void execute() throws Exception {
		int no = scanInt("������ �۹�ȣ�� �Է��ϼ��� : ");
		BoardVO board = new BoardVO();
		board.setNo(no);
		
		service.deleteBoard(board);
		
		System.out.println("�Խñ��� �����Ǿ����ϴ�.\n");
	}
}
