class Solution {
    public boolean makeEqual(String[] words) {
        HashMap<Character,Integer> charCount = new HashMap<>();
        int numWords = words.length;

        for(String word : words)
        {
            for(char c : word.toCharArray())
            {
                charCount.put(c,charCount.getOrDefault(c,0)+1);
            }
        }

        for(int count : charCount.values())
        {
            if(count % numWords != 0)
            {
                return false;
            }
        }
        return true;
    }

}