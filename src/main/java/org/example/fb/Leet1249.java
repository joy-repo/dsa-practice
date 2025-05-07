package org.example.fb;

// TODO :  https://leetcode.com/problems/dot-product-of-two-sparse-vectors/description/

import java.util.Arrays;

public class Leet1249 {

   // static char[] cArr = "((vb)hjhj))(ghj(".toCharArray();
    
    public static void main(String[] args) {
        Leet1249 leet1249 = new Leet1249();
        char[] cArr = "((vb)hjhj))(ghj(".toCharArray();
        leet1249.minRemoveToMakeValid(cArr);
        System.out.println(new String(cArr));
    }
    
    public void minRemoveToMakeValid(char[] cArr) {
       int totalOpens = 0;
       int tracker = 0;
       int validIndex=0;
       
       for( int i=0; i<cArr.length; i++) {
          if(cArr[i]=='('){
              totalOpens++;
              tracker++;
          } else if (cArr[i]==')') {
              if(tracker==0){
                  cArr[i]='$';
                  continue;
              }
              tracker--;
          }

//          cArr[validIndex]=cArr[i];
//           validIndex++;

       }
       int keep= totalOpens-tracker;
       int j =0;
       for(int i = 0; i<cArr.length; i++){
           if(cArr[i]=='$' ){
                continue;
           }
           if(cArr[i]=='(' && keep==0){
               continue;
           }
           cArr[j]=cArr[i];
           j++;
           if(cArr[i]=='(') keep--;
       }
       System.out.println(j);
       cArr = Arrays.copyOf(cArr,j);


    }
}
