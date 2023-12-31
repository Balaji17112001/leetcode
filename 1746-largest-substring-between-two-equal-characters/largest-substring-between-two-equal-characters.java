class Solution {
    public int maxLengthBetweenEqualCharacters(String s) {
        int max = Integer.MIN_VALUE;
        String str = "";

        for(int i=0;i<s.length()-1;i++)
        {
            for(int j=i+1;j<s.length();j++)
            {
                if(s.charAt(i) == s.charAt(j))
                {
                    max = Math.max(max,(j - i - 1));
                }
            }
        }

        return max == Integer.MIN_VALUE ? -1 : max;
    }
}