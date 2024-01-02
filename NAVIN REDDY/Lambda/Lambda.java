@FunctionalInterface
interface A{
  int show(int i);
}
public  class Lambda{
  public static void main(String[] args) {
A obj=a->{
  System.out.println("Hello");
  return a;
};
  

int result=obj.show(10);
obj.show(20);
System.out.println(result);
  }
}
