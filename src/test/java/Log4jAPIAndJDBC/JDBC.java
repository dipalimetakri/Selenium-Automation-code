package Log4jAPIAndJDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBC {
	
	
	public static void main(String[] args) throws SQLException {
		Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/Demo","root","Disha@123");
		Statement statement = connection.createStatement();
		ResultSet resultset = statement.executeQuery("select * from employees where id=3");
		
		while(resultset.next()) {
			
			System.out.println(resultset.getInt("id"));
			System.out.println(resultset.getString("name"));
			System.out.println(resultset.getInt("experienece"));
		}
		
	}

}
