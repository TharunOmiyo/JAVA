interface Computer{
  void code();
}
class Desktop implements Computer{
   public void code(){
    System.out.println("Code ,Run ,Debug ,Fast");
  }
}
class Laptop implements Computer{
  public void code(){
    System.out.println("Code ,Run ,Debug ,Fast");
  }
}
class Devloper{
  public void appDevlop(Computer lap){
   lap.code();
  }
}
public class Need {
  public static void main(String[] args){
   Devloper dev=new Devloper();    
Computer lap=new Laptop();
Computer desk=new Desktop();
// Computer comput=new /
dev.appDevlop(desk);
  }
  
}
