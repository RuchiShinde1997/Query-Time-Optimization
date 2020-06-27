/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package hypergraph;

import java.util.ArrayList;
import java.util.Iterator;
import org.neo4j.graphdb.*;
import java.util.Map;
import java.util.Map.Entry;


public class FindAllNodesOfGraph {

    public static ArrayList baseNodes = new ArrayList();
    public static ArrayList temp = new ArrayList();

    public ArrayList find(GraphDatabaseService db) {
        ArrayList nodes = new ArrayList();

        Transaction tx = db.beginTx();
        try {
            Iterable hh = db.getAllNodes();
            Iterator it = hh.iterator();
            while (it.hasNext()) {
                ArrayList mm = new ArrayList();
                Node nd = (Node) it.next();

                Iterable ll = nd.getRelationships(Direction.BOTH);

                Iterator oo = ll.iterator();
                int ct = 0;

                while (oo.hasNext()) {
                    oo.next();
                    ct++;
                }

                System.out.println("nd ++++++++++++++ " + nd);
                String rid = nd.toString();


                int start = rid.indexOf("[");
                int end = rid.indexOf("]");

                String id = rid.substring(start + 1, end);


                Node_Name_Finder nodename = new Node_Name_Finder();
                String node_names = nodename.find_Node_Names(id.trim(), db);



                //  System.out.println("node name : "+node_names+" "+ct);
                if (!temp.contains(node_names)) {
                    temp.add(node_names);
                    mm.add(node_names);
                    mm.add(nd);

                    nodes.add(mm);
                }
            }


            return nodes;

        } finally {
            tx.finish();
        }
    }

    public void findBaseNodes(GraphDatabaseService db) {
        Transaction tx = db.beginTx();
        try {
            String query = "";

            query = "MATCH (n)-[r]->(c) RETURN n";




            Result result = db.execute(query);

            ArrayList mas = new ArrayList();
            ArrayList temp = new ArrayList();
            int ct = 0;
            while (result.hasNext()) {
                ct++;

                Map<String, Object> row = result.next();
                for (Entry<String, Object> column : row.entrySet()) {
                    ArrayList mm = new ArrayList();

                    String rid = column.getValue().toString();

                    int start = rid.indexOf("[");
                    int end = rid.indexOf("]");

                    String id = rid.substring(start + 1, end);
                    Node_Name_Finder nodename = new Node_Name_Finder();
                    String node_names = nodename.find_Node_Names(id.trim(), db);
                    if (!temp.contains(node_names)) {
                        temp.add(node_names);
                        mm.add(node_names);
                        baseNodes.add(node_names);
                        mm.add(column.getValue());

                        mas.add(mm);
                    }
                }

            }



            //  System.out.println(mas);


//return mas;
        } finally {
            tx.finish();
        }

    }
}
