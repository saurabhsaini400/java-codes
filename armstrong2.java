import java.util.Scanner;
public class Exercise1_4 {
    public static void main(String[] args) {
	   Scanner sc = new Scanner(System.in);
	   int n=sc.nextInt();
           int result=0;
           int length = String.valueOf(n).length();
       int p,rev;
       int temp=n;
       while(n>0){
           rev=n%10;
           result=result+(int)(Math.pow(rev,length));
           n=n/10;
       }
       if(result==temp){
           System.out.print("1");
       }
       else{
           System.out.print("0");
       }
       }
       }
