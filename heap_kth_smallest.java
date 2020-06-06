public class Solution {
    // DO NOT MODIFY THE LIST. IT IS READ ONLY
    public int kthsmallest(final List<Integer> A, int B) {
        PriorityQueue<Integer> p=new PriorityQueue<>(Collections.reverseOrder());
        for(int i=0;i<A.size();i++)
        {
            p.add(A.get(i));
            if(p.size()>B)
                p.poll();
            
        }
        return(p.peek());
        
    }
}
