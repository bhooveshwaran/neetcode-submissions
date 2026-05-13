class Solution {
    public int lengthOfLongestSubstring(String s) {
        int maxLength=0,i=0;
        List<Character> list = new ArrayList<>();
        char[] c = s.toCharArray();
        while(i < c.length){
            if(list.contains(c[i])){
                list = list.subList(list.indexOf(c[i])+1,list.size());
            }
            list.add(c[i]);
            if(list.size()>maxLength){
                maxLength = list.size();
            }
            i++;
        }
        return maxLength;
    }
}
