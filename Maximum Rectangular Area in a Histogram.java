/*package whatever //do not write package name here */

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args) {
		//code
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0)
		{
		    int p=sc.nextInt();
		    int a[]=new int[p];
		    int l[]=new int[p];
		    int r[]=new int[p];
		    for(int i=0;i<p;i++)
		    a[i]=sc.nextInt();
		    Stack<Integer> s=new Stack<>();
		    l[0]=-1;
		    int z=0;
		    int x=0;
		    s.push(0);
		    for(int i=1;i<p;i++)
		    {
		        z=0;
		        
		        if(s.size()==0)
		        {
		            s.push(i);
		            l[i]=-1;
		            continue;
		        }
		        int ra=a[s.peek()];
		        if(ra<a[i])
		        {
		            l[i]=s.peek();
		            s.push(i);
		        }
		        else
		        {
		            while(s.size()!=0)
		            {
		                if(a[s.peek()]<a[i])
		                {
		                   
		                    l[i]=s.peek();
		                     s.push(i);
		                    z=1;
		                    break;
		                }
		                else
		                s.pop();
		              
		            }
		            if(z==0)
		            {
		                l[i]=-1;
		                s.push(i);
		            }
		        }
		        
		    }
		    s.clear();
		    s.push(p-1);
		    r[p-1]=p;
		    for(int i=p-2;i>-1;i--)
		    {
		        x=0;
		        
		        if(s.size()==0)
		        {
		            s.push(i);
		            r[i]=p;
		            continue;
		        }
		        int ra=a[s.peek()];
		        if(ra<a[i])
		        {
		            r[i]=s.peek();
		            s.push(i);
		        }
		        else
		        {
		            while(s.size()!=0)
		            {
		                if(a[s.peek()]<a[i])
		                {
		                   
		                    r[i]=s.peek();
		                     s.push(i);
		                    x=1;
		                    break;
		                }
		                else
		                s.pop();
		              
		            }
		            if(x==0)
		            {
		                r[i]=p;
		                s.push(i);
		            }
		        }
		        
		    }
		    int min=Integer.MIN_VALUE;
		    for(int i=0;i<p;i++)
		    {
		        r[i]=(r[i]-l[i]-1)*a[i];
		        if(min<r[i])
		        min=r[i];
		    }
		    System.out.println(min);
		   
		   
		}
	}
}
