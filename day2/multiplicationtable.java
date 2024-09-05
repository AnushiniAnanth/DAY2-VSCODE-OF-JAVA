import java.util.Scanner;
public class multiplicationtable {
    public static void main(String[] args){
        System.out.println("Enter the number:");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=0;i<16;i++){
            System.out.println(i+"x"+n+"="+(i*n));

        }
    }

}
