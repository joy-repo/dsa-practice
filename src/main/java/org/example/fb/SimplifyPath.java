package org.example.fb;


import java.util.Stack;

/// TODO: Leet 71
public class SimplifyPath {

  static String path = "/a/b/.././//./d";

  public static void main(String[] args) {
    solveLeet71();

  }

  private static void solveLeet71() {

    String[] splitPath = path.split("/");
    Stack<String> stack = new Stack<String>();
    for (String folder : splitPath) {
      if(folder.equals("")) continue;
      if(folder.equals("..") && !stack.isEmpty()) {
        stack.pop();
      } else if (folder.equals(".")) {
        continue;
      } else {
        stack.push(folder);
      }

    }
    String result = "/"+String.join("/", stack);
    System.out.println(result);

  }

}
