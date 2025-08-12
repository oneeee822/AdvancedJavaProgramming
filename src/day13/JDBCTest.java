package day13;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.SQLIntegrityConstraintViolationException;
import java.sql.SQLSyntaxErrorException;
import java.sql.Statement;

public class JDBCTest {

	public static void main(String[] args) throws ClassNotFoundException {
		
		//register the driver
		Class.forName("com.mysql.cj.jdbc.Driver");

		//Create a connection object
		Connection conn = null;
		String db_url = "jdbc:mysql://localhost:3306/tubDB";
		String username = "root";
		String password = "econet";
		
		String createTableSQL = """
				CREATE  Table studentNew (
				student_id INT AUTO_INCREMENT,
				first_name VARCHAR(20) NOT NULL,
				last_name VARCHAR(20) NOT NULL,
				gender VARCHAR(20) NOT NULL,
				gpa DECIMAL(3,2),
				PRIMARY KEY (student_id)
				);
				""";
		
		String addDataSQL = """
				INSERT INTO studentNew VALUES(1, "John", "Doe", "Der", 5.27);
				INSERT INTO studentNew VALUES(2, "Donald", "Adib", "Der", 1.2);
				INSERT INTO studentNew VALUES(3, "Sara", "Flaming", "Die", 2.2);
				INSERT INTO studentNew VALUES(4, "Sacha", "Rooijen", "Der", 4.2);
				INSERT INTO studentNew VALUES(4, "Sacha", "Rooijen", "Der", 4.2);
				""";
		
		try {
			conn = DriverManager.getConnection(db_url, username, password);
			System.out.println("Connected Successfully");
			
			// Create a statement and execute SQL
			try {
				Statement statement = conn.createStatement();
				statement.executeUpdate(createTableSQL);
				System.out.println("Creating Table Successful!");
			} catch(SQLSyntaxErrorException e1) {
				System.out.println("Table is already exists");
			}
			
			// Add data in the studentNew table
			try {
				Statement statement = conn.createStatement();
				statement.executeUpdate(addDataSQL);
			} catch (SQLIntegrityConstraintViolationException e) {
	            e.printStackTrace();
	        }
			
			//Close the Connection
			conn.close();
			
		} catch(SQLException e) {
			e.printStackTrace();
		}
		
	}

}
