import java.util.Scanner;

public class Burhanmusume {
    static Scanner input = new Scanner(System.in);

    public static void header() {
        System.out.println(" ____             _                                                          \n" + //
                        "| __ ) _   _ _ __| |__   __ _ _ __  _ __ ___  _   _ ___ _   _ _ __ ___   ___ \n" + //
                        "|  _ \\| | | | '__| '_ \\ / _` | '_ \\| '_ ` _ \\| | | / __| | | | '_ ` _ \\ / _ \\\n" + //
                        "| |_) | |_| | |  | | | | (_| | | | | | | | | | |_| \\__ \\ |_| | | | | | |  __/\n" + //
                        "|____/ \\__,_|_|  |_| |_|\\__,_|_| |_|_| |_| |_|\\__,_|___/\\__,_|_| |_| |_|\\___|");
                        System.out.println("");
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

            if (userInput.equalsIgnoreCase("1")) {
                homeMenu(); 
                break;
            } else if (userInput.equalsIgnoreCase("2")) {
                storyMenu();
                break; 
            } else if (userInput.equalsIgnoreCase("3")) { 
                raceMenu();
                break; 
            } else if (userInput.equalsIgnoreCase("4")) {
                scoutMenu();
                break;
            } else if (userInput.equalsIgnoreCase("5")) {
                enhanceMenu();
                break;
            } else if (userInput.equalsIgnoreCase("6")) {
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
        }
    }

    public static void raceMenu() {
        while (true) {
            System.out.println("\n=== RACE ===");
            System.out.println("1. Team Trials");
            System.out.println("2. Race Events");
            System.out.println("3. Daily Races");
        }
    }

    public static void scoutMenu() {
        while (true) {
            System.out.println("\n=== SCOUT ===");
            System.out.println("1. Support Card Scout");
            System.out.println("2. Pretty Derby Scout");
            System.out.println("3. SSR Guaranteed");
            System.out.println("4. Head Start Scout");
        }
    }

    public static void storyMenu() {
        while (true) {
            System.out.println("\n=== STORY ===");
            System.out.println("1. Main Story");
            System.out.println("2. Uma Stories");
            System.out.println("3. Extra");
        }
    }

    public static void enhanceMenu() {
        while (true) {
            System.out.println("\n=== ENHANCE ===");
            System.out.println("1. Trainee");
            System.out.println("2. Support Cards");
            System.out.println("3. Veteran Uma");
        }
    }

    public static void exitGame() {
        System.out.println("\nThank you for playing Burhanmusume!");
        System.exit(1);
    }

    public static void main(String[] args) {
        header();
        mainMenu();
    }
}