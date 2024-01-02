package others;
import tools.A;
import tools.B;
class Other extends A{

public void show(){
  System.out.println("MARKS OF :"+ marks);
}
}
public class AccessModifier {
  

  public static void main(String[ ] args){

    A obj=new A();
    obj.show();
    obj.total=1000;
    obj.show();
   
    B obj1=new B();
    // obj1.marks=800;

    obj1.show();
  Other o=new Other();
  o.show();
  System.out.println(o.total);
  AccessModifier acc=new AccessModifier();
  System.out.println(acc.toString());
    
  }
}
