package models;

import java.time.LocalDate;

public class Person implements Comparable<Person> {

    private String name;
    private int ticketNummer;
    private int age;
    private LocalDate birthDate;

    public Person(String name, int ticketNummer, int age, LocalDate birthDate) {
        this.name = name;
        this.ticketNummer = ticketNummer;
        this.age = age;
        this.birthDate = birthDate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getTicketNummer() {
        return ticketNummer;
    }

    public void setTicketNummer(int ticketNummer) {
        this.ticketNummer = ticketNummer;
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
        return "Person [name=" + name + ", ticketNummer=" + ticketNummer + ", age=" + age + ", birthDate=" + birthDate
                + "]";
    }

    @Override
    public int compareTo(Person otraPersona) {
        // Compara las personas basándose en el número de ticket
        return Integer.compare(this.ticketNummer, otraPersona.getTicketNummer());
  
    }

    

    
    

}
