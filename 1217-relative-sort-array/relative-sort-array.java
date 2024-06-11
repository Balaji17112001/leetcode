class Solution {
    public int[] relativeSortArray(int[] arr1, int[] arr2) {
        HashMap<Integer,Integer> map = new HashMap<>();
        ArrayList<Integer> list = new ArrayList<>();
      
        for(int i=0;i<arr1.length;i++)
        {
            map.put(arr1[i],map.getOrDefault(arr1[i],0)+1);
        }

        int arr[] = new int[arr1.length];

        int k = 0;

        for(int i=0;i<arr2.length;i++)
        {
            for(int j=0;j<map.get(arr2[i]);j++)
            {
                arr[k] = arr2[i];
                k++;
            }
            map.remove(arr2[i]);
        }

        for(int key : map.keySet())
        {
            for(int i=0;i<map.get(key);i++)
            {
                list.add(key);
            }
        }

        Collections.sort(list);

        for(int i=0;i<list.size();i++)
        {
            arr[k] = list.get(i);
            k++;
        }

        return arr;
    }
}