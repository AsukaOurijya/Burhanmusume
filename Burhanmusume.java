import java.util.Scanner;

public class Burhanmusume {
    static Scanner input = new Scanner(System.in);

    public static void header() {
        System.out.println("    ____             __                                                        \n" + //
                        "   / __ )__  _______/ /_  ____ _____  ____ ___  __  _________  ______ ___  ___ \n" + //
                        "  / __  / / / / ___/ __ \\/ __ `/ __ \\/ __ `__ \\/ / / / ___/ / / / __ `__ \\/ _ \\\n" + //
                        " / /_/ / /_/ / /  / / / / /_/ / / / / / / / / / /_/ (__  ) /_/ / / / / / /  __/\n" + //
                        "/_____/\\__,_/_/  /_/ /_/\\__,_/_/ /_/_/ /_/ /_/\\__,_/____/\\__,_/_/ /_/ /_/\\___/ \n" + //
                        "                                                                               ");
                        System.out.println("Burhanmusume: Pretty Object-Oriented");
    }

    public static void mainMenu() {
        while (true) {
            System.out.println("\n=== MAIN ===");
            System.out.println("1. Home");
            System.out.println("2. Story");
            System.out.println("3. Race");
            System.out.println("4. Scout");
            System.out.println("5. Enhance");
            System.out.println("6. Exit Game");
            System.out.print("Option: ");
            String userInput = input.next();

            if (userInput.equals("1")) {
                homeMenu(); 
                break;
            } else if (userInput.equals("2")) {
                storyMenu();
                break; 
            } else if (userInput.equals("3")) { 
                raceMenu();
                break; 
            } else if (userInput.equals("4")) {
                scoutMenu();
                break;
            } else if (userInput.equals("5")) {
                enhanceMenu();
                break;
            } else if (userInput.equals("6")) {
                exitGame();
                break;
            } else {
                System.out.println("Wrong input!");
                continue;
            }
        }
    }

    public static void homeMenu() {
        while (true) {
            System.out.println("\n=== HOME ===");
            System.out.println("1. Career");
            System.out.println("2. Shop");
            System.out.println("3. Club");
            System.out.println("4. Mission");
            System.out.println("5. Back to Main Menu");
            System.out.print("Option: ");
            String userInput = input.next();

            if (userInput.equals("1")) {
                // TODO : Implement Career Method. Change to 'break' if already implemented.
                System.out.println("Coming Soon");
                //break;
                continue;
            } else if (userInput.equals("2")) {
                // TODO : Implement Shop Method. Change to 'break' if already implemented.
                System.out.println("Coming Soon");
                //break;
                continue;
            } else if (userInput.equals("3")) {
                // TODO : Implement Club Method. Change to 'break' if already implemented.
                System.out.println("Coming Soon");
                //break;
                continue;
            } else if (userInput.equals("4")) {
                // TODO : Implement Mission Method. Change to 'break' if already implemented.
                System.out.println("Coming Soon");
                //break;
                continue;
            } else if (userInput.equals("5")) {
                mainMenu();
                break;
            } else {
                System.out.println("Wrong Input");
                continue;
            }
        }
    }

    public static void raceMenu() {
        while (true) {
            System.out.println("\n=== RACE ===");
            System.out.println("1. Team Trials");
            System.out.println("2. Race Events");
            System.out.println("3. Daily Races");
            System.out.println("4. Back to Home Menu");
            System.out.print("Option: ");
            String userInput = input.next();

            if (userInput.equals("1")) {
                // TODO : Implement Team Trials Method. Change to 'break' if already implemented.
                System.out.println("Coming Soon");
                //break;
                continue;
            } else if (userInput.equals("2")) {
                // TODO : Implement Race Events Method. Change to 'break' if already implemented.
                System.out.println("Coming Soon");
                //break;
                continue;
            } else if (userInput.equals("3")) {
                // TODO : Implement Daily Races Method. Change to 'break' if already implemented.
                System.out.println("Coming Soon");
                //break;
                continue;
            } else if (userInput.equals("4")) {
                mainMenu();
                break;
            } else {
                System.out.println("Wrong Input");
                continue;
            }
        }
    }

