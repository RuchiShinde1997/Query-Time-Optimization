/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package KNN;

import java.util.ArrayList;


public class Sorter

{

    public ArrayList sortData(ArrayList ali)
    {

for(int i=0;i<(ali.size()-1);i++)// bubble sort
{
    for( int j=i+1;j<ali.size();j++)
    {

        ArrayList m=new ArrayList();
         ArrayList h=new ArrayList();

         m=(ArrayList)ali.get(i);

      int a=Integer.parseInt(m.get(1).toString());
         

          h=(ArrayList)ali.get(j);
      int b=Integer.parseInt(h.get(1).toString());
          
         if(a>=b)
         {
            ali.set(i,h);
            ali.set(j, m);
         }

    }

}

return ali;
    }





     public ArrayList sortcentroids(ArrayList ali)
    {

    for(int i=0;i<(ali.size()-1);i++)// bubble sort
     {
    for( int j=i+1;j<ali.size();j++)
    {

        double a=Double.parseDouble(ali.get(i).toString());
        double b=Double.parseDouble(ali.get(j).toString());



         if(a>=b)
         {
            ali.set(i,b);
            ali.set(j, a);
         }

    }

}

return ali;
    }



     








 }







