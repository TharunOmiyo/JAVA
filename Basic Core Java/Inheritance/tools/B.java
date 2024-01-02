package tools;

public class B extends A {

  public void add(int a){
    System.out.println(a);
  }
  public void add(int a,int b){
    System.out.println(a);
  }

  public void show(){
    System.out.println("Price : "+ price +" Marks:" + marks + "  total :" + total);
  }
  public static void main(String[] args){
    B obj=new B();
    obj.marks=800;
    obj.show();
  }
}
