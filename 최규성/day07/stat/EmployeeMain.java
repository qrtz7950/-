package day07.stat;

public class EmployeeMain {

	public static void main(String[] args) {
		Employee.empCountInfo();
		
		/*Employee e = new Employee();
		e.name = "ȫ�浿";
		
		Employee e2 = new Employee();
		e2.name = "���浿"; */ //�ܺο��� .name���� �����ϴ°� �����ʴ�
							//������ ���� Ŭ�������Ͽ��� �����ϴ� ���� ����.
		Employee e = new Employee("ȫ�浿");
		Employee e2 = new Employee("���浿");
		
		System.out.println("�Ի��� �� �ο���: " + e.totalCnt + "��");
	
		
		e.info();
		e2.info();
	
		Employee.empCountInfo();
	}

}
