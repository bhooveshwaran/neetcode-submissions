class Solution {
    public boolean isPalindrome(String s) {
        // if(s!="")
        //Remove all non alpha numberic chars from string.
        s = s.replaceAll("[^a-zA-Z\\d]","");
        StringBuilder builder = new StringBuilder(s);
        String revStr = builder.reverse().toString();
        if(revStr.compareToIgnoreCase(s) == 0){
            return true;
        }else{
            return false;
        }
    }
}
