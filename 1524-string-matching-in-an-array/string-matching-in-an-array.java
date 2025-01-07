class Solution {
    public List<String> stringMatching(String[] words) {
        List<String> list = new ArrayList<>();

        for(int i=0;i<words.length;i++)
        {
            for(int j=0;j<words.length;j++)
            {
                if(i == j)
                {
                    continue;
                }
                else if(words[j].length() >= words[i].length() && words[j].contains(words[i]) && !(list.contains(words[i])))
                {
                    list.add(words[i]);
                }
            }
        }
        return list;
    }
}