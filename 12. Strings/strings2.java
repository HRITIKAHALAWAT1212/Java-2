// Concatenation of Strings.

import java.util.Scanner;

public class strings2 {
    public static void main(String[] args) {
        // concatenation
        String firstname = "t";
        String lastname = "Stark";
        //literal //object bankekk
        String rit=new String("tStark");
        String fullname = firstname+lastname ;
        System.out.println(fullname);
        System.out.println(fullname.length());// arr.length;

        // charAt
        for(int i = 0; i<fullname.length();i++) {
            System.out.println(fullname.charAt(i));
        }

        String kap="tStark";
        if(rit.equals(fullname))System.out.print("yes");
    }
    
}
