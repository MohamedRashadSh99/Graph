import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class AdjacencyList {
	public void MakeGraph() throws FileNotFoundException 
	{
		Scanner in = new Scanner(new File("MyGraph"));
		int Nodes =in.nextInt();
		int Edges=in.nextInt();
	//	ArrayList<Integer> Graph=new ArrayList<>() ;
		//Graph.add(12);
		ArrayList<Integer>[] Graph1=new ArrayList[Nodes] ;
		for(int i=0;i<Nodes;i++)
		
		{
		Graph1[i]=new ArrayList<>();
	    }
		
		for(int i=0;i<Edges;i++)
			
		{int u=in.nextInt(), v =in.nextInt();
		Graph1[u].add(v);Graph1[v].add(u);
	    }
		for(int i=0;i<Nodes;i++)
		{	System.out.print(i+" connected to ");
		{for(int u:Graph1[i])
		System.out.print(u+" ");
		
	    }
		System.out.println(" ");
	}
	}
}
