package hello;
//rod cutting problem memoization
public class DP15 {
	
	
	public static int  rodCutMemoized(int r[], int p[], int n)
	{
		int q ;
		if(r[n] >= 0)
			return r[n];
		if(n == 0)
			return q = 0;
		else 
			q = Integer.MIN_VALUE;
		for(int i  = 1 ; i<=n ; i++)
			q = Math.max(q, p[i]+rodCutMemoized(r, p, n-i));
		
		r[n]=q;
		return q ;
		
	}
	
	public static void main (String [] args)
	{
		int n = 4; 
		int r[] = new int [6];
		
		for (int i = 0; i < r.length; i++) {
			r[i] = -1;
		}
		int p[] = new int [6];
		p[1] = 1; 
		p[2] = 5;
		p[3] = 8;
		p[4] = 9;
		p[5] = 10;
		
		
		System.out.println( rodCutMemoized(r, p, n));
		
	}
	
	
	

}
