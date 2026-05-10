class Solution {
    public int maxArea(int[] heights) {
        //HashMap Solution 1
        Map<Integer[],Integer> hashmap = new HashMap<>();

        for(int i=0;i<heights.length;i++){
            for(int j=0; j<heights.length;j++){
                if(i==j)continue;
                Integer[] index = new Integer[]{i,j};
                Integer lengthMin = Math.min(heights[i],heights[j]);
                Integer breadth = j-i;
                Integer area = lengthMin * breadth;
                hashmap.put(index,area);
            }
        }

        return Collections.max(hashmap.values());
        
    }
}
