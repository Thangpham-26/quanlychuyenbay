package QuanLyChuyenBay;

public class HangBay {
    // Thuộc tính
    private String id;
    private String tenHangBay;
    private ChuyenBay[] danhSachChuyenBay;
    private HanhKhach[] danhSachHanhKhach;
    private int soLuongChuyenBay;
    private int soLuongHanhKhach;

    private static final int MAX_CHUYEN_BAY = 100; // Số lượng chuyến bay tối đa
    private static final int MAX_HANH_KHACH = 1000; // Số lượng hành khách tối đa

    // Constructor
    public HangBay(String id, String tenHangBay) {
        this.id = id;
        this.tenHangBay = tenHangBay;
        this.danhSachChuyenBay = new ChuyenBay[MAX_CHUYEN_BAY];
        this.danhSachHanhKhach = new HanhKhach[MAX_HANH_KHACH];
        this.soLuongChuyenBay = 0;
        this.soLuongHanhKhach = 0;
    }

    // Getter và Setter
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTenHangBay() {
        return tenHangBay;
    }

    public void setTenHangBay(String tenHangBay) {
        this.tenHangBay = tenHangBay;
    }


    // Thêm chuyến bay
    public void themChuyenBay(ChuyenBay chuyenBay) {
        if (soLuongChuyenBay < MAX_CHUYEN_BAY) {
            danhSachChuyenBay[soLuongChuyenBay++] = chuyenBay;
            System.out.println("Đã thêm chuyến bay: " + chuyenBay.getMaChuyenBay());
        } else {
            System.out.println("Không thể thêm chuyến bay. Danh sách đã đầy.");
        }
    }

    // Xóa chuyến bay
    public boolean xoaChuyenBay(String maChuyenBay) {
        for (int i = 0; i < soLuongChuyenBay; i++) {
            if (danhSachChuyenBay[i].getMaChuyenBay().equals(maChuyenBay)) {
                // Dịch chuyển phần tử
                for (int j = i; j < soLuongChuyenBay - 1; j++) {
                    danhSachChuyenBay[j] = danhSachChuyenBay[j + 1];
                }
                danhSachChuyenBay[--soLuongChuyenBay] = null;
                System.out.println("Đã xóa chuyến bay: " + maChuyenBay);
                return true;
            }
        }
        System.out.println("Không tìm thấy chuyến bay: " + maChuyenBay);
        return false;
    }

    // Tìm chuyến bay
    public ChuyenBay timChuyenBay(String maChuyenBay) {
        for (int i = 0; i < soLuongChuyenBay; i++) {
            if (danhSachChuyenBay[i].getMaChuyenBay().equals(maChuyenBay)) {
                return danhSachChuyenBay[i];
            }
        }
        return null;
    }

    // Thêm hành khách
    public void themHanhKhach(HanhKhach hanhKhach) {
        if (soLuongHanhKhach < MAX_HANH_KHACH) {
            danhSachHanhKhach[soLuongHanhKhach++] = hanhKhach;
            System.out.println("Đã thêm hành khách: " + hanhKhach.getId());
        } else {
            System.out.println("Không thể thêm hành khách. Danh sách đã đầy.");
        }
    }

    // Xóa hành khách
    public boolean xoaHanhKhach(String idHanhKhach) {
        for (int i = 0; i < soLuongHanhKhach; i++) {
            if (danhSachHanhKhach[i].getId().equals(idHanhKhach)) {
                // Dịch chuyển phần tử
                for (int j = i; j < soLuongHanhKhach - 1; j++) {
                    danhSachHanhKhach[j] = danhSachHanhKhach[j + 1];
                }
                danhSachHanhKhach[--soLuongHanhKhach] = null;
                System.out.println("Đã xóa hành khách: " + idHanhKhach);
                return true;
            }
        }
        System.out.println("Không tìm thấy hành khách: " + idHanhKhach);
        return false;
    }

    // Tìm hành khách
    public HanhKhach timHanhKhach(String idHanhKhach) {
        for (int i = 0; i < soLuongHanhKhach; i++) {
            if (danhSachHanhKhach[i].getId().equals(idHanhKhach)) {
                return danhSachHanhKhach[i];
            }
        }
        return null;
    }

    // Tính tổng doanh thu
    public double tinhTongDoanhThu() {
        double doanhThu = 0;
        for (int i = 0; i < soLuongChuyenBay; i++) {
            ChuyenBay cb = danhSachChuyenBay[i];
            for (Ticket ve : cb.getDanhSachVe()) {
                if (ve != null && ve.getTrangThai() == 'B') { // Vé đã được đặt
                    doanhThu += ve.getGiaVe();
                }
            }
        }
        return doanhThu;
    }



    // toString()
    @Override
    public String toString() {
        return "Hãng Bay {" +
                "ID='" + id + '\'' +
                ", Tên Hãng Bay='" + tenHangBay + '\'' +
                ", Tổng Số Chuyến Bay=" + soLuongChuyenBay +
                ", Tổng Số Hành Khách=" + soLuongHanhKhach +
                '}';
    }
}
