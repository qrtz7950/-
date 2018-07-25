package kr.co.mlec.board.ui;

import java.util.List;

import kr.co.mlec.board.vo.BoardVO;

/*
 	alt + shift + s ���� ��  v���� : override
 */
public class SelectAllUI extends BaseUI {

	@Override
	public void execute() throws Exception {
		
		List<BoardVO> boardList = service.selectAllBoard();
		
		System.out.println("�Խù� ��� : " + boardList.size() + "��");
		System.out.println("------------------------------------");
		System.out.println("��ȣ\t�۾���\t�����\t����");
		System.out.println("------------------------------------");
		if(boardList.isEmpty()) {
			System.out.println("\t��ϵ� �Խù��� �����ϴ�");
		} else {
			for (BoardVO board : boardList) {
				System.out.println(
						board.getNo() + "\t" + board.getWriter() + "\t" + board.getRegDate() + "\t" + board.getTitle());
			}
		}
		System.out.println("------------------------------------");
	}
	
}






