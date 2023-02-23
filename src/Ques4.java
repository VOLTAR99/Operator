//Assign values of variables 'a' and 'b' as 55 and 70 respectively and then check if:

public class Ques4 {
    public static void main(String[] args) {
        int a=55;
        int b=70;
        if(a<50 && a<b){
            System.out.println("1.True");
        }
        else {
            System.out.println("1.False");
        }

        if (a<50 || a<b) {
            System.out.println("2.True");
        }
        else {
            System.out.println("2.False");
        }
    }
}
