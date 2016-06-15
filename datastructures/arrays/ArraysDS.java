package datastructures.arrays;

import java.util.Scanner;

public class ArraysDS {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int inputLength = scanner.nextInt();
        int ar[] = new int[inputLength];
        
        //accept user inputs
        for(int index = 0; index < inputLength; index ++) {
            ar[index] = scanner.nextInt();
        }
        
        //print in reverse order
        for(int index = inputLength - 1; index>=0; index --) {
            System.out.print(ar[index] + " ");
        }
        
    }
}
