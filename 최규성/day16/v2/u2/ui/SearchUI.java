package board.v2.u2.ui;

import board.v2.u2.vo.BoardVO;

public class SearchUI extends BaseUI  {

	public void execute() throws Exception {
		// service �޼��� ȣ��
		BoardVO[] list = service.selectBoard();
		
		// ȭ�鿡 ��� ���
		System.out.printf("�Խñ� ��� : ��ü %d��\n", list.length);
		System.out.println("--------------------------------------------------");
		System.out.println("��ȣ\t�۾���\t�����\t����");
		System.out.println("--------------------------------------------------");
		for (BoardVO board : list) {
			System.out.print(board.getNo     () + "\t");
			System.out.print(board.getWriter () + "\t");
			System.out.print(board.getRegDate() + "\t");
			System.out.print(board.getTitle  () + "\n");
		}
		
		if (list.length == 0) {
			System.out.println("��ȸ�� �Խù��� �����ϴ�.");
		}
		System.out.println("--------------------------------------------------");
	}
}
