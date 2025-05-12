package org.example.fb;

public class KthMissingElement_Leet1539 {

    static int[] ARR = {4,8,10,11,12,13,18};
    static int K =11;
// 1 2 3 4 5 6 7 8 9 10 11 12 13 14 15 16 17 18
// . . . 0 . . . 1 . 2  3............
    public static void main(String[] args) {
        solution_1539();
    }

    private static void solution_1539() {

        int left=0;
        int right = ARR.length-1;

        while(right>left){
            int mid = (right+left)/2;
            int kTemp = ARR[mid]-mid-1;

            if(K>kTemp){
                left = mid+1;
            } else {
                right = mid-1;
            }
        }
        System.out.println(right);
        System.out.println(left);

        System.out.println(left+K);

    }
}
