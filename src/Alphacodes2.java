                                /***    9.   LOOPS(flow control):(9).Reverse a number.  ***/

                                //         Earlier done:Even-Odd,Print nos. from 1-n(or any value),Print sum of first n natural nos.


import java.util.*;

/* public class Alphacodes2 {
    public static void main(String[] args) {
          int n=99801,rem,reversed;                                           //(using while loop)
        while(n!=0){
//        rem=0; init. kora na kora same(both in and out of loop) //Avoid initializing within a loop.It is not considered by main function.
          rem=n%10;
          //reversed=rem*10000;(Python concept bhule jacchi).// Dewar mane nei and the logic is even wrong.(LEARNED NEW APPROACH). Without operation: rev=0;rev=rev*10+rem;
            n=n/10;
            System.out.print(rem);                        //(This one is reversing(just printing the reversed form)without actually reversing the original number)
        }
        // Jodi eikhane(out of loop) sopln(rem);kortam then rem not initialized dakhato.Baire init.korte hoto and inside init. consider korto na.//

        for (int n = 99801; n > 0; n = n / 10) {                         //(using for loop)
            int rem = n % 10;
            System.out.print(rem);                                      //not println but print..

        }

    }
} */


                    /***      (10)    Reverse the original number and then printing it.       ***/



                          /*      public class Alphacodes2 {
        public static void main(String[] args) {

      int reversed=0;
      for (int n = 99801; n > 0; n = n / 10) {                               //(using for loop but can also be done by while)
           //int reversed = 0;(dont do this mistake).
          //int rem=0; (no effect on code:thaka na thaka equal:both inside and outside the loop.NO NEED).
           int rem = n % 10;                                                  // Avoid init. within a loop.It is not considered by Basics function.

           reversed = reversed*10 + rem ;
           // System.out.println(reversed); //By this print u can observe the progress in ur operation in each step but for final one and only result print outside loop.
        }
           System.out.println(reversed);       //Directly gives the final result.(Doesnt matter print or println).
    }
}             */



              //   (11)   Printing "Hello World" by using d0-while..
              //   (12)   break; stmnt
              //   (13)   Keep enetring nos. till user enters a multiple of 10;



                               /* public class Alphacodes2 {
                                    public static void main(String[] args) {
                                        Scanner sc = new Scanner(System.in);
                                        do {
                                            System.out.print("Enter a number: ");
                                            int n = sc.nextInt();
                                            if (n % 10 == 0) {
                                                break;
                                            }
                                            System.out.println(n);
                                        } while (true);
                                    }

                                } */


          /***    (14)   continue; stmnt       ***/

                               /* public class Alphacodes2 {
                                    public static void main(String[] args) {
                                        for (int i = 1; i <= 5; i++) {
                                            if (i == 3) {
                                                continue;
                                            }
                                            System.out.println(i);
                                        }
                                    }
                                } */

           /***    (15)   Display all numbers entered by user except multiples of 10        ***/


                            /*    public class Alphacodes2 {
                                    public static void main(String[] args) {
                                        Scanner sc = new Scanner(System.in);
                                        do {
                                            System.out.print("Enter a number: ");
                                            int n = sc.nextInt();
                                            if (n % 10 == 0) {
                                                continue;
                                            }
                                            System.out.println("number was : " + n);
                                        }   while(true);
                                    }
                                }  */


           /***    (16)   Printing Prime numbers but understanding in a different approach.       ***/


                               /*  public class Alphacodes2 {
                                    public static void main(String[] args) {
                                        Scanner sc = new Scanner(System.in);
                                        System.out.print("Enter a number: ");
                                        int n = sc.nextInt();
                                        boolean isPrime = true;
                                        for (int i = 2; i <= n - 1; i++) {
                                            if (n % i == 0) {
                                                isPrime = false;
                                            }
                                        }

                                        if (isPrime == true && n>=2) {    //or n!=1 && n!=0
                                            System.out.println("n is Prime");
                                        }
                                      else {
                                            System.out.println("n is not Prime");
                                        }
                                    }
                                } */


                                /*** 10 . Patterns (2):   Print star(*) pattern.   ***/

    //                                                     *                               1
   //                                                      * *           similar to        1 2
   //                                                      * * *                           1 2 3
   //                                                      * * * *                         1 2 3 4     (Don't count the space used in btwn.)


                                /*  class Alphacodes2{
                                    public static void main(String[] args) {     // better using variables instead of direct values.(Eg. n=5 & line<=n...)
                                        int line,i=0;                            // nothings wrong with i's init. but here not needed.needed if print i outside both loops.
                                                for(line=1;line<=5;line++){      // Try i=line;i<=line & then
                                                    for(i=1;i<=line;i++){        // practice try the 3 combi. sopln(i) & sopln(line) inside inner 'for',just outside inner 'for' and outside of nested 'for-s'.
                                                       //System.out.print(i);    // try executing this by uncommenting it & also see whts coming by usng sopln.will give the coresponding no. pattern.
                                                        System.out.print("*");
                                                    }
                                                    System.out.println();
                                                }
                                    }
                                } */

     /***              (3): Print inverted (*) pattern.  :              ***/

     //                                                       ****
     //                                                       ***
     //                                                       **
     //                                                       *

     //       Note:  Star pattern and no. pattern printing is hugely diff.Multi. seq can give same o/p for star but DIIFERENT every time for nos.



                                                                                  //  (M-1)
                            /*    class Alphacodes2 {                            //normal class can exist but public class will be 1 only.May or may not be used.
                                    public static void main(String[] args) {
                                        int line, i = 0;
                                        for (line = 1; line <= 5; line++) {
                                            for (i = line; i <= 5; i++) {              // try this: i=5;i>=1;i--
                                                //  System.out.print(i);              // also try this
                                                System.out.print("*");  //Better:(" "+"*"); // job for * will be done but not for no.pattern.
                                            }
                                            System.out.println();
                                        }
                                    }
                                }   */


                           /*     class Alphacodes2 {                               //  (M-2)
                                    public static void main(String[] args) {
                                        int line, i = 0;
                                        for (line = 1; line <= 5; line++) {
                                            for (i = 5; i >=line; i--) {           // try this: i=5;i>=1;i--
                                              //  System.out.print(i);            // also try this(will give): 5 4 3 2 1
                                                System.out.print("*");            //                           5 4 3 2
                                            }                                     //                           5 4 3
                                            System.out.println();                 //                           5 4
                                        }                                         //                           5
                                    }
                                }   */

                                                                                   //  (M-3)
                          /*      class Alphacodes2 {
                                    public static void main(String[] args) {
                                        int line, i = 0;
                                        for (line = 5; line >=1 ; line--) {
                                            for (i = line; i >=1; i--) {        //try i=line;i>=line;i--
                                              //  System.out.print(i);      // also try this(interchanging i & *).Run both prints together or one at a time by commenting out other.
                                                System.out.print("*");
                                            }
                                            System.out.println();
                                        }
                                    }
                                }  */



                                                                                    //  (M-4): NEW APPROACH.

                           /*     class Alphacodes2 {
                                    public static void main(String[] args) {
                                        int line, star,n=5;
                                        for (line = 1; line <= n; line++) {
                                            for (star = 1; star <= n-line+1; star++) {
                                                //  System.out.print(i);
                                                System.out.print("*");
                                            }
                                            System.out.println();
                                        }
                                    }
                                }   */


               /***  (4).         Print HALF PYRAMID(of numbers):(done in (2) only).same logic just print i     ***/

                /*** (5).                        Print CHARECTER pattern:          ***/


                                 //                                   A
                                //                                    B C
                                //                                    D E F
                                //                                    G H I J


                               /* class Alphacodes2 {                                   //  (M-1): New approach:as taught.
                                    public static void main(String[] args) {
                                        int line, chars, n = 5;
                                        char ch = 'A';
                                        for (line = 1; line <= n; line++) {
                                            for (chars = 1; chars <= line ; chars++) {       //wht if chars <=n.
                                                System.out.print(ch);
                                                ch++;                   //In Java,ASCII is used as the default character encoding for text data.
                                            }
                                            System.out.println();
                                        }
                                    }
                                } */



                                                                                           //  (M-2)

                               /* class Alphacodes2
                                {
                                    public static void main(String abc[])
                                    {
                                        int alphabet=65;                          //ASCII value of A
                                        for(int i=1;i<5;i++)
                                        {
                                            for(int j=1;j<=i;j++)
                                            {
                                                System.out.print((char)alphabet);
                                                alphabet++;
                                            }
                                            System.out.println();
                                        }
                                    }
                                }  */



                                                                         // Another pattern(practice):self-discovered.

                              /*  class Alphacodes2 {
                                    public static void main(String[] args) {
                                        int line, chars, n = 5;
                                        char ch = 'A';
                                        for (line = 1; line <= n; line++) {
                                            for (chars = 1; chars <= n - line + 1; chars++) {
                                                System.out.print(ch);
                                                ch++;
                                            }
                                            System.out.println();
                                        }
                                    }
                                } */
                                                                                       // (M-3) (By ASCII) my trials...


                              /*  class Alphacodes2 {
                                    public static void main(String[] args) {
                                        int line=65, chars, n = 5;       // in this current case no need of line;if line is present chars++ is unrechable.
                                        //char ch = 'A';
                                        //for (line = 65; line <= 70; line++) {            //this range can be set by any nos. but dependency in the inner for matters.
                                            for (chars =line; chars < 75 ; chars++) {   //try chars 65-90 and then print ch;ch++ //u hve to bring & show the dependency of line with chars.
                                                System.out.print((char)(chars));    //try chars=line;chars<=75;// also try:line 65-70;& chars=line;chars>=65 & [also chars<=65(chars++)],chars=--.
                                                System.out.println();
                                                //ch++;
                                                line++;
                                            }
                                            System.out.println();
                                        }
                                   // }
                                }  */




                                                           // M-3 (By ASCII) but before that..

                                //                                    A                              1
                                //                                    B C                            2 3     (Floyd's Triangle)
                                //                                    D E F         similar to       4 5 6   (done first)
                                //                                    G H I J                        7 8 9 10




                                /*      class Alphacodes2 {
                                    public static void main(String[] args) {
                                        int line, chars, n = 5,c=1;  //also try with c=0(normal one); & also for commented one.
                                        for (line = 65; line < 70; line++) {    // and not <=70.(6ta loop cholbe then).& u can set this limit in any type of rnge.
                                           // for (chars =line; chars < 75 ; chars++) { // here also type of range doesnt matter.just printing c does.
                                            for(chars=65; chars <=line;chars++){ // solely depends on outer loop and then modifi. done to inner one as per that.
                                               // System.out.print((char)(chars));
                                               // c++;// try putting it here.
                                                System.out.print(c);
                                                c++;
                                            }
                                            //c=0; //try this with uncommenting pv. commented c++; if c=1, then o/p so coming is similar to logic (4).
                                            System.out.println();
                                        }
                                    }
                                }  */


                                //  (M-3):FINAL(by ASCII):-    SELF...:    A
                                //                                         B C
                                //                                         D E F
                                //                                         G H I J


                               /* class Alphacodes2 {
                                    public static void main(String[] args) {
                                        int line, chars, n = 5,c=1;
                                        for (line = 65; line < 70; line++) {       //any type of range but with diff 5(as reqd).
                                            for(chars=65; chars <=line;chars++){  // doesn't matter the range.because c s not related to them at all.
                                                // System.out.print((char)(chars));
                                                System.out.print((char)(c+64));
                                                c++;//   https://codedost.com/java/alphabet-patterns-in-java/java-program-for-character-alphabet-pattern-16/
                                            }
                                            System.out.println();
                                        }
                                    }
                                } */

                            // Direct by ASCII still not possible, without counter.. . Might be possible in C.

                           // Note:  Here on,multiple methods wont be practiced.Just the taught one and self one & not from web.


        //   (6)  From next patterns will be practiced and done using FUNCTIONS to practice both PATTERNS and FUNCTIONS.


