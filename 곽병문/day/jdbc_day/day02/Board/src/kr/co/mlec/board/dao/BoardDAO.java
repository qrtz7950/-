package kr.co.mlec.board.dao;

import java.util.ArrayList;
import java.util.List;

import kr.co.mlec.board.vo.BoardVO;

/*
 	DAO : Data Access Object
 	
 	BoardDAO : �Խñ۵��� CRUD�ϱ����� Ŭ����
 */

public class BoardDAO {

	private List<BoardVO> boardList;

	public BoardDAO() {
		boardList = new ArrayList<BoardVO>();
	}
	
	public void insertBoard(BoardVO board) {
		boardList.add(board);
		System.out.println("��ϵ� �Խù� ���� : " + boardList.size() + "��");
	}
	
	// ��ü�Խñ� ����� ȣ���ڸ޼ҵ忡 ����
	public List<BoardVO> selectAllBoard() {
		return boardList;
	}
	
	/**
	 	�۹�ȣ�� �ش��ϴ� �Խù��� ȣ���ڿ��� ����
	 */
	public BoardVO selectBoard(int no) {
		
		for(BoardVO board : boardList) {
			if(board.getNo() == no) {
				return board;
			}
		}
		
		return null;		
	}
	
	/**
	 * ȣ���ڰ� �Ѱ��� BoardVO�� ��ü�� no�� �˻��Ͽ� title������ ����
	 */
//	public void updateBoard(int no, String title)
	public void updateBoard(BoardVO board) {

		/*
		for(BoardVO vo : boardList) {
			if(vo.getNo() == no) {
				vo.setTitle(title);
			}
		}
		*/
		
		for(BoardVO vo : boardList) {
			if(vo.getNo() == board.getNo()) {
				vo.setTitle(board.getTitle());
				return;
			}
		}
	}
	
	/**
	 *	ȣ���ڰ� �Ѱ��� ��ȣ�� �ش� �Խù��� boardList���� ����
	 */
	public void deleteBoard(int no) {
		
		for(BoardVO board : boardList) {
			if(board.getNo() == no) {
				boardList.remove(board);
			}
		}
		
		/*
		for(int i = 0; i < boardList.size(); i++) {
			if(boardList.get(i).getNo() == no) {
				boardList.remove(i);
				return;
			}
		}
		*/
	}
}














