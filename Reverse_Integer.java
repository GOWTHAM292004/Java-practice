import java.util.Scanner;
public class Reverse_Integer {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the Integer : ");
        int input=sc.nextInt();
        int reverse=0;
        while(input>0){
            int digit=input%10;
            reverse=reverse*10+digit;
            input=input/10;
        }
        System.out.println("Reversed number : "+reverse);    
    }
}
