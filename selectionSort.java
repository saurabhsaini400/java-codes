import java.util.*;
public class SelectionSort{

     public static void main(String []args){
         Scanner sc=new Scanner(System.in);
         int n=sc.nextInt();
        int []arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        //selection sort
        for(int i=0;i<n-1;i++){
            int minIndex=i;
            for(int j=i+1;j<n;j++){
                if(arr[j]<arr[minIndex]){
                    minIndex=j;
                }
            }
            int small=arr[minIndex];
            arr[minIndex]=arr[i];
            arr[i]=small;
        }
        //sorted array
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
            
        }
     }
}
