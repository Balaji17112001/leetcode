class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> list = new ArrayList<>();
        List<Integer> ds = new ArrayList<>();
        print(0,nums,list,ds);
        return list;
    }
    private void print(int idx,int[] nums,List<List<Integer>> list,List<Integer> ds)
    {
        if(idx == nums.length)
        {
            list.add(new ArrayList<>(ds));
            return;
        }
        ds.add(nums[idx]);
        print(idx+1,nums,list,ds);

        ds.remove(ds.size()-1);
        print(idx+1,nums,list,ds);
    }
}