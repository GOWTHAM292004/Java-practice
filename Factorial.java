import java.util.Scanner;
public class Factorial {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=1;
        for (int i=a;a>=1;i--){
            b*=a;
            a--;
        }
        System.out.println(b);
    }
}
