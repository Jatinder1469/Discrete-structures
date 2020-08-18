package ds;
import java.util.*;

public class test1 
{
static int pre(char ch) {
	switch (ch)
	{
	case '+':
	case '-':
		return 1;
	case '*':
	case '/':
		return 2;
	case '^':
		return 3;
	}
	return -1;
}
	static String Postfix(String s)
	{
		String r=new String(" ");
		Stack<Character> c=new Stack();
		for(int i=0;i<s.length();++i)
		{
			char d=s.charAt(i);
		if(Character.isLetterOrDigit(d))
			r=r+d;
		else if(d== '(')
			c.push(d);
		else if(d==')')
		{
			while(!c.isEmpty() && c.peek()!='(')
			{
				r=r+c.pop();
			}
	        if(!c.isEmpty() && c.peek()!='(')
	        	return "Invalid";
	        else
	        	c.pop();
		}
		else
		{
			while(!c.isEmpty() && pre(d)<=pre(c.peek()))
			{
				if(c.peek()=='(')
					return "invalid";
			      r=r+c.pop();
			      }
		c.push(d);
		}
	}
		while(!c.isEmpty())
		{
			if(c.peek()=='(')
				return "invalid";
		      r=r+c.pop();
		}
		return r;
	}
public static void main(String args[])
{
	Scanner s1=new Scanner(System.in);
	String ch=new String();
	ch=s1.nextLine();
	System.out.println(Postfix(ch));
	
}
}
