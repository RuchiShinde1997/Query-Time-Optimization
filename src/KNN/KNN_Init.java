/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package KNN;


import java.util.ArrayList;



/**
 *
 * @author 1450
 */
public class KNN_Init 
{
    public ArrayList initClustering(ArrayList pdata)
    {
        ArrayList cluster=new ArrayList();
        
        double ed=new DistanceEvaluator().calculateEuclideanDistance(pdata);
          ed=(int)Math.sqrt(ed);
          
          System.out.println("MEAN EUCLEDEAN DISTANCE IS "+ed);
        ///======finding centroids======================================//
       DataKeeper.centroid=new DataPoints().getCentroid(DataKeeper.master);

      DataKeeper.centroid=new Sorter().sortcentroids(DataKeeper.centroid);
      System.out.println("Centorids");
      System.out.println(DataKeeper.centroid);
        
         //=============================ranges=============================//
        Neighbor_Boundary r=new Neighbor_Boundary();
        System.out.println("---range generated for centroids----");
        DataKeeper.range=r.getRange(DataKeeper.centroid,ed);
        
//        System.out.println(DataKeeper.range);
        System.out.println("\n\n");
        
         //----------------------clustering---------------------------//
        Clustering km=new Clustering();
        ArrayList c=km.getKClusters(DataKeeper.range,DataKeeper.master);
       System.out.println("---clusters generated---"+c);
        ArrayList out=km.getoutlinears(DataKeeper.master,c);
       System.out.println("======outlinears=====");
        System.out.println(out);
        c.add(out);

      
        for(int i=0;i<c.size();i++)
       {
           
            ArrayList single=(ArrayList)c.get(i);
            ArrayList row=new ArrayList();
           for(int j=0;j<single.size();j++)
           {
           ArrayList temp=(ArrayList)single.get(j);
               //System.out.println(temp);
           ArrayList temp1=new ArrayList();
           String s1=(String)temp.get(1);
           String s2=(String)temp.get(11);
           String s3=(String)temp.get(18);
          String s4=(String)temp.get(temp.size()-1);
          
              
          
           temp1.add(s1);
           temp1.add(s2);
          
           temp1.add(s3);
           temp1.add(s4);
           
           
            

           row.add(temp1);
           }
          
           
           cluster.add(row);
       }
      

      
        return cluster;
    }
}
