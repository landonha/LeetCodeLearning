package questions.QuestionOne;

import java.util.HashMap;
import java.util.Map;

class Solution {

  public int[] twoSum(int[] nums, int target) {
    Map<Integer, Integer> numberMap = new HashMap<>();
    for (int index = 0; index < nums.length; index++) {
      int compliment = target - nums[index];
      if (numberMap.containsKey(compliment)) {
        return new int[]{numberMap.get(compliment), index};
      }
      numberMap.put(nums[index], index);
    }
    return null;
  }
}
