class Solution {
    public List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> list = new ArrayList<>();

        while(left <= right)
        {
            if(isDivide(left))
            {
                list.add(left);
            }
            left++;
        }
        return list;
    }
    public static boolean isDivide(int i)
    {
        int n = i;
        while(n > 0)
        {
            if(n % 10 == 0)
            {
                return false;
            }
            if(i % (n % 10) != 0)
            {
                return false;
            }
            n /= 10;
        }
        return true;
    }
}