package com.streamapi;

import java.math.BigDecimal;

public class Employee {
    int id;
    String name;
    BigDecimal salary;

    public Employee(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = BigDecimal.valueOf(salary);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public BigDecimal getSalary() {
        return salary;
    }

    public void setSalary(BigDecimal salary) {
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }
}
