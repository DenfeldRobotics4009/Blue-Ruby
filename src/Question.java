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
        // this is stupid
        double deathChance = Math.round(Math.max(0, Math.min(Math.random()*100, 100)));
        System.out.println(deathChance);

        if(deathChance == 1.0 || gameOver == true) {
            
        }

        input = input.toLowerCase();
        for(int i = 0; i < options.length; i++){
            if(input.equals(options[i])){
                questions[i].answer(questions[i].input());
                return;
            }
        }

        answer(input());
    }

}