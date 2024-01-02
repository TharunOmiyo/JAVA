import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

class A{
final int name;
name="Tharun";
  public void collectionArrayList(){
    Collection<Integer> n1= new ArrayList<>();
    n1.add(10);
    n1.add(20);
    n1.add(5);
    n1.add(40);
    n1.add(25);
      System.out.println("Collection Arraylist");
    for(int n:n1){
      System.out.println(n);
    }
    for(Object n:n1){
      System.out.println(n);
    }
     for(Integer n:n1){
      System.out.println(n);
    }
  }
  public void listArrayList(){
    List<Integer> n1=new ArrayList<>();
    n1.add(10);
    n1.add(22);
    n1.add(55);
    n1.add(4);
    n1.add(25);
     System.out.println("List Arraylist");
    for(int i=0;i<n1.size();i++){
      System.out.println(n1.get(i));
    }
     for(Object n:n1){
      System.out.println(n);
    }
     for(int n:n1){
      System.out.println(n);
    }
     for(Integer n:n1){
      System.out.println(n);
    }
  }
  public void setHashSet(){
    Set<Integer> n1=new HashSet<>();
    n1.add(10);
    n1.add(22);
    n1.add(55);
    n1.add(4);
    n1.add(25);
    n1.add(25);
    //   for(int i=0;i<n1.size();i++){
    //   System.out.println(n1);
    // }
     System.out.println("Set HastSet");
        for(int n:n1){
      System.out.println(n);
    }
    for(Object n:n1){
      System.out.println(n);
    }
     for(Integer n:n1){
      System.out.println(n);
    }
  }
  public void setTreeSet(){
    Set<Integer> n1=new TreeSet<>();
    n1.add(10);
    n1.add(22);
    n1.add(55);
    n1.add(4);
    n1.add(25);
    n1.add(25);
    //   for(int i=0;i<n1.size();i++){
    //   System.out.println(n1);
    // }
     System.out.println("Set TreeSet makes array Sort");
        for(int n:n1){
      System.out.println(n);
    }
    for(Object n:n1){
      System.out.println(n);
    }
     for(Integer n:n1){
      System.out.println(n);
    }
  }
  public void map(){
    Map<String,String> emp=new HashMap<>();
      emp.put("name", "Tharun");
      emp.put("age", "26");
      emp.put("sal", "$150k");
      emp.put("company", "Amazon");
      //  for(int i=0;i<n1.size();i++){
          System.out.println("Map Data");
          System.out.println(emp);
      // //   }
      for(Object key:emp.keySet()){
     System.out.println(key +" : "+ emp.get(key) );
      }
  }
}
class D{
  int a=10;
  String name="Tharun";
  public D(){
    System.out.println("D Constructor");
  }
}
public class Collections{
  static{
    System.out.println("Static block");
  
  }
  public static void main(String[] args){
System.out.println("Hello");
//Calling CollectionArrayList
      

A obj=new A();
System.out.println(obj.name);
obj.collectionArrayList();
obj.listArrayList();
obj.setHashSet();
obj.setTreeSet();
obj.map();
ArrayList<String> arr=new ArrayList<>();

D object=new D<>();
System.out.println(object.name);
  }
  

}