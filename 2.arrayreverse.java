import java.util.*;
class arrayreverse{
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6,7,8};
       
       reverse(arr);
    }
    public static void reverse(int arr[]){
    int reverse[]=new int[arr.length];
    System.out.println("reverse an array");
    for (int i=0;i<arr.length;i++){
       reverse[i]=arr[arr.length-i-1];
    }
    
    System.out.println(Arrays.toString(reverse));
    }
}
