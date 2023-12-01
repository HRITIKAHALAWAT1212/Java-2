// // Q4. Create a Java program to add two matrices of size 2x3.

// public class HArrays4 {
//     public static void main(String[] args) {
//         int[][] array1 =  {{1,2,3},
//                            {4,5,6}};
//         int[][] array2 =  {{1,2,3},
//                            {4,5,6}};
//         int[][] result =  {{0,0,0},{0,0,0}};


//         for (int i = 0;i<array1.length;i++) {
//             for (int j = 0; j<array2.length;j++) {
//                 result[i][j] = array1[i][j] + array2[i][j];
//             }

//         }
//         for (int i = 0;i<array1.length;i++) {
//             for (int j = 0; j<array2.length;j++) {
//                 result[i][j] = array1[i][j] + array2[i][j];
//                 System.out.print(result[i][j] + " ");
//             }
//             System.out.println();
//         }

//     }
// }


public class HArrays4 {
    public static void main(String[] args) {
        int[][] arrays1 = {{3,4,3},
                           {3,4,3}};
        int[][] arrays2 = {{5,6,5},
                           {5,6,5}};
        
        for (int i = 0; i<arrays1.length; i++ ) {
            for(int j = 0; j<arrays1.length; j++) {
                arrays1[i][j] = arrays1[i][j] + arrays2[i][j];
            }
        }
        for (int i = 0; i<arrays1.length; i++ ) {
            for(int j = 0; j<arrays1.length; j++) {
                System.out.print(arrays1[i][j] + " ");
            }
            System.out.println();
        }
    }
}
