package day04;

public class ArrayMain01 {

	public static void main(String[] args) {

		int[] iArr = new int[5]; //iArr�� ��������
		
		System.out.println("iArr: " + iArr); //��°�� iArr: [I@7852e922
		System.out.println("iArr�迭 ������ ����: "+ iArr.length + "��");
		
		
		System.out.println(iArr[0]); //��°�� 0 (�迭�̸�������鼭 �ʱ�ȭ�� 0�̵�)
		System.out.println(iArr[1]);
		System.out.println(iArr[2]);
		System.out.println(iArr[3]);
		System.out.println(iArr[4]);
		
		iArr[0] = 10;
		iArr[1] = 20;
		iArr[2] = 30;
		iArr[3] = 40;
		iArr[4] = 50;
		
		for(int i = 0; i <iArr.length;i++) {
			iArr[i] = (i+1) * 10;
		}
		
		for(int i = 0; i <5 ; i++) {
			System.out.print(iArr[i]+" ");
		}
		
		System.out.println();
	}

}
