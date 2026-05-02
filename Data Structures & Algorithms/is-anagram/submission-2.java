class Solution {
    public boolean isAnagram(String s, String t) {
        //Have a int array of 26 size where each index is a ascii value
        int[] asciiIndexArray = new int[26];

        //1: Loop through String S's each char.
        for(int i=0; i<s.length(); i++){
            //Logic: Find the Ascii of the char, 
            //Make it a relative ascii by subtracting from first ascii value.
            char a = 'a';
            int relativeAscii = (int)s.charAt(i) - (int) a;
            //Count: Add 1 for every index found from relative ascii.
            asciiIndexArray[relativeAscii] += 1;
        }

        //2: Loop Through String T's each char.
        for(int i=0;i<t.length(); i++){
            //Logic: Find the Ascii of the char, 
            //Make it a relative ascii by subtracting from first ascii value.
            char a = 'a';
            int relativeAscii = (int)t.charAt(i) - (int) a;
            //Remove: subtract 1 for every index found from relative ascii.
            asciiIndexArray[relativeAscii] -= 1;
        }
        //3: Loop through the int array, 
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
