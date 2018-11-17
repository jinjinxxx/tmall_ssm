package tmall_ssm;

import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Connection;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Class.forName("com.mysql.jdbc.Driver");
			try {
				Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/tmall_ssm", "root", "root");
				System.out.println(conn);
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
