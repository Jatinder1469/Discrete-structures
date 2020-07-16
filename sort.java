package ds;
import java.util.*;

public class ds3 {

	public static void main(String args[])
	{

	
Scanner s =new Scanner(System.in);
int n,i;
n=s.nextInt();
int[] a=new int[n];
for(i=0;i<a.length;i++)
{
a[i]=s.nextInt();

}
 Arrays.sort(a);

System.out.println(Arrays.toString(a));  

	}

}
