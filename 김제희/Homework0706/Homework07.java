package kr.co.Homework0706;

public class Homework07 {

	public static void main(String[] args) {
		
		int h = 0;
		int t = 0;
		
		System.out.println("������ ���ö��!");
		
		while(h<100) {
			h += 5;
			t++;
			if(h<50) {
				h -=1;
			} else {
				h -=2;
			}
			System.out.printf("[%d�ð���] �����̰� �ö� �� ���� : %d\n",t,h);
		}
		System.out.printf("�����̰� �� %d�ð��� �ɷ� �� �ö�Ծ��\n",t);
		
	}

}
