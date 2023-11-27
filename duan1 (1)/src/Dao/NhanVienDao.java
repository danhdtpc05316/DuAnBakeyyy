/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Dao;

import entity.NhanVien;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import ultils.JDBCHelper;

/**
 *
 * @author MSI8
 */
public class NhanVienDao extends duan1Dao<NhanVien, String> {
    String INSERT_SQL = "INSERT INTO NhanVien(id_NV,HoTenNV,MatKhau,VaiTro,GioiTinh,SDT,Email,DiaChi,Hinh) VALUES(?,?,?,?,?,?,?,?,?)";
    String UPDATE_SQL = "UPDATE NhanVien SET HoTenNV=?,MatKhau=?,VaiTro=?,GioiTinh=?,SDT=?,Email=?,DiaChi=?,Hinh=? WHERE id_NV=?";
    String DELETE_SQL = "DELETE FROM NhanVien WHERE id_NV =?";
    String SELECT_ALL_SQL = "SELECT*FROM NhanVien";
    String SELECT_BY_ID_SQL = "SELECT*FROM NhanVien WHERE id_NV=?";
    
    
    @Override
    public void insert(NhanVien entity) {
        JDBCHelper.update(INSERT_SQL,
                entity.getId_NV(), entity.getMatKhau(), entity.isVaiTro(),entity.getGioiTinh(),entity.getSDT(),entity.getEmail(),entity.getDiaChi(),entity.getHinh());
    }

    @Override
    public void update(NhanVien entity) {
    JDBCHelper.update(INSERT_SQL,
                entity.getMatKhau(), entity.isVaiTro(),entity.getGioiTinh(),entity.getSDT(),entity.getEmail(),entity.getDiaChi(),entity.getHinh(),entity.getId_NV());
    }

    @Override
    public void delete(String id) {
        JDBCHelper.update(DELETE_SQL,id);
    }    

    @Override
    public NhanVien selectById(String id) {
        List<NhanVien> list = this.selectBySql(SELECT_BY_ID_SQL, id);
        if (list.isEmpty()) {
            return null;
        }
        return list.get(0);
    }   

    @Override
    public List<NhanVien> selectAll() {
        return this.selectBySql(SELECT_ALL_SQL);
    }

    @Override
    protected List<NhanVien> selectBySql(String sql, Object... args) {
        List<NhanVien> list = new ArrayList<NhanVien>();
        try {
            ResultSet rs = JDBCHelper.query(sql, args);
            while (rs.next()) {
                NhanVien entity = new NhanVien();
                entity.setId_NV(rs.getInt("Id_NV"));
                entity.setHoTenNV(rs.getString("HoTenNV"));
                entity.setMatKhau(rs.getString("MatKhau"));
                entity.setVaiTro(rs.getBoolean("VaiTro"));
                entity.setGioiTinh(rs.getInt("GioiTinh"));
                entity.setSDT(rs.getInt("SDT"));
                entity.setEmail(rs.getString("Email"));
                entity.setDiaChi(rs.getString("DiaChi"));
                entity.setHinh(rs.getString("Hinh"));
                list.add(entity);   
            }
            rs.getStatement().getConnection().close();
            return list;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    
}
