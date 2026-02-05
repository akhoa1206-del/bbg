/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package java1.quanlysanpham;
import java.util.Scanner;
import Product.Sanpham;
import java.util.ArrayList;
/**
 *
 * @author ASUS
 */
public class Quanlysanpham {

    public static void main(String[] args) {
         Scanner scan = new Scanner(System.in);
        ArrayList<Sanpham> ds = new ArrayList<>();
        int option;

        while (true) {
            System.out.println("\n===== MENU =====");
            System.out.println("1. Thêm sản phẩm");
            System.out.println("2. Xem sản phẩm");
            System.out.println("3. Cập nhật sản phẩm");
            System.out.println("0. Thoát");
            System.out.print("Vui lòng chọn: ");

            option = scan.nextInt();

            switch (option) {
                case 1:
                    Sanpham sp = new Sanpham();
                    sp.Nhap();
                    ds.add(sp);
                    System.out.println("Đã thêm sản phẩm");
                    break;

                case 2:
                    if (ds.isEmpty()) {
                        System.out.println("Danh sách trống");
                    } else {
                        for (Sanpham p : ds) {
                            p.Xuat();
                        }
                    }
                    break;

                case 3:
                    System.out.println("Chức năng cập nhật đang xây dựng");
                    System.out.println("Vui lòng chờ cập nhật trong 24 giờ tiếp theo");
                    break;

                case 0:
                    System.out.println("Thoát chương trình");
                    scan.close();
                    return; // thoát hẳn chương trình

                default:
                    System.out.println("Chức năng không hợp lệ.");
            }
        }
    }
}
