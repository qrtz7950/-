package day06;

/*
 * String ������
 * 1. String()
 * 2. String(char[])
 * 3. String(char[],int, int)
 * 4. String(String)
 * 5. String(byte[])
 * 6. String(byte[], int, int)
 */
public class StringMain01 {

	public static void main(String[] args) {

		String str = new String();	//str�� �ƹ��͵� ���� ���ڿ��� ����Ų��.
		
		char[] chars = {'a', 'b', 'c','d','e','f','g'};
		
		System.out.println(chars);
		
		//String str2 = null;	//str2�� �ƹ��͵� ����Ű���ʰ� null���� ���´�.
		String str2 = new String(chars);
		String str3 = new String(chars, 2, 3);
		String str4 = new String("Hello!");
		
		byte[] bytes = {65,66,67,68,69,70};	//�빮�� �����ڵ�
		String str5 = new String(bytes);
		
		System.out.println("str: ["+ str+ "]");
		System.out.println("str2: ["+ str2+ "]");
		System.out.println("str3: ["+ str3+ "]");
		System.out.println("str4: ["+ str4+ "]");
		System.out.println("str5: ["+ str5+ "]");
	}

}
