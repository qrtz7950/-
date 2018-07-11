package day07.stat;

public class Employee {

	String name;
	static int totalCnt; 	//static�� ���������� ��ü�� ���� ����� ������
							//�Ի� �ο��� ī��Ʈ �� �� ����.
	
	Employee(){
		totalCnt++;
	}
	
	Employee(String name){
		this.name = name;
		System.out.println(name + "����� �Ի��߽��ϴ�.");
		totalCnt++;
	}
	
	void info() {
		System.out.println("�����: " + name);
	}
	
	static void empCountInfo() {	 //static�� ����Ű�� ������ ������ �����Ű�� ���ÿ� �����ȴ�.
		System.out.println("�Ի��� �� �����: " +  Employee.totalCnt + "��");
	}
}
