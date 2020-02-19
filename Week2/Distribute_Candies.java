class Solution {
    public int distributeCandies(int[] candies) 
    {
     HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<candies.length;i++)
            if(map.containsKey(candies[i]))
                map.put(candies[i],map.get(candies[i]));
            else
                map.put(candies[i],1);
        
        int dist=map.size();
        if(dist>=candies.length/2)
            return candies.length/2;
        else 
            return dist;
    }
}