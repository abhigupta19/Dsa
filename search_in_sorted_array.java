public class Solution {
    // DO NOT MODIFY THE LIST. IT IS READ ONLY
    public int search(final List<Integer> A, int B) {
                int k[]=new int[A.size()];
                

                int b=A.size();
                for(int i=0;i<A.size();i++)
                {
                    k[i]=A.get(i);
                }
                int u=B;
                int i=0;
                int j=b-1;
                
                int p=binary(k,0,j,b);
                int r=bb(k,i,p-1,u);
                int e=bb(k,p,j,u);

                if(e>=0)
                return (e);
                else if(r>=0)
                return (r);
                else
                return(-1);
            }
    
    static int binary(int k[],int i,int j,int b)
    {
                while(i<=j)
                {   
                   

                    int mid=(i+j)/2;
                    int p=(mid-1+b)%b;
                    int n=(mid+1)%b;
                

                    if(i==j)
                    return i;
                    if( k[mid]<k[mid+1] && k[mid]<k[mid-1])
                        return mid;
                    if(k[i]<=k[mid])
                    {

                        i=mid+1;

                    }
                    else  
                    {
                        j=mid-1;
                        
                    }
                
                    
                }
                return 0;

    }
    static int bb(int k[],int i,int j,int u)
    {
        if(i<=j&& i>=0)
        {


            int mid=(i+j)/2;
            if(k[mid]==u)
            {
                return mid;
            }
            if(k[mid]>u)
            return bb(k,i,mid-1,u);
            else
            return bb(k,mid+1,j,u);
        }
        return -1;
    }

    
}
