package kr.co.mlec.day11;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

import kr.co.mlec.util.FileClose;

public class FileMain07 {

	public static void write() {
		UserInfo user = new UserInfo("ȫ�浿", 20, "����� ���ʱ�");
		
		FileWriter fw = null;
		BufferedWriter bw = null;
		
		try {
			/*
			fw = new FileWriter("io/userInfo.txt");
			bw = new BufferedWriter(fw);
			
			bw.write(user.getName());
			bw.newLine();
			bw.write(String.valueOf(user.getAge()));
			bw.newLine();
			bw.write(user.getAddr());
			bw.newLine();
			*/
			// ���2
			bw.write(user.getName() + ":" + user.getAge() + ":" + user.getAddr());
			bw.newLine();
			
			System.out.println("���� ������ �Ϸ��Ͽ����ϴ�");
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			FileClose.close(bw);
			FileClose.close(fw);
		}
	}
	
public static void read() {
		
		FileReader fr = null;
		BufferedReader br = null;
		
		try {
			fr = new FileReader("io/userInfo.txt");
			br = new BufferedReader(fr);
			
			/*
			// ���1
			String name = br.readLine();
			int    age  = Integer.parseInt(br.readLine());
			String addr = br.readLine();
			
			UserInfo user = new UserInfo(name, age, addr);
			System.out.println("���Ͽ��� �о�� ������...");
			System.out.println(user);
			*/
			
			// ���2
			String str = br.readLine();
			String[] data = str.split(":");
			
			UserInfo user = new UserInfo(data[0], Integer.parseInt(data[1]), data[2]);
			System.out.println("���Ͽ��� ���� ������");
			System.out.println(user);
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			FileClose.close(br);
			FileClose.close(fr);
		}
	}
	public static void main(String[] args) {
		
		write();
		read();
	}
}









