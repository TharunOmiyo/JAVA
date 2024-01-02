public class Inherit{
  public static void main(String args[]){
    Animal an=new Animal("CHeeta");
    an.makeSound();
    an.makeSound("LION");
    an=new Dog();
    an.makeSound();
    
  }
}
class Animal{
  protected String sound;
  public Animal(String sound){
this.sound=sound;
  }
  public void makeSound(){
    System.out.println("HELLO ANIMAL");
  }
   public void makeSound(String sound){
    System.out.println("HELLO ANIMAL " + sound);
   }
}
class Dog extends Animal{

  public void makeSound(){
    System.out.println("HELLO Dog " + sound);
  }
  // super("Tiger");
}