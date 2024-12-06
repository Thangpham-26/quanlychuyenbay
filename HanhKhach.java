package QuanLyChuyenBay;

import java.util.Date;

public class HanhKhach implements IHanhKhach {
    private String id; // KHxxx
    private String ten;
    private String namSinh;
    private String soHoChieu; // 8 ký tự
    private String idHangBay;
    private String maTheThanhVien;
    private double soDamBayTichLuy;
    private char hangTheThanhVien;
    private double diemBayTichLuy;
    private Ticket[] danhSachVe;
    private String diaChi;
    private static int soVeToiDa=5;
    private int demSoVeDaDat;
    private Date kiemTraThoiGianDatVe;

    public HanhKhach(String id, String ten, String namSinh, String soHoChieu) {
        this.id = id;
        this.ten = ten;
        this.namSinh = namSinh;
        this.soHoChieu = soHoChieu;
        this.soDamBayTichLuy=0;
        this.hangTheThanhVien='B';
        this.danhSachVe = new Ticket[soVeToiDa];
    }
    private int demSoVeDaDat() {
        int count = 0;
        for (Ticket ve : danhSachVe) {
            if (ve != null && ve.getTrangThai() == 'B') {
                count++;
            }
        }
        return count;
    }
    private boolean kiemTraThoiGianDatVe(String maChuyenBay) {

        return true; // Giả sử luôn hợp lệ
    }
    public Date getCurrentDateTime(){
        return new Date();
    }

    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
    public String getTen() {
        return ten;
    }
    public void setTen(String ten) {
        this.ten = ten;
    }
    public String getNamSinh() {
        return namSinh;
    }
    public void setNamSinh(String namSinh) {
        this.namSinh = namSinh;
    }
    public String getSoHoChieu() {
        return soHoChieu;
    }
    public void setSoHoChieu(String soHoChieu) {
        this.soHoChieu = soHoChieu;
    }
    public String getIdHangBay() {
        return idHangBay;
    }
    public void setIdHangBay(String idHangBay) {
        this.idHangBay = idHangBay;
    }
    public String getMaTheThanhVien() {
        return maTheThanhVien;
    }
    public void setMaTheThanhVien(String maTheThanhVien) {
        this.maTheThanhVien = maTheThanhVien;
    }
    public double getSoDamBayTichLuy() {
        return soDamBayTichLuy;
    }
    public char getHangTheThanhVien() {
        return hangTheThanhVien;
    }
    public void setHangTheThanhVien(char hangTheThanhVien) {
        this.hangTheThanhVien = hangTheThanhVien;
    }
    public double getDiemBayTichLuy() {
        return diemBayTichLuy;
    }
    public Ticket[] getDanhSachVe() {
        return danhSachVe;
    }
    public void setDanhSachVe(Ticket[] danhSachVe) {
        this.danhSachVe = danhSachVe;
    }
    public String getDiaChi() {
        return diaChi;
    }
    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }
    public int getSoVeToiDa() {
        return soVeToiDa;
    }
    public void setSoVeToiDa(int soVeToiDa) {
        this.soVeToiDa = soVeToiDa;
    }
    public int getDemSoVeDaDat() {
        return demSoVeDaDat;
    }
    public void setDemSoVeDaDat(int demSoVeDaDat) {
        this.demSoVeDaDat = demSoVeDaDat;
    }
    @Override
    public boolean datVe(String maChuyenBay, char hangGhe) {
        // Kiểm tra số vé đã đặt
        if (soVeToiDa <= demSoVeDaDat()) {
            System.out.println("Đã đạt số vé tối đa!");
            return false;
        }

        // Kiểm tra thời gian đặt vé
        if (!kiemTraThoiGianDatVe(maChuyenBay)) {
            System.out.println("Không thể đặt vé trước giờ bay dưới 2 giờ!");
            return false;
        } else {
            return true;

        }
    }
    public void capNhatHangThe(double diemTichLuy) {
        if (diemTichLuy >= 50000) {
            hangTheThanhVien = 'G'; // Gold
        } else if (diemTichLuy >= 10000) {
            hangTheThanhVien = 'S'; // Silver
        } else {
            hangTheThanhVien = 'B'; // Basic
        }
    }
    @Override
    public boolean huyVe(String maVe) {
        return false;
    }

    @Override
    public boolean doiVe(String maVeCu, String maChuyenBayMoi) {
        return false;
    }

    @Override
    public String kiemTraTrangThaiVe(String maVe) {
        return "";
    }

    @Override
    public void tichLuyDiemBay(double khoangCach, char hangGhe) {

    }
    // Constructor, Getter/Setter


}

