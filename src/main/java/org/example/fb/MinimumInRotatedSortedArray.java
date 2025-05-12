package org.example.fb;

public class MinimumInRotatedSortedArray {

  static int arr[] = {11,0};

  public static void main(String[] args) {
    solveMininRotatedSortedArr();

  }

  private static void solveMininRotatedSortedArr() {

    int left = 0;
    int right = arr.length - 1;
    int ans = Integer.MAX_VALUE;

    while(left <= right) {
      int mid = (left + right) / 2;

      if(arr[left] < arr[mid] ) {
       ans = Math.min(arr[left],ans);
       left = mid + 1;
      }
      else {
        ans = Math.min(arr[mid],ans);
        right = mid - 1;
      }

    }
    System.out.println(ans);
  }

}
