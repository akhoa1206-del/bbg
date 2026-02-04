/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author ASUS
 */
public class PartTimeEmployee extends Employee {
    private int workHours;
    private double salaryPerHour;

    public PartTimeEmployee(String id, String name, int workHours, double salaryPerHour) {
        super(id, name);
        this.workHours = workHours;
        this.salaryPerHour = salaryPerHour;
    }
    @Override 
    public double getSalary(){
        return workHours * salaryPerHour;
    }
    @Override 
    public String toString(){
        return "PartTimeEmployee{" +
                "id='" + getId() + '\'' +
                ", name='" + getName() + '\'' +
                ", workHours=" + workHours +
                ", salaryPerHour=" + salaryPerHour +
                ", salary=" + getSalary() +
                '}';
    }
}
