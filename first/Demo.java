class Calculator{
  int num1,num2;
  public int add(int n1,int n2){
    this.num1=n1;
    this.num2=n2;
    return this.num1+this.num2 ;
  }
}

public class Demo{
  public static void main(String args[]){
    int num1=10;
    int num2=20;
    Calculator calc=new Calculator();
    int result=calc.add(num1,num2);
    System.out.println("This is Result :"+ result);
  }
}