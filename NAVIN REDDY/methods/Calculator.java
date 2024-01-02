class Calculator{
  String name;
  int age;
  double sal;
  public int add(int a,int b){
    int c=a+b;
    System.out.println(c);
    return c;
  }
  public int add(int a,int b,String d){
    int c=a+b;
    return c;
  }
  public double add(int a,int b,Double z){
    double c=a+b+z;
    return c;
  }
  public static void main(String[] a){
// Calculator cal=new Calculator();
// cal.add(10,20);
// double sum=cal.add(10,20,30.00);
// System.out.println(sum);
int num[][]=new int[5][10];
for(int i=0;i<num.length;i++){
for(int j=0;j<num[i].length;j++){
  num[i][j]=(int)(Math.random()*10);
  System.out.println(num[i][j]);
}
System.out.println(num);
  }
  System.out.println(num.length);
  System.out.println(num[num.length-1].length);
for(int x[]:num){
  for(int y:x){
    System.out.print(y+" ");
  
  }
}  
Calculator cal1=new Calculator();
cal1.name="Tharun";
cal1.age=25;
cal1.sal=80000;
Calculator cal2=new Calculator();
cal2.name="Omiyo";
cal2.age=26;
cal2.sal=80000;
Calculator cal3=new Calculator();
cal3.name="Kumar";
cal3.age=25;
cal3.sal=80000;

Calculator calculator[]=new Calculator[3];
calculator[0]=cal1;
calculator[1]=cal2;
calculator[2]=cal3;
System.out.println("Array of Objects :" + calculator[1]);
for(Calculator ca:calculator){
  System.out.println("Name:"+ca.name+" Age"+ca.age+" Salary "+ca.sal);

}
String str=new String("Tharun");
System.out.println(str);
System.out.println(str.hashCode());
System.out.println(str.charAt(2));
System.out.println(str.concat("reddy"));
String s1="Omiyo";
s1="Kumar";
str="RAJ";
System.out.println(s1);
System.out.println(str);

StringBuffer strBuffer=new StringBuffer("Tharun");
System.out.println(strBuffer);
System.out.println(strBuffer.capacity());
System.out.println(strBuffer.length());
System.out.println(strBuffer.append("Java"));
System.out.println(strBuffer.delete(0, 1));
System.out.println(strBuffer.deleteCharAt(1));


Class.forName(Calculator);




}

}