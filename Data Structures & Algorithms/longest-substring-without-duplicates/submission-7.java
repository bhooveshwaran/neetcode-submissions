class Solution {
    public int lengthOfLongestSubstring(String s) {
        int maxLength=0,currentCount=0,i=0;
        List<Character> list = new ArrayList<>();
        while(i < s.length()){
            if(list.contains(s.charAt(i))){
                list = list.subList(list.indexOf(s.charAt(i))+1,list.size());
                currentCount = list.size();
            }
            list.add(s.charAt(i));
            currentCount++;
            if(currentCount>maxLength){
                maxLength = currentCount;
            }
            i++;
        }
        return maxLength;
    }
}
