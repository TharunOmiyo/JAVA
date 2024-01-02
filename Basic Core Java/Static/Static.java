class Static{

  private int price;
  private String name ;
  private String name1 ;
  static String cateogry;
  static String country;
  static String brand;

  static{
    country="China";
    brand="Xomi";
    System.out.println(cateogry);
  }
public static void getBrand(Static obj){
  brand = "Apple";
  
  System.out.println(brand + " " + obj.name);
}
  public int getPrice() {
    return price;
  }

  public void setPrice(int price) {
    this.price = price;
  }

  public void setName(String name,Static obj) {
    obj.name = name;
  }

  public static void setCateogry(String cateogry) {
    Static.cateogry = cateogry;
  }

  public String getName() {
    return name;
  }

  public static String getCateogry() {
    return cateogry;
  }
  public static void main(String[] args){
Static obj=new Static();
int price=obj.getPrice();
System.out.println(price);
obj.setPrice(999);
obj.setName("Iphone 14",obj);
Static.setCateogry("Smart Phones");
System.out.println(obj);
System.out.println(obj.getName());
System.out.println(obj.getPrice());
System.out.println(Static.getCateogry());
Static obj1=new Static();

obj1.setPrice(1200);
obj1.setName("Iphone 15",obj1);
Static.setCateogry("Smart Phones");
System.out.println(obj1);
System.out.println(obj1.getName());
System.out.println(obj1.getPrice());
System.out.println(Static.getCateogry());
Static.getBrand(obj);

  }

 
}