package day07;

public class StringMain04 {

	public static void main(String[] args) {

		String str = "Hello World";

		int searchIndex = str.indexOf('o');
		System.out.println("�տ��� ������\'o\'��ġ: " + searchIndex);

		int searchLastIndex = str.lastIndexOf('o');
		System.out.println("�ڿ��� ������ \'o\'��ġ: " + searchLastIndex);

		searchIndex = str.indexOf("World");
		System.out.println("\'World\'��ġ: " + searchIndex);

		str = "hello world";
		char ch = 'l';

		int index = str.indexOf(ch); // ã�� ���ڰ� �ִ� �������� ������ ����
		while (index != -1) {
			System.out.println(ch + " �� ��ġ: " + index);
			index = str.indexOf(ch, index + 1);
		}
		System.out.println("----------------------");
		index = -1;
		while (true) {
			index = str.indexOf(ch, index + 1);
			if (index == -1) {
				break;
			}
			System.out.println(ch + " �� ��ġ: " + index);
		}
		
	}

}
