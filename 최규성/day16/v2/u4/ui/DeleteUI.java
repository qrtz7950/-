package board.v2.u4.ui;

import board.v2.u4.vo.BoardVO;

public class DeleteUI extends BaseUI {
	
	public void execute() throws Exception {
		int no = scanInt("������ �۹�ȣ�� �Է��ϼ��� : ");
		BoardVO board = new BoardVO();
		board.setNo(no);
		
		service.deleteBoard(board);
		
		System.out.println("�Խñ��� �����Ǿ����ϴ�.\n");
	}
}
