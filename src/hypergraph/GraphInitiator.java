/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package hypergraph;

import org.neo4j.graphdb.GraphDatabaseService;
import org.neo4j.graphdb.factory.GraphDatabaseFactory;


public class GraphInitiator {
//public static final String DB_PATH = "D:/neo4j-community-2.2.3/data/graph.db";
// public static GraphDatabaseService graphDb;
    /**
     * @param args the command line arguments
     */
    public  void initgraph()
    {

       
        WithOptimizationFrame ws = new WithOptimizationFrame();
        ws.setVisible(true);
        
        ws.setLocation(300,210);
        ws.setSize(600,460);

       


    }
}
