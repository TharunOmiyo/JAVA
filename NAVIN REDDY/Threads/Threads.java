import java.util.ArrayList;
import java.util.HashSet;
// import java.util.Collection;
import java.util.List;
import java.util.Set;

class A implements Runnable{
  public synchronized void run(){
    System.out.println("I am Running Thread");
    for(int i=0;i<=10;i++){
      System.out.println("Hi--"+i);
    }
  }
}
class B  implements Runnable {
  public synchronized void run(){
    System.out.println("I am Running Thread");
    for(int i=0;i<=10;i++){
      System.out.println("Hello--"+i);
    }
  }
}
class Threads{
  static{
    System.out.println("Hello from Threads");
  }
  public static void main(String[] args) throws InterruptedException{
  //   Runnable a=()->{
  //   System.out.println("I am Running Thread");
  //   for(int i=0;i<=10;i++){
  //     System.out.println("Hi--"+i);
  //   }
  // };
  //   Runnable b=()->{
  //   System.out.println("I am Running Thread");
  //   for(int i=0;i<=10;i++){
  //     System.out.println("Hello--"+i);
  //   }
  
    // };
    Runnable a=new A();
    Runnable b=new B();
   Thread t1=new Thread(a);
   Thread t2=new Thread(b);
   t1.start();
   try {
    Thread.sleep(10);
  } catch (InterruptedException e) {
  
    e.printStackTrace();
  }
   t2.start();

   t1.join();
   t2.join();

   List<Integer> nums=new ArrayList<>();
   nums.add(10);
   nums.add(20);
   nums.add(100);
   nums.add(15);
  //  nums.add("15");
   System.out.println(nums);
   for(int i=0;i<nums.size();i++){
    System.out.println(nums.get(i));
   }
    System.out.println("Sets");
   Set<Integer> set=new HashSet<>() ;
   set.add(100);
   set.add(25);
   set.add(13);
   set.add(150);
   set.add(10);
   for(Object n:set){
    System.out.println(n);
   }
   }
  }
