package kr.co.mlec.board.ui;

public class ExitUI implements IBoardUI {

	@Override
	public void execute() throws Exception {
			
		System.out.println("=======================================");
		System.out.println("\n\t�Խ��� ���α׷��� �����մϴ�\n");
		System.out.println("=======================================");
		System.exit(0);

	}

	
}
