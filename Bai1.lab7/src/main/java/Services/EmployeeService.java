/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Services;
import Model.Employee;
import java.util.ArrayList;
/**
 *
 * @author ASUS
 */
public class EmployeeService {
    public void showAll(ArrayList<Employee> list) {
        for (Employee e : list) {
            System.out.println(e);
            System.out.println("Salary = " + e.getSalary());
            System.out.println("--------------------");
        }
    }
}
