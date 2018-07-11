package day06;

public class StringMain03 {

	public static void main(String[] args) {

		String str = new String("Hello");
		// String str = "Hello";
		String str2 = new String("Hello");
		// String str2 = "Hello";

		if (str == str2) {
			System.out.println("str == str2");
		} else {
			System.out.println("str != str2");
		}

		// ���ڿ� ���� ��
		str = new String("HELLO");
		str2 = new String("hello");

		// boolean bool = str.equals(str2); // str�� str2�� ���� ���ڿ���
		boolean bool = str.equalsIgnoreCase(str2); // ��ҹ��� �����ϰ� ���ڿ� ��
		if (bool) {
			System.out.println("���� ���ڿ��Դϴ�");
		} else {
			System.out.println("�ٸ� ���ڿ��Դϴ�");
		}

		str = new String("Hello");
		bool = str.startsWith("He");
		if (bool) {
			System.out.println("[" + str + "]�� \"He\"�� �����մϴ�");
		} else {
			System.out.println("[" + str + "]�� \"He\"�� ���������ʽ��ϴ�");
		}

		str = "hello.txt";
		bool = str.endsWith(".txt");
		System.out.println("[" + str + "]�� " + (bool ? "�ؽ�Ʈ�����Դϴ�" : "�ؽ�Ʈ ������ �ƴմϴ�"));

		str = "apple";
		str2 = "banana";
		int compare = str.compareTo(str2);
		if (compare == 0) {
			System.out.println(str + "==" + str2);
		} else if (compare > 0) {
			System.out.println(str + ">" + str2);
		} else { // compare < 0
			System.out.println(str + "<" + str2);
		}

		String[] names = { "ȫ�浿", "���浿", "ȫ���", "�ڼ�ȫ", "ȫ�浿", "��ȫ��" };

		System.out.println("< �̸��� ȫ�浿�� ��� ��� ��ȸ >");
		for (String name : names) {
			if (name.equals("ȫ�浿"));{ // = if("ȫ�浿".equals(name));
				System.out.println(name);
			}
		}
		
		System.out.println("< ���� ȫ���� ��� ��ȸ >");
		for(String name : names) {
			if(name.startsWith("ȫ")) {
				System.out.println(name);
			}
		}
		System.out.println("< �̸��� �浿�� ��� ��ȸ >");
		for(String name : names) {
			if(name.endsWith("�浿")) {
				System.out.println(name);
				
			}
		}
		
		System.out.println("< ȫ�� ������ �ִ� ��� ��ȸ >");
		for(String name : names) {
			if(name.contains("ȫ")){
				System.out.println(name);
			}
		}
	}

}
