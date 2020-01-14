import java.util.*;
public class HelloWorld{

     public static void main(String []args){
     
        
         Scanner sc=new Scanner(System.in);
         int n=sc.nextInt();
         if(isPlindrome(n)){
             System.out.println("Palindrome");
         }
         else{
             System.out.println("Not palindrome");
         }
         
         
     }
    public static boolean isPlindrome(int n){
        int sum=0,r,temp=n;
        while(n>0){
            r=n%10;
            sum=(sum*10)+r;
            n=n/10;
        }
        if(temp==sum){
            return true;
        }
        return false;
    }    
}
