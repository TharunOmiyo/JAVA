enum Status{
  Pending,Failed,Running,Success,Not ;
}
public class ENUM{
  public static void main(String[] args){

    Status s=Status.Not;
    System.out.println(s.ordinal());
  }
}