package questions.QuestionFour;

import helper.PrimitiveDataHelper;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class SolutionTest {

  Solution solution = new Solution();

  @ParameterizedTest
  @MethodSource("provideTestData")
  public void testSolution(int[][] testData) {
    double actual = solution.findMedianSortedArrays(testData[0], testData[1]);
    double expected = PrimitiveDataHelper.convertArrayListToDouble(testData[2]);
    Assertions.assertEquals(actual, expected);
  }


  private static int[][][] provideTestData() {
    int[][][] testData = new int[5][][];
    int index = 0;
    {
      testData[index++] = new int[][]{{1, 3}, {2}, {2}};
    }
    {
      testData[index++] = new int[][]{{1, 2}, {3, 4}, {2, 5}};
    }
    {
      testData[index++] = new int[][]{{0, 0}, {0, 0}, {0}};
    }
    {
      testData[index++] = new int[][]{{}, {1}, {1}};
    }
    {
      testData[index] = new int[][]{{2}, {}, {2}};
    }
    return testData;
  }


}
