package kr.co.mlec.day07.stat;

public class EmployeeMain {

	public static void main(String[] args) {
		
		Employee e = new Employee("������");
		
		Employee e2 = new Employee("�ּ���");
		
		Employee.howMany();
		
		e.info();
		e2.info();
		
		e.setName("Ŵ����");
		e.info();
	}

}
