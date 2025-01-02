class Solution {
    public int[] vowelStrings(String[] words, int[][] queries) {
        int prefix[] = new int[words.length+1];

        for(int i=1;i<prefix.length;i++)
        {
            if((words[i-1].charAt(0) == 'a' || words[i-1].charAt(0) == 'e' || words[i-1].charAt(0) == 'i' || words[i-1].charAt(0) == 'o' || words[i-1].charAt(0) == 'u') &&
               (words[i-1].charAt(words[i-1].length()-1) == 'a' || words[i-1].charAt(words[i-1].length()-1) == 'e' || words[i-1].charAt(words[i-1].length()-1) == 'i' || words[i-1].charAt(words[i-1].length()-1) == 'o' || words[i-1].charAt(words[i-1].length()-1) == 'u'))
               {
                    prefix[i] = prefix[i-1] + 1;
               }
               else
               {
                    prefix[i] = prefix[i-1];
               }
        }

        int ans[] = new int[queries.length];

        for(int i=0;i<queries.length;i++)
        {
            int l = queries[i][0];
            int r = queries[i][1];

            ans[i] = (prefix[r+1] - prefix[l]);
        }
        return ans; 
    }
}