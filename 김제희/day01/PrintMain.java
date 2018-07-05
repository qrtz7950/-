package kr.co.mlec.day01;

/*
 * ��¸޼ҵ忡��
 * System.out.print()
 * System.out.println()
 * System.out.printf()
 * �� ���� �޼ҵ� ��� �ֵ���ǥ ���� ������ ����ϴ� �޼ҵ��̴�
 * �ٸ� ���� �˾ƺ���
 */

public class PrintMain {

	public static void main(String[] args) {
		System.out.println(3);		//����
		System.out.println(3.14);	//�Ǽ�
		System.out.println("ABC");	//���ڿ�
		System.out.println('A');	//����
		//printf() �޼ҵ�� ���๮�ڸ� ������������, ��ȯ���ڸ� ���(%c, %d, %x, %o, %f, %d) JDK 1.5���ĺ��� ��밡��
		System.out.printf("%c\n", 'A');
		System.out.printf("%d\n", 3);
		System.out.printf("%.2f\n", 3.14);
		System.out.printf("%s\n", "ABC");
		System.out.printf("����: %s ����: %d\n", "ABC" , 3);
		//printf() �޼ҵ带 �� �̿��ϸ� ���ٿ� ���� �ڷ����� ��°����ϴ�
		//�ڹٿ��� ���ϱ� ������ �ٸ� Ÿ���� �ڷ����� �ڵ����� ��ȯ���ش�
		System.out.printf("����: " + 'A' + ", ����: " + 3 +"\n");
		//����:A, ����:3
		System.out.println('A'+"BC");	//ABC
		System.out.println(3 + 4);		//7
		System.out.println(2.3 + 5);	//7.3
		System.out.println('A' + 'B');	// 131
		// ���ڳ����� ���ϱ� ������ �ƽ�Ű�ڵ尪�� ���� ������ ǥ���ȴ� A+B = 131 A=65 B=66
		// �ڹٴ� �����ڵ� ����� ����̴�
		System.out.println('\u0041');	//A
		// 1 + 2 = 3�� ǥ���غ���
		System.out.println(1 + "+" + 2 + "=" +1+2); //1+2=12
		//�ڹٿ��� ������ ���ʿ������� �ΰ��� ����ϱ⶧���� ù��° ��� 1 �� +�� ���ϸ� string������ ��ȯ�ȴ�
		//������ ��굵 ��� string���� �Ǳ� ������ ������� 12�� �����Եȴ�
		System.out.println(1 + "+" + 2 + "=" + (1+2)); //1+2=3
		// 1+2 ������ ���������ؼ� 3���� �������Ҽ��ִ�
		System.out.printf("%d + %d = %d\n",1 ,2 ,3); //1+2=3
		// ��ȯ���ڸ� �̿��Ͽ� ���� �����ϰ� ǥ�� �����ϴ�
		System.out.println("[    A]");
		//****A
		System.out.println("[   12]\n\n");
		//***12
		//�տ� ���� ���߱Ⱑ �ʹ� ��Ƴ׿� ���� �غ��ô�
		System.out.printf("[%5c]\n", 'A');
		System.out.printf("[%5d]\n", 12);
		//[    A]
		//[   12]
		System.out.printf("[%-5c]\n", 'A');
		System.out.printf("[%-5d]\n", 12);
		//[A    ]
		//[12   ]
		System.out.printf("%f\n", 3.23); // 3.230000
		System.out.printf("%.2f\n", 3.23); // 3.23
		//�Ҽ��� �ڸ� ���� ����
	}
}