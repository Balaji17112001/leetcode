class Solution {
    public boolean rotateString(String s, String goal) {
        if(s.length() != goal.length())
        {
            return false;
        }

        if(s.equals(goal))
        {
            return true;
        }
        
        String str = "";
        int len = s.length();
       
        for(int i=0;i<len;i++)
        {
            str += s.charAt(s.length()-1);
            str += s.substring(0,s.length()-1);
            
            if(str.equals(goal))
            {
                return true;
            }
            else
            {
                s = str;
                str = "";
            }
        }
        return false;

        
    }
}