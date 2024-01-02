class A{
   private String toString(String a){
    System.out.println(a);
    return a;
  }
  public String toString(){
    System.out.println("To STRING");
    A a=new A();
    a.toString("Omiyo");
    return "Tharun";
  }
}
class B extends A{
  public void show(){
    System.out.println("Showing from B");
  }
}
abstract class Car{
  public  abstract void drive();
  public  abstract void dance();
  public void sitting(){
 System.out.println("Sitting in the car");
  }
}
abstract class Bus extends Car{
  public void travel(){
    System.out.println("Travel with bus");
  }
//    public void drive(){
//    System.out.println("Driving");
//  }
   public void dance(){
   System.out.println("Dancing in Bus");
 }
  public abstract void employee();
}
 class Bike extends Bus{
  public void drive(){
   System.out.println("Driving");
 }
  public void employee(){
   System.out.println("Empolyee in Car");
 }
   public void dance(){
   System.out.println("Dancing On Bike");
 }
}
public class Abstract{

  public String toString(){
    System.out.println("To STRING");
    return "Tharun";
  }
  private String toString(String a){
    System.out.println(a);
    return a;
  }
  public static void main(String[] args){
    Abstract abs=new Abstract();
    abs.toString();
    abs.toString("Tharun");
    A a=new B();
    a.toString();
    // a.toString("Omiyo");
    Car B=new Bike();
    B.drive();
    B.dance();
    B.sitting();
    // B.employee();
// a.showing();
    

  }
}