package com.example.beansdemo.initialization;

//show order of things happening upon object initialization
// - static blocks
// - instance variables and initializer blocks
// - constructors
public class Dog {
    private String name;
    private int age;
    private boolean bitesBurglars;
    {
        bitesBurglars = true;
    }

    static {
        System.out.println("I'm first");
    }

    public Dog(String name, int age) {
        System.out.println(this);
        this.name = name;
        this.age = age;
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

    public boolean isBitesBurglars() {
        return bitesBurglars;
    }

    public void setBitesBurglars(boolean bitesBurglars) {
        this.bitesBurglars = bitesBurglars;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", bitesBurglars=" + bitesBurglars +
                '}';
    }
}
