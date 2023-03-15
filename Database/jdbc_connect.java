import java.io.File;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class jdbc_connect {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
try {
			
			Class.forName("oracle.jdbc.driver.OracleDriver"); //The forName() method of java.lang.Class class is used to get the instance of this Class with the specified class name. 
			Connection connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","username","password");
			
			Statement smt = connection.createStatement();
			/*
			smt.executeUpdate("create table game (gamename varchar(10),player int)");
			
			smt.executeUpdate("insert into game(gamename,player) values ('Football',11)");
			smt.executeUpdate("insert into game(gamename,player) values ('BasketBall',12)");
			smt.executeUpdate("insert into game(gamename,player) values ('Cricket',15)");
			smt.executeUpdate("insert into game(gamename,player) values ('Badminton',2)");
			smt.executeUpdate("insert into game(gamename,player) values ('VolleyBall',10)");
			smt.executeUpdate("insert into game(gamename,player) values ('Table',2)");
			smt.executeUpdate("insert into game(gamename,player) values ('Herapheri',99)");
			
			*/
			
			System.out.println("Created successfully");
			connection.close();
			
			
			

		}
		catch(Exception e)
		{
			System.out.println(e);

		}
	}

}
