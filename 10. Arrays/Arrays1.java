// Array 1:

// Method-1:
// public class Arrays1 {
//     public static void main (String[] args) {
//         int[] marks = new int[3];
//         marks[0] = 100;
//         marks[1] = 200;
//         marks[2] = 400;
//         for (int i = 0; i<3;i++) {
//             System.out.println(marks[i]);
//         }
//     }
// }

// Method-2:
public class Arrays1 {
    public static void main(String[] args) {
        int[] marks = {100,200,300,4000};
        for (int i = 0;i<4;i++) {
            System.out.println(marks[i]);
        }
    }
}