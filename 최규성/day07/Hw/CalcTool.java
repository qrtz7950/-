package day07Hw;

public class CalcTool {

	CalcTool() {

	}

	CalcTool(int n, int a) {

		if (n == 1) {
			System.out.printf("���簢���� ������ %d �Դϴ�", a * a);
		} else {
			System.out.printf("���� ������ %d �Դϴ�", (int) (a * a * 3.14));
		}

	}

	CalcTool(int n, int a, int b) {

		if (n == 2) {
			System.out.printf("���簢���� ������ %d �Դϴ�", a * b);
		} else {
			System.out.printf("�ﰢ���� ������ %d �Դϴ�", a * b / 2);
		}

	}
}
