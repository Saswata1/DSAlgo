                                           /***        13.    ARRAYS:---        ***/

import java.util.*;


//    (3) Passing arrays as Arguments:--




/*  public class Alphacodes3 {                     // Self: Just checking wheather value gets updated or not.
    public static int Update(int nonchngble){// Misconc: Number of parameters = number of return values.No.Only one return value reqd.(no matter the no.of Parameters)
        nonchngble=10;
        System.out.println(nonchngble);
        return nonchngble;                  // value is passed to Update and not from update to main.Unless & until value is returned,updation not possible.
    }

    public static void main(String[] args) {
        int nonchngble = 5;
        int n= Update(nonchngble);         // n: vari. to catch the returned & updated value.Return type thakle newa bhalo.
        //System.out.println(Update(nonchngble));// This can also be directly & no need to take seperate vari.(But,taking vari. is better to understand the workflow)
        System.out.println(nonchngble);    // Both var. nonchngble are diff in diff functions.
        System.out.println(n);
    }
}  */



 /* public class Alphacodes3 {                     //  Checking wheather value and array gets updated or not.
    public static void Update(int marks[], int nonchngble) {  //Value doesn't gets updated until returned(with no void functions) & Arrays always gets Updated/Changed.
        nonchngble = 10;
        int i;
        //System.out.println(nonchngble);
        for(i=0; i<marks.length;i++){    // This updation occured by Call by reference.
            marks[i]= marks[i]+1;

        }
        //return marks[i]; //DOUBT: can return type be of array nature: Yes.But remem. array is not a data-type.It is a data structure.(cleared).
                           // To know better : https://www.geeksforgeeks.org/how-to-return-an-array-in-java/
    }

    public static void main(String[] args) {
        int marks[] = {98,99,100};       // This exp:  int marks[3] = {98, 99, 100};(Wrong Vari declaration). & This exp:int marks[] = {98, 99, 100};
        int nonchngble = 5;              // (line 30) Wrong stmnt:Incomplete declaration(without new KW & so no memory allocation.)
       // System.out.println(marks);     // Array cannot be printed in this way.
         Update(marks,nonchngble);
        System.out.println(nonchngble);  // Both var. 'nonchngble' & 'marks[]' are diff in diff functions.
        // Printing marks:--
        for(int i=0; i<marks.length;i++){
            System.out.print(marks[i]+" ");
        }
    }
}  */



//      (5).     Linear Search:---



  /*  public class Alphacodes3 {                                              //(EG.1)
       public static int LinearSearch(int numbers[], int key) {
           for (int i = 0; i < numbers.length; i++) {
               if (numbers[i] == key) {
                   System.out.println("Key value found");// Genrally sopln stmnt not reqd when return; is used.
                   return i;
               }
           }
           return -1;
       }

       public static void main(String[] args) {
           int numbers[] = {2, 4, 6, 8, 10, 12, 14, 16};
           int key=16;               // Without declaring and initializing seperately direct value can also be passed inside Calling function.
           int index= LinearSearch(numbers,key);   //  (To avoid writing func. name repeatedly).
           if(index==-1){
               System.out.println("Not Found");
           }else {
               System.out.println("Key is at index: " +index);
           }
       }

   } */


                                                                               //(EG.2)
 /* public class Alphacodes3{

     public static int LinearSearch(String str[], String key) {
        for (int i = 0; i < str.length; i++) {
            if(str[i] == key) {
                System.out.println("Key value found");// Genrally sopln stmnt not reqd when return; is used.
                return i;
            }
        }
        return -1;
     }

      public static void main(String[] args) {
         String str[] = {"Saswata","Shubham"," Pranay"};
         String key ="Ritwick"; // Without declaring and initializing seperately direct value can also be passed inside Calling function.
          int index = LinearSearch(str,key);   //  (To avoid writing func. name repeatedly).
          if (index == -1) {
              System.out.println("Not Found");
          } else {
              System.out.println("Key is at index: " + index);
          }
      }
  }  */




