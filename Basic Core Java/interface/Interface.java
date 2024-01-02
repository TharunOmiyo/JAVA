/**
 * InnerInterface
 */
 interface A {

  int age=22;
  String name="Tharun";
  void show();
   void display();
}
interface C{
void run();
}
interface D extends A,C{

}
@FunctionalInterface
interface E {
  void add();
  
}
interface F  extends E,D{
void sub();
}
class B implements D,F{

  
  public void show() {
    System.out.println("Show Method");
  }

 
  public void display() {
    System.out.println("Display Method");
  }
  public void run() {
    System.out.println("Interface C :RUN Method");
  }
  public void add() {
    System.out.println(" Interface E : ADD Method");
  }


  @Override
  public void sub() {
    // TODO Auto-generated method stub
    System.out.println(" Interface F : SUB Method");
    // throw new UnsupportedOperationException("Unimplemented method 'sub'");
  }

}
public class Interface{
  public static void main(String[] a){

    //Creating Object by using type interface A;
    A obj=new B();
    obj.display();
    obj.show();
    //Creating Object by using type interface D;
    D obj1=new B();
    obj1.run();
    int x=D.age;
    System.out.println(A.age);
    System.out.println(D.name);
     //Creating Object by using type interface E;
    E obj2=new B();
    obj2.add();
    F obj3=new B();
    obj3.sub();
  }
  
  

}