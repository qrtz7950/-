<<<<<<< HEAD
package kr.co.mlec.homework.homework10;

public class Board extends BoardServer{
	public static int totalnum = 0;
	
	public void start() {
		
		while(true) {
			int a = menu();
			switch(a) {
				case 1:
					showAll();
					break;
				case 2:
					showNum();
					break;
				case 3:
					upload();
					break;
				case 4:
					modify();
					break;
				case 5:
					remov();
					break;
				case 0:
					System.exit(0);
				default :
					System.out.println("�߸��� �����Դϴ�.");
			}
			System.out.println();
			
		}
	}
	
	public int menu() {
		System.out.println("*** �޴� ***");
		System.out.println("1. ��ü�Խñ� ��ȸ");
		System.out.println("2. �۹�ȣ ��ȸ");
		System.out.println("3. �۵��");
		System.out.println("4. �ۼ���");
		System.out.println("5. �ۻ���");
		System.out.println("0. ����");
		System.out.print("���ϴ� �׸��� �����ϼ��� => ");
		int a = Integer.parseInt(s.nextLine());
		return a;
	}
}
=======
package kr.co.mlec.homework.homework10;

public class Board extends BoardServer{
	public static int totalnum = 0;
	
	public void start() {
		
		while(true) {
			int a = menu();
			switch(a) {
				case 1:
					showAll();
					break;
				case 2:
					showNum();
					break;
				case 3:
					upload();
					break;
				case 4:
					modify();
					break;
				case 5:
					remov();
					break;
				case 0:
					System.exit(0);
				default :
					System.out.println("�߸��� �����Դϴ�.");
			}
			System.out.println();
			
		}
	}
	
	public int menu() {
		System.out.println("*** �޴� ***");
		System.out.println("1. ��ü�Խñ� ��ȸ");
		System.out.println("2. �۹�ȣ ��ȸ");
		System.out.println("3. �۵��");
		System.out.println("4. �ۼ���");
		System.out.println("5. �ۻ���");
		System.out.println("0. ����");
		System.out.print("���ϴ� �׸��� �����ϼ��� => ");
		int a = Integer.parseInt(s.nextLine());
		return a;
	}
}
>>>>>>> 282951cd084703f8f7ebe984b1e780d5f23a17b4
