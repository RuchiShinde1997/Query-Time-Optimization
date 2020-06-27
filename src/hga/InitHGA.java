

package hga;

import java.util.ArrayList;
import javax.swing.JOptionPane;




public class InitHGA
{
    public static ArrayList mas=new ArrayList();

    public void startProcess(int atri)
    {
        int m=atri;
        int n=atri;
        
        TimeEstimator  rta=new TimeEstimator();
            int mat[][]=rta.estimateTime(m, n);
            
            DataKeeper.mat=mat;
            
         System.out.println("Number of Queries : " +m);
        System.out.println("\nNumber of Threads : "+n);
        
        String str1=UtilInfo.res;
        str1=str1+"Number of Queries : "+m+"\n";
        UtilInfo.res=str1;
        
         String str2=UtilInfo.res;
        str2=str2+"Number of Threads : "+n+"\n\n";
        UtilInfo.res=str2;
        
        String str3=UtilInfo.res;
        str3=str3+"\nAssigned Query Schedule \n\n"+"    ";
        UtilInfo.res=str3;
        
        
        System.out.println("\nAssigned Query Schedule \n");
        System.out.print("    ");
        String st4="        ";
        for(int i=1;i<=n;i++)
        {
            st4=st4+"T"+i+"       ";
            System.out.print("T"+i+"   ");
        }
        st4=st4+"\n";
        System.out.println();
        
        String str5=UtilInfo.res;
        str5=str5+st4;
        UtilInfo.res=str5;
        
        
        ArrayList matmas=new ArrayList();
        String st5="";
        
        for(int i=0;i<m;i++)
        {
            st5=st5+"Q"+ (i+1)+"      ";
            System.out.print("Q"+ (i+1)+"  ");
            ArrayList temp=new ArrayList();
            for(int j=0;j<n;j++)
            {
                String st=Integer.toString(mat[i][j]);
                temp.add(st);
                
               System.out.print(mat[i][j] + "   ");
               st5=st5+mat[i][j] + "      ";
                
             }
            matmas.add(temp);
         
            System.out.println();
            st5=st5+"\n";
        }
        
          String str6=UtilInfo.res;
        str6=str6+st5;
        UtilInfo.res=str6;
        
        
        PathAugmentation.mas=matmas;
        // First Printing ends 
        int jobs[]=new int[m];
        
        for(int i=0;i<m;i++)
        {
            jobs[i]=i;
            
        }
          System.out.println();
        
       
        while(true)
        {
            new CombinationProcessor().getSets(jobs);
            if(UtilInfo.gen>=10)
            {
                
                break;
            }
            
        }
        
        System.out.println("\n\nTHE COMBINATION THAT IS HAVING LEAST TIME SCHEDULED FOR THE LAST Thread IS  tt"+DataKeeper.crossover);
         String str10=UtilInfo.res;
        str10=str10+"\n\nTHE COMBINATION THAT IS HAVING LEAST TIME SCHEDULED FOR THE LAST Thread IS  "+DataKeeper.crossover+"\n\n";
        
        UtilInfo.res=str10;
        
        
        
        
        
        
      
    }
}
