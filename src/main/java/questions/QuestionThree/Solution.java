package questions.QuestionThree;

import java.util.HashSet;
import java.util.Set;

public class Solution {
  public int lengthOfLongestSubString(String s) {
    int result = 0;
    Set<Character> characterSet = new HashSet<>();

    for (int start = 0, end = 0; end < s.length(); end++) {
      char currentChar = s.charAt(end);
      while (characterSet.contains(currentChar)) {
        characterSet.remove(s.charAt(start));
        start++;
      }
      characterSet.add(currentChar);
      result = Math.max(result, end - start + 1);
    }

    return result;
  }
}
