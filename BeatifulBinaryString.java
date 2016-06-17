import java.io.*;
class BeatifulBinaryString {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int strLength = Integer.parseInt(br.readLine());
    int result = 0;
    String str = br.readLine();
    char ch[] = str.toCharArray();
    for(int index = 0; index < strLength-2; index ++) {
      if(ch[index] == '0' && ch[index + 1] == '1' && ch[index+2] == '0') {
        ch[index + 2] = '1';
        result ++;
      }
    }

    System.out.println(result);
  }
}
