/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entity;
/**
 *
 * @author MSI8
 */
public class ChiTietDatHang {
    private int MaChiTietDonHang;
    private int MaDonHang;
    private int MaSP;
    private int SoLuong;
    private int TongTien;
    private int MaKhuyenMai;
    private int id_NV;
    
    public ChiTietDatHang (int MaChiTietDonHang, int MaDonHang, int MaSP, int SoLuong, int TongTien, int MaKhuyenMai, int id_NV){
        this.MaChiTietDonHang = MaChiTietDonHang;
        this.MaDonHang = MaDonHang;
        this.MaSP = MaSP;
        this.SoLuong = SoLuong;
        this.TongTien = TongTien;
        this.MaKhuyenMai = MaKhuyenMai;
        this.id_NV = id_NV;
    }

    public int getMaChiTietDonHang() {
        return MaChiTietDonHang;
    }

    public void setMaChiTietDonHang(int MaChiTietDonHang) {
        this.MaChiTietDonHang = MaChiTietDonHang;
    }

    public int getMaDonHang() {
        return MaDonHang;
    }

    public void setMaDonHang(int MaDonHang) {
        this.MaDonHang = MaDonHang;
    }

    public int getMaSP() {
        return MaSP;
    }

    public void setMaSP(int MaSP) {
        this.MaSP = MaSP;
    }

    public int getSoLuong() {
        return SoLuong;
    }

    public void setSoLuong(int SoLuong) {
        this.SoLuong = SoLuong;
    }

    public int getTongTien() {
        return TongTien;
    }

    public void setTongTien(int TongTien) {
        this.TongTien = TongTien;
    }

    public int getMaKhuyenMai() {
        return MaKhuyenMai;
    }

    public void setMaKhuyenMai(int MaKhuyenMai) {
        this.MaKhuyenMai = MaKhuyenMai;
    }

    public int getId_NV() {
        return id_NV;
    }

    public void setId_NV(int id_NV) {
        this.id_NV = id_NV;
    }
    
            
            
    
}
