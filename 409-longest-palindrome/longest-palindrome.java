class Solution {
    public int longestPalindrome(String s) {
        HashMap<Character,Integer> map = new HashMap<>();

        for(int i=0;i<s.length();i++)
        {
            map.put(s.charAt(i),map.getOrDefault(s.charAt(i),0)+1);
        }

        int sum = 0;
        boolean isFirstOdd = false;

        for(char key : map.keySet())
        {
            if(map.get(key) % 2 == 0)
            {
                sum += map.get(key);
            }
            else
            {
                sum += map.get(key);
                if(!isFirstOdd)
                {
                    isFirstOdd = true;
                }
                else
                {
                    sum -= 1;
                }
            }
        }

        return sum;

    }
}