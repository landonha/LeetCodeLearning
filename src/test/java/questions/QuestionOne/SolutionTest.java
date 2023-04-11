package questions.QuestionOne;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;


public class SolutionTest {

  private static Solution solution;

  @BeforeAll
  public static void init() {
    solution = new Solution();
  }

  @ParameterizedTest
  @MethodSource("provideTestingData")
  public void testSolution(int[][] testData) {
    int[] result = solution.twoSum(testData[0], testData[1][0]);
    Assertions.assertArrayEquals(testData[2], result);
  }

  private static int[][][] provideTestingData() {
    int[][][] data = new int[3][][];
    int index = 0;
    {
      int[][] testData = new int[3][];
      testData[0] = new int[]{2, 7, 11, 15};
      testData[1] = new int[]{9};
      testData[2] = new int[]{0, 1};
      data[index++] = testData;
    }
    {
      int[][] testData = new int[3][];
      testData[0] = new int[]{3, 2, 4};
      testData[1] = new int[]{6};
      testData[2] = new int[]{1, 2};
      data[index++] = testData;
    }
    {
      int[][] testData = new int[3][];
      testData[0] = new int[]{3, 3};
      testData[1] = new int[]{6};
      testData[2] = new int[]{0, 1};
      data[index] = testData;
    }
    return data;
  }
}
