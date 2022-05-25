package com.company;

public class Human {
    Animal pet;
    Car volvo;
    private Double salary;

    public Double getSalary() {
        System.out.println("Dane o wypłacie były pobrane " + java.time.LocalDateTime.now());
        return this.salary;
    }

    public void setSalary(Double salary) {
        if (salary < 0.0) {
            System.out.println("Chyba Cię powaliło, nie ma niewolnictwa");
        }
        System.out.println("Nowa wypłata wysłana do systemu księgowego");
        System.out.println("Odbierz aneks od Pani Hani");
        System.out.println("Nie ukrywaj dochodów, ZUS i US i tak Cię znajdą");
        this.salary = salary;
    }
}
