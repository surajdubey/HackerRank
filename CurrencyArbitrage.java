import java.io.*;
class CurrencyArbitrage {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int testcase = Integer.parseInt(br.readLine());
    double amountInUSD = 100000;

    while(testcase > 0) {
      String input[] = br.readLine().split(" ");
      double USD_EUR = Double.parseDouble(input[0]);
      double EUR_GBP = Double.parseDouble(input[1]);
      double GBP_USD = Double.parseDouble(input[2]);

      double amountInEUR = amountInUSD / USD_EUR;
      double amountInGBP = amountInEUR / EUR_GBP;
      double convertedAmountInUSD = amountInGBP / GBP_USD;

      double difference = convertedAmountInUSD - amountInUSD;
      if(difference > 0) {
        System.out.println((int) difference);
      } else {
        System.out.println("0");
      }

      testcase--;
    }
  }

}
