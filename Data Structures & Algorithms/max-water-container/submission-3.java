class Solution {
    public int maxArea(int[] heights) {
        //Solution 3 - Brute Force
        Integer maxArea = 0;

        for(int i=0;i<heights.length;i++){
            for(int j=0; j<heights.length;j++){
                if(i==j)continue;
                Integer lengthMin = Math.min(heights[i],heights[j]);
                Integer breadth = j-i;
                Integer area = lengthMin * breadth;
                if(area>maxArea){
                    maxArea=area;
                }
            }
        }

        return maxArea;
        
    }
}
