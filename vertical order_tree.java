// { Driver Code Starts
//Initial Template for Java


//Contributed by Sudarshan Sharma
import java.util.*;
import java.io.*;
class Node{
    int data;
    Node left,right;
    Node(int d){
        data=d;
        left=right=null;
    }
}


class GfG{
    
    public static void main(String[] args)throws IOException{
        //Scanner sc=new Scanner(System.in);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int t=Integer.parseInt(br.readLine());
       
        while(t > 0)
           {
               Queue<Node> q = new LinkedList<>();
        
            int n = Integer.parseInt(br.readLine());
            String input[] = br.readLine().trim().split(" ");
            
            Node root = null;
            int j=0;
            while(n > 0){
            int a1 = Integer.parseInt(input[j]);
            int a2 = Integer.parseInt(input[j+1]);
            char lr = input[j+2].charAt(0);
            j+=3;
            
            if(root == null)
            {
                root = new Node(a1);
                q.add(root);
            }
            
            Node pick = q.peek();
            
            q.remove();
            
            if(lr=='L'){
                pick.left = new Node(a2);
                q.add(pick.left);
            }
            a1 = Integer.parseInt(input[j]);
            a2 = Integer.parseInt(input[j+1]);
            lr = input[j+2].charAt(0);
            j += 3;
            
            if(lr=='R'){
                pick.right = new Node(a2);
                q.add(pick.right);
            }
            
            n-=2;
        }
            new View().topView(root);
            System.out.println();
            t--;
        }
    }
}

   


// } Driver Code Ends


//User function Template for Java



/*class Node
{
    int data;
    Node left, right;

    Node(int item)
    {
        data = item;
        left = right = null;
    }
}*/
class Pair{
    Node node;
    int hd;
    Pair(Node n,int h){
        node=n;
        hd=h;
    }
}
class View
{
    // function should print the topView of the binary tree
   
    static void topView(Node root)
    {
       Queue<Pair> q=new LinkedList<>();
        Map<Integer,ArrayList<Integer>> m=new TreeMap<>();
        q.add(new Pair(root,0));
        while(!q.isEmpty()){
            Pair p=q.poll();
            int hd=p.hd;
            Node curr=p.node;
            if(m.containsKey(hd))
            m.get(hd).add(curr.data);
            else{
                ArrayList<Integer> al=new ArrayList<>();
                al.add(curr.data);
                m.put(hd,al);
            }
            if(curr.left!=null)q.add(new Pair(curr.left,hd-1));
            if(curr.right!=null)q.add(new Pair(curr.right,hd+1));
        }
        for(Map.Entry<Integer,ArrayList<Integer>> me:m.entrySet()){
             ArrayList<Integer> al=me.getValue();
             System.out.print(al.get(0)+" ");
        }
    }
}
