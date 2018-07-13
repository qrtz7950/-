package kr.co.mlec.day09;

class Cat{
	
	private String name;
	private int age;
	
	Cat(String name, int age){
		this.name = name;
		this.age = age;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public int getAge() {
		return age;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	@ Override
	public String toString() {
		return "�̸� : " + name + ", " + age + "��";
	}
}

public class CatMain {

	public static void main(String[] args) {
		Cat c = new Cat("�߿���", 2);
		
		System.out.println("�̸� : " + c.getName() + ", " + c.getAge() + "��");
		
		c.setName("���");
		c.setAge(3);
		
		System.out.println("�̸� : " + c.getName() + ", " + c.getAge() + "��");
		
		System.out.println("c : " + c);
		System.out.println("c : " + c.toString());
		
		String str = "����";
		System.out.println(str);
		System.out.println(str.toString());
		
		while(true) {
			Cat c2 = null;
			try {
				System.out.println("c2 : " + c2.toString());
			}catch(Exception e){
				System.out.println("����");
				break;
			}
		}
	}

}
