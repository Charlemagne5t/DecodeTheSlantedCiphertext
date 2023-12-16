public class Solution {
    public String decodeCiphertext(String encodedText, int rows) {
        int columns = encodedText.length() / rows;
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < columns; i++) {
            int start = i;
            while (start < encodedText.length()) {
                sb.append(encodedText.charAt(start));
                start += columns + 1;
            }
        }
       String answer = sb.toString().stripTrailing();
        return answer;
    }
}