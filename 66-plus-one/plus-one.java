class Solution {
    public int[] plusOne(int[] digits) {
        List<Integer> list = new ArrayList<>();

        int i = digits.length - 1;

        if(digits[i] < 9)
        {
            digits[i] = digits[i] + 1;
            return digits;
        }

        boolean flag = false;

        for(int j = i; j >= 0; j--)
        {
            if(digits[j] == 9 && !flag)
            {
                list.add(0);
            }
            else if(!flag)
            {
                list.add(digits[j] + 1);
                flag = true;
            }
            else
            {
                list.add(digits[j]);
            }
        }

        if(list.get(list.size() - 1) == 0 && !flag)
        {
            list.add(1);
        }

        int[] arr = new int[list.size()];
        int k = 0;

        for(int j = list.size() - 1; j >= 0; j--)
        {
            arr[k] = list.get(j);
            k++;
        }

        return arr;
    }
}