package kr.co.mlec.day07.extend;

public class EmployeeMain {

	public static void main(String[] args) {
		
		Employee[] e = new Employee[5];
		
		e[0] = new Employee(1, "ȫ�浿", 280, "���");
		e[1] = new Employee(2, "���浿", 300, "���");		
		e[2] = new Employee(3, "�ֱ浿", 330, "�븮");		
		e[3] = new Employee(4, "�ѱ浿", 350, "�븮");		
		e[4] = new Employee(5, "�ڱ浿", 380, "����");
		
		e[0].info();
		e[1].info();
		e[2].info();
		e[3].info();
		e[4].info();
		
		Employee[] empList = {e[0], e[2], e[4]};
		
		Manager m = new Manager(100, "���ְ�", 500, "����", empList);
		m.info();
		
		m.display();

	}

}
