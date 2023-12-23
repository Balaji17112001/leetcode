class Solution {
    public boolean isPathCrossing(String path) {
        int x = 0;
        int y = 0;
        Set<String> visited = new HashSet<>();
        visited.add("0,0");

        for(int i=0;i<path.length();i++)
        {
            if(path.charAt(i) == 'E')
            {
                x++;
            }
            else if(path.charAt(i) == 'W')
            {
                x--;
            }
            else if(path.charAt(i) == 'N')
            {
                y++;
            }
            else
            {
                y--;
            }

            String currPos = x+","+y;

            if(visited.contains(currPos))
            {
                return true;
            }
            visited.add(currPos);
        }
        return false;
    }
}