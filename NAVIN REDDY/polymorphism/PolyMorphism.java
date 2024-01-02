// class Object{
//   public Object(){
//      System.out.println("IT IS IN OBJECT class Constructor");
//   }
// }
class A {
  public A(){
    // super();
    // Object ob=new Object();
    // System.out.println(ob);
    System.out.println("IT IS IN A Constructor");
  }
  public void show1(){
    System.out.println("ITS A SHOW");
  }
}
class B extends A{
  public B(){
    System.out.println("IT IS IN B Constructor");
  }
  public void show1(){
    System.out.println("ITS B SHOW");
  }
}

public class PolyMorphism extends Object{
  public static void main(String[] args){
    		System.out.println("Number of Command Line Argument = "+args.length);
		
		// for(int i = 0; i< args.length; i++) {
		// 	System.out.println(String.format("Command Line Argument %d is %s", i, args[i]));
		// }
    // B B=  new B();
    // A A=  new A();
    A a=new B();
    a.show1();
    

    // a.show2()  We dont have access to child methods 
    // If it do method overriding then only it will access to child class method which are present in the parent
    // B.show1();
    // B.show1();
    // A.show1();
    int num=10;
    Integer num1=num;//Auto-boxing
    int num2=num1;//Auto-unBoxing
    String str="2";
    int n=Integer.parseInt(str);

    System.out.println(num2);
    System.out.println(str);
    System.out.println(n);
    System.out.println(a);
    System.out.println(num+","+num1+","+num2);

  }

}