class A{

   public A(){

    System.out.println("Its is A");
  }
   public A(int a){
    this();
    System.out.println("Its is A with parameter");
  }
}
class B extends A{

   B(){
  
    System.out.println("Its is B");
  }
   B(int a){
    
     super(10);
    
     System.out.println("Its is B with parameter");
  }
}
public class Inhertance{
  public static void main(String[] args){
     Inhertance in=new Inhertance();
     A a=new B(5);

  }
}