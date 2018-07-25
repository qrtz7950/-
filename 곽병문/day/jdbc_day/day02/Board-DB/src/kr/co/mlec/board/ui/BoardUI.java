package kr.co.mlec.board.ui;

public class BoardUI extends BaseUI {
	
	public void execute() throws Exception {
		
		IBoardUI ui = null;
		while(true) {
			int type = menu();
			switch (type) {
			case 1:
				ui = new SelectAllUI();
				break;
			case 2:
				ui = new SelectOneUI();
				break;
			case 3:
				ui = new AddUI();
				break;
			case 4:
				ui = new UpdateUI();
				break;
			case 5:
				ui = new DeleteUI();
				break;
			case 0:
				ui = new ExitUI();
				break;
			}
			if(ui != null)
				ui.execute();
			else
				System.out.println("�߸��Է��ϼ̽��ϴ�. �ٽü����ϼ���");
		}
	}
	
	private int menu() {
		System.out.println("----------------------------------");
		System.out.println("\t\t�Խ��� ���� ���α׷� - DB");
		System.out.println("----------------------------------");
		System.out.println("1. ��ü�Խñ� ��ȸ");
		System.out.println("2. �۹�ȣ ��ȸ");
		System.out.println("3. �۵��");
		System.out.println("4. �ۼ���");
		System.out.println("5. �ۻ���");
		System.out.println("0. ���� ");
		int type = scanInt("�׸��� �����ϼ��� : ");
		
		return type;
		
	}
}
