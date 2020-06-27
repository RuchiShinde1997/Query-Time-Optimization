/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package KNN;

import java.util.ArrayList;

/**
 *
 * @author A57
 */
public class Neighbor_Boundary {

    public ArrayList getRange(ArrayList centroid,double ed)
    {
        ArrayList range=new ArrayList();

        for(int i=0;i<centroid.size();i++)
        {
         double r1=Double.parseDouble(centroid.get(i).toString());
         double min=r1-ed;
         double max=r1+ed;
            String minmax=min+" "+max;
            System.out.println(min+" -- "+max);
            range.add(minmax);
        }




        return range;
    }
}
