package kr.co.mlec.day01;

/*
 * <��¸޼ҵ�>
 * 1. System.out.print()	: ���๮��X(enter)
 * 2. System.out.println()	: ���๮��O
 * 3. System.out.printf()	: ���๮��X, ��ȯ����(%c, %d, %x, %o, %f, %s...)
 * 										JDK1.5 ����
 * 
 * ����, ����, �Ǽ�, ���ڿ�
 */

public class PrintMain {
	
	public static void main(String[] arg) {
		
		System.out.print("Hello");
		System.out.println("Hello");
		System.out.printf("Hello");
		String str = "olleH";
		int num = 123;
		System.out.printf("\n�ݴ�� %s %do\n", str, num);
		System.out.println("�ݴ�� " + str + " " + num + 'o');
		System.out.println('A'+'B');	// ���� + ���� = �����ڵ�(�ڹ�) ��
		System.out.println('A'+10); 	// ���� + ���� = �����ڵ�  + ����
		System.out.println('\u0041'); 	// �����ڵ�(16����)
		
	}
}
