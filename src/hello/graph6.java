package hello;
import java.util.*;
import java.io.*;
import java.lang.*;
public class graph6 
{
	public final int  V = 9;
	
	void dijkstra(int graph[][],int src)
	{
		int dist[]= new int [V];
		boolean sptset[] = new boolean[V];
		
		for (int i = 0; i < V; i++) 
		{
			dist[i]= Integer.MAX_VALUE;
			sptset[i] = false;
		}
		
		dist[src] = 0;
		
		for(int count = 0 ; count < V-1 ; count++)
		{
			int u  = mindistance(dist , sptset);
			sptset[u]=true;
	        for(int v=0 ; v<V ;  v++)
			{
				if(!sptset[v] && graph[u][v] != 0 && dist[u] != Integer.MAX_VALUE && dist[v]> dist[u]+graph[u][v])
				{
					dist[v] = dist[u]+ graph[u][v];
				}
			}
			
			
		}
		printsolution(dist,V);
		
	}

	int mindistance(int dist[], boolean sptset[])
	{
		int min = Integer.MAX_VALUE;
		int minindex = -1;
		for(int i = 0 ; i<V ; i++)
		{
			if(dist[i]<= min && sptset[i]==false)
			{
				min = dist[i];
				minindex = i;
			}
		}
		return minindex;
	}
	
	void printsolution(int dist[] , int n)
	{
		for (int i = 0; i < n; i++)
		{
			System.out.println(i + "   Distance  " + dist[i]);
			
		}
	}
	
	public static void main (String [] args)
	{
		int graph[][] = new int[][]{{0, 4, 0, 0, 0, 0, 0, 8, 0}, 
            {4, 0, 8, 0, 0, 0, 0, 11, 0}, 
            {0, 8, 0, 7, 0, 4, 0, 0, 2}, 
            {0, 0, 7, 0, 9, 14, 0, 0, 0}, 
            {0, 0, 0, 9, 0, 10, 0, 0, 0}, 
            {0, 0, 4, 14, 10, 0, 2, 0, 0}, 
            {0, 0, 0, 0, 0, 2, 0, 1, 6}, 
            {8, 11, 0, 0, 0, 0, 1, 0, 7}, 
            {0, 0, 2, 0, 0, 0, 6, 7, 0} 
           };  
           
          graph6 t = new graph6();
          t.dijkstra(graph , 0);
           
           
     }
}
