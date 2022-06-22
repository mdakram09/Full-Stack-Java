package sql_example;
import java.sql.*;

public class Sql_example {
	static final String JDBC_DRIVER="com.mysql.jdbc.Driver";
	static final String DB_URL="jdbc:mysql://localhost:3306/company_database";
	
	//Database Credentials
	static final String USER ="root";
	static final String PASS ="Ak@123456789";
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Connection conn=null;
		Statement stmt=null;
		
		try {
			//Register JDBC Driver
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			//Open a Connection
			System.out.println("connecting to db...");
			conn=DriverManager.getConnection(DB_URL,USER,PASS);
			
			
			//Execute Query
			System.out.println("creating statement...");
			stmt=conn.createStatement();
			String sql;
			
			sql="select emp_id, first_name, last_name from employee";
			ResultSet rs=stmt.executeQuery(sql); //in rs, you are storing the data which you got by executing the query
			
			
			//Extract Data From Result set
			while(rs.next()) {
				int emp_id=rs.getInt("emp_id");
				String first_name=rs.getString("first_name");
				String last_name=rs.getString("last_name");
				
				System.out.println("emp_id: "+ emp_id);
				System.out.println("first name: "+first_name);
				System.out.println("last name: "+last_name);
			}
			//Close Connection
			rs.close();
			stmt.close();
		} catch(Exception e) {
			System.out.println(e);
		}
		
	}

}
