public class Constants {

    public static Question question = new Question(
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
                        "\nYou go to talk to the animals. They try to attack you, but you trip on a stone and die before they get the chance. Man, you suck at walking.\nGAME OVER\n(press enter to retry)",
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
                            "\nYou decide to take the left path. You get shot by a skeleton and lose all your items. You wake up in your house.\nGAME OVER\n(press enter to retry)",
                            new String[]{},
                            new Question[]{}
                        ),

                        new Question(
                            false,
                            "\nYou choose right path and run into a purpul grasshopper and he is uneque and enchanted grasshoper he gives you a stick with sharp edge and he shows you a secrect tunnle go in or no\n(\"go in\" or \"ignore\")",
                            new String[]{"go in", "ignore"},
                            new Question[]{

                            new Question(
                                false,
                                "\nYou say yes purple grasshopper and he opens a tunnel and give a AK47 and you zoom away and you see the end you arive at the gem what do you do take gem or leave it.\n(\"leave gem\" or \"take gem\")",
                                new String[]{"leave gem", "take gem"},
                                new Question[]{

                                new Question(
                                    false,
                                    "leave gem",
                                    new String[]{},
                                    new Question[]{}
                                ),

                                new Question(
                                    false,
                                    "\nAs you take the gem, a group of flying lemurs flies towards you menacingly. What do you do?\n(\"throw gem\", \"shoot\", or \"run\")",
                                    new String[]{"throw gem", "shoot", "run"},
                                    new Question[]{

                                    new Question(
                                        true,
                                        "\nYou throw the gem. The lemurs catch the gem and throw it at your head, shattering your skull.\nGAME OVER\n(press enter to retry)",
                                        new String[]{},
                                        new Question[]{}
                                    ),

                                    new Question(
                                        true,
                                        "\nYou grab your AK47. But you don't have any ammo. The monkeys attack you.\nGAME OVER\n(press enter to retry)",
                                        new String[]{},
                                        new Question[]{}
                                    ),

                                    new Question(
                                        false,
                                        "\nYou try to run away, but the lemurs corner you. You spot a hole in the wall. Do you beg the lemurs for mercy, or do you attempt a daring escape?\n(\"beg\" or \"escape\")",
                                        new String[]{"beg", "escape"},
                                        new Question[]{

                                        new Question(
                                            true,
                                            "\nYou beg the lemurs to let you go. They make an offer with you. They'll let you go if you share your wealth with them. You accept the offer and fly out of the temple with your new friends.\nYOU WIN!!!\n(press enter to restart)",
                                            new String[]{},
                                            new Question[]{}
                                        ),

                                        new Question(
                                            true,
                                            "\nYou try to crawl through the hole, but you don't fit. The lemurs attack you. Try eating fewer donuts next time.\nGAME OVER\n(press enter to retry)",
                                            new String[]{},
                                            new Question[]{}
                                        ),

                                    }

                                    ),

                            new Question(
                                true,
                                "The grasshopper shoots you in the face with an RPG. You should've talked with him you idiot!!!\nGAME OVER\n(press enter to retry)",
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
            )
            }
        )
        }               
    ),
            new Question(
                false,
                "You decide to sail to the town far in the distance. After you dock, you walk ashore and onto a dock and see a man and a tavern. Do you want to talk to the man, or go to the tavern?\n(\"Talk to man\" or \"Go to tavern\")", 
                new String[]{"talk to man", "go to tavern"},
                new Question[]{}
            )
        }   
    );
}
