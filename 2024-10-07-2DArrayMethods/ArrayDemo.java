import java.util.Arrays;
public class ArrayDemo{
  public static void main(String[]args){
    //write your tests here!
    //You can now use Arrays.toString(yourArray) instead of writing arrayToString again.
    //Compare Arrays.toString(yourArray) to YOUR arrayToString() method to make sure yours is correct
    //do not use any other Arrays.method()
    int[] arr = new int[]{1, 4};
    System.out.println("Expected: " + Arrays.toString(arr) + ", Received: " + arrToString(arr)
    + " | Equals? " + (arrToString(arr).equals(Arrays.toString(arr))));
    arr = new int[]{-12, 234};
    System.out.println("Expected: " + Arrays.toString(arr) + ", Received: " + arrToString(arr)
    + " | Equals? " + (arrToString(arr).equals(Arrays.toString(arr))));
    int[][] arr2 = new int[][]{{7, 8, -9}, {100000, 1, 3, 4, 2}, {}};
    System.out.println("Expected: " + Arrays.deepToString(arr2) + ", Received: " + arrToString(arr2)
    + " | Equals? " + (arrToString(arr2).equals(Arrays.deepToString(arr2))));
    arr2 = new int[][]{{-3, 5, 0}, {1}};
    System.out.println("Expected: " + Arrays.deepToString(arr2) + ", Received: " + arrToString(arr2)
    + " | Equals? " + (arrToString(arr2).equals(Arrays.deepToString(arr2))));

    // countZeros2D test cases
    int[][] arr3 = new int[][]{{2, 0, 3}, {1, 4}, {6, 20, -3}};
    System.out.println("Expected: 1, Received: " + countZeros2D(arr3) + " | Equals? " + (countZeros2D(arr3) == 1));
    arr3 = new int[][]{{0, 0, 0}, {0, 0, 0}, {0, 0}};
    System.out.println("Expected: 8, Received: " + countZeros2D(arr3) + " | Equals? " + (countZeros2D(arr3) == 8));
    arr3 = new int[][]{{}, {}};
    System.out.println("Expected: 0, Received: " + countZeros2D(arr3) + " | Equals? " + (countZeros2D(arr3) == 0));
    arr3 = new int[][]{{13542}, {23, 0}};
    System.out.println("Expected: 1, Received: " + countZeros2D(arr3) + " | Equals? " + (countZeros2D(arr3) == 1));
    arr3 = new int[][]{{}, {0}};
    System.out.println("Expected: 1, Received: " + countZeros2D(arr3) + " | Equals? " + (countZeros2D(arr3) == 1));
    arr3 = new int[][]{{1, 2, 3, 4, 0}, {0, 0, 0, 1, 0, 0, 0}};
    System.out.println("Expected: 7, Received: " + countZeros2D(arr3) + " | Equals? " + (countZeros2D(arr3) == 7));
    
    // htmlTable test cases
    int[][] arr4 = new int[][]{{2, 0, 3}, {1, 4}, {6, 20, -3}};
    System.out.println("Expected: <table><tr><td>2</td><td>0</td><td>3</td></tr><tr><td>1</td><td>4</td></tr><tr><td>6</td><td>20</td><td>-3</td></tr></table>, Received: " + htmlTable(arr4)
    + " | Equals? " + (htmlTable(arr4).equals("<table><tr><td>2</td><td>0</td><td>3</td></tr><tr><td>1</td><td>4</td></tr><tr><td>6</td><td>20</td><td>-3</td></tr></table>")));
    arr4 = new int[][]{{3}, {4}, {5}};
    System.out.println("Expected: <table><tr><td>3</td></tr><tr><td>4</td></tr><tr><td>5</td></tr></table>, Received: " + htmlTable(arr4)
    + " | Equals? " + (htmlTable(arr4).equals("<table><tr><td>3</td></tr><tr><td>4</td></tr><tr><td>5</td></tr></table>")));
    arr4 = new int[][]{{}, {}, {}};
    System.out.println("Expected: <table><tr></tr><tr></tr><tr></tr></table>, Received: " + htmlTable(arr4)
    + " | Equals? " + (htmlTable(arr4).equals("<table><tr></tr><tr></tr><tr></tr></table>")));
    arr4 = new int[][]{{}, {1, 2, 3}, {}};
    System.out.println("Expected: <table><tr></tr><tr><td>1</td><td>2</td><td>3</td></tr><tr></tr></table>, Received: " + htmlTable(arr4)
    + " | Equals? " + (htmlTable(arr4).equals("<table><tr></tr><tr><td>1</td><td>2</td><td>3</td></tr><tr></tr></table>")));
    arr4 = new int[][]{{}, {-7, 8}, {-9}};
    System.out.println("Expected: <table><tr></tr><tr><td>-7</td><td>8</td></tr><tr><td>-9</td></tr></table>, Received: " + htmlTable(arr4)
    + " | Equals? " + (htmlTable(arr4).equals("<table><tr></tr><tr><td>-7</td><td>8</td></tr><tr><td>-9</td></tr></table>")));
    arr4 = new int[][]{{10}, {-100}, {1000}};
    System.out.println("Expected: <table><tr><td>10</td></tr><tr><td>-100</td></tr><tr><td>1000</td></tr></table>, Received: " + htmlTable(arr4)
    + " | Equals? " + (htmlTable(arr4).equals("<table><tr><td>10</td></tr><tr><td>-100</td></tr><tr><td>1000</td></tr></table>")));
  }

