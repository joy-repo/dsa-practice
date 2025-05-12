package org.example.fb;

public class SearchInARotatedSortedArray {

  static int[] arr = {7,9,10,1,2,4,5};
  static int TARGET = 9;

  public static void main(String[] args) {
    solveSearch();
  }

  private static void solveSearch() {

    int left = 0;
    int right = arr.length - 1;

    while(left <= right) {

      int mid = (left + right) / 2;
      if(TARGET == arr[mid]){
        System.out.println(mid);
        return;
      }
      if(arr[left] <= arr[mid] ) {
        if(arr[left] <= TARGET  && TARGET <= arr[mid]) {
          right = mid - 1;
        } else {
          left = mid + 1;
        }
      } else {
        if(arr[mid] <= TARGET && TARGET <= arr[right]) {
          left = mid + 1;
        } else {
          right = mid-1;
        }
      }
    }
    System.out.println("-1");
  }

}
