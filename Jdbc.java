package Java;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
public class Jdbc {

	public static void main(String[] args) throws ClassNotFoundException, SQLException{
		Class.forName("com.mysql.jdbc.Driver");
		String url="jdbc:mysql://localhost:3306/mondee";
		String username="root";
		String password="Sai@63096";
		Connection connection=DriverManager.getConnection(url,username,password);
		if(connection!=null)
			System.out.println("connection Established");

	}

}
