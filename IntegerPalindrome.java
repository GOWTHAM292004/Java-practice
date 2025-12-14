import java.util.Scanner;

public class IntegerPalindrome {
    public static void main (String args[]){
        Scanner sc=new Scanner(System.in);
        int input=sc.nextInt();
        int dummy=input;
        int reverse=0;
        while(input>0){
            int digit=input%10;
            reverse=reverse*10+digit;
            input=input/10;
        }
        if(reverse==dummy){
            System.out.println("It is a Palindrome");
        }
        else{
            System.out.println("It is not a Palindrome");
        }
    }
}
