class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<Integer[], List<String>> resultMap = new HashMap<>();
        for(String s:strs){
            Integer[] convertedAsciiArray = convertToAsciiAnagram(s);
            boolean found = false;
            for(Integer[] asciiIndexinMap:resultMap.keySet()){
                if(isAsciiAnagram(asciiIndexinMap,convertedAsciiArray)){
                    List<String> stringList = resultMap.get(asciiIndexinMap);
                    stringList.add(s);
                    found = true;
                    break;
                }
            }
            if(!found){
                List<String> stringList = new ArrayList<>();
                stringList.add(s);
                resultMap.put(convertedAsciiArray, stringList);
            }
        }
        return new ArrayList<>(resultMap.values());
        
    }
    public Integer[] convertToAsciiAnagram(String s) {
        Integer[] arr = new Integer[26];
        Arrays.fill(arr, 0);
        for(Character c : s.toCharArray()) 
            arr[(int) c - (int)'a']+=1;
        return arr;
    }
    public boolean isAsciiAnagram(Integer[] base, Integer[] compare){
        if(base.length!=compare.length){
            return false;
        }
        return Arrays.equals(base,compare);
    }
}