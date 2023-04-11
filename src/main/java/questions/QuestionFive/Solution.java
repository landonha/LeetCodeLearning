package questions.QuestionFive;

public class Solution {
  public String longestPalindrome(String s) {
    int size = s.length();
    String result = "";
    boolean[][] array = new boolean[size][size];

    for (int i = size - 1; i >= 0; i--) {
      for (int j = i; j < size; j++) {
        array[i][j] = (s.charAt(i) == s.charAt(j)) && (j - i < 3 || array[i + 1][j - 1]);
        if (array[i][j] && ((j - i + 1) >= result.length())) {
          result = s.substring(i, j + 1);
        }
      }
    }

    return result;
  }
}
