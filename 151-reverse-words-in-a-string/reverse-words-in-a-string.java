class Solution {
    public String reverseWords(String s) {
        // trim() removes leading/trailing spaces
        // split("\\s+") splits by one or more whitespace characters
        String[] words = s.trim().split("\\s+");
        StringBuilder sb = new StringBuilder();
        
        for (int i = words.length - 1; i >= 0; i--) {
            sb.append(words[i]);
            if (i > 0) sb.append(" ");
        }
        
        return sb.toString();
    }
}