import java.util.Scanner;

public class Main {

  public static void main(String[] args) { 
    System.out.println("Main");
    QuestionService service=new QuestionService();
        service.displayQuestions();
        service.displayScore();
        // String a="Tharun";
        // Scanner sc=new Scanner(System.in);
        // String b=sc.nextLine();
        // int c=sc.nextInt();
        // int d=Integer.parseInt(sc.next());

        // System.out.println(sc.next() instanceof String);
        // System.out.println(a instanceof String);
        // // System.out.println(d instanceof String);
        // System.out.println(b+""+b instanceof String);
        // System.out.println(c+""+c instanceof String);
  }
}