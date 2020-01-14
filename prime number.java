import java.util.*;
public class HelloWorld{

     public static void main(String []args){
     Scanner s=new Scanner(System.in);
     System.out.println("enter a number");
     int n=s.nextInt();
     if(isPrime(n)){
         System.out.println("Prime");
     }
     else{
         System.out.println("Not prime");
     }
    }
    public static boolean isPrime(int n){
        for(int i=2;i<=Math.sqrt(n);i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }
}
