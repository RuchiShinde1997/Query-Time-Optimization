

package hga;

import java.util.ArrayList;


public class CombinationMutationMatrix 

{
public int[][] generateMatrix(ArrayList temp,ArrayList mas)
{
   int m=temp.size();
   
   ArrayList tt=(ArrayList) mas.get(0);
   int n=tt.size();
   
   
   int mat[][]=new int[m][n];

  
   for(int i=0;i<temp.size();i++)
   {
       int x=Integer.parseInt((String)temp.get(i));
       x=x-1;
       ArrayList t1=(ArrayList)mas.get(x);
       
       for(int j=0;j<t1.size();j++)
       {
           
           int val=Integer.parseInt((String)t1.get(j));
           mat[i][j]=val;
       }
       
     
       
       
       
   }
   
return mat;
    
}
}
