/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package hypergraph;

import java.util.ArrayList;
import java.util.Map;
import java.util.Map.Entry;
import org.neo4j.graphdb.GraphDatabaseService;
import org.neo4j.graphdb.Result;


public class Node_Name_Finder
{
	//  This class is used to find out names of nodes using id


    public String find_Node_Names(String tid,GraphDatabaseService db)
    {
        ArrayList node_names=new ArrayList();


        String node_name="";
      //  System.out.println("id is "+id);
       
            

            String query="match (s) where id(s) ="+tid+" return s.name";
            // System.out.println("query is "+query);

              Result result = db.execute( query ) ;


    while ( result.hasNext() )
    {

        Map<String,Object> row = result.next();
        for ( Entry<String,Object> column : row.entrySet() )
        {
             node_name=column.getValue().toString().trim();

           // System.out.println("---------->"+node_name);
             // node_names.add(n_name.trim());
        }

    }

               return node_name;

    }

}
