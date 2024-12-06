package QuanLyChuyenBay;

public class Ghe {
    private String idGhe;
    private char hangGhe; // Y-Economy, B-Business, F-First
    private boolean trangThai; // true = Đã đặt, false = Trống
    private double giaCoBan;

    // Constructor
    public Ghe(String maGhe, char hangGhe, double giaCoBan) {
        this.idGhe = maGhe;
        this.hangGhe = hangGhe;
        this.giaCoBan = giaCoBan;
        this.trangThai = false; // Mặc định là ghế trống
    }

    public String getIdGhe() {
        return idGhe;
    }

    public char getHangGhe() {
        return hangGhe;
    }

    public boolean isTrangThai() {
        return trangThai;
    }

    public double getGiaCoBan() {
        return giaCoBan;
    }

    public void setIdGhe(String idGhe) {
        this.idGhe = idGhe;
    }

    public void setHangGhe(char hangGhe) {
        this.hangGhe = hangGhe;
    }

    public void setTrangThai(boolean trangThai) {
        this.trangThai = trangThai;
    }

    public void setGiaCoBan(double giaCoBan) {
        this.giaCoBan = giaCoBan;
    }


    @Override
    public String toString() {
        return "Ghe{" +
                "idGhe=" + idGhe +
                ", hangGhe=" + hangGhe +
                ", trangThai=" + trangThai +
                ", giaCoBan=" + giaCoBan +
                '}';
    }
}
