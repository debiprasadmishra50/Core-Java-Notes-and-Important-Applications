package jdbc_connection;

import java.sql.*;

public class Provider 
{
	public static void getMySqlConnection() throws SQLException , ClassNotFoundException
	{
		Class.forName("com.mysql.jdbc.Driver");
		Class.forName("oracle.jdbc.OracleDriver");
//		Connection oracle_con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:db_name", "system", "password");
//		Connection mysql_con = DriverManager.getConnection("jdbc:mysql://@localhost:3306:db_name", "root", "password");
	}
	public static void main(String[] args) throws SQLException, ClassNotFoundException 
	{
		Provider.getMySqlConnection();
	}
}
