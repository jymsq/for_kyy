package sjy;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class database {
	 
	 private static String url = "jdbc:postgresql://127.0.0.1:5432/pra";
	 private static String name = "postgres";
	 private static String password = "wsy17320056192";
	 public Statement Get_Statement() throws Exception
		{
			Connection conn=null;
			Statement stat=null;
			
			Class.forName("org.postgresql.Driver");
			conn= DriverManager.getConnection(url, name, password);
			stat=conn.createStatement();
			return stat;
		}
}
