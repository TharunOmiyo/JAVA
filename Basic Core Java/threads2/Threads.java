abstract class Lambda {
  public void show(){
    
  }

}
public class Threads implements Runnable{
public void run(){
  System.out.println("Thread is running");
}
public static void main(String[] args){
  Threads obj=new Threads();
  Thread t1=new Thread(obj);
  t1.start();
  Lambda obj1=new Lambda(){
    public void show(){
      System.out.println("Lambd");
    }
  };
  obj1.show();
}
}

//-->class name using lower case 
// class threads implements Runnable{
// public void run(){
//   System.out.println("Thread is running");
// }
// public static void main(String[] args){
//   threads obj=new threads();
//   Thread t1=new Thread(obj);
//   t1.start();
// }
// }