package kr.co.mlec.day05;

public class HandphoneMain {

	public static void main(String[] args) {
		Handphone hp = new Handphone();
		//�ڵ��� �ν���Ʈ ��ü ����
		System.out.println("name: " + hp.name); 
		System.out.println("phone: " + hp.phone); 
		System.out.println("company: " + hp.company); 
		
		System.out.println(); 
		//�ڵ��ʱ�ȭ �ʱⰪ null���� ����մ�
		
		hp.name = "������";
		hp.phone = "010-1234-5678";
		hp.company = "�������ݾ�";
		
		System.out.println("name: " + hp.name); 
		System.out.println("phone: " + hp.phone); 
		System.out.println("company: " + hp.company); 
		
		//�ڵ����� �Ѱ� �� ������
		
		Handphone hp2 = new Handphone();
		
		hp2.name = "������";
		hp2.phone = "010-9012-3456";
		hp2.company = "������";
		
		Handphone hp3 = new Handphone();
		
		hp3.name = "����";
		hp3.phone = "010-7890-1234";
		hp3.company = "�ؾ!";
		
		System.out.println("name: " + hp.name + "��ȭ��ȣ: " + hp.phone + "�Ҽ�: " + hp.company);
		System.out.println("name: " + hp2.name + "��ȭ��ȣ: " + hp2.phone + "�Ҽ�: " + hp2.company);
		System.out.println("name: " + hp3.name + "��ȭ��ȣ: " + hp3.phone + "�Ҽ�: " + hp3.company);
		System.out.println();
		
		//���� �̰��� �迭�� �̿��Ͽ� ���� ������ ��  �� �ִ�
		Handphone [] hpArr = {hp, hp2, hp3};
		
		for(int i=0; i<hpArr.length; i++) {
			System.out.println("������: " + hpArr[i].name + "��ȭ��ȣ: " + hpArr[i].phone + "�Ҽ�:" + hpArr[i].company);
		}
		
		System.out.println();
		
		for(Handphone phone : hpArr) {
			System.out.println("������ : " + phone.name + ", ��ȭ��ȣ : " + phone.phone + ", ������ : " + phone.company);
		}
		
		System.out.println("=========================================================");
		
		Handphone [] hArr = new Handphone[3];
		
		//��������� ���� �ڵ������� �迭�� ����� ���̰� �� �ּҰ��� ��ü�� ����Ű�� ���� �ƴϱ⶧����
		//�Ʒ��� ���� ������ �迭�� �ּҰ��� ��ü�� ����Ű���� �ؾ��Ѵ�
		
		for(int i=0; i<hArr.length; i++) {
			hArr[i] = new Handphone();
		}
		
		hArr[0].name = "ȫ�浿";
		hArr[0].phone = "010-1111-2222";
		hArr[0].company = "�Ｚ";
		
		hArr[1].name = "���浿";
		hArr[1].phone = "010-3333-4444";
		hArr[1].company = "����";
		
		hArr[2].name = "�ֱ浿";
		hArr[2].phone = "010-5555-666";
		hArr[2].company = "����";
		
		for(Handphone phone : hArr) {
			System.out.println("������ : " + phone.name
							+ ", ��ȭ��ȣ : " + phone.phone
							+ ", ������ : " + phone.company);
		}
		
		
	}

}
