import java.sql.*;
class Test
{
	static String sql;
	static int status;
	public static void main(String[] args) throws Exception
	{
		Class.forName("oracle.jdbc.OracleDriver");
		Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "system", "sipusipu18");

		if (con != null) 
			System.out.println("Connection Established");	
		else
			System.out.println("Not Connected");

		Statement st = con.createStatement();
		
		//To drop a table Debi
		sql = "drop table Debi";
		status = st.executeUpdate(sql);
		System.out.println(status);

		//To create a table Debi
		sql = "Create table Debi (id number(4) , name varchar2(20))";
		status = st.executeUpdate(sql);
		System.out.println(status);

		//To insert into table Debi
		sql = "Insert into Debi values (100,'Debi')";
		status = st.executeUpdate(sql);
		System.out.println(status);

		//To update records in table Debi
		sql = "update Debi set name='Alpu' where id=100";
		status = st.executeUpdate(sql);
		System.out.println(status);

		//See the table
		String sql = "Select * from Debi";
		ResultSet rs = st.executeQuery(sql);
		while(rs.next())
		{
			System.out.println("Id : "+rs.getInt(1)+"\nName : "+rs.getString("name"));
		}

		//To delete records from table Debi
		sql = "delete Debi";
		status = st.executeUpdate(sql);
		System.out.println(status);
		
		con.close();
	}
}


/*

D:\JAVA LIT CORE\Database>javac Test.java

D:\JAVA LIT CORE\Database>java Test
Connection Established
0
0
1
1
Id : 100
Name : Alpu
1

D:\JAVA LIT CORE\Database>
*/