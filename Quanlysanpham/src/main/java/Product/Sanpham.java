/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Product;
import java.util.Scanner;
/**
 *
 * @author ASUS
 */
public class Sanpham {
    String maSP;
    String tenSP;
    double donGia;
    int soLuong;

    public Sanpham() {
    }

    public Sanpham(String maSP, String tenSP, double donGia, int soLuong) {
        this.maSP = maSP;
        this.tenSP = tenSP;
        this.donGia = donGia;
        this.soLuong = soLuong;
    }

    public String getMaSP() {
        return maSP;
    }

    public void setMaSP(String maSP) {
        this.maSP = maSP;
    }

    public String getTenSP() {
        return tenSP;
    }

    public void setTenSP(String tenSP) {
        this.tenSP = tenSP;
    }

    public double getDonGia() {
        return donGia;
    }

    public void setDonGia(double donGia) {
        this.donGia = donGia;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }
    
    public void Nhap(){
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Nhập mã sản phẩm: ");
        maSP = scan.nextLine();
        System.out.println("Nhập tên sản phẩm: ");
        tenSP = scan.nextLine();
        System.out.println("Nhập đơn giá: ");
        donGia = scan.nextDouble();
        System.out.println("Nhập số lượng: ");
        soLuong = scan.nextInt();      
    }
    public double thanhTien(){
        return donGia * soLuong;
    }
    public void Xuat(){
        System.out.println(
                "Mã sản phẩm: " + maSP + " | " +
                "Tên sản phẩm: " + tenSP + " | " +
                "Đơn giá: " + donGia + " | " +
                "Số lượng: " + soLuong + " | " +
                "Thành tiền: " + thanhTien());
    }
    
    public void CapNhat(){
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Nhập tên mới: ");
        tenSP = scan.nextLine();
        System.out.println("Nhập đơn giá mới: ");
        donGia = scan.nextDouble();    
        System.out.println("Nhập số lượng mới: ");
        soLuong = scan.nextInt();
    }
}

