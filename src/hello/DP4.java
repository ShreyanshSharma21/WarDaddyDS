package hello;
// Edit Distance Problem
//naive recursive approach
public class DP4 
{
	
	public static int editDist(String s1,String s2, int m,int n)
	{
		if(m==0)
			return n;
		if(n==0)
			return m;
		
		if(s1.charAt(m-1) == s2.charAt(n-1))
			return editDist(s1,s2,m-1,n-1);
		
		return 1 + min(editDist(s1 , s2 , m,n-1), editDist(s1,s2,m-1,n) , editDist(s1 , s2 , m-1 , n-1));			
	}
	
	
	public static int min(int x , int y , int z)
	{
		if (x<=y && x<=z) return x; 
        if (y<=x && y<=z) return y; 
        else return z; 
	}
	
	public static void main(String [] args)
	{
		String str1 = "Your Name here";
		String str2 = "Your Name here";
		
		System.out.println(editDist(str1,str2,str1.length(),str2.length()));
				
	}

}
