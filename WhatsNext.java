import java.math.BigInteger;
import java.io.*;
class WhatNext {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int testCases = Integer.parseInt(br.readLine());

    while(testCases>0) {

      int n = Integer.parseInt(br.readLine());

      String str[] = br.readLine().split(" ");
      int a[] = new int[str.length];
      for(int index = 0; index < str.length; index ++) {
        a[index] = Integer.parseInt(str[index]);
      }

      int countValue = setCount(a);
      String binaryStr = getBinaryFromArray(a);

      while(true) {
        binaryStr = getNextBinary(binaryStr);
        if(setCountFromString(binaryStr) == countValue) {
          System.out.println(binaryStr);
          printC(binaryStr);
          break;
        }
      }
      testCases --;
    }
  }

  private static int setCount(int a[]) {
    int countValue = 0;
    for(int i = 0; i<a.length; i++) {
      if(i%2 == 0) {
        countValue = countValue + a[i];
      }
    }
    return countValue;
  }

  private static int setCountFromString(String str) {
    int count = 0;
    for(int i = 0; i< str.length(); i++) {
      if(str.charAt(i) == '1') {
        count ++;
      }
    }

    return count;
  }

  private static String getBinaryFromArray(int a[]) {
    String result = "";
    for(int i=0;i<a.length; i++) {
      int valueToAppend = 0;
      if(i%2==0) {
        valueToAppend = 1;
      }

      for(int j=0; j<a[i]; j++) {
        result = result + valueToAppend;
      }
    }

    return result;
  }

  private static String getNextBinary(String binaryStr) {
    BigInteger b = new BigInteger(binaryStr, 2);
    b = b.add(BigInteger.ONE);
    return b.toString(2);
  }

  private static void printC(String str) {
    int a = 0;
    int c = 0;
    String result = "";
    for(int i=0; i< str.length() - 1; i++) {
      if(str.charAt(i) == str.charAt(i+1)) {
        c++;
      } else {
        a++;
        result = result + (c+1);
        c = 0;

      }

    }

    System.out.println(a);
    System.out.println(result);
  }
}
