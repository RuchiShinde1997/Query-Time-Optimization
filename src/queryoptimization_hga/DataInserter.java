

package queryoptimization_hga;
/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */



import java.sql.*;

 public class DataInserter
 	{
	
//cino, title, fname, lname, ffname, flname, mfname, mlname, dob, bplace, ecolor, caddr, ccity, cstate, paddr, pcity, pstate, bgrp, mb_no, email, summary, credith

	public boolean insertData(String cino,String title,String fname,String lname,String ffname,String flname,String mfname,String mlname,String dob,String bplace,String ecolor,String caddr,String ccity,String cstate,String paddr,String pcity,String pstate,String bgrp,String mb_no,String email,String summary,String credith)
	{
		try
		{
			Class.forName("com.mysql.jdbc.Driver").newInstance();
 			Connection Conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/comet","root","root");
 			Statement stmt = Conn.createStatement();
 			
 			int x=stmt.executeUpdate("Insert into user_info values('"+cino+"','"+title+"','"+fname+"','"+lname+"','"+ffname+"','"+flname+"','"+mfname+"','"+mlname+"','"+ dob+"','"+ bplace+"','"+ ecolor+"','"+ caddr+"','"+ ccity+"','"+ cstate+"','"+ paddr+"','"+ pcity+"','"+ pstate+"','"+ bgrp+"','"+mb_no+"','"+email+"','"+ summary+"','"+credith+"')");
              Conn.close();

			if(x>0)
			{

				
				return true;
			}
			else{

				
				return false;
				}
                        
                   
		}
		catch(Exception e){System.out.println("Exception = ......."+e);}
		return false;
	}


	


}