class Solution {
    public int[] findErrorNums(int[] nums) {
        
        ArrayList<Integer> l = new ArrayList<>();

        HashMap<Integer,Integer> map = new HashMap<>();

        for(int i=0;i<nums.length;i++)
        {
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }

        for(int i=1;i<=nums.length;i++)
        {
            if(map.containsKey(i) && map.get(i) > 1)
            {
                l.add(i);
            }
        }

         for(int i=1;i<=nums.length;i++)
        {
            if(!map.containsKey(i))
            {
                l.add(i);
            }
        }

        int n[] = new int[l.size()];

        for(int i=0;i<l.size();i++)
        {
            n[i] = l.get(i);
        }
        
       // Arrays.sort(n);

        return n;
    }
}