import java.util.Scanner;
public class Primenumbers {
    public static void main (String args[]){
        Scanner sc=new Scanner(System.in);
        int input=sc.nextInt();
        for(int i=2;i<=input;i++){
            for(int j=1;j<i;j++){
                if(j%i==0){
                    System.out.print(i+",");
                    break;
                }
            }
        }
    }
}
