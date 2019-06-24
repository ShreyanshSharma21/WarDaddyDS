package hello;
import java.util.*;
public class graph4 {
	
	private int V;
	private LinkedList<Integer> adj[];
	
	public graph4(int v)
	{
		// TODO Auto-generated constructor stub
		V=v;
		adj=new LinkedList[V];
		for(int i =0 ; i<V;i++)
			adj[i] = new LinkedList();
	}
	
	void addEdge(int v , int w)
	{
		adj[v].add(w);
	}
	
	
	void topologicalsort()
	{
		Stack<Integer> stack = new Stack<>();
		boolean visited[] = new boolean[V];
		
		for(int i =0;i<V;i++)
			if(visited[i]==false)
				topological_sort_util(i, visited, stack);
		
		while(stack.empty()==false)
			System.out.print(stack.pop()+"   ");
	}
	
	
	void topological_sort_util(int 	v ,boolean visited[] ,Stack<Integer> stack)
	{
		visited[v] = true;
		Iterator<Integer> it = adj[v].iterator();
		while(it.hasNext())
		{
			int i = it.next();
			if(visited[i]==false)
				topological_sort_util(i, visited, stack);
			
		}
		stack.push(v);
	}
	
	
	public static void main(String args[]) 
    { 
        // Create a graph given in the above diagram 
        graph4 g = new graph4(6); 
        g.addEdge(5, 2); 
        g.addEdge(5, 0); 
        g.addEdge(4, 0); 
        g.addEdge(4, 1); 
        g.addEdge(2, 3); 
        g.addEdge(3, 1); 
  
        System.out.println("Following is a Topological " + 
                           "sort of the given graph"); 
        g.topologicalsort(); 
    } 

}
