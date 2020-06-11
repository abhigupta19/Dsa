//imports for BufferedReader
import java.io.BufferedReader;
import java.io.InputStreamReader;

//import for Scanner and other utility classes
import java.util.*;


// Warning: Printing unwanted or ill-formatted data to output will cause the test cases to fail
class Pair
{
    int a;
    int b;
    int w;
    Pair(int a,int b,int w)
    {
        this.a=a;
        this.b=b;
        this.w=w;
    }
}
class TestClass {
    public static void main(String args[] ) throws Exception {
        Scanner sc=new Scanner(System.in);
        int v=sc.nextInt();
        int e=sc.nextInt();
        ArrayList<ArrayList<Integer>> graph=new ArrayList<>();
        for(int i=0;i<e;i++)
        {
            int av=sc.nextInt();
            int b=sc.nextInt();
            int c=sc.nextInt();
            ArrayList<Integer> a=new ArrayList<>();
            a.add(av);
            a.add(b);
            a.add(c);
            graph.add(a);
        }
        System.out.println(spanningTree(v,e,graph));

      

    }
    static int spanningTree(int v, int e, ArrayList<ArrayList<Integer>> graph) {
        int pp[]=new int[v+1];
        for(int i=0;i<pp.length;i++)
        {
            pp[i]=-1;
        }
        ArrayList<Pair> aa=new ArrayList<>();
        for(int i=0;i<graph.size();i++)
        {
            int a=graph.get(i).get(0);
            int b=graph.get(i).get(1);
            int w=graph.get(i).get(2);
            Pair p=new Pair(a,b,w);
            aa.add(p);
        }
    
        int sum=0;
        Collections.sort(aa,(o1,o2)->o1.w-o2.w);
         for(int i=0;i<aa.size();i++)
        {
            int ap=aa.get(i).a;
            int bp=aa.get(i).b;
            int a1=find(pp,ap);
            int b1=find(pp,bp);
            if(a1!=b1)
            {
                pp[a1]=b1;
                sum+=aa.get(i).w;
            }
            
        }
                    return sum;

    }
    static int  find(int p[],int i)
    {
        if(p[i]==-1)
        {
            return i;
        }
        return find(p,p[i]);
    
        
    }
}
