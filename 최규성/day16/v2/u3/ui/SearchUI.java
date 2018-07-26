package board.v2.u3.ui;

import java.util.ArrayList;

import board.v2.u3.vo.BoardVO;

public class SearchUI extends BaseUI  {

	public void execute() throws Exception {
		// service �޼��� ȣ��
		ArrayList<BoardVO> list = service.selectBoard();
		
		// ȭ�鿡 ��� ���
		System.out.printf("�Խñ� ��� : ��ü %d��\n", list.size());
		System.out.println("--------------------------------------------------");
		System.out.println("��ȣ\t�۾���\t�����\t����");
		System.out.println("--------------------------------------------------");
		for (BoardVO board : list) {
			System.out.print(board.getNo     () + "\t");
			System.out.print(board.getWriter () + "\t");
			System.out.print(board.getRegDate() + "\t");
			System.out.print(board.getTitle  () + "\n");
		}
		
		if (list.isEmpty()) {
			System.out.println("��ȸ�� �Խù��� �����ϴ�.");
		}
		System.out.println("--------------------------------------------------");
	}
}
