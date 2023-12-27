class Solution {
    public int minCost(String colors, int[] neededTime) {
        int sum = 0;
      
        char currColor = colors.charAt(0);
        int currTime = neededTime[0];

        for(int i=1;i<colors.length();i++)
        {
            if(colors.charAt(i) == currColor)
            {
                sum += Math.min(currTime,neededTime[i]);
                currTime = Math.max(currTime,neededTime[i]);
            }
            else
            {
                currColor = colors.charAt(i);
                currTime = neededTime[i];
            }
        }
        return sum;
    }
}