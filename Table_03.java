import java.util.*;

public class Table_03 {
   public static void main(String[] args) {
      
      Scanner sc = new Scanner(System.in);
       int num = sc.nextInt();
        int result = 0;
        int i =0;
        for( i = 1; i <= 10; i++)
        {
          result = num*i;

          System.out.println(num+" * "+i+" = "+result);
        }
       
   }
}
