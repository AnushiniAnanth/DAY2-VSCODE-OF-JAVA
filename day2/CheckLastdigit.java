import java.util.Scanner;
public class CheckLastdigit {
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the number :");
        int n=sc.nextInt();
        int lastDigit= n%10;
        if(lastDigit%2==0){
            System.out.println("Even");
        }
        else{
            System.out.println("Odd");
        }
    }

}
