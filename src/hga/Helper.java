

package hga;


public class Helper
{
public void getFitness(int mat[][])
{
    
      
 
      
       
       
       int a[]=new int[mat[0].length];
       
       for(int i=0;i<mat.length;i++)
       {
           
           for(int j=0;j<mat[0].length;j++)
           {
               if(i==0 && j==0)
               {
                   a[j]=mat[i][j];
                   
               }
               else if(i==0)
               {
                 a[j]=a[j-1]+mat[i][j];  
                   
               }
               else if(j==0)
               {
                   
                   a[j]=a[j]+mat[i][j];
               }
               
               else
               {
                   
                  if(a[j-1]>a[j])
                  {
                      int x=a[j-1]-a[j];
                      a[j]=a[j]+x+mat[i][j];
                      
                  }
                  
                  else
                  {
                      a[j]=a[j]+mat[i][j];
                      
                  }
               }
               
           }
           
       }
       
       if(DataKeeper.currentfitness==0 && DataKeeper.prevfitness==0)
       {
          DataKeeper.currentfitness=a[a.length-1];
          DataKeeper.prevfitness=a[a.length-1];
          
    System.out.print("SCHEDULED TIME FOR ALL THE THREADS IS : ");
    String str8=UtilInfo.res;
        str8=str8+"SCHEDULED TIME FOR ALL THE THREADS IS : ";
        
      //  MainFrame.jTextArea1.setText(str8);
        UtilInfo.res=str8;
        
        String st1="";
       for(int i=0;i<a.length;i++)
       {
           
         System.out.print("THREAD"+(i+1)+" = "+a[i]+" , ");
         st1=st1+"THREAD"+(i+1)+" = "+a[i]+" , ";
       }
       st1=st1+"\n";
        System.out.println();
        String str9=UtilInfo.res;

        str9=str9+st1;
        
        UtilInfo.res=str9;
        
           UtilInfo.gen++;
           //MainFrame.jTextField4.setText(Integer.toString(MainFrame.gen));
             System.out.println("iteration IS "+UtilInfo.gen);
             
             String str10=UtilInfo.res;
        str10=str10+"iteration IS "+UtilInfo.gen+"\n";
        
        UtilInfo.res=str10;
                   
       }
       else
       {
             DataKeeper.currentfitness=a[a.length-1];
             if( DataKeeper.currentfitness<=DataKeeper.prevfitness)
             {
                 DataKeeper.crossover=CombinationProcessor.tempcross;
                 DataKeeper.prevfitness=DataKeeper.currentfitness;
                  System.out.print("SCHEDULED TIME FOR ALL THE THREADS IS : ");
                  
                  
                   String str11=UtilInfo.res;
        str11=str11+"SCHEDULED TIME FOR ALL THE THREADS IS : ";
        UtilInfo.res=str11;
        
        String st="";
       for(int i=0;i<a.length;i++)
       {
           
         System.out.print("THREAD"+(i+1)+" = "+a[i]+" , ");
         st=st+"THREAD"+(i+1)+" = "+a[i]+" , ";
       }
       st=st+"\n";
        String str9=UtilInfo.res;
        str9=str9+st;
        
        UtilInfo.res=str9;
       
        System.out.println();
        
            UtilInfo.gen++;
          // MainFrame.jTextField4.setText(Integer.toString(MainFrame.gen));
             System.out.println("GENERATION IS "+UtilInfo.gen);
             
             
              String str10=UtilInfo.res;
        str10=str10+"GENERATION IS "+UtilInfo.gen+"\n";
        
        UtilInfo.res=str10;
             }
             
             else
             {
                 System.out.print("SCHEDULING DISCARDED FOR THIS CHOICE ++++++++++++++++++++++++++++\n ");
                 
                  String str10=UtilInfo.res;
        str10=str10+"SCHEDULING DISCARDED FOR THIS CHOICE ++++++++++++++++++++++++++++\n ";
        
        UtilInfo.res=str10;
                 
             }
           
       }
        
       
            
        
    
}
}
