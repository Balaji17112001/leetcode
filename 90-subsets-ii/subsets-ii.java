class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        List<List<Integer>> list = new ArrayList<>();
        List<Integer> ds = new ArrayList<>();
        Arrays.sort(nums);
        print(0,nums,list,ds);
        return list;
    }
    private void print(int idx,int[] nums,List<List<Integer>> list,List<Integer> ds)
    {
        list.add(new ArrayList<>(ds));
        for(int i=idx;i<nums.length;i++)
        {
            if(i > idx && nums[i] == nums[i-1])
            {
                continue;
            }
            ds.add(nums[i]);
            print(i+1,nums,list,ds);
            ds.remove(ds.size()-1);
        }
    }
}