/***   11.             AFTER A LOT OF THEORY:--                  ***/

/***       (9)    Finding product of 2 nos. using functions.      ***/

                              /*  class Alphacodes2 {
                                    public static int multiply(int a, int b) {
                                        int product = a * b;
                                        return product;
                                    }

                                    public static void main(String[] args) {
                                        int a = 3;
                                        int b = 4;
                                        int prod = multiply(a, b);
                                        System.out.println("a * b = " + prod);  // or directly:-System.out.println(multiply(a,b));
                                        prod = multiply(20, 30);
                                        System.out.println("a * b = " + prod);
                                    }
                                } */
/***        (10)    Finding Factorial...
            (11)    Finding Binomial Coefficient...             ***/

                            /*    class Alphacodes2 {
                                    public static int factorial(int n) {
                                        int f = 1;
                                        for (int i = 1; i <= n; i++) {
                                            f = f * i;
                                            // try by giving System.out.println(f);
                                            // return f;  //what's the diff in writing return here & out of loop
                                        }
                                        return f;
                                    }

                                    public static int binomial(int n,int r) {
                                       int fact_n= factorial(n);
                                       int fact_r=factorial(r);
                                       int fact_nmr=factorial(n-r);
                                       int result= fact_n/(fact_r * fact_nmr);
                                       return result;
                                    }

                                    public static void main(String[] args) {
                                        int num = 5,r=2;
                                        //int c = factorial(num);
                                            int c=binomial(num,r);
                                        System.out.println(c);
                                    }
                                }  */


