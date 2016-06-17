import java.util.*;
import java.io.*;

class TheGridSearch {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int testcase = sc.nextInt();

    while(testcase>0) {
      int textRowCount = sc.nextInt();
      int textColCount = sc.nextInt();

      String text[] = new String[textRowCount];

      for(int i=0; i<textRowCount; i++) {
        text[i] = sc.nextLine();
      }

      int patternRowCount = sc.nextInt();
      int patternColCount = sc.nextInt();

      String pattern[] = new String[patternRowCount];

      for(int i=0; i<patternRowCount; i++) {
        pattern[i] = sc.nextLine();
      }


      testcase--;
    }
  }
}
