/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Dao;

import entity.NhanVien;
import java.util.List;

/**
 *
 * @author MSI8
 */
public class NhanVienDao extends duan1Dao<NhanVien, String> {
    String INSERT_SQL = "INSERT INTO NhanVien(id_NV,HoTenNV,MatKhau,VaiTro,GioiTinh,SDT,Email,DiaChi,Hinh) VALUES(?,?,?,?,?,?,?,?,?)";
    String UPDATE_SQL = "UPDATE NhanVien SET MatKhau=?,HoTen=?,VaiTro=? WHERE MaNV=?";
    String DELETE_SQL = "DELETE FROM NhanVien WHERE MaNV =?";
    String SELECT_ALL_SQL = "SELECT*FROM NhanVien";
    String SELECT_BY_ID_SQL = "SELECT*FROM NhanVien WHERE MaNV=?";
    
    
    @Override
    public void insert(NhanVien entity) {
        
    }

    @Override
    public void update(NhanVien entity) {
    }

    @Override
    public void delete(String id) {
    }    

    @Override
    public NhanVien selectById(String id) {
    }   

    @Override
    public List<NhanVien> selectAll() {
    }

    @Override
    protected List<NhanVien> selectBySql(String sql, Object... args) {
    }
    
}
