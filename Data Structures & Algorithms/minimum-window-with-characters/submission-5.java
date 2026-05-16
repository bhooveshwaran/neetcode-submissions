class Solution {
    //Brute Force
    public String minWindow(String s, String t) {
        Integer smallestWindowValue = Integer.MAX_VALUE;
        Map<String,Integer> validWindows = new HashMap<>();
        if(Objects.equals(s,t)){
            return s;
        }
        if(s.contains(t)){
            return t;
        }
        if(t.length()>s.length()){
            return "";
        }

        for(int i=0; i< s.length(); i++){
            for(int j=i+1; j<=s.length();j++){
                if(i!=j){
                    String window = s.substring(i,j);
                    if(containsAll(window,t)){
                        System.out.println(window);
                        validWindows.put(window,window.length());
                        smallestWindowValue = Math.min(smallestWindowValue, window.length());
                    }
                }
            }
        }
        System.out.println(smallestWindowValue);
        final Integer finalValue = smallestWindowValue;
        return validWindows.entrySet().stream()
              .filter(entry -> Objects.equals(entry.getValue(), finalValue))
              .map(Map.Entry::getKey)
              .findFirst()
              .orElse("");
    }

    public static boolean containsAll(String source, String target) {
        if (target.length() > source.length()) return false;

        int[] charCounts = new int[256];

        for (char c : source.toCharArray()) {
            charCounts[c]++;
        }

        for (char c : target.toCharArray()) {
            charCounts[c]--;
            // If count goes negative, it means 'target' has a char not in 'source'
            // or more duplicates of it than 'source' has.
            if (charCounts[c] < 0) {
                return false;
            }
        }

        return true;
    }
}
