package thi_thu.model;

public class Teacher extends Person {
    private String chuyenMon;

    public Teacher() {
    }

    public Teacher(String maId, String hoTen, String ngaySinh, String gioiTinh, String chuyenMon) {
        super(maId, hoTen, ngaySinh, gioiTinh);
        this.chuyenMon = chuyenMon;
    }

    public String getChuyenMon() {
        return chuyenMon;
    }

    public void setChuyenMon(String chuyenMon) {
        this.chuyenMon = chuyenMon;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "chuyenMon='" + chuyenMon + '\'' +
                '}';
    }
}
