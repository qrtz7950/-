package day09.exam;

class Cat /* extends Object */ {
	private String name;
	private int age;

	Cat(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return this.name;
	}

	public int getAge() {
		return this.age;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public void info() {
		System.out.println("name: " + name + ", age" + age);
	}

	@Override
	public String toString() {
		return "Cat [name: " + name + ", age: " + age + "]";
	}
	/*
	 * @Override public String toString() { return"name: "+ name +", age: "+ age; }
	 */
}

public class CatMain {
	public static void main(String[] args) {
		Cat c = new Cat("����", 3);

		System.out.println("����� �̸�: " + c.getName());
		c.setName("����"); // ����
		c.info();

		System.out.println("c: " + c); // �ؿ��ٰ� ��°���
		System.out.println("c: " + c.toString());

		String str = new String("Hello");
		System.out.println("str: " + str);
		System.out.println("str: " + str.toString());

		while (true) {		//if�� ����� ����ó��
			Cat c2 = null;

			if (c2 != null) {
				System.err.println("c2: " + c2.toString());
			} else {
				System.out.println("��ü����");
			}

		}
	}
}