/***     (16)     Check Prime no. using FUNCTION:-       (practice)           ***/

                         /*       public class Alphacodes2 {
                                    public static boolean isPrime(int n) {
                                        //boolean isPrime=true;// not needed.
                                        if (n < 2) {      // best not only for 0 & 1 but for any -ve value.(DIDI: if n==2;return true)
                                            return false;
                                        }
                                        for (int i = 2; i <= n - 1; i++) {
                                            if (n % i == 0) {
//                                                isPrime=false;
//                                                return isPrime;  Not needed to take a separate boolean variable.Directly return kora jai & its BEST>
                                                return false; // can also use a break stmnt after that cause if i get one then no need to check for any others..
                                            }
                                        }
                                        //return isPrime;// Not needed.
                                        return true;
                                    }

                                    public static void main(String[] args) {
                                        //System.out.println(isPrime(3));   //can aslo do this.one input at a time or,
                                        Scanner sc = new Scanner(System.in);
                                        while (true) {
                                            System.out.println("Enter a number: ");
                                            int n = sc.nextInt();// this n is different than the above one.
                                            //int result=isPrime(n);// this will give error cause int e boolean store korar chesta hocchilo.
                                            System.out.println(isPrime(n));
                                           if(isPrime(n)==true){
                                               System.out.println("Number is Prime");
                                           }
                                           else{
                                               System.out.println("Number is not Prime");
                                           }
                                            // System.out.println(isPrime(n));
                                        }
                                    }
                                }     */

