package day07.extend;
// �����ڵ� ����̾� ���
public class Manager {
	
	int no;
	String name;
	int salary;
	String grade;

	Employee[] empList; // ������� ���

	
	Manager(int no, String name, int salary, String grade, Employee[] empList) {
		this.no = no;
		this.name = name;
		this.salary = salary;
		this.grade = grade;
		this.empList = empList;
	}

	void info() {
		System.out.println("��ȣ: " + no);
		System.out.println("�̸�: " + name);
		System.out.println("����: " + salary);
		System.out.println("����: " + grade);

		System.out.println("=====================");
		System.out.println("======���� ��� ���======");
		for (int i = 0; i < empList.length; i++) {
			empList[i].info();
		}
		/*
		 * for(Employee e : empList) {
		 * 		e.info(); 
		 * }
		 */
	}

}
