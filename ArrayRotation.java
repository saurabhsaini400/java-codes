import java.util.*;
public class Student{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        for(int j=0;j<3;j++){
            int temp=a[a.length-1];
        for(int i=a.length-1;i>0;i--){
            
            a[i]=a[i-1];
           
        }
         a[0]=temp;
        }
        System.out.println();
        for(int i=0;i<a.length;i++){
            System.out.println(a[i]);
        }

    }
}