/***          (17)                                      M-2(optimised approach): Only modification is:--
                                              for(i=2;i<=Math.sqrt(n);i++)                       ***/

/***         (18)               Printing prime numbers in range:       ***/



                         /*       public class Alphacodes2 {
                                    public static boolean isPrime(int n) {
                                        //boolean isPrime=true;// not needed.
                                        if (n < 2) {
                                            return false;
                                        }
                                        for (int i = 2; i <= n - 1; i++) {
                                            if (n % i == 0) {
                                                return false; // can also use a break stmnt after that cause if i get one then no need to check for any others..
                                            }
                                        }
                                        return true;
                                    }

                                    public static void PrimeInRange(int n){
                                        for(int i=2;i<=n;i++){
                                            if(isPrime(i)){
                                                System.out.print(i+" ");
                                            }
                                        }
                                        System.out.println();
                                    }

                                    public static void main(String[] args) {
                                        //System.out.println(isPrime(3));   //can aslo do this.one input at a time or,
                                        Scanner sc = new Scanner(System.in);
                                        while (true) {
                                            System.out.println("Enter a number: ");
                                            int n = sc.nextInt();// this n is different than the above one.
                                            PrimeInRange(n);
                                           // int c= PrimeInRange(n); :not work as PrimeInRange has no return type.
                                           // System.out.println(PrimeInRange(n));:also not possible. //System.out.println(isPrime(n));
//                                            if(isPrime(n)==true){
//                                                System.out.println("Number is Prime");
//                                            }                                                 not checking anymore.
//                                            else{
//                                                System.out.println("Number is not Prime");
//                                            }
                                            // System.out.println(isPrime(n));
                                        }
                                    }
                                }  */


