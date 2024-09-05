import java.util.Scanner;
public class primeornot {
    public static void main(String[] args){
        System.out.println("Enter the number");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int flag=0;
        
            for(int i=2;i<n/2;i++){
                if(n%i==0 || n%2==0){
                    flag=1;
                }

            }
       
        if(flag==1){
            System.out.println("Not a prime number");
        }
     

        else{
            System.out.println("prime number");
        }

    }

}
