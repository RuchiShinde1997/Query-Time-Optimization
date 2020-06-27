

package hga;

import java.sql.*;
import java.util.ArrayList;

 public class InserterStreamProcessor 
 	{
	


	public boolean insertData(ArrayList master)
	{

            
		try
		{
			Class.forName("com.mysql.jdbc.Driver").newInstance();
 			Connection Conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/comet","root","root");
 			Statement stmt = Conn.createStatement();
                        Conn.setAutoCommit(false);

                        for(int i=0;i<master.size();i++)
                        {

                              ArrayList temp=new ArrayList();
                temp=(ArrayList)master.get(i);

                String cino=(String)temp.get(1);
                String title=(String)temp.get(2);
                String fname=(String)temp.get(3);
                String lname=(String)temp.get(4);
                String ffname=(String)temp.get(5);
                String flname=(String)temp.get(6);
                String mfname=(String)temp.get(7);
                String mlname=(String)temp.get(8);
                String dob=(String)temp.get(9);
                String bplace=(String)temp.get(10);
                String ecolor=(String)temp.get(11);
                String caddr=(String)temp.get(12);
                String ccity=(String)temp.get(13);
                String cstate=(String)temp.get(14);
                String paddr=(String)temp.get(15);
                String pcity=(String)temp.get(16);
                String pstate=(String)temp.get(17);
                String bgrp=(String)temp.get(18);
                String mb_no=(String)temp.get(19);
                String email=(String)temp.get(20);
                String summary=(String)temp.get(21);
                String credith=(String)temp.get(22);

                String st1="Insert into user_info values('"+cino+"','"+title+"','"+fname+"','"+lname+"','"+ffname+"','"+flname+"','"+mfname+"','"+mlname+"','"+ dob+"','"+ bplace+"','"+ ecolor+"','"+ caddr+"','"+ ccity+"','"+ cstate+"','"+ paddr+"','"+ pcity+"','"+ pstate+"','"+ bgrp+"','"+mb_no+"','"+email+"','"+ summary+"','"+credith+"')";
                        
                        stmt.addBatch(st1);
                        }
 			stmt.executeBatch();
                        Conn.commit();


			return true;
		}
		catch(Exception e){System.out.println("Exception ="+e);}
		return false;
	}


	


}