package hello;
// printing lcs palindrome
public class DP14 
{
	
	public static void lcs(String s1 , String rev)
	{
		
		int n = s1.length();
		int m = rev.length();
		char c1 [] = s1.toCharArray();
		char c2 [] = rev.toCharArray();
		
		int dp[][] = new int [n+1][m+1];
		
		for(int i = 0 ; i<=n ; i++)
		{
			for(int j = 0 ; j<=m ; j++ )
			{
				if(i == 0 || j== 0)
					dp[i][j] = 0;
				else if(c1[i-1] == c2[j-1])
					dp[i][j] = dp[i-1][j-1] + 1;
				else
					dp[i][j] = Math.max(dp[i-1][j], dp[i][j-1]);
			}
		}
		int index = dp[n][m];
		int i = n ; int j = m;
		char lcss[] = new char[index + 1];
		while(i >0 && j > 0)
		{
			if(c1[i-1] == c2[j-1])
			{
				lcss[index - 1 ] = c1[i-1];
				
				
				i--;
				j--;
				index-- ;
			}
			else if(dp[i-1][j]	> dp[i][j-1])
				i--;
			else 
				j--;
		}
		for(int k = 0 ; k < lcss.length; k++) {
			System.out.print(lcss[k]);
		}
		System.out.println();
	}
	public static void lcsPrint(String s)
	{
		String s1 = s;
		int n  = s1.length();
		String rev= "";
		for(int i = n - 1 ; i >= 0 ; i--)
			rev = rev + s1.charAt(i);
		
		lcs(s1 , rev);
		
	}
	public static void main (String [] args)
	{
		String s = "shreyansh";
		lcsPrint(s);
	}

}
