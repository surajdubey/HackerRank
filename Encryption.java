import java.io.*;
import java.util.*;

class Encryption {
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    String input = sc.nextLine();
    input = input.replace(" ", "");

    int length = input.length();

    double sqrt = Math.sqrt(length);
    int sqrtInt = (int) sqrt;
    int row = sqrtInt, col = sqrtInt;
    if(sqrt != sqrtInt) {
      col++;
    }

    System.out.print(row+" " + col);
    char strChar[][] = new char[row][col];
    int k = 0;
    int colEndIndex = 0;
    for(int i=0; i<row; i++) {
      for(int j=0; j<col; j++) {
        if(k<length) {
          strChar[i][j] = input.charAt(k);
          k++;

          if(i==row-1) {
            colEndIndex = j;
          }
        }
      }
    }
    k = 0;
    for(int i=0; i<row; i++) {
      for(int j=0; j<col; j++) {
        if(k<length) {
          System.out.print(strChar[i][j]);
          k++;
        }
      }
      System.out.println();
    }

    k=0;
    for(int i=0; i<col; i++) {
      for(int j=0; j<row; j++) {
        if(k<length)  {
          if(!(j== row-1 && i >colEndIndex)) {
            System.out.print(strChar[j][i]);
            k++;
          }
        }
      }
      System.out.print(" ");
    }

  }
}
