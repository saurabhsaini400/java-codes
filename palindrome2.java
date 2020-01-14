import java.util.*;
public class Palin{
    public static void main(String areg[]){
        String rev="",p;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number to check for palindrome");
        p=sc.nextLine();
        int l=p.length();
        for(int i=l-1;i>=0;i--){
            rev=rev+p.charAt(i);
            
        }
        if(p.equals(rev)){
            System.out.println("Palindrome");
        }
        else{
            System.out.println("Not palindrome");
        }
    }
}
