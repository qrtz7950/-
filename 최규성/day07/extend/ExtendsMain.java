package day07.extend;

class A{
	A(){
		System.out.println("A()������ ȣ��...");
	}
}

class B extends A{
	B(){
		System.out.println("B()������ ȣ��...");
	}
}

class C extends B{
	C(){
		System.out.println("C()������ ȣ��...");
	}
}
public class ExtendsMain {

	public static void main(String[] args) {

		new C();
		
	}

}
