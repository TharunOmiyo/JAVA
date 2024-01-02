// package Regex;

import java.util.StringTokenizer;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

class A{
  
}
class B{

}
class C{

}
public class Regex{
  public void show(){
    System.out.println(this);
  }
  public static void main(String[] a){
    System.out.println("Hello");

    //Matching Single Character;
    System.out.println("cat".matches("cat"));
    System.out.println("Cat".matches("cat"));
    System.out.println("Cat".matches("[cC]at"));
    System.out.println("Cat".matches("[cC]at"));
    System.out.println("Cat".matches("[a-cA-C]at"));
    System.out.println("Cat".matches("[^c]at"));
    System.out.println("flat".matches("[^a-cA-C]at"));
    System.out.println("flat".matches("[^a-cA-C][lL]at"));
    System.out.println("Mat".matches("[^a-cA-CO-Qf-gM-N]at"));
    Regex ab=new Regex();
    ab.show();
      Pattern p=Pattern.compile("[a-zA-Z]+");
    Matcher m=p.matcher("Tharun");
    System.out.println(m.groupCount());
    // System.out.println(m.find());
    int count=0;
    while (m.find()) {
      System.out.println("start: " + m.start()+"  end: "+m.end()+"  group: "+m.group(0)+" Count : "+m.groupCount());
      count++;
    }
    System.out.println("Matching:"+ m.matches()+""+m.groupCount());
    System.out.println(count);
    StringTokenizer s1=new StringTokenizer("My name is Tharun, and I am from Tirupati",",",true);
    while(s1.hasMoreTokens()){
      System.out.println(s1.nextToken());
  }
}
}