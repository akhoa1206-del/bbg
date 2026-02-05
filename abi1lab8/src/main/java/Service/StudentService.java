/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Service;

/**
 *
 * @author ASUS
 */
public class StudentService {
    public String trimName(String name){
        return name.trim();
    }
    public String toUpperCase(String name){
        return name.toUpperCase();
    }
    public int countCharacters(String name){
        return name.trim().length();
    }
}
