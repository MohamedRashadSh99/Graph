import java.io.FileNotFoundException;
import java.io.IOException;

public class Main {
	public static void main (String []args) throws IOException
	{
		////////AdjacencyMatix to present Gragh
		System.out.println("Graph using AdjacencyMatix");
		AdjacencyMatix graph1=new AdjacencyMatix();
	try {
		graph1.MakeGraph();
	} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	System.out.println("\nGraph using AdjacencyList");
	/////////// AdjacencyList to present Graph
	AdjacencyList graph2=new AdjacencyList();
try {
	graph2.MakeGraph();
} catch (FileNotFoundException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
System.out.println("\nGraph using EdgeList");
//////////////EdgeList To present Gragh
ListEdge listEdge =new ListEdge();
listEdge.MakeGraph();

}
}