/***        (20)              Binary to Decimal:--              ***/

             /*  public class Alphacodes2 {
                   public static void binTdec(int bi_n) {
                       int num= bi_n;
                       int p = 0;
                       int dec = 0, last_d;

                       while (bi_n > 0) {
                           last_d = bi_n % 10;
                           dec = dec + (last_d * (int) Math.pow(2, p));
                           p++;
                           bi_n = bi_n / 10;
                       }
                       System.out.println("The decimal form of binary " + num + " is " + dec);
                   }

                   public static void main(String[] args) {
                       binTdec(1010);// enter ur binary digits.(User input also been better)
                   }
               } */


/***        (21)             Decimal to Binary:--             ***/


                               /* public class Alphacodes2 {
                                    public static void decTbin(int dec) {
                                        int num= dec;
                                        int p = 0;
                                        int bin = 0,rem;

                                        while (dec > 0) {
                                            rem = dec % 2;
                                            bin = bin + (rem * (int) Math.pow(10, p));
                                            p++;
                                            dec = dec / 2;
                                        }
                                        System.out.println("The decimal form of binary " + num + " is " + bin);
                                    }

                                    public static void main(String[] args) {
                                        decTbin(10);// enter ur binary digits.(User input also been better)
                                    }
                                }*/

/*** 12.                     Advanced Patterns:--            ***/

/***         (1-2)            Hollow Rectangle:--            ***/


//                                                           * * * * * *
//                                                           *         *
//                                                           *         *
//                                                           * * * * * *

                               /* public class Alphacodes2 {
                                    public static void HollowRect(int tot_rows, int tot_col) {
                                        for (int i = 1; i <= tot_rows; i++) {
                                            for (int j = 1; j <= tot_col; j++) {
                                                if (i == 1 || i == tot_rows || j == 1 || j == tot_col) {  // Boundary condition
                                                    System.out.print("*");
                                                } else {
                                                    System.out.print(" ");
                                                }
                                            }
                                            System.out.println();
                                        }
                                    }

                                    public static void main(String[] args) {
                                        HollowRect(4, 5);      //Better in this way cause changing values after each run becomes easy.
                                        HollowRect(10,7);
                                    }
                                }  */

/***           (3)            Inverted & Rotated Half-Pyramid:--            ***/

