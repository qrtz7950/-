package kr.co.mlec.day06;

public class StingMain03 {

	public static void main(String[] args) {

		String str = "Hello";
		String str2 = "Hello";
		
		System.out.println("���ڿ� �ּ� ��");
		if(str == str2) {
			System.out.println("str == str2");
		} else {
			System.out.println("str != str2");
		}
		
		//�̰� �ּ� �� �񱳱� ������ ���ٰ� ���´� stack�� �ִ� ���� hello�� ����Ű�� �ּҰ��� �������ִ�
		
		String str3 = new String("Hello");
		String str4 = new String("Hello");
		
		if(str3 == str4) {
			System.out.println("str3 == str4");
		} else {
			System.out.println("str3 != str4");
		}	
		
		//�ּҰ��� �ٸ���
		System.out.println();
		//�ּҰ��� �ƴ϶� ���ڿ� ���� �񱳸� �غ���
		
		boolean bool = str.equals(str2);
		
		System.out.println("���ڿ� ���� ��");
		if(bool) {
			System.out.println("���� ���ڿ�");
		} else {
			System.out.println("�ٸ� ���ڿ�");
		}
		//�ּҰ��� �ƴ϶� ������ ���Ѵ�
		//������ ���� ���ڴ�
		
		System.out.println();
		
		//��ҹ��ڸ� �����ϰ� ���غ���
		String str5 = "Hello";
		String str6 = "hello";
		
		boolean bool2 = str.equalsIgnoreCase(str2);
		
		System.out.println("��ҹ��ڸ� ������ ���ڿ� ���� ��");
		if(bool2) {
			System.out.println("���� ���ڿ�");
		} else {
			System.out.println("�ٸ� ���ڿ�");
		}
		
		System.out.println("�����ϴ� ���ڰ� �������?");
		String str7 = new String("Hello");
		boolean bool3 = str.startsWith("He");
		if(bool3) {
			System.out.println(str + "�� He�� �����մϴ�");
		} else {
			System.out.println(str + "�� He�� �� ���������ʽ��ϴ�");
		}
		
		System.out.println("������ ���ڰ� �������?");
		str7 = "Hello.txt";
		boolean bool4=str.endsWith(".txt");
		System.out.println(str7 + "��" + (bool?"�ؽ�Ʈ �����Դϴ�":"�ؽ�Ʈ������ �ƴմϴ�"));
		
		System.out.println("� ���ڰ� �� Ŭ���?(���������� �ڷ� ���� ���ڰ� �����)");
		str = "apple";
		str2 = "banana";
		int compare = str.compareTo(str2);
		if(compare == 0) {
			System.out.println(str + " == " +str2);
		} else if (compare > 0) {
			System.out.println(str + " > " +str2);
		} else {
			System.out.println(str + " < " +str2);
		}
		
		System.out.println();
		String [] names = {"������", "������", "������", "������", "������", "�ֱԼ�"};
		System.out.println("�̸��� �������� ��� �����ȸ");
		
		for(String name : names) {
			if(name.equals("������")) {
				System.out.println(name);
			}
		}
		
		System.out.println("�̸��� ������ �����ϴ� ��� ���");
		for(String name : names) {
			if(name.startsWith("��")) {
				System.out.println(name);
			}
		}
		
		System.out.println("�̸��� ������ ��� ��ȸ ");
		for(String name : names) {
			if(name.endsWith("����")) {
				System.out.println(name);
			}
		}
		
		System.out.println("���� ������ �ִ� ��� ��ȸ ");
		for(String name : names) {
			if(name.contains("��")) {
				System.out.println(name);
			}
		}
	}

}
