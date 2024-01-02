import java.lang.reflect.Array;
import java.util.Arrays;

abstract class A{
  A(){
    System.out.println("I AM from Abstraction");
  }
  public void show(){

  };
  //Abstraction classes  and Interface doesnt have structure for their methods;
  public abstract void display();
} 

class Abs extends A {

  // int i=10;
  public Abs(){
    int i=20;
  }
  public void show1(){
    // int i=0;
    System.out.println(i);
    System.out.println("I AM from Abs Class");
  }
  public void display(){
    System.out.println("I AM from Abs Public ");
  }

  class One{

  }
  class Two extends One{
  public void show(One obj){
  System.out.println("");
  }
  }
  public int[] display1(){
    int[] a=new int[]{1,2,3,4};
return a;
  }
  public static void main(String[] args){

    Abs obj=new Abs();
    obj.show();
    A obj1=new A() {
      public void display(){
        System.out.println("Hello");
      }

    };
Integer a=10;
 System.out.println(a instanceof Object);
    obj1.display();
    new Abs().display();
    new Abs().display();
    new Abs().display();
     Abs obj3=new Abs();
    //  System.out.println(obj3 instanceof Object);
    //  System.out.println(obj3 instanceof Abs);
    //  One one=new Two();
    //  System.out.println(one instanceof Two);
    Abs.One one=obj3.new Two();
    Integer in=30;
    int abc=20;
    System.out.println(in);
    System.out.println(abc);

    String name="abcdcba";
    char ch[]=name.toCharArray();
    System.err.println(Arrays.toString(name.toCharArray()));
    System.out.println(ch[0]);
    for(int i=0;i<name.size();i++){
      System.out.print(name.charAt(i)+" ");
      int j=20;
      String str=str+name.charAt(i);
    }
// System.out.println(str==name);
System.out.println(j);
  }
  
}