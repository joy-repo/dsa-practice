package org.example.fb;

public class MoveZerosBeging_Leet283 {


    static int[] arr = {5,0,6,0,7,0,9};

    public static void main(String[] args) {
        solveLeet283();
        for(int f : arr){
            System.out.println(f);
        }
    }

    private static void solveLeet283() {

        int left =0;

        for(int i=0; i< arr.length; i++){
            if(arr[i]==0){
                if(i>left){
                    int temp = arr[i];
                    arr[i] = arr[left];
                    arr[left]=temp;
                }
                left++;

            }
        }
    }

}
