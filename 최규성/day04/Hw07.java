package day04Hw;

public class Hw07 {

	public static void main(String[] args) {

		int m = 0; // ����
		int h = 0; // �ð�

		/*for (int i = 0; i < 35; i++) {
			h++;
			m = m + 5;
			if (m < 50) {
				m = m - 1;
				System.out.println("[" + h + "�ð���] �����̰� �ö� �� ����: " + m + "M");
			} else if (m >= 50) {
				m = m - 2;
				System.out.println("[" + h + "�ð���] �����̰� �ö� �� ����: " + m + "M");
			} else if (m > 100) {
				
				System.out.println("[" + h + "�ð���] �����̰� �ö� �� ����: " + m + "M");
				break;
			}

		}*/
		
		while(m<100) {
			m += 5;
			m = m < 50 ? m-1 : m-2;
			System.out.println("["+ ++h + "�ð���] ������ ����: "+ m + "M");
		}

		
	}
}