//                                                                     *
//                                                                   * *
//                                                                 * * *
//                                                               * * * *


                                /* class Alphacodes2 {                                         //Rough work
                                  public static void main(String[] args) {
                                   int line,i,n=5; // i=0; not reqd.
                                    for (line = 1; line <= n; line++) {
                                        for (i=1;i>=1;i--) {         // with this logic:No print fr 1,1*for line= 2,2* for line=3and so on.
                                              if(line==i)                       //  System.out.print(i);
                                            System.out.print("*");             // Design changes for * pattern.(pv one).when i = line; i <= 5; i++
                                            else
                                            System.out.print(" ");            // not working even on interchanging * & " ".
                                           }
                                            System.out.println();
                                        }}}*/


                                //  (WITHOUT FUNCTION)

                            /*    class Alphacodes2 {
                                    public static void main(String[] args) {
                                        int i, n = 5;         // AND NOW ON:-- line=i; and next vari. j or k.Moreover: eikhane 1bar j declare kre dile mite jai.
                                        for (i = 1; i <= n; i++) {
                                            for (int j = 1; j <= n - i; j++) {  // for spaces
                                                System.out.print(" ");
                                            }
                                            for (int j = 1; j <= i; j++) {  // How is it possible redeclaring & reinitializing same vari.can also give diff variable like 'k'.
                                                System.out.print("*");  // this 'j' is diff.(of diff scope).will work for double j; also.
//                                                  System.out.print(j);  also try.It give:    1
//                                                                                           1 2
//                                                                                         1 2 3
//                                                                                       1 2 3 4
                                            }
                                            System.out.println();
                                        }
                                    }
                                }       */                // Also see: https://www.codingninjas.com/studio/library/inverted-half-pyramid.



/***          (4).       Inverted Half_Pyramid of NUMBERS  :              ***/

//                                                                 1 2 3 4 5
//                                                                 1 2 3 4
//                                                                 1 2 3
//                                                                 1 2                 (Ignore the spacing)
//                                                                 1



/*public class Alphacodes2 {
    public static void Numbers(int n){
        for(int i =1;i<=n;i++){
            for(int j=1;j<=n-i+1;j++){                    // <=n-i korle n er jonno pattern will continue till (n-1).
                                                                  //            for(int j=i;j<=n;j++){ // will give:  1 2 3 4 5
                                                                  //                                                  2 3 4 5
                                                                  //                                                  3 4 5
                                                                  //                                                  4 5
                                                                  //                                                  5

                System.out.print(" "+j);   // looks better due to " ".
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Numbers(5);
    }
}*/


/***         ( 5 )       Floyd's Triangle: (already done.Line: 309-320)            ***/


//                                     A                              1
//                                     B C                            2 3     (Floyd's Triangle)
//                                     D E F         similar to       4 5 6
//                                     G H I J                        7 8 9 10



/***     (6)        0-1 TRIANGLE:          ***/

//                                       1
//                                       0 1
//                                       1 0 1
//                                       0 1 0 1
//                                       1 0 1 0 1


 /*public class Alphacodes2 {

     public static void zero_one_triangle(int n) {
         for (int i = 1; i <= n; i++) {
             for (int j = 1; j <= i; j++) {
                 if ((i + j) % 2 == 0) {
                     System.out.print(" 1");  // "" er dorkar nei.normal 1 & 0 hleo hbe.then " "+1/0.
                 } else {
                     System.out.print(" 0");
                 }
             }
             System.out.println();
         }
     }

     public static void main(String[] args) {
         zero_one_triangle(5);
     }
 }*/


/***         (7)        BUTTERFLY PATTERN:--             ***/

                            /*    public class Alphacodes2 {
                                    public static void zero_one_triangle(int n) {
                                        for (int i = 1; i <= n; i++) {               //   (1st-Half)
                                            for (int j = 1; j <= i; j++) {           // for *
                                                System.out.print("*"); // repeat this same printing style in next half also except space:MAGIC(" *":logic:couldnt fig.out)
                                            }
                                            for (int j = 1; j <= 2*(n - i); j++) {   // for space
                                                System.out.print(" ");
                                            }
                                            for (int j = 1; j <= i; j++) {           //  for *
                                                System.out.print("*");
                                            }
                                            System.out.println();
                                        }

                                        for (int i = n; i >= 1; i--) {                // wht if n>=i or n>=1 ?   //  (2nd-Half)
                                            for (int j = 1; j <= i; j++) {
                                                System.out.print("*");                  // for *
                                            }
                                            for (int j = 1; j <= 2 * (n - i); j++) {    // for space
                                                System.out.print(" ");
                                            }
                                            for (int j = 1; j <= i; j++) {              // for *
                                                System.out.print("*");
                                            }
                                            System.out.println();
                                        }

                                    }

                                    public static void main(String[] args) {
                                        zero_one_triangle(4);
                                        zero_one_triangle(5);
                                    }
                                }  */


