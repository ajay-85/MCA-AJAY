import java.util.*;

public class Anagram_21 {
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      String st1= sc.nextLine();
      String st2 = sc.nextLine();
      Boolean anagram = true;

      char []a = st1.toCharArray();
      char []b = st2.toCharArray();

      if( st1.length() != st2.length() )
      {
        anagram = false;
      }

      else
      {
        Arrays.sort(a);
        Arrays.sort(b);
      

      for(int i = 0; i<a.length; i++)
      {
         if(a[i]!=b[i])
         {
             anagram = false;
             break;
         }

         
      }
    }

      if(anagram)
      {
        System.out.println("Anagram");
      }

      else 
      {
        System.out.println("Not Anagram");
      }
   }
}
