import java.util.Arrays;

class C {
  int[] a=new int[5];
  String ab=new String();
  public C(){
    System.out.println("COnstructor C");
  }

}
class Demo extends C{
  public Demo(){
     this(10);
    System.out.println("In Demo Constructor");
  }
  public Demo(int a){
    // this();
    System.out.println("Parameter Constructor");
  }

  public static void main(String[] args) {

Demo obj=new Demo();
// obj.display();
// obj1.show(10,20,30);
int[] a=new int[]{10,20,30};
System.out.println(Arrays.toString(a) instanceof String);

  }

}