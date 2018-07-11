package day07;

import java.util.Arrays;

/*
 * ���ڿ� ��ȯ�� ������ ���ڿ��� �ǵ帮���ʰ� ��ȯ��Ų ���� ���Ͻ��� �����ش�.
 */
public class StringMain05 {

	public static void main(String[] args) {

		String str = "Hello World";

		String sub = str.substring(3, 9); // [3]~[9-1]
		String sub2 = str.substring(3); // [3]~[�������ڸ�����]

		System.out.println("sub: [" + sub + "]");
		System.out.println("sub2: [" + sub2 + "]");
		
		
		str = "Hello";
		//str => "Hello!!!!"�� ����
		//str = str + "!!!!"; //str�� ����ǥ 4���� ����
		str = str.concat("!!!!");
		System.out.println(str);
		
		//���ڿ��� ��� l�� r�� ����
		str = "Hello World";
		str = str.replace('l', 'r');
		System.out.println(str);
		
		str =("          Hello World          ");
		System.out.println(str.length());
		
		str = str.trim();
		System.out.println(str.length()); // ������ trim���� ����
		System.out.println(str);	//trim�� �翷�� ���鸸 ������
		
		str = "Hello World";
		System.out.println(str.toUpperCase());	//��� �빮��
		System.out.println(str.toLowerCase());	//��� �ҹ���
		
		String phone = "010-1111-2222";
		String[] strArr = phone.split("-");	// - �� �������� �迭 ����
		System.out.println(Arrays.toString(strArr)); //�迭�� ����
		
		
		String ip = "192.168.1.12";
		String[] ipArr = ip.split("\\."); //. �� �������� �迭 ����
		System.out.println(Arrays.toString(ipArr)); //�迭�� ����
		
		int num = 123; //123 => "123"
//		String strNum = num + ""; //�ļ�
		String strNum = String.valueOf(num); //���ڿ��� ��ȯ
		System.out.println(strNum);
		
		char[] chars = {'a', 'b', 'c', 'd'};
		String s = String.valueOf(chars);	//���ڿ��� ��ȯ
		System.out.println(s);
	}
}
