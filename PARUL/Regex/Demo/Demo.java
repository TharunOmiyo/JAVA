import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Demo {

  public void intro(){
    //It checks "o" is availabe in given string between 3 to 5
// Pattern p=Pattern.compile("[o]{3,5}");

// Pattern p=Pattern.compile("[O]m{1}");//It checks "o" is followed by m
// Pattern p=Pattern.compile("[o]{3,5}");
// Pattern p=Pattern.compile("[o]{3,5}");
Pattern p=Pattern.compile("[a-zA-Z0-9][a-zA-Z0-9]*@[a-zA-z0-9]*[.][a-z]+");
System.out.println(p);
// String[] s1=p.split("My, name, is, @TharooonOmiyoo@1997");
// for(String s2:s1){
//   System.out.println(s2);
// }
Matcher m=p.matcher("pullareddytharun8@gmail.com");
// System.out.println(m);
int count=0;
while(m.find()){
  count++;
  System.out.println(m.start()+".."+m.end()+".."+m.group(0));
}
System.out.println(count);
  }
  public static void main(String[] args){
Demo obj=new Demo();
obj.intro();
  }
}
