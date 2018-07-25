package kr.co.mlec.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.Scanner;

/*
 * 	����� ���̵� �Է� : hong
 *  ����� �̸��� �Է� : �浿�浿
 *  
 *  insert into t_test(id,name) values('hong','��˱��')
 */

public class InsertMain02 {
	
	public static void main(String[] args) {
		
		Connection conn = null;
		Statement stm = null;
		Scanner s = new Scanner(System.in);
		
		try {
		// 1�ܰ�
			Class.forName("oracle.jdbc.driver.OracleDriver");
		
		// 2�ܰ�
			String url = "jdbc:oracle:thin:@127.0.0.1:1521:xe";
			String user = "hr";
			String password = "hr";
			conn = DriverManager.getConnection(url, user, password);
			
		// 3�ܰ�
			stm = conn.createStatement();
			
			System.out.print("����� ���̵� �Է� : ");
			String id = s.nextLine();
			System.out.print("����� �̸� �Է� : ");
			String name = s.nextLine();
			
			String sql = "insert into t_test(id, name) ";
				   sql += "values (\'" + id + "\', \'" + name +"\') ";
				   
		// 4�ܰ�
			int cnt = stm.executeUpdate(sql);
			System.out.println("�� " + cnt + "�� ���� �����߽��ϴ�");
			
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			if(stm != null) {
				try {
					stm.close();
				}catch(Exception e) {
					e.printStackTrace();
				}
			}
			
			if(conn != null) {
				try {
					conn.close();
				}catch(Exception e) {
					e.printStackTrace();
				}
			}
		}
		s.close();
	}
	
}
