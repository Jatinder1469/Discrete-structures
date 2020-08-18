package ds;
import java.util.*;
import java.util.Scanner;

public class test2 {
	static int postfix(String c)
	{
		Stack<Integer> g=new Stack();
		for(int i=0;i<c.length();++i)
		{
			char d=c.charAt(i);
			if(d== ' ')
				continue;
			else if(Character.isDigit(d))
			{
				int n=0;
				while(Character.isDigit(d))
				{
					n=n*10+(int)d-'0';
					i++;
					d=c.charAt(i);
					}
				i--;
				 g.push(n);
			}
			else
			{
				int v=g.pop();
				int x=g.pop();
				if(d=='+')
					g.push(x+v);
				if(d=='-')
					g.push(x-v);
				if(d=='*')
					g.push(x*v);
				if(d=='/')
					g.push(x/v);
			}
		}
		return g.pop();
		
	}
	
	public static void main(String args[])
	{
		Scanner s1=new Scanner(System.in);
		String ch=new String();
		ch=s1.nextLine();
		System.out.println(postfix(ch));
		
	}
}
