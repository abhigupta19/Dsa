/*package whatever //do not write package name here */

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
    public static void main (String[] args) {
    Scanner sc=new Scanner(System.in);
    int t=sc.nextInt();
    while(t-->0)
    {
        int v=sc.nextInt();
        int w=sc.nextInt();
        int g[][]=new int[w][3];
        for(int i=0;i<w;i++)
        {
            g[i][0]=sc.nextInt();
            g[i][1]=sc.nextInt();
            g[i][2]=sc.nextInt();
            
        }
        int d[]=new int[v];
        for(int i=0;i<v;i++)
        {
            d[i]=Integer.MAX_VALUE;
            
        }
        d[0]=0;
        // for(int i=0;i<v-1;i++)
        // {
        //     for(int j=0;j<w;j++)
        //     {
        //         d[g[j][1]]=Math.min(d[g[j][1]],d[g[j][0]]+g[j][2]);
        //     }
        // }
        int kk=0;
            for (int i = 0; i < v - 1; i++)  
             { 
  
                for (int j = 0; j < w; j++)  
                { 
                    if (d[g[j][0]]!=Integer.MAX_VALUE && d[g[j][0]] + g[j][2] < 
                            d[g[j][1]]) 
                    d[g[j][1]] =  
                            d[g[j][0]] + g[j][2]; 
             } 
            } 

        for (int i = 0; i < w; i++)  
        { 
            int x = g[i][0]; 
            int y = g[i][1]; 
            int weight = g[i][2]; 
            if (d[x] != Integer.MAX_VALUE && 
                    d[x] + weight < d[y]) 
                {
                System.out.println(1);
                kk=1;
                }
        } 
        if(kk==0)
        System.out.println(0);
        

    }
            
    }
}
