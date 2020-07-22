package ds;
import java.util.*;
public class max_element {
	
	public static void main(String args[])
	{
		Scanner  s=new Scanner(System.in);
		int n,i;
		n=s.nextInt();
		int a[]=new int[n];
		for(i=0;i<n;i++)
		a[i]=s.nextInt();
		int max;
		max=a[0];
		for(i=0;i<n;i++)
		{
			if(a[i]>max)
				max=a[i];
		}
		System.out.println(max);
		
	}

}
