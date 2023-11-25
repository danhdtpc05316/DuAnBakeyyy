/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entity;

/**
 *
 * @author MSI8
 */
public class KhuyenMai {
    private int MaKhuyenMai;
    private String tenKhuyenMai;
    private int ChietKhau;
    private String NgayBatDau;
    private String NgayKetThuc;
    private String ChiTiet; 
    
    public KhuyenMai(int MaKhuyenMai, String tenKhuyenMai, int ChietKhau, String NgayBatDau, String NgayKetThuc, String ChiTiet){
        this.MaKhuyenMai = MaKhuyenMai;
        this.tenKhuyenMai = tenKhuyenMai;
        this.ChietKhau = ChietKhau;
        this.NgayBatDau = NgayBatDau;
        this.NgayKetThuc = NgayKetThuc;
        this.ChiTiet = ChiTiet;
    }

    public int getMaKhuyenMai() {
        return MaKhuyenMai;
    }

    public void setMaKhuyenMai(int MaKhuyenMai) {
        this.MaKhuyenMai = MaKhuyenMai;
    }

    public String getTenKhuyenMai() {
        return tenKhuyenMai;
    }

    public void setTenKhuyenMai(String tenKhuyenMai) {
        this.tenKhuyenMai = tenKhuyenMai;
    }

    public int getChietKhau() {
        return ChietKhau;
    }

    public void setChietKhau(int ChietKhau) {
        this.ChietKhau = ChietKhau;
    }

    public String getNgayBatDau() {
        return NgayBatDau;
    }

    public void setNgayBatDau(String NgayBatDau) {
        this.NgayBatDau = NgayBatDau;
    }

    public String getNgayKetThuc() {
        return NgayKetThuc;
    }

    public void setNgayKetThuc(String NgayKetThuc) {
        this.NgayKetThuc = NgayKetThuc;
    }

    public String getChiTiet() {
        return ChiTiet;
    }

    public void setChiTiet(String ChiTiet) {
        this.ChiTiet = ChiTiet;
    }
    
}
