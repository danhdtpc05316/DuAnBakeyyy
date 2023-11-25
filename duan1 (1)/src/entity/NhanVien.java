/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entity;

/**
 *
 * @author MSI8
 */
public class NhanVien {
    private int id_NV;
    private String HoTenNV;
    private String MatKhau;
    private double VaiTro;
    private int GioiTinh;
    private int SDT;
    private String Email;
    private String DiaChi;
    private String Hinh;
    
    public NhanVien(int id_NV, String HoTenNV, String MatKhau, double VaiTro, int GioiTinh, int SDT,String Email, String DiaChi, String Hinh){
        this.id_NV = id_NV;
        this.HoTenNV = HoTenNV;
        this.MatKhau = MatKhau;
        this.VaiTro = VaiTro;
        this.GioiTinh = GioiTinh;
        this.Email = Email;
        this.DiaChi = DiaChi;
        this.Hinh = Hinh;
    }

    public int getId_NV() {
        return id_NV;
    }

    public void setId_NV(int id_NV) {
        this.id_NV = id_NV;
    }

    public String getHoTenNV() {
        return HoTenNV;
    }

    public void setHoTenNV(String HoTenNV) {
        this.HoTenNV = HoTenNV;
    }

    public String getMatKhau() {
        return MatKhau;
    }

    public void setMatKhau(String MatKhau) {
        this.MatKhau = MatKhau;
    }

    public double getVaiTro() {
        return VaiTro;
    }

    public void setVaiTro(double VaiTro) {
        this.VaiTro = VaiTro;
    }

    public int getGioiTinh() {
        return GioiTinh;
    }

    public void setGioiTinh(int GioiTinh) {
        this.GioiTinh = GioiTinh;
    }

    public int getSDT() {
        return SDT;
    }

    public void setSDT(int SDT) {
        this.SDT = SDT;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    public String getDiaChi() {
        return DiaChi;
    }

    public void setDiaChi(String DiaChi) {
        this.DiaChi = DiaChi;
    }

    public String getHinh() {
        return Hinh;
    }

    public void setHinh(String Hinh) {
        this.Hinh = Hinh;
    }
    
}
