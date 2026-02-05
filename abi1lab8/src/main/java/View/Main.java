/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package View;
import Service.StudentService;
import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        StudentService service = new StudentService();
        
        System.out.println("Nhập họ tên sinh viên: ");
        String name = scan.nextLine();
        
        name = service.trimName(name);
        
        System.out.println("Họ tên in hoa: " + service.toUpperCase(name));
        System.out.println("Số ký tự: " + service.countCharacters(name));
    }
}
    