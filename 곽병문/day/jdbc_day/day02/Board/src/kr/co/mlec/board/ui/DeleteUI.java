package kr.co.mlec.board.ui;

public class DeleteUI extends BaseUI {

	@Override
	public void execute() throws Exception {

		int no = scanInt("������ �۹�ȣ�� �Է��ϼ��� : ");
		service.deleteBoard(no);
		
		System.out.println("�Խñ۹�ȣ [" + no + "]�� �Խñ��� �����Ͽ����ϴ�");
	}

	
}
