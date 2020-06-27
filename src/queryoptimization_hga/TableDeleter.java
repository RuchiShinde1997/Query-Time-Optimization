/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package queryoptimization_hga;
/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */






import java.sql.*;

 public class TableDeleter
 	{


	public boolean deleteAllRecords()
	{
		try
		{
			Class.forName("com.mysql.jdbc.Driver").newInstance();
 			Connection Conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/comet","root","root");
 			Statement stmt = Conn.createStatement();

 			int x=stmt.executeUpdate("delete from  user_info ");


			if(x>0)
			{

				//System.out.println ("all rows deleted from token table");
				return true;
			}
			else{

					//System.out.println ("rows NOT deleted from token table");
				return false;
				}
		}
		catch(Exception e){System.out.println("Exception ="+e);}
		return false;
	}





}