package kr.co.mlec;

public class PrintMain {

	public static void main(String[] args) {
		System.out.println("11111"); //���๮�� ����
		System.out.print('��');//���๮�� ������, ����('A') ����(3) �Ǽ�(3.14) ���ڿ�("ABCdef") 4���� ��� ��� ����
		System.out.print(3);
		System.out.print(3.14);
		System.out.print("ABCDEF");
		System.out.printf("33333"); //���๮�� ������, ��ȯ���� ���(%c(����) ,d(����),  x, o, f(�Ǽ�), d, s(���ڿ�) JDK1.5�̻� printf��밡��
		System.out.printf("%c",'A');
		System.out.printf("%s","ABC");
		System.out.printf("%d", 123);
		System.out.printf("%.4f", 123.456);
		System.out.printf("����: %s, ����: %d","ABC", 123);
		System.out.println('A' + 'B'); //131(�ƽ�Ű�ڵ� ��)
		System.out.println('\u0041'); //A (�����ڵ�)
		System.out.printf("[%6d]",3);
		System.out.printf("[%-6d]", 6);
	}

}
