package kr.co.mlec.day11;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

import kr.co.mlec.util.FileClose;

public class FileIOMain07 {

	public static void write() {
		UserInfo user = new UserInfo("홍길동", 20, "서울시 서초구");
		
		FileWriter fw = null;
		BufferedWriter bw = null;
		
		try {
			
			fw = new FileWriter("iotest/userInfo.txt");
			bw = new BufferedWriter(fw);
		
			/*
			// 방법1
			bw.write(user.getName());
			bw.newLine();
			bw.write(String.valueOf(user.getAge()));
			bw.newLine();
			bw.write(user.getAddr());
			bw.newLine();
			*/
			
			// 방법2
			bw.write(user.getName() + ":" + user.getAge() + ":" + user.getAddr());
			bw.newLine();
			
			System.out.println("파일 저장을 완료하였습니다");
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			FileClose.close(bw, fw);
		}
	}
	
	public static void read() {
		
		FileReader fr = null;
		BufferedReader br = null;
		
		try {
			fr = new FileReader("iotest/userInfo.txt");
			br = new BufferedReader(fr);
			
			/*
			// 방법1
			String name = br.readLine();
			int    age  = Integer.parseInt(br.readLine());
			String addr = br.readLine();
			
			UserInfo user = new UserInfo(name, age, addr);
			System.out.println("파일에서 읽어온 데이터...");
			System.out.println(user);
			*/
			
			// 방법2
			String str = br.readLine();
			String[] data = str.split(":");
			
			UserInfo user = new UserInfo(data[0], Integer.parseInt(data[1]), data[2]);
			System.out.println("파일에서 읽은 데이터");
			System.out.println(user);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			FileClose.close(br, fr);
		}
	}
	
	public static void main(String[] args) {
		
//		write();
		read();
	}
}









