import java.util.Scanner;
public class Factorial {
    public static void main(String[] args){
        System.out.println("Enter the number:");
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int fact=1;
    if(n==0||n==1){
        System.out.println("The factorial is 1");
    }
    else{
        for(int i=2;i<=n;i++){
            fact*=i;

        }
        System.out.println("The factorial is "+fact);
    }
    }
}
