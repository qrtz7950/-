package day04;

public class ArrayMain02 {

	public static void main(String[] args) {

		//"û��""�ڹ�""����" 3���� ���ڿ��� �����ϴ� �迭 strArr ����
		
		String[] strArr = new String[3];
		//String[] strArr = new String[]{"û��","�ڹ�","����"};
		//String[] strArr = {"û��","�ڹ�","����"};
		strArr[0] = "û��";
		strArr[1] = "�ڹ�";
		strArr[2] = "����";
		
		for(int i = 0; i<strArr.length; i++) {
			System.out.println(strArr[i]);
		}
	}

}
