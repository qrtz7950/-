package day15_JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class InsertMain03 {

	public static void main(String[] args) {

		Connection conn = null;
		PreparedStatement pstmt = null;
		try {
			//1
			Class.forName("oracle.jdbc.driver.OracleDriver");
			//2
			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			String user = "hr";
			String password = "hr";
			conn = DriverManager.getConnection(url, user, password);
			
			//3
			Scanner sc = new Scanner(System.in);
			System.out.print("ID�Է�: ");
			String id = sc.nextLine();
			
			System.out.print("�̸��Է�: ");
			String name = sc.nextLine();
			
			String sql = "insert into t_test(id,name)";
					sql += "values(?,?)";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1,id);
			pstmt.setString(2,name);
			
			//4
			int cnt = pstmt.executeUpdate();
			System.out.println(cnt + " ���� ���� �����Ͽ����ϴ�.");
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			//5
			if(conn != null) {
				try {
					conn.close();
				} catch(Exception e) {
					e.printStackTrace();
				}
			}
			
			if(pstmt != null) {
				try {
					pstmt.close();
				} catch(Exception e) {
					e.printStackTrace();
				}
			}
		}
	}

}
