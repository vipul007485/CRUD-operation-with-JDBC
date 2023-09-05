package Employee;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class UpdateEmp {
	
	public static void main(String[] args) {
	
		String url = "jdbc:mysql://localhost:3306/javabatch";
		String username = "root";
		String password = "root";

		String sql = "UPDATE employee SET name ='Anuj' WHERE ID = 3";


		
		
		//step 1 Load/Register the driver
		
		
		Connection connection = null;
		
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			//Step 2 Establish Connection 
			
		    connection = DriverManager.getConnection(url, username, password);
			
			//Step 3 Establish Connection
			
			Statement statement = connection.createStatement();
			
			//Step 4 Execute the Statement
			statement.executeUpdate(sql);
			
			//Step 5 Close the connection 
			
			
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try {
				connection.close();
				System.out.println("All Good");
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}

}
