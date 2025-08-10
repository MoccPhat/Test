package Folder_File.SinhVien;

import java.io.Serializable;

public class SinhVien implements Comparable<SinhVien>, Serializable {
    private String maSinhVien;
    private String hoVaTen;
    private int namSinh;
    private double diemTB;

    public SinhVien(String maSinhVien, String hoVaTen, int namSinh, double diemTB) {
        this.maSinhVien = maSinhVien;
        this.hoVaTen = hoVaTen;
        this.namSinh = namSinh;
        this.diemTB = diemTB;
    }

    public SinhVien(String maSinhVien) {
        this.maSinhVien = maSinhVien;
    }

    public String getMaSinhVien() {
        return this.maSinhVien;
    }

    public void setMaSinhVien(String maSinhVien) {
        this.maSinhVien = maSinhVien;
    }

    public String getHoVaTen() {
        return this.hoVaTen;
    }

    public void setHoVaTen(String hoVaTen) {
        this.hoVaTen = hoVaTen;
    }

    public int getNamSinh() {
        return this.namSinh;
    }

    public void setNamSinh(int namSinh) {
        this.namSinh = namSinh;
    }

    public double getDiemTB() {
        return this.diemTB;
    }

    public void setDiemTB(double diemTB) {
        this.diemTB = diemTB;
    }

    @Override
    public String toString() {
        return "SinhVien [maSinhVien= " + maSinhVien + ", hoVaTen= " + hoVaTen + ", namSinh= " + namSinh + ", DiemTB= "
                + diemTB + "]";
    }

    // 6 Kiem tra sinh vien co ton tai khong
    @Override
    public int compareTo(SinhVien o) {
        return this.maSinhVien.compareTo(o.maSinhVien);
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((maSinhVien == null) ? 0 : maSinhVien.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        SinhVien other = (SinhVien) obj;
        if (maSinhVien == null) {
            if (other.maSinhVien != null)
                return false;
        } else if (!maSinhVien.equals(other.maSinhVien))
            return false;
        return true;
    }

}