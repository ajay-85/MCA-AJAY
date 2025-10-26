import java.util.*;

public class Remove_Space_String_11 {
   public static void main(String[] args) {
    
     Scanner sc = new Scanner(System.in);
      String st = sc.nextLine();
      String str ="";
    
      for(int i = 0; i<st.length(); i++)
      {
         char ch = st.charAt(i);

        if(ch!=' ')
        {
          str = str + ch;
        }

      } 
      
      System.out.println(str);
    }
}
