package br.com.alura.knowledge08.module02;

import java.math.BigDecimal;
import java.time.LocalDate;

public class Employee {
    private String name;
    private LocalDate hiredDate;
    private BigDecimal salary;

    public Employee(String name, LocalDate hiredDate, BigDecimal salary) {
        this.name = name;
        this.hiredDate = hiredDate;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public LocalDate getHiredDate() {
        return hiredDate;
    }

    public BigDecimal getSalary() {
        return salary;
    }
}
