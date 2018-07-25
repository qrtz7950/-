package kr.co.mlec.board.ui;

import kr.co.mlec.board.vo.BoardVO;

public class SelectOneUI extends BaseUI {

	@Override
	public void execute() throws Exception {

		int no = scanInt("��ȸ�� �۹�ȣ�� �Է��ϼ��� : ");
		BoardVO board = service.selectBoard(no);
		
		if(board == null) {
			System.out.println("�Է��Ͻ� �Խù� [" + no + "]���� �ش絥���Ͱ� �����ϴ�");
		} else {
		
		System.out.println("-----------------------------------");
		System.out.println("\t\t�˻����");
		System.out.println("-----------------------------------");
		System.out.println("��  ȣ : " + board.getNo());
		System.out.println("��  �� : " + board.getTitle());
		System.out.println("�۾��� : " + board.getWriter());
		System.out.println("��ȸ�� : " + board.getViewCnt());
		System.out.println("�����: " + board.getRegDate());
		System.out.println("-----------------------------------");
		}
		
	}

}
