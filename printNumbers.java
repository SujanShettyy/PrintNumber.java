//print numbers from 1-5
import java.util.Scanner;

public class printNumbers{

    public static void printNumber(int n){
        if(n==0){
            return;
        }
        System.out.println(n);
        printNumber(n-1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int n = sc.nextInt();
        System.out.println("Thanks for entering the number. Here is the Descending Order:");
        printNumber(n);
    }
}
