package io.zipcoder.polymorphism;

public class Parrot extends Pet{
    public Parrot(String name, int age){
            setName(name);
            setAge(age);
    }
    public Parrot(){
    }
    @Override
    public String speak(){return "Polly want a cracker!";}
}
