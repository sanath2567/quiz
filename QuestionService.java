import java.util.*;

public class QuestionService {
  Question[] question = new Question[5];
  String selection[] = new String[5];

  public QuestionService() {
    question[0] = new Question(1, "Size of int", "2", "4", "6", "8", "4");
    question[1] = new Question(2, "Size of double", "2", "4", "1", "8", "8");
    question[2] = new Question(3, "Size of char", "2", "1", "4", "6", "2");
    question[3] = new Question(4, "Size of long", "2", "3", "6", "8", "8");
    question[4] = new Question(5, "Size of boolean", "2", "3", "1", "8", "1");
  }

  public void display() {
    int i = 0;
    for (Question q : question) {
      System.out.print("Question No:" + q.getId());
      System.out.print("\t" + q.getQuestion());
      System.out.println("\n" + q.getOpt1() + "\t" + q.getOpt2());

      System.out.println(q.getOpt3() + "\t" + q.getOpt4());
      // System.out.println(q.getOpt4());
      System.out.println("Enter your Answer:");
      Scanner sc = new Scanner(System.in);
      selection[i] = sc.nextLine();
      i++;
      System.out.println("--------------------------");
    }

    for (String s : selection) {
      System.out.println(s);
    }
  }

  public void print() {
    int scr = 0;
    for (int i = 0; i < 5; i++) {
      Question que = question[i];
      String answer = que.getAnswer();
      String user = selection[i];
      if (answer.equals(user)) {
        scr++;
      }

    }
    System.out.println("Your score is " + scr);
  }
}
