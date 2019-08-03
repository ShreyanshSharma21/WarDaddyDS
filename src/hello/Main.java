package hello;
import java.util.*;
public class Main
{
	
	public static void main(String [] args)
	{
	Scanner obj = new Scanner(System.in);
	int q = obj.nextInt();
	
	for( int i = 0 ; i <q ; i++)
	{
		int n = obj.nextInt();
		int a[] = new int[n];
		for(int j = 0 ; j< n;  j++)
		{
			a[i]=obj.nextInt();
		}
		int first =0 , sc = 0 , count = 0;
		for(int z= 1 ; z < n ; z++)
		{
			if(a[z]<a[z-1]	)
			{
				count++;
				if ( first == 0)
					first = z;
				else sc=z;
			}
		}
		
		if(count>2)
		{
			System.out.println("NO");
		}
		else if(count==0)
		{
			System.out.println("YES");
		}
		else
		{
			if(count==1)
			{
				int temp=a[first-1];
				a[first-1]=a[first];
				a[first] = temp;
			}
			if(count == 2)
			{
				int temp=a[first-1];
				a[first-1]=a[sc];
				a[sc] = temp;
			}
	   }
		for (int k = 1; k< a.length; k++) 
		{
			if(a[k]<a[k-1])
			{
				System.out.println("NO 1");
				break;
			}
			else
			{
				System.out.println("YES 2");
				break;
			}
		}
		
			
	}
	}
}


