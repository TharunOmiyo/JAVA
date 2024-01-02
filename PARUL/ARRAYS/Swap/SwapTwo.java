// package Swap;

import java.util.Arrays;

public class SwapTwo {

  public void show(){
int[] arr={1,3,20,90,10};
System.out.println(arr[2]);
swap(arr,2,4);
System.out.println(Arrays.toString(arr));

System.out.println("Maximum number in array is :"+maximum(arr));
  }
 private static void swap(int[] arr,int i,int j ){
int temp=arr[i];
 arr[i]=arr[j];
 arr[j]=temp;
  
}
  static int maximum(int[] numb){
    // int[] numb={56,78,23,405,90}; 
    int max=numb[0];
    for(int i=1;i<numb.length;i++){
if(max<numb[i]){
  max=numb[i];
}
}
return max;
    // System.out.println("Maximum number in array is : "+max);
  }
  
  public static void main(String[] args){
SwapTwo obj=new SwapTwo();
obj.show();
// obj.maximum();

  }
}
