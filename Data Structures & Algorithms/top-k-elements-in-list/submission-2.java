class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer,Integer> mapNumsWithCount = new HashMap<>();
        for(int num:nums){
            mapNumsWithCount.merge(num,1,Integer::sum);
        }
        List<Integer> result = new ArrayList<>();
        result = mapNumsWithCount.entrySet()
                    .stream()
                    .sorted(Map.Entry.<Integer, Integer>comparingByValue().reversed())
                    .limit(k)
                    .map(Map.Entry::getKey)
                    .collect(Collectors.toList());

        return result.stream().mapToInt(Integer::intValue).toArray();
    }
}
