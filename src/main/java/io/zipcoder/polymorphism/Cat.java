package io.zipcoder.polymorphism;

public class Cat extends Pet{
    public Cat(String name, int age){
        setName(name);
        setAge(age);
    }
    public Cat(){

    }

    @Override
    public String speak(){
        return "Prrr";
    }
}
