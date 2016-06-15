package datastructures.arrays;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TwoDimensionalArrayDS {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int numberOfLines = 6;
        //accept user input
        int ar[][] = new int[6][6];
        
        for(int outerIndex = 0; outerIndex < numberOfLines; outerIndex ++) {
            
            //accept user input
            String input[] = br.readLine().split(" ");
            for(int innerIndex = 0; innerIndex < numberOfLines; innerIndex ++) {
                ar[outerIndex][innerIndex] = Integer.parseInt(input[innerIndex]);
            }
        }
        
        //calculate largest sum
        int largestSum = Integer.MIN_VALUE;
        for(int outerIndex = 0; outerIndex < numberOfLines - 2; outerIndex ++) {
            for(int innerIndex = 0; innerIndex < numberOfLines - 2; innerIndex ++) {
                int sum = ar[outerIndex][innerIndex] + ar[outerIndex][innerIndex + 1] + ar[outerIndex][innerIndex + 2]
                        +ar[outerIndex + 1][innerIndex + 1] + ar[outerIndex + 2][innerIndex]
                        + ar[outerIndex + 2][innerIndex + 1] + ar[outerIndex + 2][innerIndex + 2];
                System.out.println("Current sum " + sum);
                if(sum > largestSum) {
                    largestSum = sum;
                }
            }
        }
        
        System.out.println(largestSum);
        
    }
}
