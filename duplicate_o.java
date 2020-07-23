package ds;
import java.util.*;
public class duplicate_o {
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
       int a[]= {0,1,0,-1,0,-1,2,-4,5,8};
       Set<Integer> set=new HashSet<Integer>();
       for(int i=0;i<a.length;i++)
       {
    	   if(set.add(a[i])==false)
    	   {
    		   System.out.println(a[i]+" ");
    	   }
       }
	}
	}


