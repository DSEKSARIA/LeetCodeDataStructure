package com.streamapi;

import java.math.BigDecimal;
import java.util.List;

public class Employee {
    int id;
    String name;
    BigDecimal salary;
    List<String> address;

    public List<String> getAddress() {
        return address;
    }

    public void setAddress(List<String> address) {
        this.address = address;
    }

    public Employee(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = BigDecimal.valueOf(salary);
    }

    public Employee(int id, String name, double salary, List<String> address) {
        this.id = id;
        this.name = name;
        this.salary = BigDecimal.valueOf(salary);
        this.address = address;
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