//      (6).     Printing the largest & the Smallest number in the (array).


  /* public class Alphacodes3{                                    //  M-1: DIDI
       public static int getLargest(int numbers[]) {
           int largest = Integer.MIN_VALUE;  // Taking - infinity
           int smallest = Integer.MAX_VALUE; // Taking + infinity
           for (int i = 0; i < numbers.length; i++) {
               if (largest < numbers[i]) {
                   largest = numbers[i];
               }
               if (smallest > numbers[i])  // Try putting a ';' here and see the result.Dry run it.
               {
                   smallest = numbers[i];
               }
           }
           System.out.println("Smallest Value is: " + smallest);
           return largest;
       }

       public static void main(String[] args) {
           int numbers[]={1,2,6,3,5,7};
           System.out.println("Largest value is: " + getLargest(numbers));

       }
}*/



    /* public class Alphacodes3 {                          //  M-2(SELF) : Ok,but Time complexity is MORE (2 LOOPS USED)

        public static int getLargest(int numbers[]) {
            int largest=0;
            int len = numbers.length;
            for (int i = 0; i < len; i++) {
                // if( numbers[i] > numbers[len-1-i]) {    //  if( numbers[i] > numbers[i+1]) {  =  These two statements clears why we need j or another 'for'.
                for (int j = i + 1; j < len; j++) {        //  Never compare arr[i] with arr[i+1].Else array index out of bound will be shown.
                    if (numbers[i] > numbers[j]) {
                        largest = numbers[i];
                        //break;                           //  Using 'break' here is a little bit optimization but not like (M-1) or (M-3).
                    } else {
                        largest = numbers[j];              // largest=numbers[i+1];
                    }
                }
            }
            //System.out.println("Smallest Value is: " + smallest);
            return largest;
        }

        public static void main(String[] args) {
            int numbers[] = {1, 2, 6, 3, 5, 7};
            System.out.println("Largest value is: " + getLargest(numbers));

        }
    }  */


                   //   (M-3) : Sort array using Arrays.sort() function then print the Last Index.





//      (8).      Binary Search;--                      (also visit: javatpoint for the same.)


/* public class Alphacodes3{
   public static int BinarySearch(int numbers[],int key){
      int start =0,end= numbers.length -1;
      while(start <= end){
         int mid = (start + end)/ 2;
         if (numbers[mid] == key){      // found
            return mid;
         }
         if(numbers[mid] < key){       // right
            start = mid + 1;
         }else{
            end = mid - 1;            //  left
         }
      }
      return -1;
   }

   public static void main(String[] args) {
      int numbers[] = {2,4,6,8,10,14};              // Arrays must be sorted.
      int key= 1;   // Try ur testing cases here.
      System.out.println(" The index of given key value is:" +BinarySearch(numbers,key)); // can also 'start' and 'end' as parameters.
   }
}  */



