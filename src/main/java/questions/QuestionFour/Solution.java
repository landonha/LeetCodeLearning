package questions.QuestionFour;

public class Solution {
  public double findMedianSortedArrays(int[] nums1, int[] nums2) {
    int size1 = nums1.length;
    int size2 = nums2.length;
    if (size1 > size2) {
      return findMedianSortedArrays(nums2, nums1);
    }
    int leftPointer = 0;
    int rightPointer = size1;

    while (leftPointer <= rightPointer) {
      int cut1 = (leftPointer + rightPointer) / 2;
      int cut2 = (size1 + size2 + 1) / 2 - cut1;

      int numLeft1 = (cut1 == 0) ? Integer.MIN_VALUE : nums1[cut1 - 1];
      int numLeft2 = (cut1 == size1) ? Integer.MAX_VALUE : nums1[cut1];
      int numRight1 = (cut2 == 0) ? Integer.MIN_VALUE : nums2[cut2 - 1];
      int numRight2 = (cut2 == size2) ? Integer.MAX_VALUE : nums2[cut2];

      if (numLeft1 <= numRight2 && numRight1 <= numLeft2) {
        int median1 = Math.max(numLeft1, numRight1);
        int median2 = Math.min(numLeft2, numRight2);
        return ((size1 + size2) % 2) == 0 ? ((median1 + median2) / 2.0) : (median1);
      } else if (numRight1 > numLeft2) {
        leftPointer = cut1 + 1;
        continue;
      } else if (numLeft1 > numRight2) {
        rightPointer = cut1 - 1;
        continue;
      }
    }
    return 0;
  }
}
