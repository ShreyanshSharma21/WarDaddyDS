package hello;
import java.util.*;
//DFS implementation recursive
public class graph2 {
	
	private int V;
	private LinkedList<Integer> adj[];
	
	graph2 (int v)
	{
		V=v;
		adj= new LinkedList[V];
		for(int i = 0 ; i < V ; i++)
			adj[i]= new LinkedList();
		
	}
	
	void addEdge(int v , int w)
	{
		adj[v].add(w);
	}
	
	void DFS_Visit(int v , boolean visited[])
	{
		visited[v]	= true;
		System.out.print(v+" ");
		
		Iterator<Integer> i = adj[v].listIterator();
		while(i.hasNext())
		{
			int n = i.next();
			if(!visited[n])
				DFS_Visit(n,visited);
		}
		
	}
	void DFS (int v)
	{
		boolean visited[] = new boolean[V];
		
		DFS_Visit(v,visited);
	}
	public static void main(String [] args)
	{
		graph2 g = new graph2(4); 
		  
        g.addEdge(0, 1); 
        g.addEdge(0, 2); 
        g.addEdge(1, 2); 
        g.addEdge(2, 0); 
        g.addEdge(2, 3); 
        g.addEdge(3, 3); 
  
        System.out.println("Following is Depth First Traversal "+ 
                           "(starting from vertex 2)"); 
  
        g.DFS(2); 
	}
	
	
	
	
	
}
