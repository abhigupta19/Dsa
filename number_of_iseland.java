class Solution {
  int m;
  int n;
    public int numIslands(char[][] g) {
      m=g.length;
      if(m==0)
        return 0;
       n=g[0].length;
      
      boolean b[][]=new boolean[m][n];
      int t=0;
      for(int i=0;i<m;i++)
      {
        for(int j=0;j<n;j++)
        {
          if(!b[i][j]&& g[i][j]=='1')
          {
            ab(g,i,j,b);
             t++;
      
          }
        }
      }
      return t;
    }
  void ab(char [][]g,int a,int b,boolean [][]bb)
  {
    int p[]=new int[]{-1,1,0,0};
    int l[]=new int[]{0,0,-1,1};
    bb[a][b]=true;
    for(int i=0;i<p.length;i++)
    {
      if( safe(a-p[i],b-l[i],bb,g)  )
        ab(g,a-p[i],b-l[i],bb);
        
        
    }
  }
    boolean safe(int a,int b,boolean [][]bb,char [][]g)
    {
      if(a>=0 && b>=0 && a<m && b<n && g[a][b]=='1' && !bb[a][b])
        return true;
      else
        return false;
      
    }
  
}
