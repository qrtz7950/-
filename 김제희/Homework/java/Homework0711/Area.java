package kr.co.Homework0711;

public class Area {
	void getArea(int i, int rand) {
		
		double area = rand * rand;
		
		if(i == 4) {
			area = area *3.14; 
			System.out.printf("���� ���̴� %.0f�Դϴ�", area);
		} else {
		System.out.printf("���簢���� ���̴� %.0f",area);
		}
	}
	
	void getArea(int i, int rand, int rand2) {
		
		double area = rand * rand2;
		
		if(i == 3) {
			area = area/2;
			System.out.printf("�ﰢ���� ���̴� %.0f�Դϴ�", area);
		} else {
		System.out.printf("���簢���� ���̴� %.0f�Դϴ�", area);
		}
	}
}
