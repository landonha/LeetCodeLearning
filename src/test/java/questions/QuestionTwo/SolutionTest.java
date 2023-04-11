package questions.QuestionTwo;

import definition.ListNode;
import helper.ListNodeHelper;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SolutionTest {

  private static Solution solution;

  @BeforeAll
  public static void init() {
    solution = new Solution();
  }

  @ParameterizedTest
  @MethodSource("prepareTestingData")
  void testSolution(List<ListNode> testData) {
    ListNode result = solution.addTwoNumbers(testData.get(0), testData.get(1));
    Assertions.assertTrue(ListNodeHelper.compareTwoListNodes(testData.get(2), result));
  }

  private static List<List<ListNode>> prepareTestingData() {
    List<List<ListNode>> testData = new ArrayList<>();
    {
      testData.add(
          Arrays.asList(
              ListNodeHelper.generateListNodesWithArray(new int[] {2, 4, 3}),
              ListNodeHelper.generateListNodesWithArray(new int[] {5, 6, 4}),
              ListNodeHelper.generateListNodesWithArray(new int[] {7, 0, 8})));
    }
    {
      testData.add(
          Arrays.asList(
              ListNodeHelper.generateListNodesWithArray(new int[] {0}),
              ListNodeHelper.generateListNodesWithArray(new int[] {0}),
              ListNodeHelper.generateListNodesWithArray(new int[] {0})));
    }
    {
      testData.add(
          Arrays.asList(
              ListNodeHelper.generateListNodesWithArray(new int[] {9, 9, 9, 9, 9, 9, 9}),
              ListNodeHelper.generateListNodesWithArray(new int[] {9, 9, 9, 9}),
              ListNodeHelper.generateListNodesWithArray(new int[] {8, 9, 9, 9, 0, 0, 0, 1})));
    }

    return testData;
  }
}
