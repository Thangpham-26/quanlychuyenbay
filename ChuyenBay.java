package QuanLyChuyenBay;

public class ChuyenBay {
    private String maChuyenBay;
    private String sanBayDi;
    private String sanBayDen;
    private String ngayBay;
    private String gioBay;
    private int soLuongGhe;
    private int soLuongVe;
    private Ghe[] danhSachGhe;
    private char trangThai;
    private Ticket[] danhSachVe;
    private double khoangCachBay;

    private static final int MAX_GHE = 300; // Tổng số ghế tối đa (điều chỉnh theo thiết kế)
    private static final int MAX_VE = 300;  // Tổng số vé tối đa

    public String getMaChuyenBay() {
        return maChuyenBay;
    }

    public String getSanBayDi() {
        return sanBayDi;
    }

    public String getSanBayDen() {
        return sanBayDen;
    }

    public String getNgayBay() {
        return ngayBay;
    }

    public String getGioBay() {
        return gioBay;
    }

    public int getSoLuongGhe() {
        return soLuongGhe;
    }

    public int getSoLuongVe() {
        return soLuongVe;
    }

    public Ghe[] getDanhSachGhe() {
        return danhSachGhe;
    }

    public char getTrangThai() {
        return trangThai;
    }

    public Ticket[] getDanhSachVe() {
        return danhSachVe;
    }

    public double getKhoangCachBay() {
        return khoangCachBay;
    }

    public void setMaChuyenBay(String maChuyenBay) {
        this.maChuyenBay = maChuyenBay;
    }

    public void setSanBayDi(String sanBayDi) {
        this.sanBayDi = sanBayDi;
    }

    public void setSanBayDen(String sanBayDen) {
        this.sanBayDen = sanBayDen;
    }

    public void setNgayBay(String ngayBay) {
        this.ngayBay = ngayBay;
    }

    public void setGioBay(String gioBay) {
        this.gioBay = gioBay;
    }

    public void setSoLuongGhe(int soLuongGhe) {
        this.soLuongGhe = soLuongGhe;
    }

    public void setSoLuongVe(int soLuongVe) {
        this.soLuongVe = soLuongVe;
    }

    public void setDanhSachGhe(Ghe[] danhSachGhe) {
        this.danhSachGhe = danhSachGhe;
    }

    public void setTrangThai(char trangThai) {
        this.trangThai = trangThai;
    }

    public void setDanhSachVe(Ticket[] danhSachVe) {
        this.danhSachVe = danhSachVe;
    }

    public void setKhoangCachBay(double khoangCachBay) {
        this.khoangCachBay = khoangCachBay;
    }

    public ChuyenBay(String maChuyenBay, String sanBayDi, String sanBayDen, String ngayBay, String gioBay, double khoangCachBay) {
        this.maChuyenBay = maChuyenBay;
        this.sanBayDi = sanBayDi;
        this.sanBayDen = sanBayDen;
        this.ngayBay = ngayBay;
        this.gioBay = gioBay;
        this.khoangCachBay = khoangCachBay;
        this.trangThai = 'S'; // Scheduled
        this.danhSachGhe = new Ghe[MAX_GHE];
        this.danhSachVe = new Ticket[MAX_VE];
        this.soLuongGhe = 0;
        this.soLuongVe = 0;
    }
    public void themGhe(Ghe ghe) {
        if (soLuongGhe < MAX_GHE) {
            danhSachGhe[soLuongGhe++] = ghe;
        } else {
            System.out.println("Không thể thêm ghế. Danh sách ghế đã đầy.");
        }
    }
    // Thêm vé
    public void themVe(Ticket ve) {
        if (soLuongVe < MAX_VE) {
            danhSachVe[soLuongVe++] = ve;
        } else {
            System.out.println("Không thể thêm vé. Danh sách vé đã đầy.");
        }
    }

    // Tìm vé
    public Ticket timVe(String maVe) {
        for (int i = 0; i < soLuongVe; i++) {
            if (danhSachVe[i].getMaVe().equals(maVe)) {
                return danhSachVe[i];
            }
        }
        return null;
    }

    // Kiểm tra trạng thái ghế
    public Ghe timGhe(String idGhe) {
        for (int i = 0; i < soLuongGhe; i++) {
            if (danhSachGhe[i].getIdGhe().equals(idGhe)) {
                return danhSachGhe[i];
            }
        }
        return null;
    }
    public double tinhDiemDichVu(double khoangCach, char hangGhe) {
        switch (hangGhe) {
            case 'Y': // Economy
                return khoangCach * 1.0;
            case 'B': // Business
                return khoangCach * 1.5;
            case 'F': // First
                return khoangCach * 2.0;
            default:
                return 0;
        }
    }

    // toString()
    @Override
    public String toString() {
        return "ChuyenBay {" +
                "Mã='" + maChuyenBay + '\'' +
                ", Sân Bay Đi='" + sanBayDi + '\'' +
                ", Sân Bay Đến='" + sanBayDen + '\'' +
                ", Ngày Bay='" + ngayBay + '\'' +
                ", Giờ Bay='" + gioBay + '\'' +
                ", Khoảng Cách=" + khoangCachBay +
                ", Trạng Thái=" + trangThai +
                '}';
    }

}