/***          (8)           SOLID  ROHOMBUS  Pattern:--              ***/

//
//                                                * * * * *
//                                              * * * * *
//                                            * * * * *
//                                          * * * * *
//                                        * * * * *

                             /*   public class Alphacodes2 {
                                                                                  // class e kono var. declaration hoi na.
                                    public static void Rhombus(int n) {
                                        //int i;      not bringing any reqd chng.
                                        for (int i = 1; i <= n; i++) {
                                            for (int j = 1; j <= n - i; j++) {
                                                System.out.print(" ");
                                               // i=i++;  don't knw.wherever u write its unreachable stmnt.
                                            }
                                            for (int j = 1; j <= n; j++) {      //  j <= i.Try it.
                                                System.out.print("*");
                                            }
                                            System.out.println();
                                        }
                                    }

                                    public static void main(String[] args) {
                                        Rhombus(5);
                                    }
                                }  */


/***        (9)         HOLLOW RHOMBUS Pattern :--          * * * * *                   ***/
//                                                        *       *
//                                                      *       *       (It's struct follows a geometry(matrix form) and not just any random rhombus drawn)
//                                                    *       *
//                                                  * * * * *


                             /*   public class Alphacodes2 {


                                    public static void HollowRhombus(int n) {                 //n=rows=coloumns.The what abt Parallelogram?...
                                        for (int i = 1; i <= n; i++) {
                                            for (int j = 1; j <= n - i; j++) {
                                                System.out.print(" ");
                                            }
                                            for (int j = 1; j <= n; j++)
                                                if (i == 1 || i == n || j == 1 || j == n) {    // Boundary Condition
                                                    System.out.print("*");
                                                } else {
                                                    System.out.print(" ");
                                                }
                                            System.out.println();
                                        }

                                    }


                                    public static void main(String[] args) {
                                        HollowRhombus(4);   // All sides same so only 1 variable passed.
                                    }
                                } */


                         //   For PARALLELOGRAM (SOLID)  //       SELF (Logic of combo of: hollow rect(row,col part) + solid rhombus)


                              /*  public class Alphacodes2 {
                                    public static void SolidParall(int rows, int col) {      //not just only n but rows & colomns...
                                        for (int i = 1; i <= rows; i++) {
                                            for (int j = 1; j <= col - i; j++) {             // col from rect and col-i logic from rhombus.
                                                System.out.print(" ");
                                            }
                                            for (int j = 1; j <= col; j++) {
                                                System.out.print("*");
                                            }
                                            System.out.println();
                                        }
                                    }

                                    public static void main(String[] args) {
                                        SolidParall(5, 10);
                                    }
                                } */


                           //  For PARALLELOGRAM (HOLLOW)  //       SELF  (Logic of combo of: hollow rect(row,col part) + Solid/Hollow Rhombus)


                               /*  public class Alphacodes2 {
                                    public static void HollowParall(int rows,int col) {
                                        for (int i = 1; i <= rows; i++) {
                                            for (int j = 1; j <= col - i; j++) {
                                                System.out.print(" ");            // from hollow or solid rhombus(col-i) & col itself is from rect part.
                                            }
                                            for (int j = 1; j <= col; j++) {     // from hollow rect.(also tried instead of col,row dite..)
                                                //for (int i = 1; i <= tot_rows; i++) {
                                                //  for (int j = 1; j <= tot_col; j++) {
                                                if (i == 1 || i == rows || j == 1 || j == col) {  // Boundary condition
                                                    System.out.print("*");
                                                } else {
                                                    System.out.print(" ");
                                                }
                                            }
                                            System.out.println();
                                        }
                                    }


                                    public static void main(String[] args) {
                                        HollowParall(5,10);
                                    }
                                } */


