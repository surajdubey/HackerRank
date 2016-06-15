package datastructures.arrays;

import java.util.ArrayList;
import java.util.Scanner;

public class DynamicArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int length = scanner.nextInt();
        
        //declaring array of ArrayList
        ArrayList<Integer> seqList[] = new ArrayList[length];
        for(int index = 0; index < length; index ++) {
            seqList[index] = new ArrayList<>();
        }

        int lastAnswer = 0;
        int queryCount = scanner.nextInt();
        while(queryCount > 0) {
            int queryType = scanner.nextInt();
            int x = scanner.nextInt();
            int y = scanner.nextInt();
            int sequenceIndex = (x ^ lastAnswer)%length;
            ArrayList<Integer> sequence = seqList[sequenceIndex];

            if(queryType == 1) {
               sequence.add(y);
            } else {
               lastAnswer = sequence.get(y % sequence.size());
                System.out.println(lastAnswer);
            }
            
            queryCount --;
        }
    }
}
