package hello;
//LCS Pallindromic naive recursive
public class DP12
{

	public static int lcs (char c[], int i, int j)
	{
		if(i == j)
			return 1;
		if (c[i] == c[j] && i == j-1 )
			return  2;
		if(c[i] == c[j])
			return lcs(c, i+1, j-1) + 2;

		return Math.max(lcs(c, i+1, j),lcs(c, i, j-1));
	}
	public static void main(String[] args)
	{
		String s = "ShreyanshSharma";
		char c[] = s.toCharArray();

		System.out.println(lcs(c, 0, c.length - 1  ));


		
	}
}