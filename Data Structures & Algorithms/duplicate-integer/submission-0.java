class Solution {
    public boolean hasDuplicate(int[] nums) {
        TreeSet<Integer> intset = new TreeSet<Integer>();
        for(int a : nums)
            intset.add(a);
        if(intset.size()<nums.length){
            return true;
        }else{
            return false;
        }
    }
}