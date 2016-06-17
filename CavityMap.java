import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CavityMap {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int inputLength = Integer.parseInt(br.readLine());

    int map[][] = new int[inputLength][inputLength];

    for(int index = 0; index< inputLength; index++)
    {
      String inputStr[] = br.readLine().split("");
      for(int innerIndex = 0; innerIndex<inputLength; innerIndex++)
      {
        map[index][innerIndex] = Integer.parseInt(inputStr[innerIndex]);
      }
    }

    // //ignore border cases
    // for(int outerIndex = 1; outerIndex<map.length-1; outerIndex++)
    // {
    // 	for(int innerIndex = 1; innerIndex<map[outerIndex].length-1; innerIndex++)
    // 	{
    // 		int number = map[outerIndex][innerIndex];
    //
    // 		//check for cavity case
    // 		if(number>map[outerIndex-1][innerIndex] && number>map[outerIndex+1][innerIndex]
    // 				&& number>map[outerIndex][innerIndex-1] && number> map[outerIndex][innerIndex+1])
    // 		{
    // 			map[outerIndex][innerIndex] = 0;
    // 		}
    // 	}
    // }

    //ignore border cases
    for(int outerIndex = 0; outerIndex<map.length; outerIndex++)
    {
      for(int innerIndex = 0; innerIndex<map[outerIndex].length; innerIndex++)
      {
        if(outerIndex == 0 || outerIndex == map.length-1 || innerIndex == 0 || innerIndex == map.length-1) {
          System.out.print(map[outerIndex][innerIndex]);
        } else {
          int number = map[outerIndex][innerIndex];

          //check for cavity case
          if(number>map[outerIndex-1][innerIndex] && number>map[outerIndex+1][innerIndex]
          && number>map[outerIndex][innerIndex-1] && number> map[outerIndex][innerIndex+1])
          {
            System.out.print("X");
          } else {
            System.out.print(number);
          }
        }
      }
      System.out.println();
    }

    // //print result
    // for(int outerIndex = 0; outerIndex<map.length; outerIndex++)
    // {
    //   for(int innerIndex = 0; innerIndex<map[outerIndex].length; innerIndex++)
    //   {
    //     if(map[outerIndex][innerIndex] == 0)
    //     {
    //       System.out.print("X");
    //     }
    //     else
    //     {
    //       System.out.print(map[outerIndex][innerIndex]);
    //     }
    //   }
    //   System.out.println();
    // }
  }
}
