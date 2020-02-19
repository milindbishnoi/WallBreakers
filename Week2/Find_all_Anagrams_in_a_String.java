class Solution {
    public List<Integer> findAnagrams(String s, String p) 
    {
        if(p.length()>s.length())
            return new ArrayList<Integer>();
        ArrayList<Integer> list =new ArrayList<>();
        int arr[]=new int[26];
        HashMap<String , ArrayList<Integer> > map=new HashMap<>();
        for(int i=0;i<p.length();i++)
        {
            arr[p.charAt(i)-'a']++;
          
        }
        String str=Arrays.toString(arr);
      //  System.out.println(str);
        map.put(str,list);
        int a[]=new int[26];
        for(int i=0;i<p.length();i++)
        {
            a[s.charAt(i)-'a']++;
        }
        String str1=Arrays.toString(a);
        if(map.containsKey(str1))
        {
            ArrayList<Integer> l=map.get(str1);
            l.add(0);
            map.put(str1, l);
        }
      //  System.out.println(str1);
        for(int i=0;i<s.length()-p.length();i++)
        {
            a[s.charAt(i)-'a']--;
            a[s.charAt(i+p.length())-'a']++;
            str1=Arrays.toString(a);
      //      System.out.println(i+" "+(s.charAt(i)-'a')+" "+(i+p.length()));
        //    System.out.println(str1);
             if(map.containsKey(str1))
              {
                 ArrayList<Integer> l=map.get(str1);
                l.add(i+1);
            map.put(str,l);
              }
        }
        return map.get(str);
    }
}