import java.util.regex.Matcher;
import java.util.regex.Pattern;

import java.io.PrintStream;
import java.util.regex.Pattern;

public class Basic {
  int a=10;
  static{
    System.out.println("Hello");
  }
  public static Basic compile(Basic obj){
    
    System.out.println(obj.toString());
    return obj;
  }
  public void show(){
    Basic ba=new Basic();
    System.out.println(ba.a);
    System.out.println("this"+this);
  }
  public static Basic compile(String obj){
    System.out.println(obj.toString());
    return new Basic();
  }
  public static void main(String[] args){
    Basic b=new Basic();
    b.show();
    int count=0;
    Pattern p=Pattern.compile("ab");
    Matcher m=p.matcher("abcabababcccab");
    System.out.println(m.find());
    System.out.println("Matching:"+ m.matches());
    while (m.find()) {
      System.out.println("start: " + m.start()+"  end: "+m.end()+"  group: "+m.group());
      count++;
    }
    System.out.println(count);
  }

  Basic bc=new Basic();
  // b.compile(b.equals(b));
  // System.out.println(b.getClass().getName() );
  // System.out.println(b.compile("abc"));
  String s=new String("Tharun");
  
  }