//        (9).       Reverse an Array:-- (SORTED OR UNSORTED DOESN"T MATTER).


   /*public class Alphacodes3 {                          // (M-1): It's not actually reversing an array.Its printing an array in a reverse order.
       public static void ReversePrint(int numbers[]) {
          int plen = numbers.length;
          for (int i = len - 1; i >= 0; i--) {
             System.out.print(numbers[i]+" ");
          }
       }

       public static void main(String[] args) {
          int numbers[] = {2, 4, 6, 8, 10, 14};       // Arrange this array in any order and see.
          ReversePrint(numbers);
       }
    } */




                         //  (M-2): Its reversing an array using a temp. array.(SELF):Printing the original array reversely inside a new one.(Style 1: i e 0 & j e n-1;
                         //         vice versa holo Style 2: NEXT CODE
                         //          Style 3: way of GFG.                  ).

    /* public class Alphacodes3 {
         public static void reverse(int numbers[], int n) {
             int[] b = new int[n];
             int j;                                   // look why we declared j here.
             for (int i = 0; i < n; i++) {
                 for (j = n - 1 - i; j >= 0; j--) {   // No value of decrement part.So na dileo 'for' cholbe.
                     b[j] = numbers[i];
                     //System.out.print(b[j]);  (mistake)
                     break;
                 }
                 //System.out.print(b[j]);      (mistake)
             }
             for (j = 0; j < n; j++) {              // ekhane j er value chng hoi ni bole same vari. can be used otherwise, Diff vari. niye index
                                                    //   ke reun korate hoto for printing the new array.
                 System.out.print(b[j] + " ");     // This Printing part can also be done in main() like in (M-3). TC in this is >er because of 1 extra
             }                                    //  'for' loop(2nd for).
         }

         public static void main(String[] args) {
             int numbers[] = {3, 5, 8, 1, 0};
             int n = numbers.length;
             reverse(numbers, n);
         }
     } */


                            /**  NOTE:-  If u want to write the same code (M-2) using return statement i.e. by returning
                             one by one the indexes or respective values inside those indexes as java allows only
                             one return value (unlike Python).   **/




  /* public class Alphacodes3{                         // (M-2): Its reversing an array(SELF: Style 2)

      public static void reverse(int numbers[], int n) {
         int[] b = new int[n];
         int j;
         for (int i = n - 1; i >= 0; i--) {    // Writing these 2 loops like this is same as changing one element of a perticular index
            for (j = 0; j <= n - 1 - i; ) {    // & printing it. OR, Printing the same index whose value is changed every time.Its NOT a
               b[j] = numbers[i];           // reversed array.Unlike pv code here j(particlar j=0 tei) er moddhei value dhukche.and j te no updation taking place.
               //System.out.print(b[j] + " ");   //(mistake)
               break;
            }
            //System.out.print(b[j]);       (mistake)
//          }
            for (j = 0; j < n; j++) {           //                     **  LOGIC PENDING  **
               System.out.print(b[j] + " ");
                                               // i & j ke (both) 0-(n-1) run korano = i & j ke (n-1) to 0 run kora and operating: b[j]=numbers[i].
            }                                 // Thats just copy pasting the elements from 1 array to another.After this even if u print in reverse order
                                             //  of the 2nd array, the thing just remains the same i.e. PRINTING IN REV. ORDER & NOT ACTUAL REVERSE.
         }
      }

      public static void main(String[] args) {
         int numbers[] = {3, 5, 8, 1, 0};
         int n = numbers.length;
         reverse(numbers, n);
      }
   } */



/* public class Alphacodes3 {     // (M-2):--  STYLE-3: GFG.For other methods Check: https://www.geeksforgeeks.org/reverse-an-array-in-java/
    // function that reverses array and stores it
    // in another array
    static void reverse(int a[], int n)
    {
        int[] b = new int[n];
        int j = n;                                // This one has lesser T.C. than Styles 1/2.
        for (int i = 0; i < n; i++) {
            b[j - 1] = a[i];
            j = j - 1;
        }

        // printing the reversed array

        System.out.println("Reversed array is: \n");
        for (int k = 0; k < n; k++) {
            System.out.println(b[k]);
        }
    }
    public static void main(String[] args)
    {
        int [] arr = {10, 20, 30, 40, 50};
        reverse(arr, arr.length);
    }
} */


                                              //  (M-3): DIDI's Code: Most Optimized One.(Here swapping is done between first and last..)

/* public class Alphacodes3{
   public static void reverse(int numbers[]) {
       int start = 0, end = numbers.length-1;
       while (start < end) {
           int temp = numbers[start];        //  Side by Side Swapping can also be done.(1 ta loop use kora jai.2 to loop use kore 'break' mereo kora jai)
           numbers[start] = numbers[end];
           numbers[end] = temp;
           start++;
           end--;
       }
   }

   public static void main(String[] args) {
       int numbers[]={2,4,6,8,10};
       reverse(numbers);
       for(int i =0;i< numbers.length;i++){
           System.out.print(numbers[i]+" ");
       }
       System.out.println();              // Can or cannot give.
   }
} */



