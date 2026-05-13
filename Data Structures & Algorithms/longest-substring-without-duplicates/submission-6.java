class Solution {
    public int lengthOfLongestSubstring(String s) {
        int maxLength=0,currentCount=0,i=0;
        List<Character> list = new ArrayList<>();
        char[] c = s.toCharArray();
        while(i < c.length){
            if(list.contains(c[i])){
                list = list.subList(list.indexOf(c[i])+1,list.size());
                currentCount = list.size();
            }
            list.add(c[i]);
            currentCount++;
            if(currentCount>maxLength){
                maxLength = currentCount;
            }
            i++;
        }
        return maxLength;
    }
}
