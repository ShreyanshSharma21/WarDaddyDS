package hello;
//knapsack DP approach
public class DP7 
{
	
	public static int knapsack(int []value,int [] wt, int W,int n)
	{
		int dp[][]=new int[n+1][W+1];
		
		for(int i = 0 ; i <= n ; i++)
			for(int j = 0 ; j<=W ; j++)
			{
				if(i == 0 || j== 0)
					dp[i][j]=0;
				else if( wt[i-1] < j)
					dp[i][j] = Math.max(value[i-1] + dp[i-1][j-wt[i-1]],  dp[i-1][j]);
				else
					dp[i][j] = dp[i-1][j];
				
					
			}
		return dp[n][W];
		
	}
	public static void main (String [] args )
	{
		int value []= {60, 100, 120};
		int wt[] = {10, 20, 30};
		int W = 50;
		int n = value.length;
		System.out.println(knapsack(value,wt,W,n));
		
	}
	
	
	
	
	
	
	
	
	
	

}
