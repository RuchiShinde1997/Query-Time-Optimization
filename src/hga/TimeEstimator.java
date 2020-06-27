/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package hga;


import java.util.ArrayList;



public class TimeEstimator 
{
    public int [][] estimateTime(int m,int n)
    {
        int mat[][]=new int[m][n];
        
        
        for(int i=0;i<m;i++)
        {
            
            
            
            for(int j=0;j<n;j++)
        {
             int t1=new RandomNumGenerator().getRandomNumber(0, 10);
            
              mat[i][j]=t1;
        }
          
      
           
           
            
            
            
        }
        
        
        
        
        
        
        
        return mat;
    }
}
