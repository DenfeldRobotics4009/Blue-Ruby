public class App {
    public static void main(String[] args) throws Exception {
        Question question = new Question(
            false,
            "\nYou are a lone sailer on boat wanting to make money, and you heard that there are gems hidden somewhere in this vast ocean.\nYou are sailing and you see and a man sitting on a rock. You also see a town approacing on the horizon.\nDo you want to talk to the man or do you want to go to the town?\n(\"talk to man\" or \"town\")", 
            new String[]{"talk to man", "town"},
            new Question[]{

                new Question(
                    false,
                    "\n\"Hello there. I give you this map to a temple, it is dangerous but there is a rare blue gem that no one has ever gotten.\"\nMAP GET\nDo you choose to ignore the man and go straight to the town, or do you decide to seek out the temple?\n(\"go straight\" or \"go to temple\")", 
                    new String[]{"go straight", "go to temple"},
                    new Question[]{

                    new Question(
                        false,
                        "test 3",
                        new String[]{}, 
                        new Question[]{}
                    ),

                    new Question(
                        false,
                        "\nAfter a while, you see a run down temple on a jungly island full animals and broken stone structures. You beach your boat in front of the temple \nDO you choose to talk to the animals or go to the temple? \n(\"talk to animals\" or \"go into temple\")",
                        new String[]{"talk to animals" , "go into temple"},
                        new Question[]{

                        new Question(
                            true,
                            "\nYou go to talk to the animals. They try to attack you, but you trip on a stone and die before they get the chance. Man, you suck at walking.\nGAME OVER",
                            new String[]{},
                            new Question[]{}
                        ),

                        new Question(
                            false,
                            "\nYou walk into the temple. You see a split path. Which path do you go down?\n(\"left\" or \"right\")",
                            new String[]{"left", "right"}, 
                            new Question[]{

                            new Question(
                                true,
                                "\nYou decide to take the left path. You get shot by a skeleton and lose all your items. You wake up in your house.\nGAME OVER",
                                new String[]{},
                                new Question[]{}
                            ),

                            new Question(
                                false,
                                "\nYou choose right path and run into a purpul grasshopper and he is uneque and enchanted grasshoper he gives you a stick with sharp edge and he shows you a secrect tunnle go in or no",
                                new String[]{"no tunnle", "yes tunnle"},
                                new Question[]{

                                new Question(
                                    false,
                                    "\nYou say yes purple grasshopper and he opens a tunnel and give a skate board and you hop on and zoom away and you see the end you arive at the gem what do you do take gem or leave it.",
                                    new String[]{"no gem", "yes gem"},
                                    new Question[]{}
                                ),

                                new Question(
                                    false,
                                    "",
                                    new String[]{},
                                    new Question[]{}
                                )

                                }
                            )   

                            }
                        )

                        }

                    )

                    }
                ),

                new Question(
                    false,
                    "test prompt 2", 
                    new String[]{},
                    new Question[]{}
                )
            }
        );

        question.answer(question.input());
    }
}