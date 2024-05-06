import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Question question = new Question("test promt", 
            new String[]{"yes", "no"}, 
            new Question[]{
                new Question("0", new String[]{}, new Question[]{}),
                new Question("1", new String[]{}, new Question[]{})
            }
        );

        question.answer(question.input());
    }
}
