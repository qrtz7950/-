package day15_JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

/*
 * ���̵��Է�: hong
 * ������ �̸��� �Է�: ȫ���
 * 
 * id : hong ===> �̸� : ȫ�浿 -> ȫ���
 */
public class UpdateMain01 {

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
			String sql = "update t_test ";
					sql+= "set name = ? ";
					sql+= "where id = ? ";
					
			
			Scanner sc = new Scanner(System.in);
			System.out.print("ID�Է�:");
			String id = sc.nextLine();
			
			System.out.print("������ �̸� �Է�:");
			String name = sc.nextLine();
			
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, name);
			pstmt.setString(2, id);
			//4
			int cnt = pstmt.executeUpdate();
			System.out.println(cnt+"�� ���� �����Ǿ����ϴ�.");
			
			
			
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
