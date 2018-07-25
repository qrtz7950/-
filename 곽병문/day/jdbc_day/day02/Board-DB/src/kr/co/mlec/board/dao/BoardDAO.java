package kr.co.mlec.board.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import kr.co.mlec.board.vo.BoardVO;
import kr.co.mlec.util.ConnectionFactory;
import kr.co.mlec.util.JDBCClose;

/*
 	DAO : Data Access Object
 	
 	BoardDAO : oracle tbl_board�� ����� �Խñ۵��� CRUD�ϱ����� Ŭ����
 */

public class BoardDAO {
	
	/**
	 * ���ο� �Խñ��� tbl_board�� �����ϴ� ���
	 */
	public void insertBoard(BoardVO board) {
		
		Connection conn = null;
		PreparedStatement pstmt = null;
		
		try {
			conn = ConnectionFactory.getConnection();
			
			StringBuilder sql = new StringBuilder();
			sql.append("insert into tbl_board(no, title, writer) ");
			sql.append(" values(tbl_board_no.nextval, ?, ?) ");
			
			pstmt = conn.prepareStatement(sql.toString());
			pstmt.setString(1, board.getTitle());
			pstmt.setString(2, board.getWriter());
			
			pstmt.executeUpdate();
			
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			JDBCClose.close(conn, pstmt);
		}
	}
	
	/**
	 * tbl_board�� ����� ��ü�Խñ��� ��ȸ�ϴ� ���
	 */
	public List<BoardVO> selectAllBoard() {
		
		Connection conn = null;
		PreparedStatement pstmt = null;
		
		List<BoardVO> boardList = new ArrayList<BoardVO>();
		
		try {
			conn = ConnectionFactory.getConnection();
			
			StringBuilder sql = new StringBuilder();
			sql.append("select no, title, writer, view_cnt, reg_date ");
			sql.append("  from tbl_board ");
			
			pstmt = conn.prepareStatement(sql.toString());
			
			ResultSet rs = pstmt.executeQuery();
			
			while(rs.next()) {
				int no = rs.getInt("no");
				String title = rs.getString("title");
				String writer = rs.getString("writer");
				int viewCnt = rs.getInt("view_cnt");
				String regDate = rs.getString("reg_date");
				
				BoardVO board = new BoardVO(no, title, writer, viewCnt, regDate);
				boardList.add(board);
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			JDBCClose.close(conn, pstmt);
		}
		
		return boardList;
	}
	
	/**
	 * tbl_board�� ����� �Խñ� �� �۹�ȣ�� �ش��ϴ� �Խñ��� ��ȸ�ϴ� ���
	 */
	public BoardVO selectBoard(int no) {
				
		return null;
	}
	
	/**
	 * tbl_board�� ����ڰ� �Է��� �۹�ȣ�� �ش�  �Խñ��� �����ϴ� ���
	 */
	public void updateBoard(BoardVO board) {
		
	}
	
	/**
	 * tbl_board���� ����ڰ� �Է��� �۹�ȣ�� �ش� �Խñ��� �����ϴ� ���
	 */
	public void deleteBoard(int no) {
		
	}

}














