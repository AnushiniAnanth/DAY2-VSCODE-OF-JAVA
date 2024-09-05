import java.util.Scanner;
public class swap {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the two numbers:");
        int a=sc.nextInt();
        int b=sc.nextInt();
      int temp;
        temp=a;
        a=b;
      b=temp;
        
        System.out.println("The swapping numbers are "+ a+","+b);
    }

}
