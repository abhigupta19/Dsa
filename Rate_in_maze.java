public class Solution {
    
    int s[][];
    public ArrayList<ArrayList<Integer>> solve(ArrayList<ArrayList<Integer>> A) {
            ArrayList<ArrayList<Integer>> a=new ArrayList<>();
            int n=A.size();
            int p;
            int m[][]=new int[n][n];
            s=new int[n][n];
            for(int i=0;i<n;i++)
            {
                p=0;
            
                for(int j:A.get(i))
                {
                
                    m[i][p]=j;
                    p++;
                }
            }
            ab(m,0,0,n);
            for(int i=0;i<n;i++)
            {
                ArrayList<Integer> pp=new ArrayList<>();
                for(int j=0;j<n;j++)
                {
                    pp.add(s[i][j]);
                    
                }
                a.add(pp);
            }
            
            return a;
    
        
        
    }
     boolean ab(int [][]m,int x,int y,int n)
    {
        if(x==n-1 && y==n-1 && m[x][y]==1)
        {
            s[x][y]=1;
        return true;
        }
        if(safe(m, x, y,n))
        {
            s[x][y]=1;
            if(ab(m,x+1,y,n))
            {
                return true;
            }
            if(ab(m,x,y+1,n))
            {
                return true;
            }
            else
            {
            s[x][y]=0;
            return false;
            }
        }
        return false;
    }
    static boolean safe(int [][]m,int x,int y,int n)
    {
        if(x>=0 && y>=0 &&x<n && y<n && m[x][y]==1)
        {
            return true;
            
        }
        return false;
    }
}
