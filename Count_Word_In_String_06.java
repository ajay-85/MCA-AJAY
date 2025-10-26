import java.util.*;

public class Count_Word_In_String_06 {
   
    public static void main(String[] args) {
      
       Scanner sc =new Scanner(System.in);
        String st = sc.nextLine();
         int word =0;
        
         for( int i = 0; i<st.length(); i++)

         {
           if(st.charAt(i)==' ')
          
           {
             word++;
           }
           
         }

          word+=1;
           System.out.println(word);
    }
}
