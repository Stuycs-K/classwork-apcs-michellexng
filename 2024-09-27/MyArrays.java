public class MyArrays{
  public static String arrayToString(int[] nums){
    String result = "[";
    if (nums.length < 1){
      return result + "]";
    }
    for (int i = 0; i < nums.length - 1; i++){
      result+=nums[i] + ", ";
    }
    result+=nums[nums.length-1];
    return result + "]";
  }

  public static int[] returnCopy(int[] ary){
    int[] copy = new int[ary.length];
    for (int i = 0; i < ary.length; i++){
      copy[i] = ary[i];
    }
    return copy;
  }

  public static void main(String[] args){
    int[] nums1 = {1, 2, 3};
    System.out.println("Expected: [1, 2, 3], received: " + arrayToString(nums1));
    int[] nums2 = {};
    System.out.println("Expected: [], received: " + arrayToString(nums2));
    
    int[] ary1 = {7, 80, 900, 1000};
    System.out.println("Expected: " + arrayToString(ary1) + ", received: " + arrayToString(returnCopy(ary1)) + 
    " Same elements: " + (arrayToString(ary1).equals(arrayToString(returnCopy(ary1)))) + " Different addresses: " + (!(ary1 == returnCopy(ary1))));
    int[] ary2 = {100, 99, 98, 97};
    System.out.println("Expected: " + arrayToString(ary2) + ", received: " + arrayToString(returnCopy(ary2)) + 
    " Same elements: " + (arrayToString(ary2).equals(arrayToString(returnCopy(ary2)))) + " Different addresses: " + (!(ary2 == returnCopy(ary2))));
    int[] ary3 = {};
    System.out.println("Expected: " + arrayToString(ary3) + ", received: " + arrayToString(returnCopy(ary3)) + 
    " Same elements: " + (arrayToString(ary3).equals(arrayToString(returnCopy(ary3)))) + " Different addresses: " + (!(ary3 == returnCopy(ary3))));
    int[] ary4 = {-100, 23, -1956, 12, 7};
    System.out.println("Expected: " + arrayToString(ary4) + ", received: " + arrayToString(returnCopy(ary4)) + 
    " Same elements: " + (arrayToString(ary4).equals(arrayToString(returnCopy(ary4)))) + " Different addresses: " + (!(ary4 == returnCopy(ary4))));
    int[] ary5 = {133, 134, -2, 5, 3, 3, 61830472};
    System.out.println("Expected: " + arrayToString(ary5) + ", received: " + arrayToString(returnCopy(ary5)) + 
    " Same elements: " + (arrayToString(ary5).equals(arrayToString(returnCopy(ary5)))) + " Different addresses: " + (!(ary5 == returnCopy(ary5))));
    int[] ary6 = {2, 2, 2, 2, 2};
    System.out.println("Expected: " + arrayToString(ary6) + ", received: " + arrayToString(returnCopy(ary6)) + 
    " Same elements: " + (arrayToString(ary6).equals(arrayToString(returnCopy(ary6)))) + " Different addresses: " + (!(ary6 == returnCopy(ary6))));

    int[] ary1a = {1, 2, 3, 4, 5};
    int[] ary1b = {6, 7, 8, 9, 10};
    System.out.println("Expected: [1, 2, 3, 4, 5, 6, 7, 8, 9, 10], received: " + arrayToString(concatArray(ary1a, ary1b));
    int[] ary2a = {6, 5, 4, 3, 2, 1};
    int[] ary2b = {0, -1, -2, -3, -4, -5, -6};
    System.out.println("Expected: [6, 5, 4, 3, 2, 1, 0, -1, -2, -3, -4, -5, -6], received: " + arrayToString(concatArray(ary2a, ary2b));
    int[] ary3a = {100000};
    int[] ary3b = {1};
    System.out.println("Expected: [100000, 1], received: " + arrayToString(concatArray(ary3a, ary3b));
    int[] ary4a = {};
    int[] ary4b = {98, 54, 25, 14};
    System.out.println("Expected: [98, 54, 25, 14], received: " + arrayToString(concatArray(ary4a, ary4b));
    int[] ary5a = {863, 2345, 1, 1};
    int[] ary5b = {};
    System.out.println("Expected: [863, 2345, 1, 1], received: " + arrayToString(concatArray(ary5a, ary5b));
    int[] ary6a = {};
    int[] ary6b = {};
    System.out.println("Expected: [], received: " + arrayToString(concatArray(ary6a, ary6b));
  }
}