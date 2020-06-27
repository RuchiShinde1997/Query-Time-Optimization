/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package queryoptimization_hga;

import java.io.*;
import java.util.ArrayList;
import jxl.*; /* Import declarations to the JExcel JAR file */
public class QueryDataReader /* The name of our class file */
{
  //  public static void main(String args[])
    public ArrayList getFileData(String path)
    {

         ArrayList m=new ArrayList();
       // String sf=FileKeeper.file;
        try
        {
            Workbook ReadExcel = Workbook.getWorkbook(new File(path));

            Sheet sheet = ReadExcel.getSheet(0);
            int a=sheet.getColumns();
            int b=sheet.getRows();
            System.out.println(Integer.toString(a));
            System.out.println(Integer.toString(b));
           


            for (int i=1;i<b;i++)
            {
                ArrayList in=new ArrayList();
                for(int j=0;j<a;j++)
                {
                Cell a1 = sheet.getCell(j,i); /* Get the first cell of Column A , 0 maps to A */

                String ed = a1.getContents();

                SymbolReplacer sr=new SymbolReplacer();
                String st=sr.replaceString(ed);

               // System.out.print(st+"    ");

                in.add(st);
                }
                m.add(in);
               // System.out.println("");

            }

     
            ReadExcel.close();

           
        }
        catch (Exception i)
        {
            System.out.println(i);
        }


 return m;
        
    }
}