// Aeriel Denmark
// Foundation in Application Development

// The following is a program written for an app development course taken towards Computer Science, B.S. degree
// This file is one of several files that links to one another

import java.util.ArrayList;
import java.util.Scanner;

public class Driver {
    private static ArrayList<Dog> dogList = new ArrayList<Dog>();
    // Instance variables (if needed)
    private static ArrayList<Monkey> monkeyList = new ArrayList<Monkey>();

public static void main(String[] args) {

    initializeDogList();
    initializeMonkeyList();

    // Add a loop that displays the menu, accepts the users input
    // and takes the appropriate action.
// For the project submission you must also include input validation
    // and appropriate feedback to the user.
    // Hint: create a Scanner and pass it to the necessary
    // methods
// Hint: Menu options 4, 5, and 6 should all connect to the printAnimals() method.

    String quit = "n";
    while (!quit.equalsIgnoreCase("q")) {
        displayMenu();
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        if (input.equalsIgnoreCase("1")) {
            intakeNewDog(scanner);

        } else if (input.equalsIgnoreCase("2")) {
            intakeNewMonkey(scanner);

        } else if (input.equalsIgnoreCase("3")) {
            reserveAnimal(scanner);

        } else if (input.equalsIgnoreCase("4")) {
            printAnimals("dog");

        } else if (input.equalsIgnoreCase("5")) {
            printAnimals("monkey");

        } else if (input.equalsIgnoreCase("6")) {
            printAnimals("available");

        } else if (input.equalsIgnoreCase("q")) {
            quit = input;

        } else {
            System.out.println("Invalid Selection! Enter a valid selection!");

        }

    }

}

// This method prints the menu options
public static void displayMenu() {
    System.out.println("\n\n");
    System.out.println("\t\t\t\tRescue Animal System Menu");
    System.out.println("[1] Intake a new dog");
    System.out.println("[2] Intake a new monkey");
    System.out.println("[3] Reserve an animal");
    System.out.println("[4] Print a list of all dogs");
    System.out.println("[5] Print a list of all monkeys");
    System.out.println("[6] Print a list of all animals that are not reserved");
    System.out.println("[q] Quit application");
    System.out.println();
    System.out.println("Enter a menu selection");

}

// Adds dogs to a list for testing
public static void initializeDogList() {
    Dog dog1 = new Dog("Spot", "German Shepherd", "male", "1", "25.6", "05-12-2019", "United States", "intake", false, "United States");
    Dog dog2 = new Dog("Rex", "Great Dane", "male", "3", "35.2", "02-03-2020", "United States", "Phase I", false, "United States");
    Dog dog3 = new Dog("Bella", "Chihuahua", "female", "4", "25.6", "12-12-2019", "Canada", "in service", true, "Canada");

    dogList.add(dog1);
    dogList.add(dog2);
    dogList.add(dog3);

}

// Adds monkeys to a list for testing
//Optional for testing
public static void initializeMonkeyList() {
    Monkey monkeyOne = new Monkey("Chiba", "Red Tailed", "male", "1", "25.6", "05-12-2019", "United States", "intake", false, "United States");
    Monkey monkeyTwo = new Monkey("Maya", "Capuchin", "male", "3", "35.2", "02-03-2020", "United States", "Phase I", false, "United States");
    Monkey monkeyThree = new Monkey("Bon", "Rhesus", "female", "4", "25.6", "12-12-2019", "Canada", "in service", true, "Canada");

    monkeyList.add(monkeyOne);
    monkeyList.add(monkeyOne);
    monkeyList.add(monkeyOne);

}

// Complete the intakeNewDog method
// The input validation to check that the dog is not already in the list
// is done for you
public static void intakeNewDog(Scanner scanner) {
    System.out.println("What is the dog's name?");
    String name = scanner.nextLine();

    for (Dog dog : dogList) {
        if (dog.getName().equalsIgnoreCase(name)) {
            System.out.println("\n\nThis dog is already in our system\n\n");
            return; //returns to menu
            }

    }

    // Add the code to instantiate a new dog and add it to the appropriate list
    System.out.println("What is the dog's type?");
    String type = scanner.nextLine();
    System.out.println("What is the dog's gender?");
    String gender = scanner.nextLine();
    System.out.println("What is the dog's age?");
    String age = scanner.nextLine();
    System.out.println("What is the dog's weight?");
    String weight = scanner.nextLine();

    Dog dog = new Dog();
    dog.setName(name);
    dog.setAnimalType(type);
    dog.setGender(gender);
    dog.setAge(age);
    dog.setWeight(weight);
    dog.setReserved(false);
    dog.setTrainingStatus("in service");
    dogList.add(dog);
    System.out.println("Dog Intake Complete");

}

// Complete intakeNewMonkey
//Instantiate and add the new monkey to the appropriate list
// For the project submission you must also  validate the input
// to make sure the monkey doesn't already exist and the species type is allowed
public static void intakeNewMonkey(Scanner scanner) {
    System.out.println("What is the monkey's name?");
    String name = scanner.nextLine();

    for (Monkey monkey : monkeyList) {
        if (monkey.getName().equalsIgnoreCase(name)) {
            System.out.println("\n\nThis monkey is already in our system\n\n");
            return; //returns to menu
            }
    }

    System.out.println("What is the monkey's type?");
    String type = scanner.nextLine();
    System.out.println("What is the monkey's gender?");
    String gender = scanner.nextLine();
    System.out.println("What is the monkey's age?");
    String age = scanner.nextLine();
    System.out.println("What is the monkey's weight?");
    String weight = scanner.nextLine();

    Monkey monkey = new Monkey();
    monkey.setName(name);
    monkey.setAnimalType(type);
    monkey.setGender(gender);
    monkey.setAge(age);
    monkey.setWeight(weight);
    monkey.setReserved(false);
    monkey.setTrainingStatus("in service");
    monkeyList.add(monkey);
    System.out.println("Monkey Intake Complete");

}

// Complete reserveAnimal
// You will need to find the animal by animal type and in service country
public static void reserveAnimal(Scanner scanner) {
    System.out.println("Enter Animal Type: ");
    String animalType = scanner.nextLine();
    System.out.println("Enter Country: ");
    String country = scanner.nextLine();
    for (Dog dog : dogList) {
        if (dog.getAnimalType().equalsIgnoreCase(animalType) && dog.getInServiceLocation().equalsIgnoreCase(country)) {
            dog.setReserved(true);
            return;

        }

    }

    for (Monkey monkey : monkeyList) {
        if (monkey.getAnimalType().equalsIgnoreCase(animalType) && monkey.getInServiceLocation().equalsIgnoreCase(country)) {
            monkey.setReserved(true);
            return;

        }

    }

    System.out.println("No Animals Found of Type : " + animalType + " and Location: " + country);

}

// Complete printAnimals
// Include the animal name, status, acquisition country and if the animal is reserved.
// Remember that this method connects to three different menu items.
// The printAnimals() method has three different outputs
// based on the listType parameter
// dog - prints the list of dogs
// monkey - prints the list of monkeys
// available - prints a combined list of all animals that are
// fully trained ("in service") but not reserved
// Remember that you only have to fully implement ONE of these lists.
// The other lists can have a print statement saying "This option needs to be implemented".
// To score "exemplary" you must correctly implement the "available" list.
public static void printAnimals(String type) {
    if (type.equalsIgnoreCase("dog")) {
        System.out.println("List of Dogs");
        for (Dog dog : dogList)
        System.out.println(dog.toString());

    }

    if (type.equalsIgnoreCase("monkey")) {
        System.out.println("List of Monkeys");
        for (Monkey monkey : monkeyList)
        System.out.println(monkey.toString());

    }

    if (type.equalsIgnoreCase("available")) {
        System.out.println("List of dogs available and in service");

        for (Dog dog : dogList) {
            if (dog.getTrainingStatus().equalsIgnoreCase("in service") && !dog.getReserved()) {
                System.out.println(dog.toString());

            }

        }
        System.out.println("List of monkeys available and in service");
        for (Monkey monkey : monkeyList) {
            if (monkey.getTrainingStatus().equalsIgnoreCase("in service") && !monkey.getReserved()) {
                System.out.println(monkey.toString());
            }
        }
    }
}

}
