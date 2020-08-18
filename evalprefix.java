package ds;

import java.util.*;

public class test3 {
	static Boolean op(char ch)
	{
		if(ch>=48 && ch<=57)
			return true;
		else
			return false;
		
	}
	static double prefix(String s)
	{
		Stack<Double> d=new Stack();
		for(int i=s.length()-1;i>=0;i--)
		{
			if(op(s.charAt(i)))
				d.push((double)(s.charAt(i)-48));
			else
			{
				double g=d.peek();
				d.pop();
				double h=d.peek();
				d.pop();
				
				if(s.charAt(i)== '+')
					d.push(g+h);
				if(s.charAt(i)== '-')
					d.push(g-h);
				if(s.charAt(i)== '*')
					d.push(g*h);
				if(s.charAt(i)== '/')
					d.push(g/h);
			}
		}
		return d.peek();
	}
	
	public static void main(String args[])
	{
		Scanner s1=new Scanner(System.in);
		String ch=new String();
		ch=s1.nextLine();
		System.out.println(prefix(ch));
		
	}

}