  //0. Include your prior methods to help you print a 1D/2D array of ints.
  public static String arrToString(int[]ary){
    String returnStr = "[";
    for (int i = 0; i < ary.length; i++) {
      returnStr += ary[i];
      if (i < ary.length - 1) {
        returnStr += ", ";
      }
    }
    return returnStr + "]";
  }

  //The name of different methods can be the same,
  //as long as the parameters are different! (type and/or quantity must be different)
  //Pro tip: you should be using your 1D arrToString in this method!
  public static String arrToString(int[][]ary){
    String result = "[";
    for (int i = 0; i < ary.length; i++){
      result+=arrToString(ary[i]);
      if (i < ary.length-1){
        result+=", ";
      }
    }
    return result + "]";
  }

  //1. Calculate and return how many elements equal zero in the 2D array.
  public static int countZeros2D(int[][] nums){
    int count = 0;
    for (int i = 0; i < nums.length; i++){
      for (int n = 0; n < nums[i].length; n++){
        if (nums[i][n] == 0){
          count++;
        }
      }
    }
    return count;
  }

  //2. Calculate the sum of a 2d array
  /*Return the sum of all of the values in the 2D array
   *Use a nested loop instead of a helper method*/
  public static int arr2DSum(int[][]nums){
    int sum = 0;
    for (int i = 0; i < nums.length; i++){
      for (int n = 0; n < nums[i].length; n++){
        sum+=nums[i][n];
      }
    }
    return sum;
  }

  //3. Modify a given 2D array of integer as follows:
  //Replace all the negative values:
  //-When the row number is the same as the column number replace
  //that negative with the value 1
  //-All other negatives replace with 0
  public static void replaceNegative(int[][] vals){
    for (int i = 0; i < vals.length; i++) {
      for (int i2 = 0; i2 < vals[i].length; i2++) {
        if (vals[i][i2] < 0) {
          if (i == i2) {
            vals[i][i2] = 1;
          }
          else {
            vals[i][i2] = 0;
          }
        }
      }
    }
  }

  //4. Make a copy of the given 2d array.
  //When testing : make sure that changing the original does NOT change the copy.
  //DO NOT use any built in methods that "copy" an array.
  //You SHOULD write a helper method for this.
  //If you don't see a good way to do that, you should stop and look at prior methods.

  // helper method
  public static int[] returnCopy(int[]ary){
    int[] copy = new int[ary.length];
    for (int i = 0; i < ary.length; i++){
      copy[i] = ary[i];
    }
    return copy;
  }

  public static int[][] copy(int[][] nums){
    int[][] result = new int[nums.length][];
    for (int i = 0; i < nums.length; i++){
      result[i] = returnCopy(nums[i]);
    }
    return result;
  }

  //5. Rotate an array by returning a new array with the rows and columns swapped.
  //   You may assume the array is rectangular and neither rows nor cols is 0.
  //   e.g. swapRC({{1,2,3},{4,5,6}}) returns {{1,4},{2,5},{3,6}}
  public static int[][] swapRC(int[][]nums){
    int[][] swapped = new int[nums[1].length][nums.length];
    for (int i = 0; i < nums.length; i++){
      for (int n = 0; n < nums[i].length; n++){
        swapped[n][i] = nums[i][n];
      }
    }
    return swapped;
  }

  //6. Make an HTML table by putting a table tag around the entire 2d array,
  //   tr tags around each row, and td tags around each value.
  //   You may use a helper method
  //   Note there is no whitespace in the string, it all one line with no spaces/tabs.
  //   e.g. htmlTable(new int[][]{{1,2},{3}})  returns:
  // "<table><tr><td>1</td><td>2</td></tr><tr><td>3</td></tr></table>"
  public static String htmlTable(int[][]nums){
    String result = "<table>";
    for (int i = 0; i < nums.length; i++){
      result+="<tr>";
      for (int n = 0; n < nums[i].length; n++){
        result+="<td>" + nums[i][n] + "</td>";
      if (nums[i].length == 0){
        result+="<td></td>";
      }
      }
      result+="</tr>";
    }
    return result + "</table>";
  }
}