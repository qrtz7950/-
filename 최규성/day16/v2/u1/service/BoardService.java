package board.v2.u1.service;

import java.util.ArrayList;

import board.v2.u1.vo.BoardVO;

public class BoardService {
	public void insertBoard(BoardVO board) throws Exception {
		System.out.println("�Խñ��� ����ϴ� ���� �޼��� ȣ��...");
	}

	public void deleteBoard(BoardVO board) throws Exception {
		System.out.println("�Խñ��� �����ϴ� ���� �޼��� ȣ��..");
	}
	
	public BoardVO selectOneBoard(BoardVO board) throws Exception {
		BoardVO result = new BoardVO();
		System.out.println("�Խñ� �� ������ ��ȸ�ϴ� ���� �޼��� ȣ��..");
		return result;
	}

	public ArrayList<BoardVO> selectBoard() throws Exception {
		ArrayList<BoardVO> list = new ArrayList<BoardVO>();
		System.out.println("�Խñ� ��ü ������ ��ȸ�ϴ� ���� �޼��� ȣ��..");
		return list;
	}

	public void updateBoard(BoardVO board) throws Exception {
		System.out.println("�Խñ� ������ �����ϴ� ���� �޼��� ȣ��..");
	}
}
