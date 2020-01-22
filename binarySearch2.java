import java.util.*;
public class Searching{

     public static void main(String []args){
    int[] arr={2,4,6,8,9};
    
    int res=Arrays.binarySearch(arr,8);
    if(res<0){
        System.out.println("Not found");
        
    }
    else{
        System.out.println("Found at pos:"+(res+1));
    }
         }
     }
