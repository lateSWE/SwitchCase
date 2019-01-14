import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        String[] genres = new String[]{
                //game

                "",                                 //0
                "Puzzle",                           //1
                "Action",                           //2
                "Role-playing",                     //3
                "Sandbox",                          //4
                "Survival",                         //5

                "Adventure",                        //6
                "MOBA",                             //7
                "Battle-royale",                    //8
                "First-Person-Shooter",             //9
                "Third-Person-Shooter",             //10

                "Platformer",                       //11
                "Tactical",                         //12
                "Turn-based-strategy",              //13
                "Simulation",                       //14
                "Massive Multi-player Online",                              //15

                "Strategy",                        //16
                "Sport",                            //17
                "Stealth",                          //18
                };

        String[] mode = new String[]{
                "Only Single-player",                    //0
                "Only Multi-player",                     //1
                "Both Single-player and Multi-player",   //2
        };

        String[][] games = new String[][]{
                // game name, genre 1, genre 2, genre 3, playing-mode

                { "Portal 2", genres[1], genres[0], genres[0], mode[2] },                                            //1
                { "The Witcher 3: Wild Hunt", genres[2], genres[3], genres[0], mode[0] },                            //2
                { "Minecraft", genres[4], genres[5], genres[0], mode[2] },                                           //3
                { "Grand Theft Auto V", genres[2], genres[6], genres[0], mode[2] },                                  //4
                { "The Elder Scrolls V: Skyrim", genres[2], genres[3], genres[0], mode[0] },                         //5

                { "Dota 2", genres[7], genres[0], genres[0], mode[1] },                                              //6
                { "League of Legends", genres[7], genres[0], genres[0], mode[1] },                                   //7
                { "Fortnite Battle Royale", genres[8], genres[0], genres[0], mode[1] },                              //8         Sämst!!!
                { "Overwatch", genres[9], genres[0], genres[0], mode[1] },                                           //9
                { "Divinity: Original Sin 2 - Definitive Edition", genres[3], genres[0], genres[0], mode[2] },       //10

                { "Mass Effect 2", genres[2], genres[3], genres[10], mode[0] },                                      //11
                { "Spelunky", genres[11], genres[0], genres[0], mode[2] },                                           //12
                { "Celeste", genres[11], genres[0], genres[0], mode[0] },                                            //13
                { "XCOM 2", genres[12], genres[3], genres[13], mode[2] },                                            //14

                { "Fallout: New Vegas", genres[2], genres[3], genres[0], mode[0] },                                  //15
                { "Sid Meier's Civilization V", genres[13], genres[16], genres[0], mode[2] },                        //16
                { "Stardew Valley", genres[14], genres[3], genres[0], mode[2] },                                     //17
                { "World of Warcraft", genres[15], genres[3], genres[0], mode[1] },                                  //18
                { "FTL: Faster Than Light", genres[16], genres[0], genres[0], mode[0] },                             //19

                { "Undertale", genres[3], genres[0], genres[0], mode[0] },                                           //20
                { "Rocket League", genres[17], genres[0], genres[0], mode[2] },                                      //21
                { "Metal Gear Solid V: The Phantom Pain", genres[2], genres[6], genres[18], mode[2] },               //22
                { "Counter-Strike: Global Offensive", genres[9], genres[0], genres[0], mode[1] },                    //23
                { "The Witness", genres[1], genres[0], genres[0], mode[0] }                                          //24
        };
        boolean run = true;
        while (run) {
            System.out.println("How do you want to sort the games?");
            System.out.println("[1]  -  By genre");
            System.out.println("[2]  -  By mode");
            System.out.println("[3]  -  View all");
            System.out.println("[4]  -  Quit");

            Scanner input = new Scanner(System.in);
            int choice = input.nextInt();

            int num1 = 1;
            switch (choice) {
                case 1:
                    System.out.println();
                    System.out.println("What game genre do you want to play?");
                    for (int i = 1; i < genres.length; i++) {
                        if (i < 10) {
                            System.out.println("[" + i + "]" + "  -  " + genres[i]);
                        }
                        if ((i >= 10) && (i < 100)) {
                            System.out.println("[" + i + "]" + " -  " + genres[i]);
                        }
                    }
                    choice = input.nextInt();

                    System.out.println();
                    System.out.println("Here are some games in the genre " + genres[choice] + "!");
                    for (int i = 0; i < games[0].length; i++) {
                        for (int j = 1; j < 4; j++) {
                            if (games[i][j].equals(genres[choice])) {
                                if (i < 10) {
                                    System.out.println("[" + num1 + "]" + "  -  " + games[i][0]);
                                }
                                if ((i >= 10) && (i < 100)) {
                                    System.out.println("[" + num1 + "]" + " -  " + games[i][0]);
                                }
                                num1++;
                            }
                        }
                    }
                    choice = 0;
                    break;

                case 2:
                    System.out.println();
                    System.out.println("What game mode do you want to play?");
                    for (int i = 0; i < mode.length; i++) {
                        if (i < 10) {
                            System.out.println("[" + (i + 1) + "]" + "  -  " + mode[i]);
                        }
                        if ((i >= 10) && (i < 100)) {
                            System.out.println("[" + (i + 1) + "]" + " -  " + mode[i]);
                        }
                    }
                    choice = input.nextInt();
                    choice--;

                    System.out.println();
                    System.out.println("Here are some games with " + mode[choice] + " mode(s)!");
                    for (int i = 1; i < games[0].length; i++) {
                        if (games[i][4].equals(mode[choice])) {
                            if (i < 10) {
                                System.out.println("[" + num1 + "]" + "  -  " + games[i][0]);
                            }
                            if ((i >= 10) && (i < 100)) {
                                System.out.println("[" + num1 + "]" + " -  " + games[i][0]);
                            }
                            num1++;
                        }
                    }
                    choice = 0;
                    break;

                case 3:
                    System.out.println();
                    for (int i = 0; i < games[0].length; i++) {
                        if (i < 10) {
                            System.out.println("[" + num1 + "]" + "  -  " + games[i][0]);
                        }
                        if ((i >= 10) && (i < 100)) {
                            System.out.println("[" + num1 + "]" + " -  " + games[i][0]);
                        }
                    }
                    choice = 0;
                    break;

                case 4:
                    choice = 0;
                    run = false;
                    break;
            }
            input.close();
        }
    }
}
