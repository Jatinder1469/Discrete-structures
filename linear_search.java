package ds;
import java.util.*;
public class linear {
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		int n,i;
		n=s.nextInt();
		int a[]=new int[n];
		for(i=0;i<n;i++)
		{
		a[i]=s.nextInt();
		}
		int ele;
		int j=0;
		ele=s.nextInt();
		for(i=0;i<n;i++)
		{
			if(a[i]==ele)
			{
				j=i;
			}
		}
		System.out.println(" "+ele+" found at index "+j+" ");
	}

}
