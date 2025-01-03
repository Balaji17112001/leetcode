class Solution {
    public int waysToSplitArray(int[] nums) {
        long[] prefixsum = new long[nums.length];
        prefixsum[0] = nums[0];

        for(int i=1;i<nums.length;i++)
        {
            prefixsum[i] = prefixsum[i-1] + nums[i];
        }

        int count = 0;

        for(int i=0;i<prefixsum.length-1;i++)
        {
            if(prefixsum[i] >= (prefixsum[prefixsum.length-1] - prefixsum[i]))
            {
                count++;
            }
        }

        return count;
        /*long[] leftsum = new long[nums.length-1];
        leftsum[0] = nums[0];

        long[] rightsum = new long[nums.length-1];
        rightsum[rightsum.length-1] = nums[nums.length-1];

        for(int i=1;i<leftsum.length;i++)
        {
            leftsum[i] = leftsum[i-1] + nums[i];
        }

        for(int i=rightsum.length-2;i>=0;i--)
        {
            rightsum[i] = rightsum[i+1] + nums[i+1];
        }

        int count = 0;

        for(int i=0;i<rightsum.length;i++)
        {
            if(leftsum[i] >= rightsum[i])
            {
                count++;
            }
        }
        return count;*/
    }
}