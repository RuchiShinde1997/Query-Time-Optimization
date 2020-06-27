

package hga;

import java.util.ArrayList;


public class PathAugmentation
{
    public static ArrayList mas=new ArrayList();
   
    
    public void performGenerations(ArrayList temp)
    {
        
       
        
        ArrayList master=mas;
        
        int mat[][]=new CombinationMutationMatrix().generateMatrix(temp, master);
        
        
        
        
        
         System.out.println("\n Query Combination is "+temp);
        System.out.println("Query MATRIX IS  ");
//         String str8=MainFrame.jTextArea1.getText();
            String str8=UtilInfo.res;
        str8=str8+"\nQuery Combination is "+temp;
        str8=str8+"\n Query MATRIX IS  \n";
       // MainFrame.jTextArea1.setText(str8);
        UtilInfo.res=str8;
        
        String st1="";
        
        for(int i=0;i<mat.length;i++)
        {
            
            for(int j=0;j<mat[0].length;j++)
            {
                
                
              System.out.print(mat[i][j]+"  ");
              st1=st1+mat[i][j]+"  ";
            }
            st1=st1+"\n";
             System.out.println();
        }
       
        String str9=UtilInfo.res;
        str9=str9+st1;
       
        UtilInfo.res=str9;
        
        new Helper().getFitness(mat);
        
        
    }
    
    
    
    
}
