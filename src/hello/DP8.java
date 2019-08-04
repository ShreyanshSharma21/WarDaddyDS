package hello;
//Longest Common Subsequence
public class DP8
{
	public static int lcs(char c1[], char c2[], int m, int n)
	{
		
		if(m==0 || n==0)
			return 0;
		if(c1[m-1] == c2[n-1])
			return 1 + lcs(c1, c2, m-1, n-1);
		else
			return Math.max(lcs(c1, c2, m-1, n), lcs(c1, c2, m, n-1));
		
		
	}
	
	public static void main(String [] args)
	{
	   String s1 = "tdtidyufkhjvkd";
	   String s2 = "gfxdzyrxfjgcjf";
	   
	   char c1[] = s1.toCharArray();
	   char c2[] = s2.toCharArray();
	   
	   
	   
	   System.out.println(lcs(c1, c2, c1.length, c2.length));
	}

}
