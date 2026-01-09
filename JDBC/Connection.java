import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Connection;

public class Connection {
    
public static void main(String[] args) throws ClassNotFoundException, SQLException {
    //Registring a Driver
		Class<?> name =Class.forName("com.mysql.cj.jdbc.Driver");
        //Establish(Opening)Connection
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/JDBC", "root", "1218");
		//create Statement(SQL Queries)
		Statement stmt = con.createStatement();
        //insert SQL Queries
		int num=stmt.executeUpdate("insert into jdbc values(1,'Vinayk');");
	
	
	}
}
