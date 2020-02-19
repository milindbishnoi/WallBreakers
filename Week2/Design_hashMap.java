class MyHashMap {
    
    int arr[];
    int x;
    /** Initialize your data structure here. */
    public MyHashMap() {
        arr=new int[10000000];
        for(int i=0;i<10000000;i++)
            arr[i]=Integer.MIN_VALUE;
        x=10000000;
    }
    
    /** value will always be non-negative. */
    public void put(int key, int value) 
    {
        arr[key%x]=value;
    }
    
    /** Returns the value to which the specified key is mapped, or -1 if this map contains no mapping for the key */
    public int get(int key) {
        if(arr[key%x]!=Integer.MIN_VALUE)
        return arr[key%x];
        return -1;
    }
    
    /** Removes the mapping of the specified value key if this map contains a mapping for the key */
    public void remove(int key) {
        arr[key%x]=Integer.MIN_VALUE;
    }
}

/**
 * Your MyHashMap object will be instantiated and called as such:
 * MyHashMap obj = new MyHashMap();
 * obj.put(key,value);
 * int param_2 = obj.get(key);
 * obj.remove(key);
 */