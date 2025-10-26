import java.util.*;

public class Prime_Number_16 {
   public static void main(String[] args) {
     
     Scanner sc = new Scanner(System.in);
      int num = sc.nextInt();
       Boolean isprime = true;
      
        for(int i = 2; i<=Math.sqrt(num); i++)
        {
         if(num%i==0) {
             isprime = false;
         }
        
        }
        if(isprime) {
          System.out.println("prime");
        }
        else {
          System.out.println("not prime");
        }

   }
}
