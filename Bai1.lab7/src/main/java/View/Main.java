package View;

import Model.Employee;
import Model.FullTimeEmployee;
import Model.PartTimeEmployee;
import Services.EmployeeService;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Employee> list = new ArrayList<>();

        Employee e1 = new FullTimeEmployee("FT01", "Nguyen Van A", 15000000);
        Employee e2 = new PartTimeEmployee("PT01", "Tran Thi B", 80, 50000);

        list.add(e1);
        list.add(e2);

        EmployeeService service = new EmployeeService();
        service.showAll(list);
    }
}
