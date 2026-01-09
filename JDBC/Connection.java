import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Connection;

public class Connection {
    
public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class<?> name =Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/JDBC", "root", "1218");
		
		Statement stmt = con.createStatement();
		int num=stmt.executeUpdate("insert into jdbc values(1,'Vinayk');");
	
	
	}
}
