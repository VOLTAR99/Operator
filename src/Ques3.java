//Write a program to calculate the sum of the digits of a 3-digit number.
import java.util.Scanner;
public class Ques3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number:");
        int a=sc.nextInt();
        int b=0;
        while (a>0){
        b+=a%10;
        a/=10;
    }
        System.out.println("sum:"+b);
  }
}
