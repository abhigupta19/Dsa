you need to write your solution in the form of Function(s) only.
Driver Code to call/invoke your function would be added by GfG's Online Judge.*/


/*You are required to complete below class */
class LRUCache {
 
    /*Inititalize an LRU cache with size N */
    Deque<Integer> q;
    int size, current;
    HashMap<Integer, Integer> map;
    public LRUCache(int N) {
       //Your code here
       q = new LinkedList<Integer>();
       size = N;
       current = 0;
       map = new HashMap<Integer, Integer>();
    //   System.out.println("Start");
    }
    
    /*Returns the value of the key x if 
     present else returns -1 */
    public int get(int x) {
       //Your code here
       if(map.containsKey(x)){
           q.remove(x);
           q.addFirst(x);
           return map.get(x);
       }
       return -1;
    }
    
    /*Sets the key x with value y in the LRU cache */
    public void set(int x, int y) {
       //Your code here
    //   System.out.println("Set: "+x+" "+y);
       if(!map.containsKey(x) || (map.get(x) != y)){
           if(map.containsKey(x)){
               map.put(x, y);
               q.remove(x);
               q.addFirst(x);
           }
           else 
           {
           if(current == size){
                int val = q.removeLast();
                map.remove(val);
                current--;
           }
           q.addFirst(x);
           map.put(x, y);
           current++;
           }
        //   printMap(map);
       }
    }
    public void printMap(Map map){
        Set set = map.entrySet();
        Iterator it = set.iterator();
        while(it.hasNext()){
            Map.Entry me = (Map.Entry)it.next();
            System.out.println(me.getKey()+" "+me.getValue());
        }
        System.out.println("---------------------------");
    }
}
