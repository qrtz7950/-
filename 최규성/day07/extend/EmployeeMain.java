package day07.extend;

public class EmployeeMain {

	public static void main(String[] args) {

		Employee e = new Employee(1, "ȫ�浿", 3000, "���");
		Employee e2 = new Employee(2, "���浿", 3200, "���");
		Employee e3 = new Employee(3, "�ֱ浿", 3500, "�븮");
		Employee e4 = new Employee(4, "�ѱ浿", 3800, "�븮");
		Employee e5 = new Employee(5, "�ڱ浿", 4300, "����");

		e.info();
		
		e2.info();
		e3.info();
		e4.info();
		e5.info();
		
		Employee[] empList = {e, e4, e5};
		Manager01 m = new Manager01(100,"������", 6000, "����", empList);

		m.info();
	}

}
