class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        char ch[] = p.toCharArray();
        Arrays.sort(ch);

        ArrayList<Integer> list = new ArrayList<>();

        for(int i=0;i<s.length()-p.length()+1;i++)
        {
            String str = s.substring(i,p.length()+i);
            char ch2[] = str.toCharArray();
            Arrays.sort(ch2);

            if(check(ch,ch2))
            {
                list.add(i);
            }
        }
        return list;
    }
    public boolean check(char ch[],char ch1[])
    {
        for(int i=0;i<ch.length;i++)
        {
            if(ch[i] != ch1[i])
            {
                return false;
            }
        }
        return true;
    }
}