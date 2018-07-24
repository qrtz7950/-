package day15_JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.Scanner;

/*
 * ����� ID�� �Է��ϼ���: hong
 * ����� �̸��� �Է��ϼ���: ȫ�浿
 * 
 * insert into t_test(id,name) values('hong','ȫ�浿')
 */

public class InsertMain02 {

	public static void main(String[] args) {

		Connection conn = null;
		Statement stmt = null;
		try {
			// 1�ܰ� : JDBC����̹� �ε�
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("jdcb����̹� �ε�");

			// 2�ܰ�: �����ͺ��̽� ������ ���ᰴü ���
			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			String user = "hr";
			String password = "hr";
			conn = DriverManager.getConnection(url, user, password);
			System.out.println("conn:" + conn);

			// 3�ܰ�: SQL����
			stmt = conn.createStatement();

			Scanner sc = new Scanner(System.in);
			System.out.println("ID�Է�: ");
			String id = sc.nextLine();
			
			System.out.println("�̸��Է�: ");
			String name = sc.nextLine();
			String sql = "insert into t_test(id,name) values(\' "+id+" \' , \' "+name+" \')";
//			String sql =  "insert into t_test(id,name) ";
//				   sql += "values('aaa','bbb') ";
			
			// 4�ܰ�: ����� ����
			int cnt = stmt.executeUpdate(sql);
			System.out.println("��" + cnt + "���� ���ԵǾ����ϴ�.");
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			// 5�ܰ�: DB���� ����
			try {
				if(stmt != null) {
					stmt.close();
				}
			} catch(Exception e){
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
