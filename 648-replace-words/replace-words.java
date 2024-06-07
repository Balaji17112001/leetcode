class Solution {
    public String replaceWords(List<String> dictionary, String sentence) {
      /*    String str = "";
        String s = "";
        int len = dictionary.get(0).length();

        for(int i=1;i<dictionary.size();i++)
        {
            len = Math.min(len,dictionary.get(i).length());
        }
        
        for(int i=0;i<sentence.length();i++)
        {
            if(sentence.charAt(i) != ' ' && i < sentence.length()-1)
            {
                str += sentence.charAt(i);
                if(i+1 == sentence.length()-1)
                {
                    str += sentence.charAt(i+1);
                }
            }
            else
            {
                if(str.length() >= len && dictionary.contains(str.substring(0, len)))
                {
                    s += str.substring(0, len)+" ";
                }
                else
                {
                    s += str+" ";
                }
                
                str = "";
            }
        }
        return s.substring(0,s.length()-1);  */

        HashSet<String> set = new HashSet<>();
        for(int i=0;i<dictionary.size();i++)
        {
            set.add(dictionary.get(i));
        }

        String[] list = sentence.split(" ");
        String str = "";
        for(int i=0;i<list.length;i++)
        {
            boolean flag = true;
            String s = list[i];
            for(int j=0;j<list[i].length();j++)
            {
                if(set.contains(s.substring(0,j+1)))
                {
                    str += s.substring(0,j+1)+" ";
                    flag = false;
                    break;
                }
            }
            if(flag)
            {
                str += s+" ";
            }
        }
        return str.substring(0,str.length()-1);
    }
}