import java.util.*;

public class Largest_Digit_23 {

  public static void main(String[] args) {
    
  
  Scanner sc = new Scanner(System.in);
  int n =sc.nextInt();
   int large = 0;
  while(n!=0)
  {
     int last = n%10;
       if(last>large)
       {
         large = last;
       }
      n=n/10;
  }

  System.out.println(large);
}
}