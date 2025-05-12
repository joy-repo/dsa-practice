//package org.example;
//
////
////You are given a string s, and an array of pairs of indices in the string pairs where
//// pairs[i] = [a, b] indicates 2 indices(0-indexed) of the string.
////You can swap the characters at any pair of indices in the given pairs any number of times.
////Return the lexicographically smallest string that s can be changed to
//// after using the swaps.
////
//
////Input: s = "dcab", pairs = [[0,3],[1,2]]Output: "abcd"
//
//// List<set<Integer>> --> 0,3
//      //  S2 -> 1,2, 3
//// List --< 2 sets
////bd  // ac
//
//
////Input: s = "dcyabx", pairs = [[0,3],[1,2],[0,2]]Output: "abcd"
////
//// s1 -> 0,3,2
////s2 -> 1,2
////
////s1 and s2  --> s3 -> 0134
//// abcd --> 3410
////  0 1 2 3 4 5
////  a b x cd
//// -> "dcab"
//// s4 -> 45
////--> "yx"
////       52
//
//import java.util.*;
//
/////
//// 0 ->
//public class Prob1 {
//
//
//    static String str = "dcyabx";
//
//    static int[][] pairs = {
//            {0,3},
//            {1,2},
//            {0,2}
//    };
//
//    public static void main(String[] args) {
//        solution();
//    }
//
//    private static void solution() {
//
//        List<Set<Integer>> list = new ArrayList<>();
//
//        for(int[] pair : pairs){
//            boolean doesExist = false;
//            for(Set<Integer> s : list){
//                if(s.contains(pair[0]) || s.contains(pair[1])){
//                    s.add(pair[0]);
//                    s.add(pair[1]);
//                    doesExist = true;
//                }
//            }
//            if(!doesExist){
//                Set<Integer> newSet = new HashSet<>();
//                newSet.add(pair[0]);
//                newSet.add(pair[1]);
//
//
//            }
//        }
//
//        List<Set<Integer>> finalSet = new ArrayList<>();
//        for(int i =0; i< list.size()-1; i++){
//            Set<Integer> set = list.get(i);
//            for(int j=i+1; j< list.size();j++ ){
//                Set<Integer> tempSet = list.get(j);
//                for(Integer k : set){
//                   if(tempSet.contains(k)){
//                       tempSet.addAll(set);
//                       continue;
//                   }
//                }
//                finalSet.add(tempSet);
//            }
//
//        }
//
//
//
//        Map<Integer, Character> map = new HashMap<>();
//
//        for(int i =0; i<str.length(); i++){
//            map.put(i, str.charAt(i));
//        }
//
//        List<Integer> tracker= new ArrayList<>();
//
//        //  0 1 2 3 4 5
//        //  dcyabx
//
//        //
//        List<List<Integer>> listF = new ArrayList<>();
//        for( Set<Integer> set  : finalSet){
//            char[] chars = new char[set.size()];
//            for(int j =0 ; j< set.size(); j++){
//                chars[j]= set.
//            }
//            tempStr.so
//        }
//
//        for (int i =0; i< str.length(); i++){
//
//            for(int j =0 ; j< finalSet.size(); j++){
//
//                Set<Integer> set = finalSet.get(j);
//                if(set.contains(i)){
//
//                }
//
//            }
//
//        }
//    }
//
//
//}
