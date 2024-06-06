class Solution {
    public String customSortString(String order, String s) {
        HashMap<String,Integer> map = new HashMap<>();

        for(int i=0;i<s.length();i++)
        {
            String ss = Character.toString(s.charAt(i));
            if(order.contains(ss))
            {
                map.put(ss,map.getOrDefault(ss,0)+1);
            }
        }

        String str = "";

        for(int j=0;j<order.length();j++)
        {
            String ss = Character.toString(order.charAt(j));

            if(map.containsKey(ss))
            {
                for(int i=0;i<map.get(ss);i++)
                {
                    str += ss;
                }
            }
        }
    
        for(int i=0;i<s.length();i++)
        {
            String ss = Character.toString(s.charAt(i));
            if(!map.containsKey(ss))
            {
                str += s.charAt(i);
            }
        }
        return str;
    }
}