package kr.co.mlec.day07;

import java.util.Arrays;

public class StringMain05 {

	public static void main(String[] args) {
		
		String str = "Hello World";
		
		//���ڿ��� ���ϴ� ��ŭ�� ����ϴ� �޼ҵ�
		String sub = str.substring(3,9); // [3] ~ [9-1]
		String sub2 = str.substring(3); // �Ǹ���������
		//�ش� �޼ҵ嵵 �����ε��� �����Ѵ�
		
		System.out.println(sub);
		System.out.println(sub2);
		
		//���ڿ��� ���ϴ� �޼ҵ�
		str = "Hello";
		str = str + "!!!!";
		System.out.println(str);
		//�޼ҵ带 �̿��� ������ ��������
		str=str.concat("!!!!");
		System.out.println(str);
		
		//���ڳ� ���ڿ��� ġȯ�ϴ� �޼ҵ�
		str = "Hello World";
		System.out.println(str);
		str = str.replace('l', 'r');
		str = str.replace("l", "rr");
		System.out.println(str);
		
		//������ ������ �޼ҵ�
		//�¿츸 ������ �߰��� ������ ������ �ʴ´�
		str = "      Hello      ";
		System.out.println("[" + str + "] ���� : " + str.length());
		
		str = str.trim();
		System.out.println("trim() �� [" + str + "] ���� : " + str.length());
		
		//��ҹ��� ���� �޼ҵ�
		str = "Hello World";
		System.out.println("�빮�� ���� : " + str.toUpperCase());
		System.out.println("�ҹ��� ���� : " + str.toLowerCase());
		
		//���ڿ� �ɰ��� �޼ҵ�
		
		String phone = "010-1111-2222";
		
		String[] strArr = phone.split("-");
		System.out.println("split() arr : " + Arrays.toString(strArr));
		
		String ip = "192.168.1.12";
		String[] arr = ip.split("\\."); // ���������� �Է��ϱ����� �������� �ι� ���� �Է��ϱ����� \.������ �Է�
		System.out.println("arr : " + Arrays.toString(arr));
		
		//���ڸ� ���ڿ� Ÿ������  ���ڿ��� ���ڷ� �ٲٰ� ������ ���� �޼ҵ�
		int num = 123;
		//123 => "123" ��ȯ
		//String strNum = num + "";
		String strNum = String.valueOf(num);
		
		char[] chars = {'A','B','C','D','E','F','G'};
		str = String.valueOf(chars);
		System.out.println(str);
		
		
	}
}






