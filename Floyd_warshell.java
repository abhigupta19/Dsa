/*package whatever //do not write package name here */

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
    public static void main (String[] args) {
    Scanner sc=new Scanner(System.in);
    String t=sc.nextLine();
    int tt=Integer.parseInt(t);
    while(tt-->0)
    {
            String v=sc.nextLine();
            int vv=Integer.parseInt(v);
            int d[][]=new int[vv][vv];
            for(int i=0;i<vv;i++)
            {
                String k[]=sc.nextLine().trim().split(" ");

                for(int j=0;j<k.length;j++)
                {
                    String p=k[j];

                    int e;
                    
                    e=Integer.parseInt(p);
                    d[i][j]=e;

                    
                }
            }
            for(int i=0;i<vv;i++)
            {
                for(int j=0;j<vv;j++)
                {
                    for (int q=0;q<vv;q++)
                    {
                    
                        d[j][q]=Math.min(d[j][q],d[j][i]+d[i][q]);
                    }
                }
            }
            for(int i=0;i<vv;i++)
            {
                for(int j=0;j<vv;j++)
                {
                        if(d[i][j]==10000000)
                        System.out.print("INF ");
                        else
                        System.out.print(d[i][j]+" ");
                
                }
                System.out.println();
            }
            
            


    }
            
    }
}
