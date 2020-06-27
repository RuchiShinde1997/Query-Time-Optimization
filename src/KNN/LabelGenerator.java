/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package KNN;

import java.util.ArrayList;


public class LabelGenerator 
{
    public ArrayList getLabel(ArrayList attr)
    {
      
        ArrayList uni=new DuplicateEliminator().getUnique(attr);
       ArrayList labels=new ArrayList();
       for(int i=0;i<uni.size();i++)
       {
           ArrayList temp=new ArrayList();
           int x=i+1;;
           String str=(String)uni.get(i);
           temp.add(str);     
           
           temp.add(Integer.toString(x));
           labels.add(temp);
           
       }
     
       
            
        
        
        return labels;
        
    }
    
    
     public int getLabel(ArrayList atr,String str)
       {
           int lab=0;;
           
           for(int i=0;i<atr.size();i++)
           {
              ArrayList temp=(ArrayList)atr.get(i);
              String word=(String)temp.get(0);
              word=word.trim();
              if(word.equals(str.trim()))
              {
                    String inti=(String)temp.get(1);
                    lab=Integer.parseInt(inti);
              }
            
             
              
              
           }
           
           
           
           return lab;
       }
        
      
}
