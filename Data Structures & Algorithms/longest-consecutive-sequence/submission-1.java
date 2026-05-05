class Solution {
    public int longestConsecutive(int[] nums) {
        //Empty Case or single item case
        if(nums.length == 0){
            return 0;
        }
        //Sort the input array
         Arrays.sort(nums);

         //Keep track of the longest sequence count
         int longestSeq = 0;
         //keep track of current sequence
        Deque<Integer> currentSeqStack = new ArrayDeque<Integer>();
        //Iterate through the input array.
        for(int i:nums){   
            if(currentSeqStack.isEmpty() || currentSeqStack.peek() == i-1 ){
                currentSeqStack.push(i);
                if(currentSeqStack.size()>longestSeq){
                    longestSeq = currentSeqStack.size();
                }
            }else if(currentSeqStack.peek().equals(i)){
                //Duplicate Case = skip increment
                continue;
            }else{
                //Remove everything
               currentSeqStack.clear();
                currentSeqStack.push(i);
            }
        }
    return longestSeq;
    }
}
