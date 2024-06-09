                                      /***    14.    BASIC SORTING ALGORITHMS :--      ***/


                                      import java.util.*;

//   (1).      BUBBLE-SORT:--
/*
public class Alphacodes4 {
    public static void Bubble_Sort(int arr[]) {
        int n = arr.length;
        int swap=0;                                 //Optimizing method(self)
        for (int turns = 0; turns < n - 1; turns++) {
                                 //Optimizing: M-2-- DIDI's Method: (here) int swap=0;and in line 17 swap=1;then if(swap==0)break;
            for (int j = 0; j < n - 1 - turns; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swap++;
                }
            }
            if(swap>=1)
                continue;

        }
    }
        public static void Print_Array(int arr[]) {
            for (int i = 0; i < arr.length; i++) {
                System.out.print(arr[i] + " ");
            }
            System.out.println();
    }

    public static void main(String args[]) {
        int arr[] = {5, 4, 1, 3, 2};
        Bubble_Sort(arr);
        Print_Array(arr);
    }
}  */

//    (2).    SELECTION-SORT:--

 /*   public class Alphacodes4{
        public static void Selection_Sort(int arr[]){
            int n=arr.length;
            for(int i=0;i < n-1;i++){          // i=turns
                int minPos=i;
                for(int j=i+1;j < n;j++){
                    if(arr[minPos] > arr[j]){
                        minPos=j;
                    }
//                    int temp=arr[minPos];         if swapped here thing has just got same as bubble sort i.e swapping inside inner loop.
//                    arr[minPos]=arr[i];
//                    arr[i]=temp;
                }
                int temp=arr[minPos];
                arr[minPos]=arr[i];
                arr[i]=temp;
            }
        }
        public static void Print_Array(int arr[]) {
            for (int i = 0; i < arr.length; i++) {
                System.out.print(arr[i] + " ");
            }
            System.out.println();
        }

        public static void main(String[] args) {
            int arr[]={5,4,1,3,2};
            Selection_Sort(arr);
            Print_Array(arr);
        }
    }   */

//   (3).   COUNTING-SORT:--

        /*   public class Alphacodes4 {
               public static void Counting_Sort(int arr[]) {
                   int largest = Integer.MIN_VALUE;
                   for (int i = 0; i < arr.length; i++) {             // Picking the largest element of the original array.
                       largest = Math.max(largest, arr[i]);           // For -ve values add before here:arr[i]=arr[i]+(Highest-ve no with oppo sign)
                   }
                   int count[] = new int[largest + 1];
                   for (int k = 0; k < arr.length; k++) {
                       count[arr[k]]++;                         // Same as count[n]=count[n]+1>Frequency Calculation happening.
                   }
                   int j = 0;
                   for (int i = 0; i < count.length; i++) {
                       while (count[i] > 0) {
                           arr[j] = i;
                           j++;
                           count[i]--;
                       }
                   }
               }

               public static void Print_Array(int arr[]) {
                   for (int l = 0; l < arr.length; l++) {
                       System.out.print(arr[l] + " ");
                   }
                   System.out.println();
               }

               public static void main(String[] args) {
                   int arr[] = {5,4,1,3,2};                    // Also try {1,4,1,3,2,4,3,7}
                   Counting_Sort(arr);
                   Print_Array(arr);
               }
           } */