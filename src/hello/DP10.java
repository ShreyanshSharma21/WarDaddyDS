package hello;
//printing out 
public class DP10 
{
	
	
	public static void lcs(char c1[], char c2[], int m, int n)
	{
		int L[][] = new int [m+1][n+1];
		for (int i=0; i<=m; i++) 
        { 
            for (int j=0; j<=n; j++) 
            { 
                if (i == 0 || j == 0) 
                    L[i][j] = 0; 
                else if (c1[i-1] == c2[j-1]) 
                    L[i][j] = L[i-1][j-1] + 1; 
                else
                    L[i][j] = Math.max(L[i-1][j], L[i][j-1]); 
            } 
        } 
	int index = L[m][n];
	int temp = index;
	 char[] lc = new char[index+1]; 
	 lc[index] =' ';
	int i = m;
	int j= n;
	
	 while(i>0 && j>0)
	 {
		 if(c1[i-1] == c2[j-1])
		 {
			 lc[index-1] = c1[i-1]; 
			 i--;
			 j--;
			 index--;
		 }
		 else if(L[i-1][j] > L[i][j-1])
			 i--;
		 else 
			 j--;
			 
	 }
	 for(int k=0;k<=temp;k++) 
         System.out.print(lc[k]); 
	
	
}
	
	
	
	
	public static void main (String [] args)
	{
		String s1 ="Shreyansh";
		String s2 ="Shreyash";
		
		char c1[] = s1.toCharArray();
		char c2[] = s2.toCharArray();
		
		lcs(c1, c2, c1.length, c2.length);
		
		
	}

}
