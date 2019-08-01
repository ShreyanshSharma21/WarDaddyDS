package hello;



//Matrix Multiplication parenthesization
//recursive approach
public class DP2 
{
	public static int maxChainOrder(int a[],int i,int j)
	{
		
		if(i == j)
			return 0;
		int min = Integer.MAX_VALUE;
		
		for(int k = i ; k < j ; k++)
		{
			int count = maxChainOrder(a,i,k) + maxChainOrder(a, k+1, j) + a[i-1]*a[k]*a[j];
			if(count < min)
				min=count;
		}
		return min;
		
	}
	
	public static void main (String [] args)
	{
		int arr[] =  {10000,264664,354646,44661,3546463};
		System.out.println("Max Multiplications = " +maxChainOrder(arr,1,arr.length-1));
	}

}
