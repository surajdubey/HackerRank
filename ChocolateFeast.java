import java.io.*;
class ChocolateFeast {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int testCount = Integer.parseInt(br.readLine());

    while(testCount>0) {
      String input[] = br.readLine().split(" ");
      int n = Integer.parseInt(input[0]);
      int c = Integer.parseInt(input[1]);
      int m = Integer.parseInt(input[2]);

      int wrapper = 0, count = 0, temp = 0;

      wrapper = n/c;
      count = wrapper;
      // temp = initialWrapper;

      while(wrapper>0) {
        wrapper = wrapper - m;
        if(wrapper>=0) {
          count++;
          if(wrapper>0) {
            wrapper++;
          }
        }

      }

      System.out.println(count);
      testCount --;
    }
  }
}
