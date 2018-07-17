package kr.co.mlec.day11;

import java.io.FileReader;
import java.io.FileWriter;

import kr.co.mlec.util.FileClose;

// FileMain05�� io�� ��ġ�� fileIOMain03���� ������

public class FileMain05 {

	public static void main(String[] args) {
		
		FileReader fr = null;
		FileWriter fw = null;
		
		try {
			fr = new FileReader("io/FileMain03.java");
			fw = new FileWriter("io/FileMain03.java.txt" , true); //�ڿ� �Ҹ��� �߰��Ͽ� Ȯ���� ��� �����
			
			while(true) {
				int c = fr.read();
				if(c==-1) break;
				fw.write(c);
			}
			fw.flush();
			
			System.out.println("���������� �Ϸ�");
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			
			FileClose.close(fr);
			FileClose.close(fw);
			
			/*			
			if(fr != null) {
				try {
					fr.close();
				} catch(Exception e) {
					e.printStackTrace();
				}
			}
			if(fw != null) {
				try {
					fw.close();
				} catch(Exception e) {
					e.printStackTrace();
				}
			}
*/
		}
	}
}







