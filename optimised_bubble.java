package ds;
import java.util.*;
public class optimised_bubble {
	public void bubble(int a[])
	{
	  int n=a.length;
		int i,j,temp;
		for(i=0;i<n-1;i++)
		{
			boolean flag=true;
			for(j=0;j<n-i-1;j++)
			{
				if(a[j]>a[j+1])
				{
					
					temp=a[j];
					a[j]=a[j+i];
					a[j+1]=temp;
					flag=false;
					
				}
			}
		
		if(flag==true)
			break;
		}
		
	}
	public static void main(String args[])
	{
		   int[] data = { -2, 45, 0, 11, -9 };
		    optimised_bubble bs = new optimised_bubble();
		    bs.bubble(data);
		    System.out.println("Sorted Array in Ascending Order:");
		    System.out.println(Arrays.toString(data));
}
}
