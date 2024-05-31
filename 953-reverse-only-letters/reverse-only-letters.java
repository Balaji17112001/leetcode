class Solution {
    public String reverseOnlyLetters(String s) {
        char ch[] = s.toCharArray();

        int i = 0;
        int j = ch.length-1;

        while(i <= j)
        {
            if(Character.isAlphabetic(ch[i]) && Character.isAlphabetic(ch[j]))
            {
                char c = ch[i];
                ch[i] = ch[j];
                ch[j] = c;

                i++;
                j--;
            }
            else if(!Character.isAlphabetic(ch[i]) && Character.isAlphabetic(ch[j]))
            {
                i++;
            }
            else 
            {
                j--;
            }
        }
        String str = new String(ch);
        return str;
    }
}