import java.util.Scanner;

public class StringPalindrome {
    public static void main(String args[]){
        Scanner sc =new Scanner(System.in);
        String input=sc.nextLine();
        String reverse="";
        for(int i=input.length()-1;i<=0;i--){
            reverse+=input.charAt(i);
        }
        if(input.equals(reverse)){
            System.out.println("It is a palindrome");
        }
        else{
            System.out.println("It is not a palindrome");
        }
    }
}
