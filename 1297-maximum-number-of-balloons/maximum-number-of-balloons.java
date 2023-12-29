class Solution {
    public int maxNumberOfBalloons(String text) {
        HashMap<Character,Integer> map = new HashMap<>();
        map.put('b',0);
        map.put('a',0);
        map.put('l',0);
        map.put('o',0);
        map.put('n',0);

        for(int i=0;i<text.length();i++)
        {
            if(map.containsKey(text.charAt(i)))
            {
                map.put(text.charAt(i),map.getOrDefault(text.charAt(i),0)+1);
            }
        }

        int count = 0;

        while(true)
        {
            if(map.get('b') >= 1 && map.get('a') >= 1 && map.get('l') >= 2 && map.get('o') >= 2 && 
                map.get('n') >= 1)
                {
                    count++;

                    map.put('b',map.get('b')-1);
                    map.put('a',map.get('a')-1);
                    map.put('l',map.get('l')-2);
                    map.put('o',map.get('o')-2);
                    map.put('n',map.get('n')-1);
                }
                else
                {
                    break;
                }
        }
        return count;

       /* Set<Character> keys = map.keySet();

        ArrayList<Charater> list = new ArrayList<>();

        for(char k : keys)
        {
            list.add(k);
        }

        int count = 0;
        for(int i=0;i<list.size();i++)
        {
            if()
        } */
    }
}