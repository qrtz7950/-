package kr.co.mlec.day01;

public class VariableMain02 {

	public static void main(String[] args) {
		
		int num = 10;			// ���� 10�� �����ϴ� ���� num ����
		
		num = 200;				// num ���� 200���� ����
		
		String str = "hello";	// ���ڿ� "hello" �����ϴ� ���� str ����
		
		str = "world";			// str ���� world�� ����
		
		System.out.println("str : " + str);
		
		Test t = new Test();
		t.a = 1;
		t.str = "aa";
		
		System.out.println(t.a + t.str);
		

	}

}

class Test{
	int a;
	String str;
}