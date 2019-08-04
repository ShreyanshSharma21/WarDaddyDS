package hello;
// DP implementation of LCS
public class DP9 
{
	public static int lcs(char c1 [], char c2 [], int m, int n)
	{
		int dp[][] = new int [m+1][n+1];
		
		for (int i = 0; i <= m; i++) 
		{
			for (int j = 0; j <= n; j++)
			{
				if( i == 0 || j == 0)
					dp[i][j] = 0;
				else if(c1[i-1] == c2[j-1]) 
					dp[i][j] = dp[i-1][j-1] + 1;
				else
					dp[i][j] = Math.max(dp[i-1][j], dp[i][j-1]);
			}
		
			
		}
		return dp[m][n];
	}
	
	
	
	
	public static void main(String[] args)
	{
		String s1 = "tdtidyufkhjvkdrtseraesghvknklhhkfrtsezxgjhvhjvkgcfuxjgchjcjfxzerzfgvjkvkhgxrdkyvkchfztrzhjgcghgctyctyictcj";
		String s2 = "gfxdzyrxfjgcjfxdztewawtejtgvkhvkghvgivkyvkvkhvjxhfdxhfgchvmhffsyesdyfkhcjfxjtdfhhhdjtxdrzeryzwszjrcxjcjgcj";
		
		char c1 [] = s1.toCharArray();
		char c2 [] = s2.toCharArray();
		
		System.out.println(lcs(c1, c2, c1.length, c2.length));
	}

}
