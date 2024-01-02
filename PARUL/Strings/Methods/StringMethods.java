// package Methods;

public class StringMethods {
  
  public void show(){
    String str1=new String("TharunOmiyo");
    String str2=new String("TharunOmiyo");
    System.out.println(str1==str2);
    String s1="TharunOmiyo";
    String s2=str2;
    String s3=s2;
    System.out.println(s1==s2);
    System.out.println(s3==s2);
    System.out.println(s3==s1);
    String s4="Tharun"+"Omiyo";
    System.out.println(s3==s1);
    System.out.println(s1==s4);
    String s6="Tharun";

    String s5=s1;
    String s7=s6+"Omiyo";
    System.out.println(s1==s5);
    System.out.println(s1==s7);
    final String s8="Omiyo";
    String s9="Tharun"+s8;
    System.out.println(s1==s9);
    String s10=s6+s8;
    System.out.println(s1==s10);



    // System.out.println(s1.equals(str1));
  }
  public void buffer(){
    StringBuffer sb = new StringBuffer("Hello ");
  //  sb.append("I am from India  ");
  System.out.println(sb.length());
  System.out.println(sb.capacity());
  System.out.println(sb.length());
  //  sb.trimToSize(); 
   System.out.println(sb.capacity());
   sb.ensureCapacity(100);
   System.out.println(sb.capacity());

   System.out.println(sb.length());
  sb.append(" World");
  System.out.println(sb);
sb.insert(5, " World");
System.out.println(sb);
sb.delete(5, 11);
System.out.println(sb);
char ch = sb.charAt(1);
System.out.println(ch);
sb.reverse(); 
System.out.println(sb);
  }
  public static void main(String[] args){

    StringMethods obj=new StringMethods();
    // obj.show();
    obj.buffer();
  }
}