    public static void scoutMenu() {
        while (true) {
            System.out.println("\n=== SCOUT ===");
            System.out.println("1. Support Card Scout");
            System.out.println("2. Pretty Derby Scout");
            System.out.println("3. SSR Guaranteed");
            System.out.println("4. Head Start Scout");
            System.out.println("5. Back to Home Menu");
            System.out.print("Option: ");
            String userInput = input.next();

            if (userInput.equals("1")) {
                // TODO : Implement Support Card Scout Method. Change to 'break' if already implemented.
                System.out.println("Coming Soon");
                //break;
                continue;
            } else if (userInput.equals("2")) {
                // TODO : Implement Pretty Derby Scout Method. Change to 'break' if already implemented.
                System.out.println("Coming Soon");
                //break;
                continue;
            } else if (userInput.equals("3")) {
                // TODO : Implement SSR Guaranteed Method. Change to 'break' if already implemented.
                System.out.println("Coming Soon");
                //break;
                continue;
            } else if (userInput.equals("4")) {
                // TODO : Implement Head Start Scout Method. Change to 'break' if already implemented.
                System.out.println("Coming Soon");
                //break;
                continue;
            } else if (userInput.equals("5")) {
                mainMenu();
                break;
            } else {
                System.out.println("Wrong Input");
                continue;
            }
        }
    }

    public static void storyMenu() {
        while (true) {
            System.out.println("\n=== STORY ===");
            System.out.println("1. Main Story");
            System.out.println("2. Uma Stories");
            System.out.println("3. Extra");
            System.out.println("4. Back to Home Menu");
            System.out.print("Option: ");
            String userInput = input.next();

            if (userInput.equals("1")) {
                // TODO : Implement Main Stories Method. Change to 'break' if already implemented.
                System.out.println("Coming Soon");
                //break;
                continue;
            } else if (userInput.equals("2")) {
                // TODO : Implement Uma Stories Method. Change to 'break' if already implemented.
                System.out.println("Coming Soon");
                //break;
                continue;
            } else if (userInput.equals("3")) {
                // TODO : Implement Daily Races Method. Change to 'break' if already implemented.
                System.out.println("Coming Soon");
                //break;
                continue;
            } else if (userInput.equals("4")) {
                mainMenu();
                break;
            } else {
                System.out.println("Wrong Input");
                continue;
            }
        }
    }

    public static void enhanceMenu() {
        while (true) {
            System.out.println("\n=== ENHANCE ===");
            System.out.println("1. Trainee");
            System.out.println("2. Support Cards");
            System.out.println("3. Veteran Uma");
            System.out.println("4. Back to Home Menu");
            System.out.print("Option: ");
            String userInput = input.next();

            if (userInput.equals("1")) {
                // TODO : Implement trainee Method. Change to 'break' if already implemented.
                System.out.println("Coming Soon");
                //break;
                continue;
            } else if (userInput.equals("2")) {
                // TODO : Implement support cards Method. Change to 'break' if already implemented.
                System.out.println("Coming Soon");
                //break;
                continue;
            } else if (userInput.equals("3")) {
                // TODO : Implement Veteran Uma Method. Change to 'break' if already implemented.
                System.out.println("Coming Soon");
                //break;
                continue;
            } else if (userInput.equals("4")) {
                mainMenu();
                break;
            } else {
                System.out.println("Wrong Input");
                continue;
            }
        }
    }

    public static void exitGame() {
        System.out.println("┏┓  •         ┏┳┓          ╻\n" + //
                        "┣┫┏┓┓┏┓┏┓╋┏┓   ┃ ┏┓┏┓┏┓┏┓┏┓┃\n" + //
                        "┛┗┛ ┗┗┫┗┻┗┗┛   ┻ ┗┛┛ ┗ ┛┗┗┻•\n" + //
                        "      ┛                     ");
        System.out.println("Thank you for playing Burhanmusume!");
        System.exit(1);
    }

    public static void main(String[] args) {
        header();
        mainMenu();
    }
}