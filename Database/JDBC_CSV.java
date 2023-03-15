
import java.sql.Connection;
import java.sql.DriverManager;
import java.io.FileWriter;
import java.sql.ResultSet;
import java.sql.Statement;
import java.io.IOException;

public class JDBC_CSV {
	public static void main(String[] args) {
		try {
			
			// init
			String SqlUsername = "himanshu";
			String SqlPassword = "1234";
			String SqlUrl = "jdbc:oracle:thin:@localhost:1521:orcl";
//			Connection connection = null;
//			Statement statement = null;
//			ResultSet resultSet = null;
			
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection connection= DriverManager.getConnection(SqlUrl , SqlUsername, SqlPassword);


			Statement statement = connection.createStatement();	//The statement interface is used to create SQL basic statements in Java it provides methods to execute queries with the database.
			ResultSet rs = statement.executeQuery("SELECT * FROM Employee");	//The result set is an object that represents a set of data returned from a data source, usually as the result of a query.


			String filepath = "C:\\Users\\hisharma\\Desktop\\Java-Learning\\Database\\JDBC_output.csv";
			FileWriter fileWrite = new FileWriter(filepath);
			fileWrite.write("Name , Email , Mob. \n");
			System.out.println(rs);
			while (rs.next()) {
				
				String name = rs.getString("name");
				String email = rs.getString("email");
				int mob = rs.getInt("mob");
				
				fileWrite.write(name + " , " + email + " , " + mob + "\n");
				System.out.println(name + " , " + email + " , " + mob + "\n");
			}
			fileWrite.close();
			connection.close();
			System.out.println("Done Successfully !! ");
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}