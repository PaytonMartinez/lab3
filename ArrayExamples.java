

public class ArrayExamples {

  // Changes the input array to be in reversed order
  static void reverseInPlace(int[] arr) {
    for(int i = 0; i < arr.length/2; i += 1) {
      //BUG: Was deleting values on the other side of the array as it was iterating.
      int num = arr[i];
      arr[i] = arr[arr.length - i - 1];
      arr[arr.length - i - 1] = num;
    }
  }

  // Returns a *new* array with all the elements of the input array in reversed
  // order
  static int[] reversed(int[] arr) {
    int[] newArray = new int[arr.length];
    for(int i = 0; i < arr.length; i += 1) {
      //BUG: newArray and arr were swapped here, and it should return newArray
      newArray[i] = arr[arr.length - i -1];
    }
    return newArray;
  }

  // Averages the numbers in the array (takes the mean), but leaves out the
  // lowest number when calculating. Returns 0 if there are no elements or just
  // 1 element in the array
  static double averageWithoutLowest(double[] arr) {

    if(arr.length < 2) { return 0.0; }

    double lowest = arr[0];
    double sum = 0;

    //Check if all values are the same 
    for(double num: arr) {
      if(num < lowest || num > lowest) { break; }
      return sum / (arr.length);
    }
    for(double num: arr) {
      if(num < lowest) { lowest = num; }
    }
    for(double num: arr) {
      if(num != lowest) { sum += num; }
    }
    return sum / (arr.length - 1);
  }


}

