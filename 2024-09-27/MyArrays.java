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

  public static void main(String[] args){
    int[] nums1 = {1, 2, 3};
    System.out.println("Expected: [1, 2, 3] , received: " + arrayToString(nums1));
    int[] nums2 = {};
    System.out.println("Expected: [] , received: " + arrayToString(nums2));
  }
}
