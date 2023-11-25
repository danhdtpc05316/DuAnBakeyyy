/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entity;

/**
 *
 * @author MSI8
 */
public class DatHang {
    private int MaDonHang;
    private String NgayDatHang;
    private int TongTien;
    
    public DatHang(int MaDonHang, String NgayDatHang, int TongTien){
        this.MaDonHang = MaDonHang;
        this.NgayDatHang = NgayDatHang;
        this.TongTien = TongTien;
    }

    public int getMaDonHang() {
        return MaDonHang;
    }

    public void setMaDonHang(int MaDonHang) {
        this.MaDonHang = MaDonHang;
    }

    public String getNgayDatHang() {
        return NgayDatHang;
    }

    public void setNgayDatHang(String NgayDatHang) {
        this.NgayDatHang = NgayDatHang;
    }

    public int getTongTien() {
        return TongTien;
    }

    public void setTongTien(int TongTien) {
        this.TongTien = TongTien;
    }
    
}
