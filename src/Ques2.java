//Swap two numbers without the use of third variable.


import java.util.Scanner;

public class Ques2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter 2 numbers:");
        int a=sc.nextInt();
        int b=sc.nextInt();
        a=a^b;
        b=a^b;
        a=a^b;      //numbers swapped using bitwise operator
        System.out.println(a+" "+b);
    }
}
