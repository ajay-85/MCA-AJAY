import java.util.*;

public class Sum_Prime_Number_24 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
     int n = sc.nextInt();
     
     int sum = 0;
     for(int i = 2; i<n; i++)
     {  int count = 0;
         
         for(int j =1; j<=i; j++)
         {
          if(i%j==0)
          {
            count++;
          }
         }
     
         if(count==2)
     {
       sum = sum + i;
     }
     }
     
     System.out.println(sum);
     
  }
}
