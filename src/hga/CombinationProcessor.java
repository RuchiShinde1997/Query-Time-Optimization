

package hga;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;
 
public class CombinationProcessor 
{
    
public static ArrayList tempcross=new ArrayList();
   

    static void getCombination(int[] a, int k) 
    {

        if (k == a.length) 
        {
            
          
            
             if(UtilInfo.gen>=10)
             {
                  
             return;
                
             }
               
            ArrayList temp=new ArrayList();
            for (int i = 0; i < a.length; i++) 
            {
                
            String s=Integer.toString(a[i]);
            int x=Integer.parseInt(s);
            x=x+1;
            String st=Integer.toString(x);
               
              
               temp.add(st);
              
                
            }
         
             
            
            tempcross=temp;
             
             new PathAugmentation().performGenerations(temp);
             
                 
                   
           

        } 
        else 
        {
            for (int i = k; i < a.length; i++) 
            {
                int temp = a[k];
                a[k] = a[i];
                a[i] = temp;
 
                getCombination(a, k + 1);
 
                temp = a[k];
                a[k] = a[i];
                a[i] = temp;
            }
        }
    }
 
    public void getSets(int sequence[]) 
    {
       
        int N = sequence.length;
     
 
   
 

        getCombination(sequence, 0);
 
      
        
        
    }
}