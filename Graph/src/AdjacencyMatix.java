import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class AdjacencyMatix {

	public void MakeGraph() throws FileNotFoundException 
	{
		Scanner in = new Scanner(new File("MyGraph"));
		int Nodes =in.nextInt();
		int Edges=in.nextInt();
		boolean [] [] Graph1=new boolean [Nodes][Nodes] ;
		for(int i=0;i<Edges;i++)
		
		{int u=in.nextInt(), v =in.nextInt();
		Graph1[u][v]=Graph1[v][u]=true;
	    }
		for(int i=0;i<Nodes;i++)
			{for(int j=0;j<Nodes;j++)	
		{	
		if(Graph1[i][j]==true)
			System.out.print("1");
		else
			System.out.print("0");
		System.out.print(" ");
	    }
		System.out.println(" ");
			}
	}
}
