//1. Write both your names + emails at the top of the document as a comment.
// Amy Shrestha (amys90@nycstudents.net) & Michelle Ng (michellen83@nycstudents.net)

public class ArrayMethods {
//2. Copy your arrToString method from before.
/**Return a String that represets the array in the format:
* "[2, 3, 4, 9]"
* Note the comma+space between values, and between values
*/
public static String arrToString(int[] nums) {
  String returnStr = "[";
  for (int i = 0; i < nums.length; i++) {
    returnStr += nums[i];
    if (i < nums.length - 1) {
      returnStr += ", ";
    }
  }
  return returnStr + "]";
}

//3. Write arrToString, with a 2D array parameter.
//Note: Different parameters are allowed with the same function name.
/**Return a String that represets the 2D array in the format:
  * "[[2, 3, 4], [5, 6, 7], [2, 4, 9]]"
  * Note the comma+space between values, and between arrays
  * You are encouraged to notice that you may want to re-use
  * previous code, but you should NOT duplicate that code. (Don't copy/paste or retype it)
  */
public static String arrToString(int[][]ary){
  //this should use arrToString(int[])
  String result = "[";
  for (int i = 0; i < ary.length; i++){
    result+=arrToString(ary[i]);
    if (i < ary.length-1){
      result+=", ";
    }
  }
  return result + "]";
}

/*Return the sum of all of the values in the 2D array */
public static int arr2DSum(int[][]nums){
  //use a nested loop to solve this
  return 1;//place holder return value so it compiles.
}

/**Rotate an array by returning a new array with the rows and columns swapped.
  * You may assume the array is rectangular and neither rows nor cols is 0.
  * e.g. swapRC({{1,2,3},{4,5,6}}) returns {{1,4},{2,5},{3,6}}
  */
public static int[][] swapRC(int[][]nums){
  return new int[1][1];
}

public static void main(String[] args) {
  int [][] arr1a = {{1, 4}, {2, 5}, {3, 6}};
  System.out.println("Expected: [[1, 4], [2, 5], [3, 6]], Received: " + arrToString(arr1a)
  + "| Equals? " + (arrToString(arr1a).equals("[[1, 4], [2, 5], [3, 6]]")));
  int [][] arr1b = {{-3, 5, 0}, {1}};
  System.out.println("Expected: [[-3, 5, 0], [1]], Received: " + arrToString(arr1b)
  + "| Equals? " + (arrToString(arr1b).equals("[[-3, 5, 0], [1]]")));
  int [][] arr1c = {{7, 8, -9}, {100000, 1, 3, 4, 2}, {}};
  System.out.println("Expected: [[7, 8, -9], [100000, 1, 3, 4, 2], []], Received: " + arrToString(arr1c)
  + "| Equals? " + (arrToString(arr1c).equals("[[7, 8, -9], [100000, 1, 3, 4, 2], []]")));
  int [][] arr1d = {{}, {5, 3, 2}, {4}};
  System.out.println("Expected: [[], [5, 3, 2], [4]], Received: " + arrToString(arr1d)
  + "| Equals? " + (arrToString(arr1d).equals("[[], [5, 3, 2], [4]]")));
  int [][] arr1e = {{94, 3323, 888}, {3, 2, 2}};
  System.out.println("Expected: [[94, 3323, 888], [3, 2, 2]], Received: " + arrToString(arr1e)
  + "| Equals? " + (arrToString(arr1e).equals("[[94, 3323, 888], [3, 2, 2]]")));
  int [][] arr1f = {{-13464, 2}, {1093, 23234, 3}};
  System.out.println("Expected: [[-13464, 2], [1093, 23234, 3]], Received: " + arrToString(arr1f)
  + "| Equals? " + (arrToString(arr1f).equals("[[-13464, 2], [1093, 23234, 3]]")));

  int [][] arr2a = {{1, 4}, {2, 5}, {3, 6}};
  System.out.println("Expected: 21, Received: " + arr2DSum(arr2a) + "| Equals? " + (arr2DSum(arr2a) ==  21));
  int [][] arr2b = {{-3, 5, 0}, {1}};
  System.out.println("Expected: 3, Received: " + arr2DSum(arr2b) + "| Equals? " + (arr2DSum(arr2b) ==  3));
  int [][] arr2c = {{7, 8, -9}, {100000, 1, 3, 4, 2}, {}};
  System.out.println("Expected: 100016, Received: " + arr2DSum(arr2c) + "| Equals? " + (arr2DSum(arr2c) ==  100016));
  int [][] arr2d = {{}, {}, {}};
  System.out.println("Expected: 0, Received: " + arr2DSum(arr2d) + "| Equals? " + (arr2DSum(arr2d) ==  0));
  int [][] arr2e = {{0}, {0, 0, 2}, {0, 0, 0, 0}};
  System.out.println("Expected: 2, Received: " + arr2DSum(arr2e) + "| Equals? " + (arr2DSum(arr2e) ==  2));
  int [][] arr2f = {{-3}, {-5}, {8, 0}};
  System.out.println("Expected: 0, Received: " + arr2DSum(arr2f) + "| Equals? " + (arr2DSum(arr2f) ==  2));

  int [][] arr3a = {{1, 4}, {2, 5}, {3, 6}};
  System.out.println("Expected: [[1, 2, 3], [4, 5, 6]], Received: " + arrToString(swapRC(arr3a)) 
  + "| Equals? " + (arrToString(swapRC(arr3a)).equals("[[1, 2, 3], [4, 5, 6]]")));
  int [][] arr3b = {{-3, 5}, {1, 2}};
  System.out.println("Expected: [[-3, 1], [5, 2]], Received: " + arrToString(swapRC(arr3b))
  + "| Equals? " + (arrToString(swapRC(arr3b)).equals("[[1, 2, 3], [4, 5, 6]]")));
  int [][] arr3c = {{7, 8, -9}, {100000, 1, 3}};
  System.out.println("Expected: [[7, 100000], [8, 1], [-9, 3]], Received: " + arrToString(swapRC(arr3c))
  + "| Equals? " + (arrToString(swapRC(arr3c)).equals("[[7, 100000], [8, 1], [-9, 3]]")));
  int [][] arr3d = {{3, 2, 6, 8}, {4, 5, 10, 14}};
  System.out.println("Expected: [[3, 4], [2, 5], [6, 10], [8, 14]], Received: " + arrToString(swapRC(arr3d))
  + "| Equals? " + (arrToString(swapRC(arr3d)).equals("[[3, 4], [2, 5], [6, 10], [8, 14]]")));
  int [][] arr3e = {{7}, {11}, {24}};
  System.out.println("Expected: [[7, 11, 24]], Received: " + arrToString(swapRC(arr3e))
  + "| Equals? " + (arrToString(swapRC(arr3e)).equals("[[7, 11, 24]]")));
  int [][] arr3f = {{8, 8, 8}, {8, 8, 8}, {8, 8, 8}};
  System.out.println("Expected: [[8, 8, 8], [8, 8, 8], [8, 8, 8]], Received: " + arrToString(swapRC(arr3f))
  + "| Equals? " + (arrToString(swapRC(arr3f)).equals("[8, 8, 8], [8, 8, 8], [8, 8, 8]]")));
}
}