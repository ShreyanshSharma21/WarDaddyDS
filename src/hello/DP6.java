package hello;
//knapsack problem naive recursive approach
public class DP6 
{
	
	public static int knapsack(int val[], int wt[],int W , int n)
	{
		
		if(W == 0 || n == 0)
			return 0;
		if(wt[n-1]>W)
			return knapsack(val,wt,W,n-1);
		else
			return Math.max((val[n-1]+knapsack(val,wt,W-wt[n-1],n-1)),(knapsack(val,wt,W,n-1)));
	}
	public static void main(String [] args)
	{
		int value[] = {60, 100, 120};
		int wt[] = {10, 20, 30};
		
		int W = 50;
		int n = value.length;
		System.out.println(knapsack(value,wt,W,n));
	}
	

}
