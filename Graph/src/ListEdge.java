import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class ListEdge {
	public void MakeGraph() throws FileNotFoundException 
	{
		Scanner in = new Scanner(new File("MyGraph"));
		int Nodes =in.nextInt();
		int Edges=in.nextInt();
	//	ArrayList<Integer> Graph=new ArrayList<>() ;
		//Graph.add(12);
		ArrayList<Edge> Graph1=new ArrayList();
		
		for(int i=0;i<Edges;i++)
			
		{int u=in.nextInt(), v =in.nextInt();
		Edge edge=new Edge(u,v);
		Graph1.add(edge);
	    }
		for(int i=0;i<Nodes;i++)
		{	

		System.out.println(Graph1.get(i).u+" "+Graph1.get(i).v);
	}
	}
}
