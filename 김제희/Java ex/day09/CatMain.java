package kr.co.mlec.day09;

class Cat { 
	
	private String name;
	private int age;
	
	Cat(String name, int age){
		this.name = name;
		this.age = age;
	}
	
	public void info() {
		System.out.println("name: " + name + " age: " + age);
	}
	
	//�Ϲ������� ��������� ���� �����ֱ����� get�� ���� �޼ҵ带 �̿��Ѵ�
	//ex) getName() getAge()
	
	public String getName() {
		return this.name;
	}
	public int getAge() {
		return this.age;
	}
	
	//�Ϲ������� �ܺο��� �Ѱ��ִ� ������ ������� ������ �ٲٰ� ���� �� set�� ���
	public void setName(String name) {
		this.name = name;
	}
	public void setAge(int age) {
		this.age = age;
	}

	//�̷� �⺻������ getter setter �޼ҵ�� ��Ŭ���� �������� 
	//Source - Generate getters and setters �� ������ ���� �޼ҵ带 �ڵ����� ����� �ִ�
	
//	@Override //������̼����� �������̵尡 �̴��� Ȯ�ΰ���
//	//��ü�� ���� ����������� ���� �� �ֵ���  toString�� ���� �������̵��Ѵ�
//	public String toString() {
//		return "name: " + name + " age: " + age;
//	}
	
	//Source -  Generate toString �� �̿��Ͽ� ��ü������ ����� �� �ּҰ��� �ƴ� Ŭ������ ���������
	//����ϴ� toString�� �������̵��� �޼ҵ带 �ڵ����� ������ �� �ִ�.
	
	@Override
	public String toString() {
		return "Cat [name=" + name + ", age=" + age + "]";
	} 
	//�ڵ�����
	//Cat c = new Cat();
	//���� c�� ����ϸ� �ּҰ��� �ƴ� ����������� ����Ѵ�
	
	
}

public class CatMain {
	
	public static void main(String[] args) {
		
		Cat c = new Cat("����", 3);
		
		c.info();
		System.out.println("�����: " + c.getName());
		
		System.out.println("������̸��̶� ���̸� �ٲ�����ڴ�");
		c.setName("��û��");
		c.setAge(4);
		c.info();
		
		System.out.println("c: " + c);
		System.out.println("c: " + c.toString());
		//��ü�� ��ü ������ �ǻ������ �⺻�� �޼ҵ��̴�
		//������ ���� c�� �׳� ����ϴ� ���� �Ʒ� �ٰ� ���� �޼ҵ尡 �����Ǿ��ִ°��̴�
		//��� Ŭ������ �⺻������ ObjectŬ������ ��ӹޱ� ������ ����
		//�ش� Ŭ�������� toString hashcode ���� �޼ҵ尡 ����ִ�
		//������ toString�� �������̵��Ͽ� ����������� �����ִ� �޼ҵ尡 �Ǿ���
		
		String str = new String("Hello");
		System.out.println("str: " + str);
		System.out.println("str: " + str.toString());
		
		//�� �ڵ嵵 ������ str���� ������ �ּҰ��� �����ϳ� 
		//value�� �����ϵ��� �������̵�Ǿ��ֱ⶧���� Hello�� ���
		
		while(true) {
			Cat c2 = null; /*new Cat("�۸���", 6);*/
			System.out.println("c2: " + c2.toString());
			//�߰��� ������ ����� ����Ǿ���ϳ� ������� �ʰ� ��� ����Ʈ��� ����ǵ����ϰ�ʹ�
			//�̷� �� ����ó���� ����Ѵ�
			//if�� else if�� �̿��Ͽ� ��κ��� �������� ��� �����ϳ�
			//�����ڰ� �������� ���� �κе� ����Ʈ ��� �ڵ����� �̰��� �����Ҽ� �ְ��ϴ°�
		}
		
		
		
	}

}
