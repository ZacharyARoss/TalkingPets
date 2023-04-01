package io.zipcoder.polymorphism;
import java.util.Scanner;


public class MainApplication {
    public static void main(String[] args) {
        MainApplication main = new MainApplication();
        main.getPets();
    }

    public String getPets(){
        Scanner scanner = new Scanner(System.in);

        System.out.println("How many Pets do you have?");
        int numPets = scanner.nextInt();
        System.out.println("What are each of their names?");
        String petNames = scanner.nextLine();
        return "So you have " + numPets + " and their names are " + petNames + ". That is wonderful!";
    }
}

