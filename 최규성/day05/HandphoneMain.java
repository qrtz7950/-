package day05;

public class HandphoneMain {

	public static void main(String[] args) {

		// �̸�: ȫ�浿, ��ȭ��ȣ: 010-1111-2222, ������ : �Ｚ�� ������ �ڵ�����ü hp����

		Handphone hp = new Handphone();
		hp.name = "ȫ�浿"; // �������� hp����
		hp.phone = "010-1111-2222";
		hp.company = "SAMSUNG";
		System.out.println(hp.name + "," + hp.phone + "," + hp.company);

		Handphone hp2 = new Handphone();
		hp2.name = "���浿";
		hp2.phone = "010-3333-4444";
		hp2.company = "APPLE";
		System.out.println(hp2.name + "," + hp2.phone + "," + hp2.company);

		Handphone hp3 = new Handphone();
		hp3.name = "�ֱ浿";
		hp3.phone = "010-5555-6666";
		hp3.company = "LG";
		System.out.println(hp3.name + "," + hp3.phone + "," + hp3.company);
		System.out.println();
////////////////////////////////////////////////////////////////////////////
		Handphone[] hpArr = { hp, hp2, hp3 };

		for (int i = 0; i < hpArr.length; i++) {
			System.out.println("������: " + hpArr[i].name + "��ȭ��ȣ: " + hpArr[i].phone + "������: " + hpArr[i].company);
		}
		System.out.println();
///////////////////////////////////////////////////////////////////////////
		for (Handphone phone : hpArr) {
			System.out.println(phone.name + " " + phone.phone + " " + phone.company);
		}
		System.out.println();
/////////////////////////////////////////////////////////////////////////////
		Handphone[] hArr = new Handphone[3];
		
		//�ۼ��ؾ��ϴ� ���� �ľ��� ��
		for(int i =0 ; i <hArr.length; i++) {
			hArr[i] = new Handphone();
		}
		hArr[0].name = "ȫ�浿";
		hArr[0].phone = "010-1111-2222";
		hArr[0].company = "SAMSUNG";

		for(Handphone phone : hArr) {
			System.out.println(phone.name+" "+phone.phone+" "+ phone.company);
		}
	}

}
