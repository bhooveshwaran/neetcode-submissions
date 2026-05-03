class Solution {
    public boolean isAnagram(String s, String t) {
        //Have a int array of 26 size where each index is a ascii value
        int[] asciiIndexArray = new int[26];

        if (s.length() != t.length()){
            return false;
        }
        //Since s and t has same length, One loop is good
        // Loop through String S's each char.
        for(int i=0; i<s.length(); i++){
            //Logic: Find the Ascii of the char, 
            //Make it a relative ascii by subtracting from first ascii value.
            int asciiofa = (int) 'a';
            int asciiS = (int)s.charAt(i) - asciiofa;
            //Count: Add 1 for every index found from relative ascii.
            asciiIndexArray[asciiS] += 1;

            int asciiT = (int)t.charAt(i) - asciiofa;
            //Remove: subtract 1 for every index found from relative ascii.
            asciiIndexArray[asciiT] -= 1;
        }

        //2: Loop through the int array, 
        for(int i=0; i < asciiIndexArray.length; i++){
            //if any 1 is found, return false - Not an anagram
            if(asciiIndexArray[i]!=0){
                return false;
            }
        }
        //return true - An anagram
        return true;
    }
}
