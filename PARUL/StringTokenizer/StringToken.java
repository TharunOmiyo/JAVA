import java.util.StringTokenizer;

public class StringToken{

  public void tokenizer_WithOut_Delimiter(){
StringTokenizer st=new StringTokenizer("StringTokenizer is a class in Java that allows you to break a string into tokens based on a specified delimiter or delimiters. It's part of the java.util package.");
while(st.hasMoreTokens()){
  System.out.println("Token: " + st.nextToken());
}
  }
  public void tokenizer_With_Delimiter(){
StringTokenizer st=new StringTokenizer("StringTokenizer, is, a, class, in :Java, that ,allows ,you, to ,break !a string into ;tokens based 'on a specified delimiter: or delimiters. It's part of the java.util package.");
while(st.hasMoreTokens()){
  System.out.println("Token: " + st.nextToken(",:;'"));
}
  }
  public void tokenizer_With_Delimiter_and_Boolean(){
    //In the StringTokenizer constructor, when you provide a boolean value of true as the third parameter (returnDelims), it indicates that the delimiters should be treated as tokens and returned as separate tokens alongside the regular tokens (words or elements) from the input string.
StringTokenizer st=new StringTokenizer("StringTokenizer, is, a, class, in :Java, that ,allows ,you, to ,break !a string into ;tokens based 'on a specified delimiter: or delimiters. It's part of the java.util package.",",:;'",true);
while(st.hasMoreTokens()){
  System.out.println("Token: " + st.nextToken(",:;'"));
}
  }
  public void tokenizer_With_Delimiter(String s){
    //This method returns, Except character "a" remaining all characters will print . Because it separates token based on Delimiters.
StringTokenizer st=new StringTokenizer("StringTokenizer, is, a, class, in :Java, that ,allows ,you, to ,break !a string into ;tokens based 'on a specified delimiter: or delimiters. It's part of the java.util package.",s);
//we can mention delimiter inside StringTokinzer constructor also.
while(st.hasMoreTokens()){
  System.out.println("Token: " + st.nextToken());
}
  }
  public static void main(String[] args){
// StringTokenizer , String Split and Pattern Split all these  methods works same way ,It separates String into tokens by using delimiters.
//What ever we mention in Delimiter, Except that character remaining all characters will print and also it splits according to delimiter character.
    StringToken obj=new StringToken();
    System.out.println("Tokenizer_WithOut_Delimiter");
    obj.tokenizer_WithOut_Delimiter();
    System.out.println("Tokenizer_With_Delimiter");
    obj.tokenizer_With_Delimiter();
    
    obj.tokenizer_With_Delimiter("a"); //This method returns, Except character "a" remaining all characters will print . 
    obj.tokenizer_With_Delimiter_and_Boolean();
  }
}
