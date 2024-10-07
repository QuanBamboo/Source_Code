import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
      int [] arr={1,2};
      for (int temp: arr){
          temp=temp*2;
      }
        System.out.println(Arrays.toString(arr));
        arr.clone();

    }
}