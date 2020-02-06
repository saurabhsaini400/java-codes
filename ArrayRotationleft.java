import java.util.*;
public class Student{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        for(int j=0;j<1;j++){
            int temp=a[0];
        for(int i=1;i<a.length;i++){
            
            a[i-1]=a[i];
           
        }
         a[a.length-1]=temp;
        }
        System.out.println();
        for(int i=0;i<a.length;i++){
            System.out.println(a[i]);
        }

    }
}
