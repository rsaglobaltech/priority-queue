package models;

import java.time.LocalDate;

public class Empleado extends Person {

    private int salario;

    public Empleado(String name, int age, LocalDate birthDate, int salario) {
        super(name, age, birthDate);
        this.salario = salario;
    }

    @Override
    public String toString(){
        return this.name + " " + this.age + " " + this.salario;    
    }
}
