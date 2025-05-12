package org.example.fb;

public class HigherBoundBS {


  static  int[] arr = {1,2,2,2,4,7};// {3, 6,8,15,19};

  static int HIGER_BOUND = 2;

  public static void main(String[] args) {
    solveHigherBound();
  }

  private static void solveHigherBound() {

    int left = 0;
    int right = arr.length - 1;
    //int ans = arr[0];

    while (left < right) {

      int mid = (left + right) / 2;

      if(arr[mid] <= HIGER_BOUND) {
        left = mid + 1;

      }  else  {
        right = mid;

      }
    }
    System.out.println("left....." +left + "---"+ arr[left]);
    System.out.println("right....."+ right + "---"+ arr[right]);

  }

}
