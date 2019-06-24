package hello;
import java.util.*;
//DFS implementation STACK method using static class just to make things even more complex looking and
//making our lives difficult
public class graph3 {
	
	static class graph 
	{
		int V;
		LinkedList <Integer> adj[];
		graph(int v)
		{
			this.V=v;
			adj=new LinkedList[V];
			
			for(int i = 0 ; i<V;i++)
				adj[i]=new LinkedList<Integer>();
			
		}
		void addEdge(int v , int w)
		{
			adj[v].add(w);
		}
		
		void DFS(int s)
		{
			Vector<Boolean> visited = new Vector<Boolean>();
			for(int i =0;i<V;i++)
				visited.add(false);
			
			Stack<Integer> stack = new Stack<>();
			stack.push(s);
			
			while (!stack.empty()) {
				 	s= stack.peek();
				 	stack.pop();
				 	
				 	if(visited.get(s)==false)
				 	{
				 		visited.set(s, true);
				 		System.out.print(s+"  ");
				 	}
				 	
				 	Iterator<Integer> i = adj[s].iterator();
				 	while(i.hasNext())
				 	{
				 		int n = i.next();
				 		if(!visited.get(n))
				 		{
				 			stack.push(n);
				 		}
				 			
				 	}
				 	
			}
			
		}
		
		public static void main (String[] args)
		{
			graph g = new graph(5);
			
			g.addEdge(1, 0); 
	        g.addEdge(0, 2); 
	        g.addEdge(2, 1); 
	        g.addEdge(0, 3); 
	        g.addEdge(1, 4); 
	              
	        System.out.println("Following is the Depth First Traversal"); 
	        g.DFS(0); 
		}
		
	}

}
