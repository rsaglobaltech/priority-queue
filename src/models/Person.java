package models;

import java.time.LocalDate;

public class Person {

    protected String name;
    protected int age;
    private LocalDate birthDate;

    public Person(String name, int age, LocalDate birthDate) {
        this.name = name;
        this.age = age;
        this.birthDate = birthDate;
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

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }


    @Override
    public String toString() {
        return "Person [name=" + name + ", age=" + age + ", birthDate=" + birthDate + "]";
    }    

}
