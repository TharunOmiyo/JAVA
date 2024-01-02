import java.util.StringTokenizer;

public class Strings{
  int a=10;
  public void display(){
    String str1="Tharun";
    int[] a=new int[]{1,2,3};
    System.out.println(a+str1);
  }
  public void subString(){
    String str="Hello World!";
    String str1=str.substring(8);
    String str2=str.substring(3,8);
    System.out.println(str1 );
    System.out.println(str2 );
  }
  public void stringConcat(){
    String str="Hello World!";
    String str1="World";
 System.out.println(str.concat(" World"));
System.out.println(str.concat(str1));
System.out.println(str);
str=str.concat(str1);
System.out.println(str);
  }
  public void stringCompare(){
    String str="Tharun";
    String str1="Tharun";
    String s=new String("Tharun");
    System.out.println(s==str1);
    String s1=s;
    System.out.println(s==s1);
    String str2=str;
    System.out.println(str==str1);
  }
  public void stringToken(){

    // The StringTokenizer class in Java is used to break a string into tokens (smaller parts or words) based on a specified delimiter or set of delimiters. It's a legacy class that has been available since the early versions of Java and was commonly used for tokenizing strings before more versatile alternatives like the split() method of the String class or regular expressions became prevalent.

    // Purpose of StringTokenizer:
// Tokenization: It helps in breaking a string into tokens based on delimiter(s), such as spaces, commas, semicolons, etc. Tokens are the individual parts of the string separated by the specified delimiter.

// Parsing: StringTokenizer can be used to parse input strings into separate components or fields. For instance, parsing a comma-separated value (CSV) file or processing input from legacy systems that use fixed-length fields.

// Why StringTokenizer?
// The reasons StringTokenizer was commonly used in the past include:

// Simplicity: It is straightforward and easy to use for basic tokenization requirements.

// Backward Compatibility: Being an old class, it was widely used in older Java versions before more efficient alternatives were introduced.

// However, there are drawbacks to using StringTokenizer:

// Limited Flexibility: It only allows simple delimiter-based tokenization. Regular expressions or more complex delimiters are not easily handled.

// No Control Over Delimiters: It doesn't provide the ability to include or exclude delimiters in the resulting tokens.

// Performance: For complex tokenization tasks or larger strings, StringTokenizer may not offer the best performance due to its limitations.
        
String text = "I am, Tharun. and, I am ;from Tirupati";
        StringTokenizer tokenizer = new StringTokenizer(text, ",;. "); // Delimiters are comma (",") and semicolon (";")
System.out.println(tokenizer.toString());
        while (tokenizer.hasMoreTokens()) {
          System.out.println(tokenizer.countTokens());
          // System.out.println(tokenizer.hasMoreElements());
          // System.out.println(tokenizer.nextElement());
          // System.out.println(tokenizer.nextToken(";"));
            String token = tokenizer.nextToken();
            System.out.println("Token: " + token);
        }
  }

  public void stringBuffer(){
    StringBuffer stringBuffer = new StringBuffer(); // Creates an empty StringBuffer
StringBuffer stringBufferWithText = new StringBuffer("Hello"); // Creates StringBuffer with initial text "Hello"
System.out.println("Creates an empty StringBuffer: "+ stringBuffer);
System.out.println("Creates StringBuffer with initial text : " +stringBufferWithText);
stringBuffer.append("World"); // Appends " World" to the existing content
stringBuffer.insert(5, " there"); // Inserts " there" at index 5
stringBuffer.replace(0, 5, "Hi");

System.out.println(stringBuffer.charAt(0));


/*
 * StringBuffer stringBuffer = new StringBuffer("Hello");
stringBuffer.delete(10, 14); // This will throw StringIndexOutOfBoundsException

 */
// stringBuffer.delete(5, 11); // Deletes characters from index 5 to 9 (10 is exclusive)

System.out.println("StringBuffer: "+ stringBuffer);
// stringBuffer.trimToSize();
// stringBuffer.ensureCapacity(50);
// System.out.println(stringBuffer.capacity());
// System.out.println(stringBuffer.length());
stringBufferWithText.append("World");
stringBuffer.reverse(); // Reverses the content of the StringBuffer
stringBuffer.ensureCapacity(20); // Ensures that the StringBuffer has a capacity of at least 20 characters
stringBuffer.setLength(10); // Sets the length of the StringBuffer to 10 (truncating if longer)
System.out.println(stringBufferWithText.length());
System.out.println(stringBufferWithText.capacity());
System.out.println(stringBuffer.length());
System.out.println(stringBuffer.capacity());

System.out.println(stringBuffer);



  }
  public void stringBuilder(){
    StringBuilder sb=new StringBuilder();
    System.out.println(sb.capacity());
  }
  public static void main(String[] args){
    Strings obj=new Strings();
    obj.display();
    // obj.stringBuffer();
    obj.stringBuilder();
    // obj.subString();
    // obj.stringConcat();
    // obj.stringCompare();
    // obj.stringToken();
    // System.out.println(obj.a);
    // System.out.println(obj.toString());
    // StringBuffer sb1=new StringBuffer("Tharun");
    // StringBuffer sb2=new StringBuffer("Tharun");
    // System.out.println(sb1.toString().equals(sb2.toString()));
    // String s=sb1.toString();
    // sb1.append("Omiyo");
    // s.concat("Omiyo");
    // System.out.println(sb1);
    // System.out.println(s);
    // System.out.println(obj+s);
    // System.out.println(sb1.substring(2,5));
    StringBuffer sb3=new StringBuffer("ABC");
    System.out.println(sb3);
  }
  
}