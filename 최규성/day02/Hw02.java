package day02;

public class Hw02 {

	public static void main(String[] args) {
		
		int a = 3661;
		int h, m, s;
		
		h = a%60;
		m = h%60;
		s = m%60;
		
		System.out.println("��� ���: " + h +"�ð�" + m + "��" + s + "��");
	}

}
