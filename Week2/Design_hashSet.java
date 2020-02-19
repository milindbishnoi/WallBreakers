class MyHashSet {

    int arr[];
    int x;
    /** Initialize your data structure here. */
    public MyHashSet() 
    {
        arr=new int[1000000];
        Arrays.fill(arr,-1);
        x=1000000;
    }
    
    public void add(int key) 
    {
       arr[key%x]=key;    
    }
    
    public void remove(int key) 
    {
     arr[key%x]=-1;   
    }
    
    /** Returns true if this set contains the specified element */
    public boolean contains(int key) 
    {
        if(arr[key]==-1)
            return false;
        return true;
    }
}

/**
 * Your MyHashSet object will be instantiated and called as such:
 * MyHashSet obj = new MyHashSet();
 * obj.add(key);
 * obj.remove(key);
 * boolean param_3 = obj.contains(key);
 */