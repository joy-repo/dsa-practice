package org.example.fb;

public class ValidWordAbbreviation_Leet408 {

  static String word = "tadpoles";
  static String abbreviation = "*9";

  public static void main(String[] args) {

    boolean res = solveAbbr(0, 0);
    System.out.println(res);
  }

  private static boolean solveAbbr(int iWord, int iAbbr) {

    if(iAbbr==abbreviation.length() && iWord==word.length()) {
      return true;
    }
    if (iAbbr == abbreviation.length()) {

      return false;
    }
    if (iWord == word.length()) {return false;}

    if(word.charAt(iWord)== abbreviation.charAt(iAbbr)){
     return solveAbbr(iWord+1, iAbbr+1);
    }

    if(Character.isDigit(abbreviation.charAt(iAbbr))){
     return solveAbbr(iWord+Integer.parseInt(abbreviation.charAt(iAbbr)+""), iAbbr+1);
    }

    if(abbreviation.charAt(iAbbr)=='*'){
      for(int i=iWord;i<word.length();i++){
        if(iAbbr+1==abbreviation.length()) return true;
        if(solveAbbr(i,iAbbr+1)) return true;
      }
    }
    return false;


  }

}
