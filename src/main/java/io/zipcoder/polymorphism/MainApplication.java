package io.zipcoder.polymorphism;
import java.util.ArrayList;
import java.util.Scanner;


public class MainApplication {
    Scanner in = new Scanner(System.in);
    public static void main(String[] args) {
        MainApplication main = new MainApplication();
        main.printPets();
    }

    public void printPets(){
        int numPets = getPetsNum();
        ArrayList<Pet> pets = getPetsTypes();
        System.out.println("So you have " + numPets + " pets, and their names are: ");
        for(Pet p : pets){
            System.out.println(p.getName() + " and they say " + p.speak());
        }
        System.out.println("They are all beautiful pets. We love them very much.");
    }

    public int getPetsNum(){
        System.out.println("How many Pets do you have?");
        return Integer.parseInt(in.nextLine());
    }

    public ArrayList<Pet> getPetsTypes(){
        System.out.println("What kind of pets are they?");
        String petsInput = in.nextLine();
        ArrayList<Pet> petsArray = new ArrayList<>();
        String[] pets = petsInput.split(" ");
        for(String p : pets){
            if(p.equalsIgnoreCase("cat")){
                petsArray.add(getPetsNames(new Cat(),p));
            }else if(p.equalsIgnoreCase("dog")){
                petsArray.add(getPetsNames(new Dog(),p));
            }else if(p.equalsIgnoreCase("parrot")){
                petsArray.add(getPetsNames(new Parrot(),p));
            }else{
                petsArray.add(getPetsNames(new Pet(),p));
            }
        }
        return petsArray;
    }

    public Pet getPetsNames(Pet p, String s){
        System.out.println("What is your " + s + "'s name?");
        p.setName(in.nextLine());
        return p;
    }

}