/***          (10)      DIAMOND Pattern:--        ***/
//                                                         *
//                                                       * * *
//                                                     * * * * *
//                                                   * * * * * * *
//                                                   * * * * * * *
//                                                     * * * * *
//                                                       * * *
//                                                         *

/*  public class Alphacodes2 {

    public static void Diamond(int n){
        for(int i=1;i<=n;i++){                    // 1st-Half
            for(int j=n-i;j>=0;j--){              // or, j=1;j<=n-i;j++ Same(DIDI)
                System.out.print(" ");
            }
            for(int k =1;k<=(2*i-1);k++){
                System.out.print("*");
            }
//            for(int j=n-i;j>=0;j--){           // NO Offence but not reqd.
//                System.out.print(" ");
//            }
            System.out.println();
        }

        for(int i=n;i>=1;i--){                    // 2nd-Half
            for(int j=n-i;j>=0;j--){
                System.out.print(" ");
            }
            for(int k =1;k<=(2*i-1);k++){
                System.out.print("*");
            }
//            for(int j=n-i;j>=0;j--){           //  NO Offence but not reqd.
//                System.out.print(" ");
//            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Diamond(4);
    }
} */


                                 /***                BONUS LIVE CLASS          ***/

                                 // (1)          Number Pyramid:        1
                                 //                                    2 2
                                 //                                   3 3 3
                                 //                                  4 4 4 4
                                 //                                 5 5 5 5 5
 /*  public class Alphacodes2 {

      public static void Number(int n) {
          for (int i = 1; i <= n; i++) {
              for (int j = 1; j <= n - i; j++) { // For spaces
                  System.out.print(" ");
              }
              for (int k = 1; k <= i; k++) {    // For numbers.     //U cant do: (int k = i; k <= i; k++)  or (int k = i; k >= i; k--).Try and see.
                  System.out.print(i + " ");
              }
              System.out.println();
          }
                                                                    //for ( k = 1; k <= 9; k++) {
                                                                   //        if ((i + k) % 2 == 0) {
                                                                  //             for (int l = 1; l >= i; l--) {
                                                                 //             System.out.print(l);          (This logic with rows+colomns should work but knw how..)
                                                                 //                 }
                                                                 //                    } else {
                                                                 //                 System.out.print(" ");}

      }


    public static void main(String[] args) {
        Number(5);
    }
  } */



                        // (2).     PALINDROMIC Pattern with numbers:--             1
                       //                                                         2 1 2
                       //                                                       3 2 1 2 3
                       //                                                     4 3 2 1 2 3 4
                       //                                                   5 4 3 2 1 2 3 4 5


                                /*  public class Alphacodes2 {

                                     public static void PalindromeNumber(int n) {
                                         for (int i = 1; i <= n; i++) {
                                             for (int j = 1; j <= n - i; j++) { // For spaces
                                                 System.out.print("  ");        // just for good look double space is used & single space with k & l.
                                             }
                                             for (int k = i; k >= 1; k--) {   // For descending
                                                 System.out.print(k+ " ");
                                             }
                                             for (int l = 2; l <= i; l++) {   // For ascending
                                                 System.out.print(l+ " ");
                                             }
                                             System.out.println();
                                         }
                                     }

                                     public static void main(String[] args) {
                                         PalindromeNumber(5);
                                     }
                                 } */



                   /***            ----------------------END OF BASIC JAVA AND CODING----------------------

                                       NEXT   MODULE IS FROM  13: ARRAYS & BASIC DSA  ON Alphacodes3.                  ***/


                   //  NOTE:-- Intellij replace C with J if the source file is not under a defined src folder or if the file is too big.
                   //                        & another thing: do not need to give.java extension with class name.