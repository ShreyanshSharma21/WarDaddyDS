package hello;

import java.util.Arrays;

// LCS using memoization technique
public class DP11 
{
	public static int lcs(char c1[], char c2[], int m, int n, int dp[][])
	{
		if(m==0 || n==0)
			return 0;
		if(dp[m-1][n-1]  != -1)
			return dp[m-1][n-1];
		if(c1[m-1] == c2[n-1])
		{
			 dp[m - 1][n - 1] = 1 + lcs(c1, c2, m - 1, n - 1, dp);
			 return dp[m-1][n-1];
		}
		else 
		{
			dp[m-1][n-1]=Math.max(lcs(c1, c2, m-1, n,dp), lcs(c1, c2, m, n-1, dp));
			return dp[m-1][n-1];
		}
			
		
	}
	public static void main (String [] args)
	{
		String s1 = "Shreyansh";
		String s2 = "Shreyash";
		
		char c1[]  = s1.toCharArray();
		char c2[] = s2.toCharArray();
		int dp[][] = new int[c1.length][1000];
		for(int [] row : dp)
			Arrays.fill(row	, -1);
		
		System.out.println(lcs(c1, c2, c1.length, c2.length, dp));
	
	
	}
	
	
	
	
	
	
	
	
	
	

}
