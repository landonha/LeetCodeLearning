package helper;

public class PrimitiveDataHelper {

  public static double convertArrayListToDouble(int[] input) {
    double ratio = 1;
    double result = 0;
    for (int number : input) {
      result += number * ratio;
      ratio/=10;
    }

    return result;
  }
}
