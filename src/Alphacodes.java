import java.lang.String;
import java.util.Scanner;


 // public class Alphacodes {

    // 1.      LEAP YEAR.


    //int main()        // code e run er option asbe na if tried with int main() like C Lang.
    /*public static void main(String args[]){    // without String args code was not runnable.IDE gives no option to run.
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the year: ");
        int year=sc.nextInt();

        if (((year % 4 == 0) && (year % 100!= 0)) || (year%400 == 0)) {  //Convention for year=4000 is not solved.Others are fine.
            System.out.println("is a leap year");
        }
        else {
            System.out.println("is not a leap year");                    //Check GFG for detailed support.
        }
        //return 0;
    } */



    //2.          Code to check mainly which if has its else.(ELIGIBILITY FOR VOTE).All=independent

   /* public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the age: ");
        int age=sc.nextInt();
        if(age>=18){
            System.out.println("Adult:drive,vote");   // as per my exp. the lines"|" indicates the flow of control.i think...
        }
           if(age>13&&age<18) {
             System.out.println("Teenager");
           }
           else {
               System.out.println("Not adult");
            }

    } */



    //3.       GREATEST OF 2 NOS(know).


    //4.GREATEST OF 3 NOS.


  /*  public static void main(String[] args)
    {

  // This code doesn't checks for equality of 3 nos.For details visit:
 https://www.javatpoint.com/java-program-to-find-largest-of-three-numbers
 https://www.geeksforgeeks.org/java-program-to-find-the-largest-of-three-numbers/  (using function)
 https://www.programiz.com/java-programming/examples/largest-number-three (diff approach)
  MUG UP ANY ONE.

        int a=40, b=78, c=19;
//comparing numbers, a with b and a with c
//if both conditions are true, prints a
        if(a>=b && a>=c)
            System.out.println(a+" is the largest Number");
//comparing b with a and b with c
//if both conditions are true, prints b
        else if (b>=a && b>=c)
            System.out.println(b+" is the largest Number");
        else
//prints c if the above conditions are false
            System.out.println(c+" is the largest number");
    } */



    //5.           EVEN ODD (Normal=u knw).

    //Refer to:javatpoint(to print range of numbers),GFG(for advanced approach-bitwise approach),Programiz(for new approach)




    //6.          CALCULATION OF INCOME TAX(full code in copy).

   /* public static void main(String args[]) {
        int t=10000;
        int tax= t * 20/100;
                  // int tax2= t * 0.3; // This will show error and requires typecasting to int.
        System.out.println(tax);*/


    //7.ALPHA CODE FOR: LARGEST OF 3 NOS.
    /*public static void main(String args[]) {
        int a = 1, b = 2, c = 6;
        if ((a >= b) && (a >= c)) {
            System.out.println("a is the largest Number");
        } else if (b >= c) {      // imagined: if b>=a.if imagined c>=a println c then else println b.
            System.out.println("b is the largest Number");
        } else {
            System.out.println("c is the largest Number");
        }
    }*/



    //8.TERNARY OPERATOR


    /*public static void main(String[] args){
        int n= 5;                                  //9. other sample codes:check if a student passed(>=33) or failed(<33).
        String type=((n%2==0) ? "Even": "Odd" );
        System.out.println(type);
    }*/



    //10.switch statemnt(self-explore)


    //11.Calculator(a normal one using switch-case)


   /* public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("enter value of a: ");
            int a = sc.nextInt();
            System.out.println("enter value of b: ");
            int b = sc.nextInt();
            System.out.println("enter operation to be performed: ");
            char ch = sc.next().charAt(0);  //Doubt:  how to take single charecter input in java? and why sc.nextLine.charAt(0) not showing error?
            switch (ch) {

                case '+':
                    System.out.println(a + b);
                    break;
                case '-':
                    System.out.println(a - b);
                    break;
                case '*':
                    System.out.println(a * b);
                    break;
                case '/':
                    System.out.println(a / b);
                    break;
                case '%':
                    System.out.println(a % b);  //er por break jodi na dii:operation i/p:%.o/p:mod valeu and then wrong choice,0 return,code exit.
                    break;
                default:
                    System.out.println("Wrong Choice!");  // what will be the code if i want to start again counting after displaying wrong choice?
                    System.exit(0);

            }
        }
    }  */
//}