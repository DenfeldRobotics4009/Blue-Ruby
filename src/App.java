public class App {
    public static void main(String[] args) throws Exception {
        Question question = new Question(
            "You are a lone sailer on boat wanting to make money, and you heard that there are gems hidden somewhere in this vast ocean.\nYou are sailing and you see and a man sitting on a rock. You also see a town approacing on the horizon.\nDo you want to talk to the man or do you want to go to the town?\n(\"talk to man\" or \"town\")", 
            new String[]{"talk to man", "town"},
            new Question[]{

                new Question(
                    "\"Hello there. I give you this map to a temple, it is dangerous but there is a rare blue gem that no one has ever gotten.\"\nYOU HAVE ACQUIRED MAP\nDo you choose to ignore the man and go straight to the town, or do you decide to seek out the temple?\n(\"go straight\" or \"go to temple\")", 
                    new String[]{"go straight", "go to temple"},
                    new Question[]{

                    new Question(
                        "test 3",
                        new String[]{}, 
                        new Question[]{}
                    ),

                    new Question(
                        "After a while, you see a run down temple on a jungley island full animals and broken stone structures. You beach in front of the temple", 
                        new String[]{},
                        new Question[]{}
                    )

                    }
                ),

                new Question(
                    "test prompt 2", 
                    new String[]{},
                    new Question[]{}
                )
            }
        );

        question.answer(question.input());
    }
}