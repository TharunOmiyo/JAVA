import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.lang.Exception;
class TharunOmiyoException extends Exception{
  public TharunOmiyoException(String str){
    super(str);
  }

}
class D extends C{
public D(){
  super();
}
}
class C  {
  public C(){

    try {
      Class.forName("Demo");
    } catch (ClassNotFoundException e) {
      // TODO Auto-generated catch block
      e.printStackTrace();
    }
    System.out.println("Hello From C");
  }
}
class B{
  public void show() throws ClassNotFoundException{
    Class.forName("B");
  }
}
class A {
  int i=20;
  int j=0;
  {

    System.out.println("Its is  global i : in line 7 "+i);
  }
  String name="Tharun";
  public void display(){
    //  int i=0;
    try {
      int[] myNumbers = {1, 2, 3};
//       for(int i=0;i<name.length();i++){
// System.out.println(name.charAt(i));
// System.out.println("Its is local i : "+i);

//       }
       System.out.println("Its is  global i : "+i);
      j=18/i;
            throw new TharunOmiyoException("I am Calling Tharun Exception");
      // throw new ArithmeticException("There is an error");
      // System.out.println(myNumbers[10]);
    } 
    catch(ArithmeticException e){
      j=18/1;


    }
    catch(ArrayIndexOutOfBoundsException e){
System.out.println("Some Array Problem : "+ e);
    }
    catch(TharunOmiyoException e){
    System.out.println("Something went wrong : "+ e);
    } 
    catch (Exception e) {
      System.out.println("Something went wrong : "+ e);
    }
      System.out.println(j);
    System.out.println("Exception ended");
}

{
   System.out.println("Hello "+i);

    System.out.println("Its is  global i : "+i);
  }

}
// class B{

// }
public class myException   {
  public static void  main(String[] args){
    System.out.println("Hello");
A obj=new A();
obj.display();
B obj1=new B();
try {
  obj1.show();
} catch (ClassNotFoundException e) {
  // TODO Auto-generated catch block
  e.printStackTrace();
  System.out.println();
}
   D obj3=new D();
   InputStreamReader in=new InputStreamReader(System.in);
BufferedReader br=new BufferedReader(in);
 
  }
}