package day04;

public class LoopMain05 {

	public static void main(String[] args) {

		forI: for(int i =1; i<=3; i++) {			//forI��� �ν�ǥ�� ���ϼ��ִ�.
			System.out.println(i +"i for()�� ����");
			forJ: for(int j = 1; j <=2; j++) {
				System.out.println(j + "	j for()�� ����");
				//break forI;
				break forJ;
			}
			System.out.println("	j for()�� ����");
			
		}
		
		System.out.println("i for()�� ����");
	}

	int[] iArr = new int[4];
}
