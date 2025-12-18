import java.util.Scanner;
public class StrongNumber {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the Number : ");
        int input=sc.nextInt();
        int duplicate=input;
        int result=0;
        while(input>0){
            int digit=input%10;
            int dummy=1;
            for(int i=1;i<=digit;i++){
                dummy*=i;
            }
            result+=dummy;
            input=input/10;
        }
        // System.out.println(result);
        if(duplicate==result){
            System.out.println("It is a Strong Number");
        }
        else{
            System.out.println("it is Not a Strong Number");
        }
    }
}
