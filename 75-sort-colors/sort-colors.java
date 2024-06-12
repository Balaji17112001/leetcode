class Solution {
    public void sortColors(int[] nums) {
        
     /*   for(int i=0;i<nums.length-1;i++)
        {
            for(int j=i+1;j<nums.length;j++)
            {
                if(nums[i] >= nums[j])
                {
                    int temp = nums[i];
                    nums[i] = nums[j];
                    nums[j] = temp;
                }
            }
        } */

        int i = 0;
        int j = 0;
        int k = nums.length-1;

        while(j <= k)
        {
            if(nums[j] == 0)
            {
                int temp = nums[j];
                nums[j] = nums[i];
                nums[i] = temp;
                i++;
                j++;
            }
            else if(nums[j] == 1)
            {
                j++;
            }
            else 
            {
                int temp = nums[j];
                nums[j] = nums[k];
                nums[k] = temp;
                k--;
            }
        }
    }
}