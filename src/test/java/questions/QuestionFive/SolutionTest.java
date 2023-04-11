package questions.QuestionFive;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SolutionTest {

  Solution solution = new Solution();

  @ParameterizedTest
  @MethodSource("provideTestData")
  public void testSolution(List<String> testData) {
    String actual = solution.longestPalindrome(testData.get(0));
    String expected = testData.get(1);
    Assertions.assertEquals(actual, expected);
  }

  private static List<List<String>> provideTestData() {
    List<List<String>> testData = new ArrayList<>();
    {
      testData.add(Arrays.asList("babad", "bab"));
    }
    {
      testData.add(Arrays.asList("cbbd", "bb"));
    }
    {
      testData.add(Arrays.asList("a", "a"));
    }
    {
      testData.add(Arrays.asList("ac", "a"));
    }

    return testData;
  }
}
