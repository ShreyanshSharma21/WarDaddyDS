package hello;
import java.util.*;
//BFS implementation using queue



public class graph {
	
	private int V;
	private LinkedList<Integer> adj[];
	
	graph(int v)
	{//constructor to make adjacency list 
		V=v;
		adj = new LinkedList[V];
		for(int i =0 ; i <V ; i++)
		{
			adj[i]=new LinkedList();
		}
	}
	
	void addEdge(int v, int w)
	{//adds the edge
		adj[v].add(w);
	}
	
	void BFS(int s)
	{
		boolean visited[]=new boolean[V];
		LinkedList<Integer> queue = new LinkedList<Integer>();
		visited[s]=true;
		queue.add(s);
		while(queue.size()!=0)
		{
			s=queue.poll();
			System.out.print(s+" ");
			Iterator<Integer> i = adj[s].listIterator();
			while(i.hasNext())
			{
				int n = i.next();
				if(!visited[n])
				{
					visited[n]= true;
					queue.add(n);
				}
			}
		}
	}
	
	public static void main(String [] args)
	{
		graph g = new graph(4);
		
		g.addEdge(0, 1); 
        g.addEdge(0, 2); 
        g.addEdge(1, 2); 
        g.addEdge(2, 0); 
        g.addEdge(2, 3); 
        g.addEdge(3, 3); 
  
        System.out.println("Following is Breadth First Traversal "+ 
                           "(starting from vertex 2)"); 
  
        g.BFS(2); 
		
	}
	

}
