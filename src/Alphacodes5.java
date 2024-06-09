                                            /***  (15)  2_D Arrays   ***/
import java.util.*;

//    (5).  Creation of 2-D Arrays:--

                                            //**  Note: Matrix.length (in 2-D arrays) is the number of rows &
                                            //          Matrix[0].length is the number of coloumns.



/* public class Alphacodes5 {
    public static void main(String args[]) {
        int matrix[][] = new int[3][3];
        int n = matrix.length, m = matrix[0].length;      // or n= 3,m=3. n=rows; m=coloumns
        int p=5;
        while(p>0) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the value u want to search: ");
            int key = sc.nextInt();
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    matrix[i][j] = sc.nextInt();
                }
            }

            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    System.out.print(matrix[i][j] + " ");   // o/p not showing if space unseparated i/p is given.
                }
                System.out.println();
            }
            p--;
            Search(matrix, key);                    // for checking multiple times for different key values u need to make separate fun.to print
                                                   // or else scope er baire chole jabe key.Things will be diff. if key is user-given(not user-input).
        }
    }

    public static boolean Search(int matrix[][],int key){
        for(int i=0;i< matrix.length;i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (matrix[i][j] == key) {
                    System.out.println("Required element found at cell (" + i + "," + j + ")");
                    return true;
                }
            }
        }
        System.out.println("Key not found");
        return false;
    }
} */



//    H|W:  Printing the largest and the smallest element in the matrix.


/* public class Alphacodes5 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the rows: ");
        int n = sc.nextInt();
        System.out.println("Enter the number of coloumns: ");
        int m = sc.nextInt();
        int i, j;
        int matrix[][] = new int[n][m];
        for (i = 0; i < n; i++) {
            for (j = 0; j < m; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }
        int min=Integer.MAX_VALUE;
        int max=Integer.MIN_VALUE;                              //Max-Min dutoi bolle:  if (mat[i][j] > max) {
        for (int k = 0; k < n; k++) {                           //                      max= mat[i][j];
            for (int l = 0; l < m; l++) {                       //                      else if(mat[i][j] < min)... min=+infinity and min = mat[i][j]
                //System.out.print(matrix[k][l] + " ");         //                      (Without using math.max/min function
                // int max=Integer.MIN_VALUE;
                max=Math.max(max,matrix[k][l]);
                min=Math.min(min,matrix[k][l]);
                //System.out.print("Max element of the matrix: "+max);
            }
        }
        System.out.println("Max element of the matrix:" +max);
        System.out.println("Min element of the matrix:" +min);
        System.out.println();
    }

} */


//      (7). Spiral-Matrix:--





























//      (9).  Diagonal Sum:--


/*  public class Alphacodes5 {                              //   M-1:  Brute-Force Approach.
    public static int Diagonal_Sum(int matrix[][]) {
        int sum = 0, i, j;
        for (i = 0; i < matrix.length; i++) {
            for (j = 0; j < matrix[0].length; j++) {
                if(i == j) {
                    sum += matrix[i][j];
                } else if(i + j == matrix.length - 1) {
                    sum += matrix[i][j];
                }
            }
        }
        return sum;
    }

    public static void main(String args[]) {
        int matrix[][] = {{1, 2, 3, 4, 5},
                          {6, 7, 8, 9, 10},
                          {11, 12, 13, 14, 15},
                          {16, 17, 18, 19, 20},
                          {21, 22, 23, 24, 25}};
        System.out.println(Diagonal_Sum(matrix));
    }
} */

/* public class Alphacodes5 {                            //   M-2: Optimized Approach
    public static int Diagonal_Sum(int matrix[][]){
        int sum=0;
        for(int i=0;i<matrix.length;i++){
            sum += matrix[i][i];
            if(i!= matrix.length-1-i){
                sum += matrix[i][matrix.length-1-i];
            }
        }
        return sum;
    }

    public static void main(String args[]){
        int matrix[][] = {{1, 2, 3, 4, 5},
                          {6, 7, 8, 9, 10},
                         {11, 12, 13, 14, 15},
                          {16, 17, 18, 19, 20},
                           {21, 22, 23, 24, 25}};
        System.out.println(Diagonal_Sum(matrix));
    }
} */




//     (10).   Search in a Sorted Matrix:-



/* public class Alphacodes5{                                     // M-1: Approach is top right considered as satrting point.

    public static boolean Staircase_Search(int matrix[][],int key) {
        int row = 0, col = matrix[0].length - 1;
        while (row < matrix.length && col >= 0) {               // Here, two nested for would have been used
            if (matrix[row][col] == key) {
                System.out.println("Found key at (" + row + "," + col + ")");
                return true;
            } else if (key < matrix[row][col]) {                // key > matrix[row][col] then row++ else col--// Same result.
                col--;
            } else {
                row++;
            }
        }
        System.out.println("Key not found!");
        return false;
    }

    public static void main(String args[]) {
        int matrix[][] = {{10, 20, 30, 40},
                          {15, 25, 35, 45},
                          {27, 29, 37, 48},
                          {32, 33, 39, 50}};
        int key = 33;
        System.out.println(Staircase_Search(matrix,key));
    }
} */


//     H|W...


/*  public class Alphacodes5{                               // M-2: Approach is bottom left is considered as starting point.
     public static boolean Staircase_Search(int matrix[][],int key){
         //int col =0, row =matrix.length-1;
         //while(col <= matrix.length-1){               // (Valid when no of rows = no. of cols) & or, col<=row

         int row=matrix.length-1,col=0;
         while(row >= 0 && col < matrix[0].length){     // (Valid for any number of rows and cols. in a matrix).
             if(matrix[row][col] == key){
                 System.out.println(" Found at ( " +row+ "," +col+ ")");
                 return true;
             }
             else if(key < matrix[row][col]){
                 row--;   // TOP er dike jabe.
             }
             else{
                 col++;  // RIGHT er dike jabe.
             }
         }
         System.out.println("Key not found! ");
         return false;
     }

     public static void main(String args[]) {
         int matrix[][] = {{10, 20, 30, 40},
                           {15, 25, 35, 45},
                           {27, 29, 37, 48},
                           {32, 33, 39, 50},
                           {41, 51, 61, 71}};
         int key = 33;           //Try 51 & also reduce row no. and increase col no.
         System.out.println(Staircase_Search(matrix,key));
     }
} */








