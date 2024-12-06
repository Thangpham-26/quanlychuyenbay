package QuanLyChuyenBay;

import java.util.Scanner;

public class QuanLyChuyenBay {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int luaChon;

        do {
                System.out.println("\n=== QUẢN LÝ ĐẶT VÉ MÁY BAY ===");
                System.out.println("1. Quản lý hành khách");
                System.out.println("2. Quản lý chuyến bay");
                System.out.println("3. Đặt vé");
                System.out.println("4. Hủy vé");
                System.out.println("5. Thống kê");
                System.out.println("0. Thoát");

                System.out.print("Nhập lựa chọn: ");
            luaChon = sc.nextInt();

                switch(luaChon) {
                    case 1:
                    HanhKhach hk1=new HanhKhach("HK001","Nguyen Van Nam","2000","0972467");
                    HanhKhach hk2=new HanhKhach("HK002","Pham Van Hung","2004","0972464");
                    HanhKhach hk3=new HanhKhach("HK003","Phan Thi Hoai","2001","0452467");
                    HanhKhach hk4=new HanhKhach("HK004","Nguyen Thi Hoa","1990","0972490");
                    HanhKhach hk5=new HanhKhach("HK005","Tran Quoc Anh","1999","0672467");
                        hk1.toString();
                        hk2.toString();
                        hk3.toString();
                        hk4.toString();
                        hk5.toString();

                        break;
                    case 2:

                        break;
                    case 3:

                        break;
                    case 4:

                        break;
                    case 5:

                        break;
                    case 0:
                        System.out.println("Tạm biệt!");
                        break;
                    default:
                        System.out.println("Lựa chọn không hợp lệ!");
                }
            } while (luaChon  <0 || luaChon>5);
        }
    }



