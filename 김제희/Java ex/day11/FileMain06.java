package kr.co.mlec.day11;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

import kr.co.mlec.util.FileClose;

// FileMain05�� io�� ��ġ�� fileIOMain03���� ������

public class FileMain06 {

	public static void main(String[] args) {
		
		FileReader fr = null;
		FileWriter fw = null;
		
		BufferedReader br = null;
		BufferedWriter bw = null;
		
		try {
			fr = new FileReader("io/FileMain03.java");
			fw = new FileWriter("io/FileMain03.java.txt" , true); //�ڿ� �Ҹ��� �߰��Ͽ� Ȯ���� ��� �����
			
			br = new BufferedReader(fr);
			bw = new BufferedWriter(fw);
			
			while(true) {
				String str = br.readLine();
				if(str==null) break;
				bw.write(str);
//				bw.write("\n");//���� �Է��̱⶧���� ���͸� �Է��ؾ��ϳ� os���� ���͸� ��Ÿ���� ���ڰ� �ٸ��⶧����
				bw.newLine();//�� �޼ҵ带 �Է��Ͽ� ���͸� ģ��
			}
			bw.flush();
			
			System.out.println("���Ϻ����� �Ϸ�");
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			FileClose.close(br);
			FileClose.close(bw);
			FileClose.close(fr);
			FileClose.close(fw);
		}
	}
}







