/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entity;

import java.util.Date;

/**
 *
 * @author MSI8
 */
public class lichlamviec {
    private int id;
    private int id_NhanVien;
    private int id_CaTruc;
    private Date ngaylamviec;
    
    public lichlamviec(int id,int id_NhanVien,int id_CaTruc, Date ngaylamviec){
        this.id = id;
        this.id_CaTruc = id_CaTruc;
        this.id_NhanVien = id_NhanVien;
        this.ngaylamviec = ngaylamviec;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId_NhanVien() {
        return id_NhanVien;
    }

    public void setId_NhanVien(int id_NhanVien) {
        this.id_NhanVien = id_NhanVien;
    }

    public int getId_CaTruc() {
        return id_CaTruc;
    }

    public void setId_CaTruc(int id_CaTruc) {
        this.id_CaTruc = id_CaTruc;
    }

    public Date getNgaylamviec() {
        return ngaylamviec;
    }

    public void setNgaylamviec(Date ngaylamviec) {
        this.ngaylamviec = ngaylamviec;
    }
        
}
