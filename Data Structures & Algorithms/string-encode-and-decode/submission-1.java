class Solution {

    public String encode(List<String> strs) {
        StringBuilder encoded_string = new StringBuilder();
        for (String s : strs) {
            encoded_string.append(s.length()).append("#").append(s);
        }
        return encoded_string.toString();
    }

    public List<String> decode(String s) {
        List<String> res = new ArrayList<>();
        int i = 0;
        while (i < s.length()) {
            int j = i;
            while (s.charAt(j) != '#') j++;
            int length = Integer.parseInt(s.substring(i, j));
            res.add(s.substring(j + 1, j + 1 + length));
            i = j + 1 + length;
        }
        return res;
    }
}