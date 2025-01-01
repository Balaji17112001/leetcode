class Solution {
    public int maxScore(String s) 
    {
        String str = "";
        String str2 = "";
        int max = Integer.MIN_VALUE;
        for(int i=0;i<s.length()-1;i++)
        {
            str = s.substring(0,i+1);
            int countleft = 0; 
            for(int j=0;j<str.length();j++)
            {
                if(str.charAt(j) == '0')
                {
                    countleft++;
                }
            }

            str2 = s.substring(i+1,s.length());
            int countright = 0;
            for(int j=0;j<str2.length();j++)
            {
                if(str2.charAt(j) == '1')
                {
                    countright++;
                }
            }

            max = Math.max(max,(countleft + countright));
        }
        return max;    
    }
}