import java.util.Scanner;

public class QuestionService {
  

  
  Question[] questions=new Question[5];
  String selection[]=new String[5];
public  QuestionService(){

questions[0]=new Question( 1, "What is the Size Of int", "2", "4", "6", "8", "4");
questions[1]=new Question( 2, "What is the Size Of float", "2", "4", "6", "8", "4");
questions[2]=new Question( 3, "What is the Size Of double", "2", "4", "6", "8", "8");
questions[3]=new Question( 4, "What is the Size Of char", "2", "4", "6", "8", "2");
questions[4]=new Question( 5, "What is the Size Of byte", "2", "4", "6", "8", "1");

}
public void displayQuestions(){
System.out.println("Hello");
 
int i=0;
Scanner sc=new Scanner(System.in);
  for(Question q:questions){
    System.out.println("QUestion no:"+q.getId());
    System.out.println("QUestion:"+q.getQuestion());
    System.out.println("Option A : "+q.getOpt1());
    System.out.println("Option B : "+q.getOpt2());
    System.out.println("Option C : "+q.getOpt3());
    System.out.println("Option D : "+q.getOpt4());
    selection[i]=sc.nextLine();
    i++;
  }
  for(String sele:selection){
    System.out.println("My Answer is : "+ sele);
  }
}
public void displayScore(){
  int score=0;
  for(int i=0;i<questions.length;i++){
    Question que=questions[i];
    String actualAnswer=que.getAnswer();
    String userAnswer=selection[i];
     System.out.println("Actual :" +actualAnswer);
      System.out.println("User"+userAnswer);
    if(actualAnswer.equals(userAnswer)){
      score++;
      System.out.println("Enterd");
    }
  }
  System.out.println("Your Score is : "+score);
}

}
