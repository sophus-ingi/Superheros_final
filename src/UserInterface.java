import java.util.InputMismatchException;
import java.util.Scanner;

public class UserInterface {
    private Database database;

    public UserInterface(Database database) {
        this.database = database;
    }

    public void startProgram() {
        Scanner scanner = new Scanner(System.in);
        Controller Controller = new Controller(database);
        Boolean stillGoing = true;
        Superhero lastCreatedSuperhero = null;

        while (stillGoing) {
            System.out.println("""
            ------------------------------------------|
            Do you want to create a superhero? (1)    |
            Do you want to download a superhero? (2)  |
            Do you want to edit a superhero? (3)      |
            ------------------------------------------|
            """);

            try {
                int ansvar = scanner.nextInt();
                if (ansvar == 1) {
                    String name;
                    String realName;
                    String superPower;
                    int yearCreated;
                    String race;
                    String strength;

                    System.out.println("What is the superhero's name?");
                    name = scanner.next();
                    System.out.println("What is the superhero's real name?");
                    realName = scanner.next();
                    System.out.println("What is the superhero's superpower?");
                    superPower = scanner.next();
                    System.out.println("What year was the superhero created?");
                    yearCreated = scanner.nextInt();
                    scanner.nextLine();
                    System.out.println("What is the race of the superhero?");
                    race = scanner.next();
                    System.out.println("What is the superhero's strength?");
                    strength = scanner.next();

                    Controller.addHeroToDatabase(name, realName, superPower, yearCreated, race, strength);

                    //Store the last created superhero
                    lastCreatedSuperhero = new Superhero(name, realName, superPower, yearCreated, race, strength);
                    System.out.println("------------------------------------------");

                    //Display details of the last created superhero
                    System.out.println("Superhero name:" + lastCreatedSuperhero.getName());
                    System.out.println("Superhero Realname:" + lastCreatedSuperhero.getRealName());
                    System.out.println("Superhero Power:" + lastCreatedSuperhero.getSuperPower());
                    System.out.println("Superhero Strength:" + lastCreatedSuperhero.getStrength());
                    System.out.println("Superhero Race:" + lastCreatedSuperhero.getRace());
                    System.out.println("Superhero was created in the year:" + lastCreatedSuperhero.getYearCreated());
                } else if (ansvar == 2) {
                    System.out.println("Which superhero are you going to find?");
                    String navn = scanner.next();
                    database.searchSuperhero(navn);
                } else if (ansvar == 3) {
                    System.out.println("Which superhero do you want to edit?");
                    String navn = scanner.next();
                    database.searchSuperhero(navn);

                    String name;
                    String realName;
                    String superPower;
                    int yearCreated;
                    String race;
                    String strength;

                    System.out.println("What is the superhero's name?");
                    name = scanner.next();
                    System.out.println("What is the superhero's real name?");
                    realName = scanner.next();
                    System.out.println("What is the superhero's superpower?");
                    superPower = scanner.next();
                    System.out.println("What year was the superhero created?");
                    yearCreated = scanner.nextInt();
                    scanner.nextLine();
                    System.out.println("What is the race of the superhero?");
                    race = scanner.next();
                    System.out.println("What is the superhero's strength?");
                    strength = scanner.next();

                    Controller.addHeroToDatabase(name, realName, superPower, yearCreated, race, strength);

                    // Store the last created superhero
                    lastCreatedSuperhero = new Superhero(name, realName, superPower, yearCreated, race, strength);

                    //Display last created superhero
                    System.out.println("--------------------------------------");
                    System.out.println("Superhero name:" + lastCreatedSuperhero.getName());
                    System.out.println("Superhero Realname:" + lastCreatedSuperhero.getRealName());
                    System.out.println("Superhero Power:" + lastCreatedSuperhero.getSuperPower());
                    System.out.println("Superhero Strength:" + lastCreatedSuperhero.getStrength());
                    System.out.println("Superhero Race:" + lastCreatedSuperhero.getRace());
                    System.out.println("Superhero was created in the year:" + lastCreatedSuperhero.getYearCreated());
                    System.out.println("--------------------------------------");

                } else {
                    System.out.println("Invalid option. Please choose 1, 2, or 3.");
                }
            } catch (InputMismatchException e) {
                System.out.println("Invalid input. Please enter a number (1, 2, or 3).");
                scanner.nextLine();
            }
        }
    }
}