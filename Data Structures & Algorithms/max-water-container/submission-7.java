class Solution {
    public int maxArea(int[] heights) {
        //Space Solution 3 - Time Brute Force 
        Integer maxArea = 0;

        for(int i=0;i<heights.length;i++){
            for(int j=0; j<heights.length;j++){
                if(i==j)continue;
                Integer area = Math.min(heights[i],heights[j]) * (j-i);
                if(area>maxArea){
                    maxArea=area;
                }
            }
        }

        return maxArea;
        
    }
}
