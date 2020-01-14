import java.util.*;
public class Fact{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int p=factorial(n);
        System.out.println(p);
    }
 static int factorial(int n){
        if(n==1){
            return 1;
        }
        else return n*factorial(n-1);
        
    }
}
