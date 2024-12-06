package QuanLyChuyenBay;

public interface IHanhKhach {
    boolean datVe(String maChuyenBay, char hangGhe);
    boolean huyVe(String maVe);
    boolean doiVe(String maVeCu, String maChuyenBayMoi);
    String kiemTraTrangThaiVe(String maVe);
    void tichLuyDiemBay(double khoangCach, char hangGhe);
}
