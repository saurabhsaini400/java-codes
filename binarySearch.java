import java.util.*;
public class Searching{

     public static void main(String []args){
     Scanner sc=new Scanner(System.in);
     int arr[]={2,3,4,6,8,0};
     int result=binary(arr,0,arr.length-1,4);
     if(result==-1){
         System.out.println("Not found");
     }
     else{
         System.out.println("found at pos:"+(result+1));
     }
     
     }
     public static int binary(int[] arr,int first,int last,int key){
        
         if(last>=first){
              int mid=(first+last)/2;
              if(arr[mid]==key){
                  return mid;
              }
              if(arr[mid]<key){
                 return binary(arr,mid+1,last,key);
              }
              else{
                  return binary(arr,mid-1,last,key);
              }
         }
         return -1;
             
         }
     }
