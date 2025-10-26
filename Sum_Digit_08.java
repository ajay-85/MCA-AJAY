import java.util.*;

public class Sum_Digit_08 {
  
   public static void main(String[] args) {
     
     Scanner sc = new Scanner(System.in);
      int num = sc.nextInt();
      int sum =0;
       
      while(num!=0)
      {
        int rev = num%10;
        sum =sum+rev;
        num = num/10;
      }
      System.out.println(sum);
   }
}
