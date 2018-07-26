package board.v2.u4.dao;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

import board.v2.u4.vo.BoardVO;

public class BoardDAO {
	
	// �Խù� ���� ����
	private ArrayList<BoardVO> boardList = null;
	// �Խù��� ����Ǿ� �ִ� ���ϸ�
	private String filePath = "board.txt";
	private File f;
	// ������ ���� �ð��� ����
	private long oriModifyTime;
	// ���� ����� ����
	private long oriSize;
	
	public BoardDAO( ) {
		boardList = new ArrayList<BoardVO>();
		f = new File(filePath);	
		oriModifyTime = f.lastModified();
		oriSize       = f.length();
		// ���� ��ü ���� �� ���Ͽ� ����Ǿ� �ִ� �Խù� ������ ����Ʈ�� �����Ѵ�.
		loading();
	}
	
	/**
	 * ���Ͽ��� �ּҷ� ������ ����Ʈ�� �����Ѵ�.
	 */
	public void loading( ) {
		boardList.clear();
		try (
			FileReader fr = new FileReader( f );
			BufferedReader br = new BufferedReader( fr );
		) {
			String str = null;
			while( ( str = br.readLine()) != null ) {
				String [] bArr = str.split(":");
				if(bArr.length == 0) {
					break;
				}
				BoardVO board = new BoardVO(
						Integer.parseInt(bArr[0]),   // ��ȣ
						bArr[1],   // �۾���
						bArr[2],   // ����
						bArr[3]    // �����
				);
				boardList.add(board);
			}
		} catch (IOException e) {
			e.printStackTrace();
		} 
	}
	
	/**
	 * ������ ������ ����Ǿ����� Ȯ��
	 * - ������ ������� ������ ������ �����ð��� ���Ͽ� üũ
	 * @return
	 */
	public boolean isChange( ) {
		boolean flag = false;
		File f  = new File(filePath );	
		if (oriModifyTime != f.lastModified() || oriSize != f.length()) {
			System.out.println("������ ������ ����Ǿ����ϴ�.");
			oriModifyTime = f.lastModified();
			oriSize       = f.length();
			flag = true;
		}
		return flag; 
	}	
	
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
		
		if(isChange()) loading();
		
		boardList.add(board);
		try (
			FileWriter     fw = new FileWriter( filePath, true);
			BufferedWriter bw = new BufferedWriter( fw );
		) {
			bw.write(board.getNo() + ":" + board.getWriter() + ":" + board.getTitle() + ":" + board.getRegDate());
			bw.newLine();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	/**
	 * �ּ����� ����Ʈ�� �ִ� ������ ���Ͽ� ����
	 * @return
	 */
	private void boardFilWrite() {
		try (
			FileWriter     fw = new FileWriter(filePath);
			BufferedWriter bw = new BufferedWriter(fw);
		) {
			for(BoardVO board : boardList) {
				bw.write(board.getNo() + ":" + board.getWriter() + ":" + board.getTitle() + ":" + board.getRegDate());
				bw.newLine();
			}
		} catch (IOException e) {
			e.printStackTrace();
		} 
	}
		
	
	/**
	 * �Խñ� ���� ���
	 */
	public boolean updateBoard(BoardVO board) {
		if(isChange()) loading();

		if (boardList == null || boardList.isEmpty()) return false;
		
		boolean searchFlag = false;
		for (BoardVO vo : boardList) {
			if (vo == null) break;
			if (vo.getNo() == board.getNo()) {
				searchFlag = true;
				vo.setTitle(board.getTitle());
				break;
			}
		}
		
		if(searchFlag == true) boardFilWrite();
		
		return searchFlag;
	}
	
	/**
	 * �Խñ� ���� ���
	 */
	public boolean deleteBoard(BoardVO board) {
		if(isChange()) loading();
		
		if (boardList == null || boardList.isEmpty()) return false;
		
		boolean searchFlag = false;
		
		for (BoardVO vo : boardList) {
			if (vo == null) break;
			if (vo.getNo() == board.getNo()) {
				searchFlag = true;
				boardList.remove(vo);
				break;
			}
		}
		
		if(searchFlag == true) boardFilWrite();
		
		return searchFlag;		
	}
}








