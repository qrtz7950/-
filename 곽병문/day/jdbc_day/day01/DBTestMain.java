package kr.co.mlec.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBTestMain {

	public static void main(String[] args) {
		
		try {
			// 1�ܰ� : JDBC ����̹� �ε�
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
			// 2�ܰ� : Database ����
			Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "hr", "hr");
																			// localhost = 127.0.0.1
			System.out.println("�����ͺ��̽� �������� : " + conn);
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

}
