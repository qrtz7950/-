package day05;

/*
 *	 	 void��� ��ȯ���� ȣ���� ��ȣ���� ������ �ʿ��� ���� ���������ϴ�.
 */
public class MethodMain01 {

	/*
	 * static void prnStar(int cnt) { //static�� �߰��Ͽ� prnStar(); ȣ�Ⱑ��
	 * 
	 * for(int i = 0; i< cnt; i++) { 
	 * 		System.out.print('*'); 
	 * } System.out.println();
	 * 
	 * }
	 * 
	 * public static void main(String[] args) {
	 * 
	 * 		prnStar(10); //�޼ҵ� ȣ��/ ��ȣ���� 10�� 'int cnt' ȣ���ڰ� ��ȣ���ڿ� ����
	 * 		System.out.println("Hello"); 
	 * 		prnStar(5);
	 * 		System.out.println("Hi");
	 * 		prnStar(20);
	 * 		System.out.println("Good-bye"); 
	 * 		prnStar(12);
	 * 
	 * }
	 */

	/*
	 * static void prnStar(char ch) {
	 * 
	 * for (int i = 0; i < 10; i++) { System.out.print(ch); // ��ȣ���ڰ� ȣ���ڿ� ���� }
	 * 		System.out.println();
	 * }
	 * 
	 * public static void main(String[] args) {
	 * 
	 * 		prnStar('*'); // �޼ҵ� ȣ��/ ��ȣ���� 10�� 'int cnt' 
	 * 		System.out.println("Hello");
	 * 		prnStar('#'); 
	 * 		System.out.println("Hi"); 
	 * 		prnStar('-');
	 *		System.out.println("Good-bye"); 
	 *		prnStar('!');
	 * 
	 * }
	 */
	
	static void prnStar(char ch, int cnt) {	//�ΰ��� �Ķ���Ϳ� ���������ϰ� ��

		for (int i = 0; i < cnt; i++) {
			System.out.print(ch);
		}
		System.out.println();

	}
	static int calc(int a, int b) { 	//int�� ���ϰ��� �ڷ���
		
		int sum = a + b;
		return sum;		//a�� b�� ���� sum�� main�� ����/return�� ������ main���� ���� ����
	}

	public static void main(String[] args) {

		
		int total = calc(10,20); 	//calc�� �̵� / total�� ���ϰ� sum�� 30�� ���Ե�
		System.out.println("10 + 20 = " + total);
		prnStar('*', 10);
		System.out.println("Hello");
		prnStar('#', 20);
		System.out.println("Hi");
		prnStar('-', 30);
		System.out.println("Good-bye");
		prnStar('!', 3);

	}
}
