// { Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.io.*;
import java.lang.*;

class DriverClass
{
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while(t-- > 0)
        {
            ArrayList<ArrayList<Integer>> list = new ArrayList<>();
            int nov = sc.nextInt();
            int edg = sc.nextInt();
            
            for(int i = 0; i < nov+1; i++)
                list.add(i, new ArrayList<Integer>());
                
            for(int i = 1; i <= edg; i++)
            {
                int u = sc.nextInt();
                int v = sc.nextInt();
                list.get(u).add(v);
                list.get(v).add(u);
            }
            if(new DetectCycle().isCyclic(list, nov) == true)
                System.out.println("1");
            else System.out.println("0");
        }
    }
}// } Driver Code Ends
//User function Template for Java

/*
ArrayList<ArrayList<Integer>> list: represent graph containing 'V' number of
                                    vertices and edges between them
V: represent number of vertices
*/
class DetectCycle
{
    static int a[];
    static boolean isCyclic(ArrayList<ArrayList<Integer>> list, int V)
    {
        a=new int[V];
        for(int i=0;i<V;i++)
        {
            a[i]=-1;
        }
        for(int i=0;i<V;i++)
        {
            if(a[i]==-1)
            {
                if(dbs(list,i))
                {
                    return true;
                }
            }
        }
        return false;
    }
    static boolean dbs(ArrayList<ArrayList<Integer>> list,int s)
    {
        Queue<Integer> q=new LinkedList<>();
        q.add(s);
        a[s]=s;
        while(!q.isEmpty())
        {
            int r=q.remove();
            a[r]=1;
            for(int i:list.get(r))
            {   
                if(a[i]==-1)
                {
                    q.add(i);
                    a[i]=0;
                }
                else if(a[i]==0)
                {
                    return true;
                }
                
            }
            
        }
        return false;
        
    }
    
}
