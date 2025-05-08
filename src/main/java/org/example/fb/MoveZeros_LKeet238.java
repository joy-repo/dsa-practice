package org.example.fb;

public class MoveZeros_LKeet238 {

    static int[] arr = {5,0,6,0,7,0,9};

    public static void main(String[] args) {
        solveLeet238();
        for(int f : arr){
            System.out.println(f);
        }
    }

    private static void solveLeet238() {

        int left = 0;

        for(int i =0; i<arr.length; i++){

            if(arr[i]!=0 && left<i){
                arr[left] = arr[i];
                arr[i]=0;
                left++;
            }
            if(arr[i]!=0) left++;
        }
    }
}
