package io.zipcoder.polymorphism;
package io.zipcoder.Pets;
import java.util.Scanner;


public class MainApplication {
    public class Pets {

    }

    public class Dog extends Pets {

    }

    public class Cat extends Pets {

    }

    public class X extends Pets {

    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("How many Pets do you have?");
        String numPets = scanner.nextLine();
    }
}

