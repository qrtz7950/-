package day09;

import java.util.Scanner;

public class ExceptionMain06 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		try {
			System.out.println("Sign In your ID: ");
			String id = sc.nextLine();

			if (id.length() < 5) { // ID�� 5�� �̸��̸� ���ܷ� ó���ϰ����
				//throw new Exception("ID�� �ּ� 5�����̻��Դϴ�."); // ���� ���ܷ� �����ϰ����
				throw new CheakIDException("ID�� �ּ� 5�����̻��Դϴ�.");	//����ó�� �������� �߰�
			}
			System.out.println("ID�� ����߽��ϴ�.");
			System.out.println("ID: " + id);
		} catch (Exception e) {
			e.printStackTrace();

		}

	}

}
