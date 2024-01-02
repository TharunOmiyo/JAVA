import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Demo{

  public void showList(){
    ArrayList<ArrayList<Integer>> list=new ArrayList<>();
   Scanner in=new Scanner(System.in);
    System.out.println(new ArrayList<>());
    for(int i=0;i<3;i++){
      list.add( new ArrayList<>());
    }
    for(int i=0;i<3;i++){
for(int j=0;j<3;j++){

  list.get(i).add(in.nextInt());
}
list.get(i).add(10);

    
  }
  System.out.println(list);
}
  public static void main(String[] args){
    Demo obj=new Demo();
    obj.showList();
//     String obj="A";
//     Demo[] a=new Demo[4];
//     for(int i=0;i<4;i++){
//      a[i]=new Demo();
//     }
//     int[] arr=new int[5];
//     System.out.println(arr);
//     System.out.println(obj);
//     StringBuffer sb=new StringBuffer("Hello");
//     StringBuffer sb1=sb;
//     sb1.append(" World");
//     int ab=10;
//     int ac=10;
//     System.out.println((ab+""+ac) instanceof String);
//     System.out.println((sb+""+sb1) instanceof String);
// Scanner in=new Scanner(System.in);
// System.out.println((float)('a'+1));
//     int[][] arr1=new int[3][3];
//     for(int row=0;row<arr1.length;row++){
//       for(int col=0;col<arr1[row].length;col++){
// arr1[row][col]=in.nextInt();
//       }
//     }
//     // for(int i=0;i<arr1.length;i++){
//     //   for
//     // }
//     for(int[] ar:arr1){
//       for(int abc:ar){
//         System.out.println("ARRAY"+abc);
//       }
//     }
//     for(int i=0;i<arr1.length;i++){
//       for(int j=0;j<arr1[i].length;j++){
// System.out.print(arr1[i][j] +" ");
//       }
//       System.out.println("\n");
//     }
//     // System.out.println(Arrays.toString(arr1));
//     System.out.println(("Tharun"+arr1) instanceof String);
//     for(int[] n:arr1){
// System.out.println(Arrays.toString(n));
// }
// ArrayList<Integer> list=new ArrayList<>(10);
// System.out.println("size"+list.size());
// for(int i=0;i<10;i++){
//   list.add(in.nextInt());
// }
// for(int i=0;i<10;i++){

//   System.out.println(list.get(i));
// }
  }
}