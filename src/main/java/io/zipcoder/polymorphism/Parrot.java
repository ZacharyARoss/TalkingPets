package io.zipcoder.polymorphism;

public class Parrot extends Pet{
    String name;
    int age;

    public Parrot(String name, int age){
            setName(name);
            setAge(age);
    }

    public String getName() {return name;}

    public void setName(String name) {this.name = name;}

    public int getAge() {return age;}

    public void setAge(int age) {this.age = age;}

    @Override
    public String speak(){return "Polly want a cracker!";}
}
