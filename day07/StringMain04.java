package kr.co.mlec.day07;

public class StringMain04 {

	public static void main(String[] args) {
		
		String str = "Hello World";
		
		int searchIndex = str.indexOf('o');
		System.out.println("\'o\'��ġ : " + searchIndex);
		
		searchIndex = str.indexOf('o', 6);
		System.out.println("\'o\'��ġ : " + searchIndex);
		
		searchIndex = str.indexOf('p');
		System.out.println("\'p\'��ġ : " + searchIndex);
		
		searchIndex = str.indexOf("World");
		System.out.println("\"world\"��ġ : " + searchIndex);
		
		searchIndex = str.lastIndexOf('o');
		System.out.println("\'o\' ������ ��ġ : " + searchIndex);
		
		str = "hello world";
		char ch = 'l';
		
		System.out.println("-----------------------------------------");
		int index = str.indexOf(ch);
		while (index != -1) {
			System.out.println("�������� �ִ�" + ch + "��ġ: " + index);
			index = str.indexOf(ch,index+1);
		}
		//indexOf�� ���ڿ����� ���� �ϳ��� ��ġ���� ã�� �޼ҵ������� �̷��� Ȱ���ϸ�� ã������ �մ�
		System.out.println("-----------------------------------");
		index = -1;
		while(true) {
			index = str.indexOf(ch, index+1);
			if(index == -1) {
				break;
			}
			System.out.println(ch + " ��ġ : " + index);
		}
		// 239�� �����µ� 932�� ������ �ٲ㺸��
		
		
		
		
		
	}
}






