import java.util.*;
public class Arm{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
       int p,rev,sum=0;
       int temp=n;
       while(n>0){
           rev=n%10;
           sum=sum+rev*rev*rev;
           n=n/10;
       }
       if(sum==temp){
           System.out.println("Armstrong");
       }
       else{
           System.out.println("Not Armstrong");
       }
    }
}
