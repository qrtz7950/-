package board.v2.u3.ui;

import board.v2.u3.vo.BoardVO;

public class DeleteUI extends BaseUI {
	
	public void execute() throws Exception {
		int no = scanInt("삭제할 글번호를 입력하세요 : ");
		BoardVO board = new BoardVO();
		board.setNo(no);
		
		service.deleteBoard(board);
		
		System.out.println("게시글이 삭제되었습니다.\n");
	}
}
