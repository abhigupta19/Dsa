void dfs(int cur,int parent,int& timer,vector<int> adj[],vector<vector<int>>& ans,vector<int>& disc,vector<int>& low,vector<bool>& vis){
    vis[cur] = true;
    timer++;
    disc[cur]=timer;
    low[cur]=timer;
    for(auto to: adj[cur]) {
        if(to == parent) continue;
        if(!vis[to]) {
            dfs(to,cur,timer,adj,ans,disc,low,vis); 
            if(disc[cur] < low[to]){ 
                int a=min(cur,to)+1;
                int b=max(cur,to)+1;
                ans.push_back({a,b});
            }
            low[cur] = min(low[cur], low[to]);
        } 
        else{
            low[cur] = min(low[cur], disc[to]);
        }
    }
}
vector<vector<int> > Solution::solve(int A, vector<vector<int>> &B) {
    vector<int> adj[A];
    vector<vector<int>> ans;
    for(int i=0;i<B.size();i++) {
        int x=B[i][0];
        int y=B[i][1];
        adj[x-1].push_back(y-1);
        adj[y-1].push_back(x-1);  
    }
    vector<int> disc(A,0);
    vector<int> low(A,0);
    vector<bool> vis(A,0);
    int timer=0;
    for(int i=0;i<A;i++){
        if(!vis[i]){
            dfs(i,-1,timer,adj,ans,disc,low,vis); 
        }
    }
    return ans;
}
...............................................java
public class Solution {
    public ArrayList<ArrayList<Integer>> solve(int A, ArrayList<ArrayList<Integer>> B) {
        int in[]=new int[A+2];
        int low[]=new int[A+2];
        int b[]=new int[A+2];
        ArrayList<ArrayList<Integer>> au=new ArrayList<>();
        ArrayList<ArrayList<Integer>> pp=new ArrayList<>();
        for(int i=0;i<=A;i++)
        {
            pp.add(new ArrayList<Integer>());
        }
        for(int i=0;i<B.size();i++)
        {
            int hh=B.get(i).get(0);
            int ho=B.get(i).get(1);
            pp.get(hh).add(ho);
            pp.get(ho).add(hh);

        }
        for(int i=0;i<=A;i++)
        {
            b[i]=-1;
        }
        for(int i=1;i<=A;i++)
        {
            if(b[i]==-1)
            dfs(pp,b,in,low,i,-1,au);
        }
        return au;
    }
    int time=0;
    void dfs(ArrayList<ArrayList<Integer>> B,int b[],int in[],int low[], int i,int p,ArrayList<ArrayList<Integer>> au)
    {
        in[i]=low[i]=time;
        b[i]=1;
        time++;
        for(int k:B.get(i))
        {
            
            if(i==p)
            continue;
            if(b[k]==1)
            {
                low[i]=Math.min(low[i],in[k]);
            }
            
            else
            {
                dfs(B,b,in,low,k,i,au);
                if(low[k]>in[i])
                {
                    ArrayList<Integer> aa=new ArrayList<>();
                    aa.add(i);
                    aa.add(k);
                    System.out.print(k);
                    au.add(aa);
                }
    
                    low[i]=Math.min(low[k],low[i]);
                    
            }
        }
    }
}


