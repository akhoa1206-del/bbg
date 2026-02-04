/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author ASUS
 */
public class FullTimeEmployee extends Employee {
    private double basicSalary;

    public FullTimeEmployee(String id, String name, double basicSalary) {
        super(id, name);
        this.basicSalary = basicSalary;
    }

    @Override
    public double getSalary() {
        return basicSalary;
    }

    @Override
    public String toString() {
        return "FullTimeEmployee{" +
                "id='" + getId() + '\'' +
                ", name='" + getName() + '\'' +
                ", basicSalary=" + basicSalary +
                ", salary=" + getSalary() +
                '}';
    }
}
