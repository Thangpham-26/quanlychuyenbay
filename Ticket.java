package QuanLyChuyenBay;

public class Ticket {
    private String maVe;
    private String maChuyenBay;
    private String maGhe;
    private char hangGhe;
    private double giaVe;
    private char trangThai;
    private HanhKhach hanhKhach;
    private String ngayDatVe;

    public void setMaVe(String maVe) {
        this.maVe = maVe;
    }

    public void setMaChuyenBay(String maChuyenBay) {
        this.maChuyenBay = maChuyenBay;
    }

    public void setMaGhe(String maGhe) {
        this.maGhe = maGhe;
    }

    public void setHangGhe(char hangGhe) {
        this.hangGhe = hangGhe;
    }

    public void setGiaVe(double giaVe) {
        this.giaVe = giaVe;
    }

    public void setTrangThai(char trangThai) {
        this.trangThai = trangThai;
    }

    public void setHanhKhach(HanhKhach hanhKhach) {
        this.hanhKhach = hanhKhach;
    }

    public void setNgayDatVe(String ngayDatVe) {
        this.ngayDatVe = ngayDatVe;
    }

    public String getMaVe() {
        return maVe;
    }



    public String getMaChuyenBay() {
        return maChuyenBay;
    }

    public String getMaGhe() {
        return maGhe;
    }

    public char getHangGhe() {
        return hangGhe;
    }

    public double getGiaVe() {
        return giaVe;
    }

    public char getTrangThai() {
        return trangThai;
    }

    public HanhKhach getHanhKhach() {
        return hanhKhach;
    }

    public String getNgayDatVe() {
        return ngayDatVe;
    }

    // Constructor
    public Ticket(String maVe, String maChuyenBay, String maGhe,
                  char hangGhe, HanhKhach hanhKhach) {
        this.maVe = maVe;
        this.maChuyenBay = maChuyenBay;
        this.maGhe = maGhe;
        this.hangGhe = hangGhe;
        this.hanhKhach = hanhKhach;
        this.trangThai = 'B';
        this.giaVe = tinhGiaVe();

    }

    private double tinhGiaVe() {
        double giaCoBan = 0;
        switch(hangGhe) {
            case 'Y': giaCoBan = 1000000; break;
            case 'B': giaCoBan = 3000000; break;
            case 'F': giaCoBan = 5000000; break;
        }

        // Áp dụng giảm giá theo hạng thẻ
        switch(hanhKhach.getHangTheThanhVien()) {
            case 'S': giaCoBan *= 0.95; break;
            case 'G': giaCoBan *= 0.90; break;
        }

        return giaCoBan;
    }

    @Override
    public String toString() {
        return "Ticket{" +
                "maVe='" + maVe + '\'' +
                ", maChuyenBay='" + maChuyenBay + '\'' +
                ", maGhe='" + maGhe + '\'' +
                ", hangGhe=" + hangGhe +
                ", giaVe=" + giaVe +
                ", trangThai=" + trangThai +
                ", hanhKhach=" + hanhKhach +
                ", ngayDatVe='" + ngayDatVe + '\'' +
                '}';
    }
}