//     (10).      Pairs in Array:--

 /* public class Alphacodes3 {
      public static void Pairs(int numbers[]) {
          int tot_pairs=0;
          int len = numbers.length;
          for (int i = 0; i < len; i++) {
              int curr = numbers[i];
              for (int j = i + 1; j < len; j++) {
                  System.out.print("(" + curr + "," + numbers[j] + ")");
                  tot_pairs++;
              }
              System.out.println();
          }
          System.out.println("Total Number of Pairs: "+ tot_pairs);  // can also use: tot_pairs = len*(len+1)/2;
      }

      public static void main(String[] args) {
          int numbers[] = {2, 4, 6, 8, 10};
          Pairs(numbers);
      }

  } */


 //    (11).     Printing Sub-Arrays:--

 /* public class Alphacodes3 {
     public static void Sub_Arrays(int numbers[]) {
         int tot_SA=0;
         int len = numbers.length;
         for (int i = 0; i < len; i++) {
             int start = i;                        // Taken separate variables for i & j for better understanding.Only working with i & j will also do.
             for (int j = i; j < len; j++) {
                 int end = j;
                 for (int k = start; k <= end; k++) {      // Just to PRINT in a manner.
                     System.out.print("{" + numbers[k] + "}" + " ");  // Not got o/p as I wanted({}).So NORMAL Printing.
                     //tot_SA++;                          // Giving it here means counting of total no.of elements of all the Sub-Arrays.
                 }
                 System.out.println();
                 tot_SA++;                               // Sopln() er age kiba pore dile: no effect on o/p i.e. no diff.
             }
             System.out.println();
         }
         System.out.println("Total number of Sub-Arrays are: "+tot_SA);
     }

     public static void main(String[] args) {
         int numbers[] = {2, 4, 6, 8, 10};
         Sub_Arrays(numbers);
     }
 } */


//  Home-Work Task: Calculate the sum of all the Sub-Arrays & Print the value of maximum sum and minimum sum.(DONE NEXT.HERE ONLY THE SUM PART).


 /*public class Alphacodes3{                         // Exact code in copy.Written in my way(SUM PART ONLY) for self-understanding.(ITS BETTER).
     public static void Sub_Arrays(int numbers[]) {
         int tot_SA = 0,currsum=0;
         int len = numbers.length;
         for (int i = 0; i < len; i++) {
             int start = i;
             for (int j = i; j < len; j++) {
                 int end = j;
                 currsum=0;
                 for (int k = start; k <= end; k++) {                 // Just to PRINT in a manner.
                     System.out.print("{" + numbers[k] + "}" + " ");  // Unlike pv.one this time it helps.Though Sub-arrays coludn't be seperated(as wanted),
                     // but elements are seperated.See the printing by commenting & uncommenting.(currently=Best one)
                     currsum+=numbers[k];
                     //System.out.print(currsum+" ");      //Not bad.Try this along with removing '{}'
                 }
                 System.out.print(currsum);
                 System.out.println();                    //(removed part from original di's code)= ^^
                 tot_SA++;                               // To count the number of Sub-Arrays.
             }
             System.out.println();                       // ^^
         }
         System.out.println("Total number of Sub-Arrays are: " + tot_SA);
     }

     public static void main(String[] args) {
         int numbers[] = {2, 4, 6, 8, 10};
         Sub_Arrays(numbers);
     }
 } */


 //      (12).   Max Sub-Array Sum : (M-1:-  BRUTE FORCE )



/* public class Alphacodes3 {                               // Exact code in copy.Written in my way for self-understanding.(ITS BETTER).
    public static void Sub_Arrays(int numbers[]) {
        int currsum=0, maxsum=Integer.MIN_VALUE;
        int len = numbers.length;
        for (int i = 0; i < len; i++) {
            int start = i;
            for (int j = i; j < len; j++) {
                int end = j;
                currsum=0;
                for (int k = start; k <= end; k++) {                 // Just to PRINT in a manner.
                    System.out.print("{" + numbers[k] + "}" + " ");  // Unlike pv.one this time it helps.Though Sub-arrays coludn't be seperated(as wanted),
                                                                    // but elements are seperated.See the printing by commenting & uncommenting.(currently=Best one)
                    currsum+=numbers[k];
                }
                System.out.println(currsum);
                if(maxsum < currsum){      // or vice-versa
                    maxsum = currsum;
                }
               // System.out.println();                    //(removed part from original di's code)= ^^.Not needed here also.
            }
            System.out.println();                       // ^^
        }
        System.out.println("Max Sum Value: " +maxsum);
    }

    public static void main(String[] args) {
        int numbers[] = {2, 4, 6, 8, 10};
        Sub_Arrays(numbers);
    }
} */



