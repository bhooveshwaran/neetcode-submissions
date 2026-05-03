class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> trackingMap = new HashMap<> ();
        for(int i=0; i<nums.length; i++){
            int complement = target - nums[i];
            if(trackingMap.containsKey(complement)){
                return new int[]{trackingMap.get(complement),i};
            }else{
                trackingMap.put(nums[i],i);
            }
        }
        return new int[]{};
    }
}
