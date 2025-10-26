import java.util.*;

public class Fibonacci_Series_09 {
   public static void main(String[] args) {
    
      Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int n1 = 0;
        int n2 = 1;
        
        for(int i = 0; i<n; i++)
        {
          
         int result =  n1+n2;
           n1 = result;
           n2 = n1-n2;
           System.out.println(n2);
        }
   }
}
