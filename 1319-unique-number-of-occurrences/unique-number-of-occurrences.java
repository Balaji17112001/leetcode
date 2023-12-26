class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        HashMap<Integer,Integer> map = new HashMap<>();

        for(int i=0;i<arr.length;i++)
        {
            map.put(arr[i],map.getOrDefault(arr[i],0)+1);
        }

        Set<Integer> keys = map.keySet();

        ArrayList<Integer> list = new ArrayList<>();

        for(int k : keys)
        {
            list.add(k);
        }

        for(int i=0;i<list.size();i++)
        {
            int n = map.get(list.get(i));
            map.remove(list.get(i));
            if(map.containsValue(n))
            {
                return false;
            }
        }
        return true;
    }
}