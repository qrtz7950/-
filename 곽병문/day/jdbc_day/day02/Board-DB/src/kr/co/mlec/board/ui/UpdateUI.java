package kr.co.mlec.board.ui;

import kr.co.mlec.board.vo.BoardVO;

public class UpdateUI extends BaseUI {

	@Override
	public void execute() throws Exception {

		int no = scanInt("������ �۹�ȣ�� �Է��ϼ��� : ");
		String title = scanStr("������ ������ �Է��ϼ���");
		
		BoardVO board = new BoardVO();
		board.setNo(no);
		board.setTitle(title);
		
		service.updateBoard(board);
		
		System.out.println("�Խñ��� �����Ͽ����ϴ�");
	}

}







