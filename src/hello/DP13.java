package hello;
//pallindromic lcs dp approach
public class DP13 
{
	public static int lcs(char c[], int n)
	{
		int dp [][] = new int [n][n];
		
		for (int i = 0; i < n; i++) {
			dp[i][i] = 1;
			
		}
		for(int cl = 2 ; cl <= n ; cl++) {
			
			for(int i = 0 ; i < n-cl+1 ; i++)
			{
				int j = i+cl-1;
				if(c[i]==c[j] && cl == 2)
					dp[i][j] = 2;
				else if(c[i]==c[j])
					dp[i][j] = dp[i+1][j-1] + 2;
				else 
					dp[i][j]  = Math.max(dp[i+1][j], dp[i][j-1]);
				 
			}
			
		}
		
		return dp[0][n-1];
		
		
	}
	
	
	
	
	public static void main (String [] args)
	{
		String s = "shreyansh";
		char c[] = s.toCharArray();
		
		System.out.println(lcs(c, c.length));
	}

}