//      (13).   Max Sub-Array Sum : (M-2:-   PREFIX SUM)



/*  public class Alphacodes3 {
    public static void Prefix_Sum(int numbers[]) {
        int Curr_Sum = 0;
        int Max_Sum = Integer.MIN_VALUE;
        int l = numbers.length;                    // Usage of more variables makes more usage of RAM.
        int prefix[] = new int[l];
        prefix[0] = numbers[0];
        for (int i = 1;i < prefix.length; i++) {
            prefix[i] = prefix[i-1] + numbers[i];
        }
        for (int j = 0; j < l; j++) {
            int start = j;
            for (int k = j; k < l; k++) {
                int end = k;
                Curr_Sum = start == 0 ? prefix[end] : prefix[end] - prefix[start - 1];
            }
            if (Max_Sum < Curr_Sum) {
                Max_Sum = Curr_Sum;
            }
        }
        System.out.println("Max Sum is : " + Max_Sum);
    }

    public static void main(String[] args) {
      int numbers[]= {1,-2,6,-1,3};
      Prefix_Sum(numbers);

    }
}  */



//    (14). Max Sub-Array Sum : (M-3:-  KADANE's Algo.)


/* public class Alphacodes3{
    public static void Kadanes(int numbers[]){
        int Max_Sum = Integer.MIN_VALUE;
        int Curr_Sum= 0;
        for(int i =0;i< numbers.length;i++){
            Curr_Sum=Curr_Sum + numbers[i];
            if(Curr_Sum < 0) {
                Curr_Sum = 0;
            }
            Max_Sum = Math.max(Curr_Sum,Max_Sum);
            }
        System.out.println("Our Max Sub-array sum is : "+Max_Sum);
        }

        public static void main(String[] args) {
             int numbers[] = {-2,-3,4,-1,-2,1,5,-3};     // or also try with pv. array: {1,-2,6,-1,3}
             Kadanes(numbers);
    }
}  */



//      (16).    Trapping-Rainwater :--


/* public class Alphacodes3 {
    public static int trappedRainwater(int height[]) {  // int return type because summation i.e tot. rainwater trapped is to be returned to main or displayed.
        int n = height.length;

        //  Calculate Left-Max boundary Array

        int Left_Max[] = new int[n];
        Left_Max[0] = height[0];
        for (int i = 1; i < n; i++) {
            Left_Max[i] = Math.max(Left_Max[i - 1], height[i]);
        }

        //  Calculate Right-Max boundary Array

        int Right_Max[] = new int[n];
        Right_Max[n - 1] = height[n - 1];
        for (int i = n - 2; i >= 0; i--) {
            Right_Max[i] = Math.max(Right_Max[i+1],height[i] );
        }

        int trapped_water = 0;

        //  Loop: Calculation of water-level & trapped rainwater

        for (int i = 0; i < n; i++) {
            int water_level = Math.min(Left_Max[i], Right_Max[i]);
            trapped_water += water_level - height[i];
        }
        return trapped_water;

    }

    public static void main(String[] args) {
        int height[] = {4, 2, 0, 6, 3, 2, 5};
        System.out.println(trappedRainwater(height));
    }
} */


 //  (17).      Stock Selling and Profit


 /* public class Alphacodes3 {
     public static int Buy_Sell_Stocks(int prices[]) {
         int buy_price = Integer.MAX_VALUE;
         int max_profit = 0;
         for (int i = 0; i < prices.length; i++) {
             if (buy_price < prices[i]) {
                 int profit = prices[i] - buy_price;
                 max_profit = Math.max(max_profit, profit);
             } else {
                 buy_price = prices[i];
             }
         }
         return max_profit;
     }
     public static void main(String args[]){
         int prices[] = {7,1,5,3,6,4};
         System.out.println(Buy_Sell_Stocks(prices));

     }
} */










