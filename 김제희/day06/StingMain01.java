package kr.co.mlec.day06;
/*
 * String ������
 * 1. String()
 * 2. String(char[])
 * 3. String(char[], int, int)
 * 4. String(String)
 * 5. String(byte[])
 * 6. String(byte[], int, int)
 * 
 * 
 */
public class StingMain01 {

	public static void main(String[] args) {

		String str = new String();
		System.out.println("str : [" + str + "]");
		
		String str2 = null;
		System.out.println("str2 : [" + str2 + "]");
		
		System.out.println(str.length()); 		// 0
		//System.out.println(str2.length()); 	//����Ű���ִ� ���� ���⶧���� �޼ҵ� ȣ�� �Ұ�
		
		
		char[] chars = {'a', 'b', 'c', 'd', 'e', 'f', 'g'};
		str2 = new String(chars);
		
		System.out.println("str  : [" + str + "]");
		System.out.println("str2 : [" + str2 + "]");
		
		String str3 = new String(chars,2,3);
		System.out.println("str3 : [" + str3 + "]");
		//[cde]
		
		String str4 = new String("Hello");
		System.out.println("str4 : [" + str4 + "]");
		
		byte[] bytes = {65,66,67,68,69,70};
		String str5 = new String(bytes);
		System.out.println("str5 : [" + str5 + "]");
		// ���ݱ��� ���ڵ��� ������ ���ڿ��� ����
		
		//���ڿ��� ���ڷ� ����� �޼ҵ嵵 �ִ�
		
	}

}
