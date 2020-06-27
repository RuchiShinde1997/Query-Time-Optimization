/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package KNN;



import java.text.DecimalFormat;
import java.util.ArrayList;



/**
 *
 * @author 1084
 */
public class DistanceEvaluator {

    public double calculateEuclideanDistance(ArrayList data)
    {
        double dist=0.0;
        double sum=0.0;   // sum of all mean dist distance of every point//

        ArrayList master=new ArrayList();
        for(int i=0;i<data.size();i++)
        {
            ArrayList temp=(ArrayList)data.get(i);
            double X1=Double.parseDouble(temp.get(1).toString());
            double X2=Double.parseDouble(temp.get(11).toString());
            double Y1=Double.parseDouble(temp.get(18).toString());
           
            double s1=0.0;  // cummulative sum of single point to all other points//
            for(int j=0;j<data.size();j++)
            {
                if(i!=j)
                {
                ArrayList temp1=(ArrayList)data.get(j);
                double X11=Double.parseDouble(temp1.get(1).toString());
                double X22=Double.parseDouble(temp1.get(11).toString());
                double Y11=Double.parseDouble(temp1.get(18).toString());
                
                double t=Math.pow((X1-X11),2)+Math.pow((X2-X22),2)+Math.pow((Y1-Y11),2);
                double d=Math.sqrt(t);
                
                s1=s1+d;
                }
            }

            s1=s1/(data.size()-1);
            
            DecimalFormat df=new DecimalFormat("#.##");
           String rr=df.format(s1);
           //String st= new DecimalFormat().format(0.00);
            temp.add(rr);
            master.add(temp);
            sum=sum+s1;


        }

        dist=sum/(data.size());
        System.out.println("\n\nMean  Distance is "+dist+"\n\n");
        DataKeeper.master=master;
       

        return dist;

    }

   




}
