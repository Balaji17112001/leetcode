class Solution {
    public boolean isMonotonic(int[] nums) {
        int l = 0,h = 0,e = 0;
        for(int i=0;i<nums.length-1;i++)
        {
            if(nums[i] > nums[i+1])
            {
                l++;
            }
            else if(nums[i] < nums[i+1])
            {
                h++;
            }
            else
            {
                e++;
            }
        }
        if(l+e == nums.length-1 || h+e == nums.length-1)
        {
            return true;
        }
        return false;
    }
}