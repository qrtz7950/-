package kr.co.mlec.day07.stat;

public class EmployeeMain {

	public static void main(String[] args) {
		
		Employee.employeeInfo();
		System.out.println("�� �Ի� �ο�: " + Employee.totalCnt + "��");
		
//		Employee e = new Employee();
//		e.name = "ȫ�浿";
//
//		Employee e2 = new Employee();
//		e.name = "���浿";
//		����������� ����Ǵ� ���� ���� ����� �ƴϱ� ������ �Ʒ��� ����� ����������
		
		Employee e = new Employee("ȫ�浿");
		Employee e2 = new Employee("���浿");
		
		System.out.println("�� �Ի� �ο�: " + Employee.totalCnt + "��");
		
		e.info();
		e2.info();
		
		
	}
}
