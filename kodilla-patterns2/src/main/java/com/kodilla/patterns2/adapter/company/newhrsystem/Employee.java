package com.kodilla.patterns2.adapter.company.newhrsystem;

import java.math.BigDecimal;

public class Employee {
    final private String peselId;
    final private String firstname;
    final private String lastmane;
    final BigDecimal baseSalary;

    public Employee(String peselId, String firstname, String lastmane, BigDecimal baseSalary) {
        this.peselId = peselId;
        this.firstname = firstname;
        this.lastmane = lastmane;
        this.baseSalary = baseSalary;
    }

    public String getPeselId() {
        return peselId;
    }

    public String getFirstname() {
        return firstname;
    }

    public String getLastmane() {
        return lastmane;
    }

    public BigDecimal getBaseSalary() {
        return baseSalary;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Employee)) return false;

        Employee employee = (Employee) o;

        return getPeselId() != null ? getPeselId().equals(employee.getPeselId()) : employee.getPeselId() == null;
    }

    @Override
    public int hashCode() {
        return getPeselId() != null ? getPeselId().hashCode() : 0;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "peselId='" + peselId + '\'' +
                ", firstname='" + firstname + '\'' +
                ", lastmane='" + lastmane + '\'' +
                ", baseSalary=" + baseSalary +
                '}';
    }
}
