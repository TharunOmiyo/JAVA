import java.util.StringTokenizer;

public class StringMethodsExample extends Object {

    // public StringMethodsExample(){
        
    // }
    // public StringMethodsExample(int a){
        
    // }
    public StringMethodsExample(String original){
 this.value = original.toCharArray(); // Convert string to character array
            this.count = original.length(); 
    }
    public void show(){
        String city="Tirupati";
        String p1=city;
        String p2=city;
        String p3=city;
        String p4=p1;
        p4="Hyd";
        System.out.println(p1+p2+p3+p4);

    }

   
        private final char[] value; // Character array to store the string
        private final int count;    // Number of characters in the string
    
        // public  String(String original) {
        //     this.value = original.toCharArray(); // Convert string to character array
        //     this.count = original.length();      // Calculate length/count of characters
        // }
    
        public int length() {
            return count; // Return the count of characters
        }
    
    
    public static void main(String[] args) {
        // StringMethodsExample obj=new StringMethodsExample();
        StringMethodsExample obj1=new StringMethodsExample("Tharun");
        // Creating a string
        String str = "Hello, World!";
        System.out.println(str.toString());
        System.out.println(str);
        System.out.println(str.toCharArray());
        char []c=new char[]{'a','b','c'};
        for(int i=0;i<c.length;i++){
            System.out.println(c[i]);
        }
        System.out.println(c.length);

        // Basic Operations
        int length = str.length(); // Finding length of the string
        System.out.println("Length of the string: " + length);

        char ch = str.charAt(7); // Accessing a character at a specific index
        System.out.println("Character at index 7: " + ch);

        boolean isEmpty = str.isEmpty(); // Checking if the string is empty
        System.out.println("Is the string empty? " + isEmpty);

        // Concatenation and Manipulation
        String concatStr = str.concat(" How are you?"); // Concatenating strings
        System.out.println("Concatenated string: " + concatStr);

        String substring = str.substring(7); // Getting substring from index 7 to end
        System.out.println("Substring from index 7: " + substring);

        String replacedStr = str.replace('o', 'x'); // Replacing 'o' with 'x'
        System.out.println("Replaced 'o' with 'x': " + replacedStr);

        String[] parts = str.split(", "); // Splitting the string based on delimiter
        System.out.println("Splitting the string:");
        for (String part : parts) {
            System.out.println(part);
        }

        // Modifying Case
        String lowerCase = str.toLowerCase(); // Converting the string to lowercase
        System.out.println("Lowercase string: " + lowerCase);

        String upperCase = str.toUpperCase(); // Converting the string to uppercase
        System.out.println("Uppercase string: " + upperCase);

        // Trimming
        String spacedStr = "   Trim this string   ";
        String trimmedStr = spacedStr.trim(); // Trimming leading and trailing spaces
        System.out.println("Original string: '" + spacedStr + "'");
        System.out.println("Trimmed string: '" + trimmedStr + "'");

        // Checking Content
        boolean contains = str.contains("World"); // Checking if string contains substring
        System.out.println("Does it contain 'World'? " + contains);

        boolean startsWith = str.startsWith("Hello"); // Checking if string starts with a prefix
        System.out.println("Does it start with 'Hello'? " + startsWith);

        boolean endsWith = str.endsWith("World!"); // Checking if string ends with a suffix
        System.out.println("Does it end with 'World!'? " + endsWith);

        int indexOf = str.indexOf("o"); // Finding the index of a character
        System.out.println("Index of 'o': " + indexOf);

        int lastIndexOf = str.lastIndexOf("o"); // Finding the last index of a character
        System.out.println("Last Index of 'o': " + lastIndexOf);

        // Comparison
        String anotherString = "HELLO, WORLD!";
        boolean isEqual = str.equals(anotherString); // Comparing strings for equality
        System.out.println("Are the strings equal? " + isEqual);

        int compareResult = str.compareTo(anotherString); // Comparing strings lexicographically
        System.out.println("Compare result: " + compareResult);

        boolean isEqualsIgnoreCase = str.equalsIgnoreCase(anotherString); // Comparing strings ignoring case
        System.out.println("Are the strings equal (ignore case)? " + isEqualsIgnoreCase);
        String obj="Tharun, Omiyo";
        String[] o=obj.split(",");
        System.out.println(o[0]);
        String apple="cpple";
        String banana="banana";
        System.out.println(apple.compareTo(banana));
        System.out.println(apple.compareToIgnoreCase(banana));

        String[] arr={"Tharun","raj","sai" , "saikumar1  ","  saikumar"};
        for(int i=0;i<arr.length-1;i++){
            System.out.println(arr[i] +arr[i].length());
            arr[i].strip();
            System.out.println(arr[i] +arr[i].length());
            char[] A={'T','H'};
            String str4=new String(A);
            System.out.println(str4);
            // System.out.println(arr[i].length());

//             if(arr[i].length()==arr[i+1].length()){
// System.out.println("The Length of String is "+arr[i].length() + " and the value is "+arr[i] + arr[i+1]);
//             }else if(arr[i].length()<arr[i+1].length()){
//                 System.out.println("The Length of String is "+arr[i].length() + " and the value is "+arr[i] );
//             }
        }
        obj1.show();
        String s=new String("I am P Tharun, I am from Tirupati.");
        StringTokenizer st=new StringTokenizer(s);
        System.out.println(st);
       while(st.hasMoreTokens()){
        System.out.println(st.countTokens());
        System.out.println(st.nextElement());
        System.out.println(st.hasMoreElements());
        System.out.println(st.hasMoreTokens());
        System.out.println(st.nextToken());
       }

    }
}
