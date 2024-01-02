import others.Other;
class Strings{
  int a=10;
  int b=a;
  private int abc=100;
  int[] arr=new int[5];
  int newArr[]={1,2,3,4,5};
  int arr1[]=newArr;
  public void show(){
    arr1[0]=100;
    for(int i=0;i<arr1.length;i++){
      System.out.println("Element at index "+i+" is :"+arr1[i]+"and"+newArr[i]);
    }
    System.out.println(arr1);
  };
  public void display(){
    String a="Tharun";
    String b="Tharun";
    String c=b;
    String newA=new String("Tharun");
    System.out.println(newA.charAt(0));
    System.out.println(a==b );
    System.out.println( b==c );
    System.out.println( a==newA);
    System.out.println( arr1);
    System.out.println( abc);
  }
  public static void main(String[] args){
    Strings s=new Strings();
    s.show();
    Strings obj=s;
    obj.show();
    obj.a=200;
    System.out.println("Value of a in object obj is: "+obj.a +"and"+s.a);
    
    obj.display();
    System.out.println(obj.abc);
    System.out.println(20);
    System.out.println("Tharun");
    System.out.println(new int[]{1,2,3,4,5});
    String s1="Tharun";
    String s2=new String("Tharun");
    System.out.println(s1.equals(s2));
    System.out.println(s1==s2);
    Other o=new Other();
    Object obj3=new Other();
    System.out.println(s1.replace("a","oooo"));
    o.show();
    System.out.println('a'+'b');
    System.out.println('a'+"b");
    System.out.println('a'+1);
    System.out.println((int)'a');
    System.out.println("a"+1);
    Integer c=10;
    String abc=c.toString();
    System.out.println("a"+abc);

    String str1="";
    for(int i=0;i<26;i++){
      char ch=(char)('a'+i);
      int in=('a'+i);
      System.out.println(ch); 
      str1+=ch;
    }
      System.out.println(str1); 

  }
}