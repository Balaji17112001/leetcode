class Solution {
    public String mergeAlternately(String word1, String word2) {
        String s = "";
        int min = Math.min(word1.length(),word2.length());
        int max = Math.max(word1.length(),word2.length());

        int i = 0;
        for(i=0;i<min;i++)
        {
            s += word1.charAt(i);
            s += word2.charAt(i);
        }

        while(i < word1.length())
        {
            s += word1.charAt(i);
            i++;
        }

        while(i < word2.length())
        {
            s += word2.charAt(i);
            i++;
        }
        
        return s;
    }
}