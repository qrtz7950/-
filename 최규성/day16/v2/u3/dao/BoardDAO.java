package board.v2.u3.dao;

import java.util.ArrayList;

import board.v2.u3.vo.BoardVO;

public class BoardDAO {
	
	// �Խù� ���� ����
	private ArrayList<BoardVO> boardList = new ArrayList<>();
	
	/**
	 * ��ü �Խñ��� ��ȸ�ϴ� ��� 
	 */
	public ArrayList<BoardVO> selectBoard() {
		return boardList;
	}
	
	/**
	 * �Խñ� ��ȣ�� �ش��ϴ� ���� ��ȸ�ϴ� ���
	 */
	public BoardVO selectOneBoard(BoardVO board) {
		for (BoardVO vo : boardList) {
			if (vo.getNo() == board.getNo()) {
				return vo;	
			}
		}
		return null;
	}
	
	/**
	 * �Խñ��� ����ϴ� ���
	 */
	public void insertBoard(BoardVO board) {
		boardList.add(board);
	}
	
	/**
	 * �Խñ� ���� ���
	 */
	public void updateBoard(BoardVO board) {
		if (boardList == null) return ;
		for (BoardVO vo : boardList) {
			if (vo == null) break;
			if (vo.getNo() == board.getNo()) {
				vo.setTitle(board.getTitle());
				break;
			}
		}
	}
	
	/**
	 * �Խñ� ���� ���
	 */
	public void deleteBoard(BoardVO board) {
		if (boardList.isEmpty()) return ;
		for (BoardVO vo : boardList) {
			if (vo == null) break;
			if (vo.getNo() == board.getNo()) {
				boardList.remove(vo);
				break;
			}
		}
	}
}
