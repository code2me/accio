package Practice;

import java.util.*;

public class validPassword {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        sc.close();

        int len = s.length();

        boolean LowerCase = false;
        boolean UpperCase = false;
        boolean Special = false;
        boolean length = false;
        boolean digit = false;

        if (len >= 8) // length more than 8
            length = true;

        for (int i = 0; i < len; i++) {
            if (s.charAt(i) <= 122 && 
                s.charAt(i) >= 97)              // a-z
                LowerCase = true;
            else if (s.charAt(i) <= 90 && 
                     s.charAt(i) >= 65)         // A-Z
                UpperCase = true;
            else if ((s.charAt(i) <= 47 && 
                      s.charAt(i) >= 33) || 
                      s.charAt(i) == 64  || 
                      s.charAt(i) == 94)        // !@#$%^&*()-+
                Special = true;
            else if (s.charAt(i) <= 57 && 
                     s.charAt(i) >= 48)         // 0-9
                digit = true;
        }

        if (LowerCase && UpperCase && Special && length && digit)
            System.out.println("Strong Password");
        else
            System.out.println("Weak Password");
    }
}