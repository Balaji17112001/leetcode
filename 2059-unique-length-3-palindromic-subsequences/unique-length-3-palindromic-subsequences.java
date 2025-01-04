class Solution {
    public int countPalindromicSubsequence(String s) {
        Set<Character> letters = new HashSet<>();
        for(int i=0;i<s.length();i++)
        {
            letters.add(s.charAt(i));
        }

        int ans = 0;
        for(Character letter : letters)
        {
            int i = -1;
            int j = 0;

            for(int k = 0;k <s.length(); k++)
            {
                if(s.charAt(k) == letter)
                {
                    if(i == -1)
                    {
                        i = k;
                    }
                    j = k;
                }
            }

            Set<Character> between = new HashSet<>();
            for(int k=i+1;k<j;k++)
            {
                between.add(s.charAt(k));
            }

            ans += between.size();
        }
        return ans;
    }
}