package board.v2.u2.dao;

import board.v2.u2.vo.BoardVO;

public class BoardDAO {
	
	// �Խù� ���� ����
	private BoardVO [] boardList = new BoardVO[10];
	private int inputPos = 0;
	
	/**
	 * ��ü �Խñ��� ��ȸ�ϴ� ��� 
	 */
	public BoardVO [] selectBoard() {
		BoardVO [] boardList = new BoardVO[inputPos];
		System.arraycopy(this.boardList, 0, boardList, 0, inputPos);
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
	
	private void increase(int length) {
		BoardVO [] copy = new BoardVO[length];
		System.arraycopy(boardList, 0, copy, 0, boardList.length);
		boardList = copy;
	}
	
	/**
	 * �Խñ��� ����ϴ� ���
	 */
	public void insertBoard(BoardVO board) {
		if (inputPos == boardList.length) {
			increase(boardList.length * 2);
		}
		boardList[inputPos++] = board;
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
		int index = 0;
		if (boardList == null) return ;
		for (BoardVO vo : boardList) {
			if (vo == null) break;
			if (vo.getNo() == board.getNo()) {
				remove(index);
				break;
			}
			index++;
		}
	}
	
	/**
	 *  �Խñ� ������ �κ� �̵��ϱ�
	 */
	private void remove(int index) {
        int numMoved = inputPos - index - 1;
        if (numMoved > 0)
            System.arraycopy(boardList, index+1, boardList, index, numMoved);
        boardList[--inputPos] = null;
	}
	
}
