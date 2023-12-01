// Compare  of Strings.

public class strings3 {
    public static void main(String[] args) {
        String name1 = "aony";
        String name2 = "aony";

        System.out.println(name1.compareTo(name2));
        if (name1.compareTo(name2) == 0) {
            System.out.println("Strings are equal.");
            
        } else {
            System.out.println("Strings are not equal");
        }

        if(name1 == name2) {
            System.out.println("string are equal.");
        } else {
            System.out.println("Strings are not equal.");
        }

        if (new String("Tony") == new String("Tony")) {
            System.out.println("string are equal.");
        } else {
            System.out.println("Strings are not equal.");
        }

    }
}
