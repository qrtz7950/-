package kr.co.mlec.homework.homework08;

import java.util.Random;

/**
 * �ֻ��� ����
 * @author ��Ʈ����
 *
 */
public class Dice implements Game {
	
	public int startGame(int you) {
		
		Random r = new Random();
		int me = r.nextInt(6) + 1;
		int result = 0;
		String str;
		
		if(me == you) {
			str = "You win";
		}else {
			str = "You lose";
		}
		
		if(str == "You win") {
			result = 1;
		}
		
		System.out.println(str);
		
		return result;
	}
	
}
