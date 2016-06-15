package datastructures.arrays;

import java.util.Scanner;

public class SparseArrays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int inputLength = scanner.nextInt();
        
        String inputs[] = new String[inputLength];
        for(int index = 0; index < inputLength; index ++) {
            inputs[index] = scanner.next();
        }
        
        int queryLength = scanner.nextInt();
        while(queryLength > 0) {
            int count = 0;
            String query = scanner.next();
            for(String input: inputs) {
                if(input.equals(query)) {
                    count ++;
                }
            }
            System.out.println(count);
            queryLength --;
        }
    }
}
