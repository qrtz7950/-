package day07.extend;

public class Manager01 extends Employee {

	Employee[] empList;

	Manager01() {
		// ����Ʈ �����ڸ� ���� ����� �ش�.
	}

	Manager01(int no, String name, int salary, String grade, Employee[] empList) {
		super(); // �Ƚ��� �־ �̰� ����Ʈ��, ��������
		this.no = no;
		this.name = name;
		this.salary = salary;
		this.grade = grade;
		this.empList = empList;
	}

	void info() {
		super.info();
		System.out.println("��ȣ: " + no);
		System.out.println("�̸�: " + name);
		System.out.println("����: " + salary);
		System.out.println("����: " + grade);

		System.out.println("=====================");
		System.out.println("======���� ��� ���======");
		for (int i = 0; i < empList.length; i++) {
			empList[i].info();
		}
	}
}
