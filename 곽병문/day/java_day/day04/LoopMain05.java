package kr.co.mlec.day04;

/* 
 * �ν�ǥ �̿��� break(while, do while, for, switch���� �ν�ǥ ����)
 */

public class LoopMain05 {

	public static void main(String[] args) {
		
		forI: for(int i=1; i<=3; i++) {
			System.out.println("i for()�� ����");
			forJ: for(int j=1; j<=2; j++) {
				System.out.println("\tj for()�� ����");
				break forI;
			}
			System.out.println("\tj for()�� ����");
		}
		System.out.println("i for()�� ����");

	}

}
