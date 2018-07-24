package kr.co.mlec.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.Scanner;

/*
 * ����� ���̵��Է� : hong
 * ����� �̸����Է� : ��õ��õ
 * 
 * insert into t_test(id, name) values('hong','��õ��õ')
 */

public class InsertMain02 {

	public static void main(String[] args) {
		
		Connection conn = null;
		Statement stmt = null;
		
		
		try {
			//1�ܰ� : ����̹� �ε�
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
			//2�ܰ� 
			String url = "jdbc:oracle:thin:@127.0.0.1:1521:xe";
			String user = "hr";
			String password = "hr";
			conn = DriverManager.getConnection(url, user, password);

			stmt = conn.createStatement();
			
			String quo = "'";
			
			Scanner sc = new Scanner(System.in);
			System.out.print("id: ");
			String id = sc.nextLine();
			id = quo + id;
			id = id + quo;
			
			System.out.print("�̸�: ");
			String name = sc.nextLine();

			String sql = "insert into t_test(id, name) ";
			       sql += "values(" + id + ", '" + name + "')";

			int cnt = stmt.executeUpdate(sql);
			System.out.println(cnt + "�� �� ����");
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			
			// 5�ܰ� : ��������
			try {
				if (stmt != null) {
					stmt.close();
				}
			} catch (Exception e) {
				e.printStackTrace();
			}

			try {
				if (conn != null) {
					conn.close();
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		
		
		
	}

}
