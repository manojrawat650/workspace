import java.sql.*;


public class Demo1 {

	public static void main(String[] args) {
		try{
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","System","password");
		System.out.println("asdf");
			/* Statement st=con.createStatement();
		 ResultSet rs=st.executeQuery("Select * from employee");
		 while(rs.next())
		 {
			 System.out.println("manoj");
		 }*/
			
			PreparedStatement ps=con.prepareStatement("Insert into employee values(?,?)");
             
			ps.setInt(1,101);//1 specifies the first parameter in the query  
			ps.setString(2,"Ratan");
			int i=ps.executeUpdate();		
             System.out.println(i);
		}
		catch(Exception e)
		{
			
		}

	}

}