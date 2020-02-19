class Trie {

    private Trie[] chr;
    private boolean isEnd;
    /** Initialize your data structure here. */
    public Trie() {
        chr=new Trie[26];
        isEnd=false;
    }
    
    /** Inserts a word into the trie. */
    public void insert(String word) 
    {
        Trie[] temp=chr;
     for(int i=0;i<word.length();i++)
     {
         
         if(temp[word.charAt(i)-'a']==null)
         {temp[word.charAt(i)-'a']=new Trie();
        // System.out.println(temp[word.charAt(i)-'a']+" asds "+word.charAt(i));
         }
          if(i==word.length()-1)
             temp[word.charAt(i)-'a'].isEnd=true;
        // System.out.println(chr[word.charAt(i)-'a'].chr+" asds "+word.charAt(i));
         temp=temp[word.charAt(i)-'a'].chr;
         
        
     }
        
    }
    
    /** Returns if the word is in the trie. */
    public boolean search(String word) 
    {
       // System.out.println(chr);
        Trie[] temp=chr;
     for(int i=0;i<word.length();i++)
     {
      //   System.out.println(temp[word.charAt(i)-'a']+" asds "+word.charAt(i));
         if(temp[word.charAt(i)-'a']==null)
         {  // System.out.println("as"+" "+word.charAt(i));
             return false;}
         if(i==word.length()-1)
             if(!temp[word.charAt(i)-'a'].isEnd)
                 return false;
         temp=temp[word.charAt(i)-'a'].chr;
         
     }
        return true;
    }
    
    /** Returns if there is any word in the trie that starts with the given prefix. */
    public boolean startsWith(String prefix) 
    {
        Trie[] temp=chr;
        for(int i=0;i<prefix.length();i++)
     {
         if(temp[prefix.charAt(i)-'a']==null)
         {return false;}
         temp=temp[prefix.charAt(i)-'a'].chr;
         
     }
        return true;
        
    }
}

/**
 * Your Trie object will be instantiated and called as such:
 * Trie obj = new Trie();
 * obj.insert(word);
 * boolean param_2 = obj.search(word);
 * boolean param_3 = obj.startsWith(prefix);
 */