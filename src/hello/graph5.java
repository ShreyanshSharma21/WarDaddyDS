package hello;
import java.util.*;
import java.io.*;
//It's the great Bell-Man Ford Algorithm which mr smarty pants discovered 
// it detects the negative edge wts cycle refer clrs book

//now here the implementation differs slightly than previous of my programs 
//because the edges are weighted here

public class graph5 {
	
	class Edge
	{
		int src, dest, wt;//source , destination and weight
		Edge()
		{
			src=dest=wt=0;
		}
	}
	
	static int V,E;
	Edge edge[];
	
	graph5(int v , int e)
	{
		V=v;
		E=e;
		edge = new Edge[E];
		for (int i = 0; i < edge.length; i++)
		{
			edge[i]=new Edge();
			
		}
	}
	
	void BellmanFord(graph5 graph , int src)
	{
		int V = graph.V;
		int E = graph.E;
		int dist[] = new int[V];
		for (int i = 0; i < dist.length; i++) 
			dist[i]=9999;
		
		dist[src]=0;
		
		
		for(int i =1 ; i<V ; i++)
		{
			for(int j =0 ; j<E ; j++)
			{
				int u = graph.edge[j].src;
				int v = graph.edge[j].dest;
				int weight = graph.edge[j].wt;
				
				if(dist[u]!= 9999 && dist[u] + weight <dist[v])
					dist[v]= dist[u]+weight;
			}
		}
		
		for(int j =0 ; j<E ; j++)
		{
			int u = graph.edge[j].src;
			int v= graph.edge[j].dest;
			int weight = graph.edge[j].wt;
			
			if(dist[u] != 9999 && dist[u]+weight <dist[v])
				System.out.println("Negative Wt Cycle may exist");
			
		}
		printArr(dist , V);
		
	}
	
	void printArr(int dist[], int V)
	{
		System.out.println("Vertex Distance from Source");
		for(int i = 0; i<V; i++)
			System.out.println(i+"  "+dist[i]);
	}
	
	public static void main (String [] args)
	{
		int V = 5;
		int E = 8;
		graph5 graph = new graph5(V,E);
		
		
		graph.edge[0].src = 0; 
        graph.edge[0].dest = 1; 
        graph.edge[0].wt = -1; 
  
        
        graph.edge[1].src = 0; 
        graph.edge[1].dest = 2; 
        graph.edge[1].wt = 4; 
  
        
        graph.edge[2].src = 1; 
        graph.edge[2].dest = 2; 
        graph.edge[2].wt = 3; 
  
         
        graph.edge[3].src = 1; 
        graph.edge[3].dest = 3; 
        graph.edge[3].wt = 2; 
  
         
        graph.edge[4].src = 1; 
        graph.edge[4].dest = 4; 
        graph.edge[4].wt = 2; 
  
        
        graph.edge[5].src = 3; 
        graph.edge[5].dest = 2; 
        graph.edge[5].wt = 5; 
  
        
        graph.edge[6].src = 3; 
        graph.edge[6].dest = 1; 
        graph.edge[6].wt = 1; 
  
         
        graph.edge[7].src = 4; 
        graph.edge[7].dest = 3; 
        graph.edge[7].wt = -3; 
  
        graph.BellmanFord(graph, 0); 
	}
}
