class Solution {
    public int maxScore(String s) {
        
        String str = "";
        String ss = "";
        int max = Integer.MIN_VALUE;
        for(int i=0;i<s.length()-1;i++)
        {
            str = s.substring(0,i+1);
            ss = s.substring(i+1,s.length());

            int countright = 0;
            for(int j=0;j<str.length();j++)
            {
                if(str.charAt(j) == '0')
                {
                    countright++;
                }
            }

            int countleft = 0;
            for(int j=0;j<ss.length();j++)
            {
                if(ss.charAt(j) == '1')
                {
                    countleft++;
                }
            }

            max = Math.max(max,(countright+countleft));
        }
        return max;
    }
}