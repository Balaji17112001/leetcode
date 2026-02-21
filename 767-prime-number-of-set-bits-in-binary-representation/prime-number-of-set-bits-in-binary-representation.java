class Solution {
    public int countPrimeSetBits(int left, int right) {
        int res = 0;
        for(int i = left; i <= right; i++)
        {
            int n = i;
            int setBitCount = 0;
            while(n > 0)
            {
                if(n % 2 == 1)
                {
                    setBitCount++;
                }
                n /= 2;
            }
            if(isPrime(setBitCount))
            {
                res++;
            }
        }
        return res;
    }
    public boolean isPrime(int n)
    {
        return n == 2 || n == 3 || n == 5 || n == 7 || n == 11 || n == 11 || n == 13 || n == 17 || n == 19;
    }
}