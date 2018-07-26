package board.v2.u4.ui;

/**
 * ����� ȭ�� ó��
 * @author bitacademy
 */
public class BoardUI extends BaseUI {
	
	public void execute() throws Exception {
		while(true) {
			System.out.println();
			String type = menu();
			IBoardUI ui = null;
			switch(type) {
			case "1" :
				ui = new SearchUI();      // ��ü �Խñ� ��ȸȭ��
				break;
			case "2" :
				ui = new SearchOneUI();  // �Խñ� ��ȣ�� ��ȸȭ��
				break;
			case "3" :
				ui = new AddUI();               // �Խñ� ��� ȭ��ó�� 
				break;
			case "4" :
				ui = new UpdateUI();      // �Խñ� ����ȭ��
				break;
			case "5" :
				ui = new DeleteUI();      // �Խñ� ����ȭ��
				break;
			case "0" :
				ui = new ExitUI();        // �Խ��� ���α׷� ����ȭ��
			}    // end of switch block
			
			if (ui != null) {
				ui.execute();
			}
			else System.out.println("�߸��� �޴��� ���õǾ����ϴ�.");
		}	// end of while loop
	}  // end of process method
	
	private String menu() {
		System.out.println("--------------------------------------------------");
		System.out.println("1. ��ü�Խù� ��ȸ   ");
		System.out.println("2. �۹�ȣ ��ȸ   ");
		System.out.println("3. �۵��   ");
		System.out.println("4. �ۼ���   ");
		System.out.println("5. �ۻ���   ");
		System.out.println("0. ����     ");
		System.out.println("--------------------------------------------------");
		return scanStr("�޴� �� ó���� �׸��� �����ϼ��� : ");
	}
}















