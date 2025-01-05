class Solution {
    public String shiftingLetters(String s, int[][] shifts) {
        /*char[] charArr = s.toCharArray();

        for(int i=0;i<shifts.length;i++)
        {
            int si = shifts[i][0];
            int ei = shifts[i][1];
            int fb = shifts[i][2];

            for(int j=si;j<=ei;j++)
            {
                int c = 25 - ('z' - charArr[j]);
                if(fb == 1)
                {
                    int s1 = (c + 1) % 26;
                    char ch1 = (char)('a' + s1);

                    charArr[j] = ch1;
                }
                else if(fb == 0)
                {
                    int s2 = ((c - 1) + 26) % 26;
                    char ch2 = (char)('a' + s2);

                    charArr[j] = ch2;
                }
            }
        }
        String str = new String(charArr);
        return str; */

        int diffArr[] = new int[s.length()+1];

        for(int i=0;i<shifts.length;i++)
        {
            int left = shifts[i][0];
            int right = shifts[i][1];
            int d = shifts[i][2];

            if(d == 1)
            {
                diffArr[right+1] += 1;
                diffArr[left] += -1;
            }
            else
            {
                diffArr[right+1] += -1;
                diffArr[left] += 1;
            }
        }
        char[] ch = new char[s.length()];
            int diff = 0;

            for(int i=diffArr.length-1;i>0;i--)
            {
                diff += diffArr[i];
                int netShift = (diff % 26 + 26) % 26;
                ch[i-1] = (char)('a'+(s.charAt(i-1) - 'a' + netShift) % 26);
            }
            String res = new String(ch);
            return res;
    }
}