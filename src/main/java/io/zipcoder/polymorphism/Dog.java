package io.zipcoder.polymorphism;

public class Dog extends Pet{

    public Dog(String name, int age){
        setName(name);
        setAge(age);
    }

    public Dog(){

    }

    @Override
    public String speak(){
        return "Bark Bark!";
    }

}
