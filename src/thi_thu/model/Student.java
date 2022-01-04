package thi_thu.model;

public class Student extends Person{
    private String lop;
    private String diemSo;

    public Student() {
    }

    public Student(String maId, String hoTen, String ngaySinh, String gioiTinh, String lop, String diemSo) {
        super(maId, hoTen, ngaySinh, gioiTinh);
        this.lop = lop;
        this.diemSo = diemSo;
    }

    public String getLop() {
        return lop;
    }

    public void setLop(String lop) {
        this.lop = lop;
    }

    public String getDiemSo() {
        return diemSo;
    }

    public void setDiemSo(String diemSo) {
        this.diemSo = diemSo;
    }

    @Override
    public String toString() {
        return "Student{" +
                "lop='" + lop + '\'' +
                ", diemSo='" + diemSo + '\'' +
                '}';
    }
}
