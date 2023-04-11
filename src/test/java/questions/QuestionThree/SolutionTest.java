package questions.QuestionThree;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SolutionTest {

  Solution solution = new Solution();

  @ParameterizedTest
  @MethodSource("provideTestingData")
  public void testSolution(List<String> testData) {
    String input = testData.get(0);
    int actual = solution.lengthOfLongestSubString(input);
    int expected = Integer.parseInt(testData.get(1));
    Assertions.assertEquals(actual, expected);
  }

  private static List<List<String>> provideTestingData() {
    List<List<String>> testData = new ArrayList<>();
    {
      testData.add(Arrays.asList(
          "abcabcbb", "3"));
    }
    {
      testData.add(Arrays.asList(
          "bbbbb", "1"));
    }
    {
      testData.add(Arrays.asList(
          "pwwkew", "3"));
    }
    {
      testData.add(Arrays.asList(
          "", "0"));
    }

    return testData;
  }

}
