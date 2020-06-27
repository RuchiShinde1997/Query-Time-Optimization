/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package queryoptimization_hga;

import java.util.ArrayList;

public class LinearQueryInserter
{

    public int  handleInsertQuery(ArrayList ins)
    {
        int count=0;
       

           for(int i=0;i<ins.size();i++)
            {

                ArrayList temp=new ArrayList();
                temp=(ArrayList)ins.get(i);

 //cino, title, fname, lname, ffname, flname, mfname, mlname, dob, bplace, ecolor,
//caddr, ccity, cstate, paddr, pcity, pstate, bgrp, mb_no, email, summary, credith


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

                DataInserter di=new DataInserter();
                if(di.insertData(cino,title,fname,lname,ffname,flname,mfname,mlname,dob,bplace,ecolor,caddr,ccity,cstate,paddr,pcity,pstate,bgrp,mb_no,email,summary,credith
))
                    count++;

            }

   return count;
        
    }
}
