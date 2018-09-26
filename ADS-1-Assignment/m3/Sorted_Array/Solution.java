import java.util.Scanner;
import java.util.Arrays;
/**
 * Class for solution.
 */
public final class Solution {
    /**
     * Constructs the object.
     */
    private Solution() {

    }
  /**
   * returns the array for a string.
   *
   * @param      s     { arguments }
   *
   * @return     { returns array from the string }
   */
  public static int[] intArray(final String s) {
    String[] tokens = s.split(",");
    int[] array = new int[tokens.length];
    for (int i = 0; i < array.length; i++) {
        array[i] = Integer.parseInt(tokens[i]);
    }
    return array;
  }
  /**
   * main function.
   *
   * @param      args  The arguments
   */
  public static void main(final String[] args) {
    Scanner scan = new Scanner(System.in);
    int[]firstArray = new int[scan.nextInt()];
    int[]secondArray = new int[scan.nextInt()];
    if (firstArray.length != 0) {
      firstArray = intArray(scan.next());
    }
    if (secondArray.length != 0) {
      secondArray = intArray(scan.next());
    }
    int[] resultArray = new int[firstArray.length + secondArray.length];
    int i = 0, j = 0, k = 0;
    while (i < firstArray.length && j < secondArray.length) {
      if (firstArray[i] < secondArray[j]) {
        resultArray[k++] = firstArray[i];
        i = i + 1;
      } else if (firstArray[i] > secondArray[j]) {
        resultArray[k++] = secondArray[j];
        j = j + 1;
      }
    }
    if (firstArray.length > secondArray.length) {
      while (k < firstArray.length + secondArray.length) {
        resultArray[k++] = firstArray[i++];
      }
    }
    if (secondArray.length > firstArray.length) {
      while (k < firstArray.length + secondArray.length) {
        resultArray[k++] = secondArray[j++];
      }
    }
    System.out.println(Arrays.toString(resultArray).replace("[", "")
                       .replace("]", "").replace(" ", ""));
  }
}
