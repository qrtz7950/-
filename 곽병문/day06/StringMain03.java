package kr.co.mlec.day06;

public class StringMain03 {

	public static void main(String[] args) {
		
		String str = new String("Hello");
		String str2 = new String("Hello");
		
		System.out.println("���ڿ� �ּ� ��");
		if(str == str2) {
			System.out.println("str == str2");
		}else {
			System.out.println("str != str2");
		}
		
//----------------------------------------------------------------
		System.out.println("���ڿ� ���� ��");
		if(str.equals(str2)) {
			System.out.println("���� ���ڿ��̴٤�");
		}else {
			System.out.println("���� ���ڿ��� �ƴѰ��� �ƴѰ��� �ƴϴ٤�");
		}
		
//----------------------------------------------------------------
		System.out.println("��ҹ��� ��� ��");
		str = new String("HELLO");
		str2 = new String("hello");
		
		if(str.equalsIgnoreCase(str2)) {
			System.out.println("���� ���ڿ��̴٤�");
		}else {
			System.out.println("���� ���ڿ��� �ƴѰ��� �ƴѰ��� �ƴϴ٤�");
		}

//----------------------------------------------------------------
		str = new String("Hello");
		boolean bool = str.startsWith("He");
		if(bool) {
			System.out.println(str +"�� �����Ѵٴ���");
		}else {
			System.out.println(str +"�� ���۾��Ѵٴ���");
		}
		
//----------------------------------------------------------------
		str = new String("Hello.txt");
		bool = str.endsWith(".txt");
		if(bool) {
			System.out.println(str +"�ؽ�Ʈ �����̴���");
		}else {
			System.out.println(str +"�ؽ�Ʈ ������ �ƴϴٴ���");
		}
		
//----------------------------------------------------------------
		str = "apple";
		str2 = "banana";
		
		int compare = str.compareTo(str2);
		if(compare == 0) {
			System.out.println(str+" == "+str2);
		}else if(compare > 0) {
			System.out.println(str+" > "+str2);
		}else {
			System.out.println(str+" < "+str2);
		}
//----------------------------------------------------------------
		String[] names = {"ȫ�浿", "���浿", "ȫ���", "�ڼ�ȫ", "ȫ�浿", "�ڱ浿"};
		
		System.out.println("�̸��� ȫ�浿�� ��� ��� ��ȸ >");
		
		for(String name : names) {
			if(name.equals("ȫ�浿")) {
				System.out.println(name);
			}
		}
		
//----------------------------------------------------------------
		System.out.println("���� ȫ���� ��� ��ȸ >");
		
		for(String name : names) {
			if(name.startsWith("ȫ")) {
				System.out.println(name);
			}
		}
		
//-----------------------------------------------------------------
		System.out.println("�̸��� ȫ �� ��� ��ȸ >");
		
		for(String name : names) {
			if(name.contains("ȫ")) {
				System.out.println(name);
			}
		}
		
	}	
}
