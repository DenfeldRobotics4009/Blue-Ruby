import java.util.Scanner;
import java.lang.Math;

public class Question {
    boolean gameOver;
    String prompt;
    String [] options;
    Question [] questions;

    static Scanner reader = new Scanner(System.in);

    public Question(boolean gameOver, String prompt, String [] options, Question [] questions){
        this.gameOver = gameOver;
        this.prompt = prompt;
        this.options = options;
        this.questions = questions;

    }

    public String input(){
        System.out.println(prompt);
        return reader.nextLine();
    }

    public void answer(String input){

        double deathChance = Math.random()*100;

        if(deathChance < 1) {
            System.out.println("\nOops, you got struck by lightning. How unfortunate!\nGAME OVER\n(press enter to retry)");
            reader.nextLine();
            Constants.question.answer(Constants.question.input());
            return;
        }

        if(gameOver == true) {
            Constants.question.answer(Constants.question.input());
            return;
        }

        input = input.toLowerCase();
        for(int i = 0; i < options.length; i++){
            //if the answer is right
            if(input.equals(options[i])){
                questions[i].answer(questions[i].input());
                return;
            }
        }

        answer(input());
    }

}