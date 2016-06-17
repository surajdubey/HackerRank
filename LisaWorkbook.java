import java.util.*;
import java.io.*;
class LisaWorkbook {
  public static void main(String[] args) throws IOException {
    Scanner sc = new Scanner(System.in);
    int chapter = sc.nextInt();
    int maxProblem = sc.nextInt();
    int ar[] = new int[chapter+1];
    int specialProblem = 0, pageNumber = 1;

    for(int i=1; i<=chapter; i++) {
      ar[i] = sc.nextInt();
    }

    for(int i=1;i<=chapter; i++) {
      for(int j=1; j<=ar[i]; j++) {
        // System.out.println("Problem " + j + " " + pageNumber);
        if(j==pageNumber) {
          // System.out.println("Special Problem " + ar[i] + " " + pageNumber);
          specialProblem++;
        }
        if(j%maxProblem == 0 || j == ar[i]) {
          pageNumber++;
        }
      }
    }

    System.out.println(specialProblem);
  }
}
