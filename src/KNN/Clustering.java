/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package KNN;

import java.util.ArrayList;

/**
 *
 * @author A57
 */
public class Clustering {

    public ArrayList getKClusters(ArrayList range,ArrayList master)
    {
        ArrayList cluster=new ArrayList();                  ///master arrayList//
       //-------------------------------------------------------//
        double min=0.0;
        double max=0.0;
        for(int i=0;i<range.size();i++)
        {
           ArrayList row=new ArrayList();
           String minmax=(String)range.get(i);
           String sp[]=minmax.split(" ");
           min=Double.parseDouble(sp[0]);
           max=Double.parseDouble(sp[1]);
          // System.out.println("=======min and max====="+min +max);
          
            for(int j=0;j<master.size();j++)
            {
                ArrayList temp=(ArrayList)master.get(j);
                
                double cmp=Double.parseDouble(temp.get(temp.size()-1).toString());
               
                if(cmp>=min&&cmp<=max)
                {
                row.add(temp);                            // element goes in that cluster corresponding to index of centroid centroid index 0 for cluster index 0//
                }
            }
            cluster.add(row);
        }



     return cluster;
    }


public ArrayList getoutlinears(ArrayList master,ArrayList cluster)
    {

     ArrayList out=new ArrayList();

     for(int i=0;i<master.size();i++)
     {
         ArrayList temp1=(ArrayList)master.get(i);
         
         double chkunit=Double.parseDouble(temp1.get(temp1.size()-1).toString());
         int flag=0;
         for(int j=0;j<cluster.size();j++)
         {
             ArrayList temp=(ArrayList)cluster.get(j);
            
             for(int k=0;k<temp.size();k++)
             {
                 ArrayList temp3=(ArrayList)temp.get(k);
                 double cunits=Double.parseDouble(temp3.get(temp3.size()-1).toString());
                 if(cunits==chkunit)
                 {
                     flag=1;
                     break;
                 }
             }



         }
         if(flag==0)
             out.add(temp1);


     }






     return out;



    }












}
