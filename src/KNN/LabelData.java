/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package KNN;

import java.util.ArrayList;

/**
 *
 * @author 1450
 */
public class LabelData 
{
    
    
   public ArrayList getLablledData(ArrayList mas)
   {
       ArrayList labeldata=new ArrayList();
       
       ArrayList bg=new ArrayList();//1
       ArrayList ec=new ArrayList(); //3
         
       
      
       ArrayList org_bg=new ArrayList();//1
       ArrayList org_ec=new ArrayList(); //3
      
       
       for(int i=0;i<mas.size();i++)
       {
           ArrayList temp=(ArrayList)mas.get(i);
           
         
           String ec_str=(String)temp.get(11);
            String bg_str=(String)temp.get(18);
           
           
         ec.add(ec_str);
           bg.add(bg_str);
           
           
           
           
           org_ec.add(ec_str);
           org_bg.add(bg_str);
           
//        
       }
    
       
   
     ArrayList eclabel=new LabelGenerator().getLabel(ec);
     ArrayList bglabel=new LabelGenerator().getLabel(bg);
   
       System.out.println("Label for eye color ");
       System.out.println(eclabel);

       System.out.println("\n\n");

       System.out.println("Label for blood gropup is is ");
       System.out.println(bglabel);

       
       
       
        for(int i=0;i<mas.size();i++)
       {
          ArrayList temp=(ArrayList)mas.get(i);
             String ec_str=(String)temp.get(11);
             
             int lab1=new LabelGenerator().getLabel(eclabel, ec_str);
             String stlab1=Integer.toString(lab1);
             temp.set(11,stlab1 );
             
            String bg_str=(String)temp.get(18);
            
             int lab2=new LabelGenerator().getLabel(bglabel, bg_str);
             String stlab2=Integer.toString(lab2);
             temp.set(18,stlab2 );
             
             
           
             
           
        labeldata.add(temp);
       }
       return labeldata;
       
       
       
   }
}
