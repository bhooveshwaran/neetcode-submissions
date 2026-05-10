class Solution {
    public int maxArea(int[] heights) {
        //Hashset Solution 2 - Brute Force
        Set<Integer> hashset = new HashSet<>();

        for(int i=0;i<heights.length;i++){
            for(int j=0; j<heights.length;j++){
                if(i==j)continue;
                Integer lengthMin = Math.min(heights[i],heights[j]);
                Integer breadth = j-i;
                Integer area = lengthMin * breadth;
                hashset.add(area);
            }
        }

        return Collections.max(hashset);
        
    }
}
