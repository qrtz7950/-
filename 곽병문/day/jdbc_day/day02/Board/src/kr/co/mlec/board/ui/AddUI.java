package kr.co.mlec.board.ui;

import kr.co.mlec.board.vo.BoardVO;

public class AddUI extends BaseUI  {


	@Override
	public void execute() throws Exception {

		String title = scanStr("����� ������ �Է��ϼ��� : ");
		String writer = scanStr("����� �۾��̸� �Է��ϼ��� : ");
		
		// BoardDAO�� boardList�� BoardVO��ü �߰�
		BoardVO board = new BoardVO();
		board.setTitle(title);
		board.setWriter(writer);
		service.insertBoard(board);

		
		System.out.println("�Խñ��� ����Ͽ����ϴ�");
	}

	
}
