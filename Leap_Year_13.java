import java.util.*;

public class Leap_Year_13 {
   public static void main(String[] args) {
    
     Scanner sc = new Scanner(System.in);
      int num = sc.nextInt();
    
      if(num%4==0  ||  ( num%4==0 && num%100==0))
      {
        System.out.println("leap year");
      }

      else
      {
        System.out.println("normal year");
      }
    }
}
