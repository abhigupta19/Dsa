//imports for BufferedReader
import java.io.BufferedReader;
import java.io.InputStreamReader;

//import for Scanner and other utility classes
import java.util.*;


// Warning: Printing unwanted or ill-formatted data to output will cause the test cases to fail

class TestClass {
   static boolean k[];
    public static void main(String args[] ) throws Exception {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> ac=new ArrayList<>();
        int n=sc.nextInt();
        int e=sc.nextInt();
        ArrayList<ArrayList<Integer>> list=new ArrayList<>();
        for(int i=0;i<n+1;i++)
        {
            list.add(new ArrayList<Integer>());

        }
        for(int i=0;i<e;i++)
        {
            int rr=sc.nextInt();
            list.get(rr).add(sc.nextInt());
            ac.add(rr);
        }
        if(e+1!=n)
        {
            System.out.println("NO");
            System.exit(0);
        }
        
        k=new boolean[n+1];
        dfs(list,ac.get(0));
        for(int i=1;i<k.length;i++)
        {
            if(!k[i])
            {
                System.out.println("NO");
                System.exit(0);
            }
        }
        System.out.println("YES");
    }
   static void dfs(ArrayList<ArrayList<Integer>> list,int n)
    {
        k[n]=true;
        for(int v: list.get(n))
        {
            if(!k[v])
            {
                k[v]=true;
                dfs(list,v);

            }
        }
    }
}
