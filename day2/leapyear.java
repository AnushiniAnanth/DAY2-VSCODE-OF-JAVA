import java.util.Scanner;
public class leapyear {
    public static void main(String[] args){
        System.out.println("Enter the number : ");
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    if(n%4==0 && n%100!=0 || n%400==0){
        System.out.println("Its a leap year");
    }
    else{
        System.out.println("Not a leap year");
    }
    }
}
