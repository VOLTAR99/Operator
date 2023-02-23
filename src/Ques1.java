//Write a program to add 8 to the number x and then divide it by 3. Now, the modulus of the quotient
//is taken with 5 and then multiply the resultant value by 5. Display the final result.
import java.util.Scanner;
class A{
    static int result(int x){
        int a=x+8;
        int b=a/3;
        int c=b%5;
        return c*5;
    }
}
public class Ques1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number x:");
        int x=sc.nextInt();
        A obj=new A();
        System.out.println("The final result is:"+obj.result(x));
    }
}
