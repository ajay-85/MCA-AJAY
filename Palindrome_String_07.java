import java.util.*;

public class Palindrome_String_07 {
   
    public static void main(String[] args) {
      
       Scanner sc =new Scanner(System.in);
        String st = sc.nextLine();
        String str = ""; 
        for(int i = st.length()-1; i>=0; i--)
        {
          str = str + st.charAt(i);

        }
         
        if(st.equals(str))
        {
          System.out.println("palindrome");
        }

        else
        {
          System.out.println("not palindrome");
        }
    }
}
