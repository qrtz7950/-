package day09;

public class ExceptionMain03 {

	public static void main(String[] args) {

		System.out.println("main start...");

		for (int i = -2; i < 4; i++) {
			try {
				System.out.println(10 / i);
			} catch (Exception e) {
				e.printStackTrace();
				System.out.println("���� �߻�");
			} finally {	//���ܰ� ������ �� ������
				System.out.println("�ݺ��� ������"); //���ܰ� ���ܵ� �ٷ� ĳġ�� �Ȱ��� ��ο츦 ����ϰ� ����ó������
			}
		}
		System.out.println("main end...");
	}
}
