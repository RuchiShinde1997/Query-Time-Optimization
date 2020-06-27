/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package KNN;

import java.util.ArrayList;
import java.util.HashSet;

/**
 *
 * @author A57
 */
public class DataPoints {

    public ArrayList getCentroid(ArrayList master)
    {
        ArrayList centroid =new ArrayList();
        
        System.out.println("=====no of elemnts==="+master.size());
        int cp1=21,cp2=33,cp3=48,cp4=64,cp5=89;    // centroid percentages//
        int c1=(master.size()*cp1)/100;           // centroid position 1//
        int  c2=(master.size()*cp2)/100;           // centroid position 2//
        int  c3=(master.size()*cp3)/100;
        int c4=(master.size()*cp4)/100;
        int c5=(master.size()*cp5)/100;
        System.out.println("\n\ncentroid positons are "+c1+"---"+c2+"----"+c3+"----"+c4+"-----"+c5+"\n\n");
        ArrayList centroidindex=new ArrayList();
        centroidindex.add(c1);
        centroidindex.add(c2);
        centroidindex.add(c3);
        centroidindex.add(c4);
        centroidindex.add(c5);
        for(int j=0;j<centroidindex.size();j++)
        {
         int v=Integer.parseInt(centroidindex.get(j).toString());

        //System.out.println("===v"+v);
         v=v-1;
         ArrayList temp=(ArrayList)master.get(v);
         System.out.println("====temp for centroid===");
         System.out.println("++++"+temp);
         //double v1=Double.parseDouble(temp.get(1).toString());
         double v1=Double.parseDouble(temp.get(temp.size()-1).toString());
            System.out.println(""+v1);
         centroid.add(v1);
       }
        System.out.println("\n\n");
   return centroid;
    }



}
