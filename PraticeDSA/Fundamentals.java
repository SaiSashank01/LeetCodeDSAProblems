package PraticeDSA;
import java.util.*;
public class Fundamentals {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(n == 2 || n%2==0){
            System.out.println("YES it is even");
        }else{
            System.out.println("NO it is odd");
        }
    }
}
