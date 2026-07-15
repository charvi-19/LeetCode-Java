class Solution {
    public String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0) {
            return "";
        }
        String prefix = strs[0]; // Two pointer arrray

        for (int i = 1; i < strs.length; i++) { // dyanamic 
            int j = 0; // static
            while ( j < prefix.length() && j < strs[i].length() && prefix.charAt(j) == strs[i].charAt(j)) {
                j++;
            }

            prefix = prefix.substring(0, j);

            if (prefix.equals("")) {
                return "";
            }
        }
        return prefix;
    }
}