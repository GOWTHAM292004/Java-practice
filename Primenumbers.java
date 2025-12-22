import java.util.Scanner;
public class Primenumbers {
    public static void main (String args[]){
        Scanner sc=new Scanner(System.in);
        int first=sc.nextInt();
        int last=sc.nextInt();
        for (int i=first;i<=last;i++){
            boolean prime=true;
            for(int j=2;j<i;j++){
                if(i%j==0){
                    prime=false;
                    break;
                }
            }
            if(prime==true){
                System.out.print(i+" ");
            }
        }
    }
}

