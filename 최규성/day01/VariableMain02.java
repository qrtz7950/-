package kr.co.mlec;

public class VariableMain02 {

	public static void main(String[] args) {
		
		int num = 10; //���� 10 num�� ����
		num = 200; //200���� ����
		System.out.println(num);
	
		String str = "hello";
		
		str = "world";
		System.out.println("str: " + str);
		
		String myStr = new String("hello"); //�����ڷ���: myStr�� "hello"�� ����ִ� �� �ٸ� String ������ ����Ű�� �־� "hello"�� ���������ʴ´�.
		System.out.println(myStr);
	}

}