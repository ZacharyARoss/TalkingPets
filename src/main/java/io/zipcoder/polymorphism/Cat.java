package io.zipcoder.polymorphism;

public class Cat extends Pet{
    String name;
    int age;
    public Cat(String name, int age){
        setName(name);
        setAge(age);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String speak(){
        return "Prrr";
    }
}
