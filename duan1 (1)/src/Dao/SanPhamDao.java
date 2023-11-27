/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Dao;

import entity.NhanVien;
import entity.SanPham;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import ultils.JDBCHelper;

/**
 *
 * @author MSI8
 */
public class SanPhamDao extends duan1Dao<SanPham, String>{
    String INSERT_SQL = "INSERT INTO SanPham(MaSP,TenSP,MaLoaiSP,Gia) VALUES(?,?,?,?)";
    String UPDATE_SQL = "UPDATE SanPham SET TenSp=?, MaLoaiSP=?, Gia=? WHERE MaSP=?"  ;
    String DELETE_SQL = "DELETE FROM SanPham WHERE MaSp =?";
    String SELECT_ALL_SQL = "SELECT*FROM SanPham";
    String SELECT_BY_ID_SQL = "SELECT*FROM SanPham WHERE MaSP=?";

    @Override
    public void insert(SanPham entity) {
       JDBCHelper.update(INSERT_SQL,
                entity.getMaSP(), entity.getTenSP(), entity.getMaLoaiSP(),entity.getGia());
    }

    @Override
    public void update(SanPham entity) {
        JDBCHelper.update(INSERT_SQL,
                entity.getTenSP(), entity.getMaLoaiSP(),entity.getGia(),entity.getMaSP());
    }

    @Override
    public void delete(String id) {
        JDBCHelper.update(DELETE_SQL,id);
    }    

    @Override
    public SanPham selectById(String id) {
        List<SanPham> list = this.selectBySql(SELECT_BY_ID_SQL, id);
        if (list.isEmpty()) {
            return null;
        }
        return list.get(0);
    }   

    @Override
    public List<SanPham> selectAll() {
        return this.selectBySql(SELECT_ALL_SQL);
    }

    @Override
    protected List<SanPham> selectBySql(String sql, Object... args) {
        List<SanPham> list = new ArrayList<SanPham>();
        try {
            ResultSet rs = JDBCHelper.query(sql, args);
            while (rs.next()) {
                SanPham entity = new SanPham();
                entity.setMaSP(rs.getInt("MaSP"));
                entity.setTenSP(rs.getString("TenSp"));
                entity.setMaLoaiSP(rs.getString("MaSP"));
                entity.setGia(rs.getInt("Gia"));
                list.add(entity);   
            }
            rs.getStatement().getConnection().close();
            return list;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    public SanPham selectByLoaiSanPham(String mlsp){
        String sql="SELECT * FROM LoaiSanPham WHERE MaLoaiSP = ?";
        return (SanPham) this.selectBySql(sql, mlsp);
    }
}
