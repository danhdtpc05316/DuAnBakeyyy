/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Dao;

import entity.LoaiSanPham;
import entity.SanPham;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import ultils.JDBCHelper;

/**
 *
 * @author MSI8
 */
public class LoaiSanPhamDao extends duan1Dao<LoaiSanPham, String>{
    String INSERT_SQL = "INSERT INTO LoaiSanPham(MaLoaiSP,TenLoaiSP) VALUES(?,?)";
    String UPDATE_SQL = "UPDATE LoaiSanPham SET MaLoaiSP=?, TenLoaiSP=? WHERE MaLoaiSP=?"  ;
    String DELETE_SQL = "DELETE FROM LoaiSanPham WHERE MaLoaiSP =?";
    String SELECT_ALL_SQL = "SELECT*FROM SanPham";
    String SELECT_BY_ID_SQL = "SELECT*FROM LoaiSanPham WHERE MaLoaiSP=?";
    @Override
    public void insert(LoaiSanPham entity) {
        JDBCHelper.update(INSERT_SQL,
                entity.getMaLoaiSP(), entity.getTenLoaiSP());
    }

    @Override
    public void update(LoaiSanPham entity) {
        JDBCHelper.update(INSERT_SQL,
                entity.getTenLoaiSP(),entity.getMaLoaiSP());
    }

    @Override
    public void delete(String id) {
        JDBCHelper.update(DELETE_SQL,id);
    }   

    @Override
    public LoaiSanPham selectById(String id) {
        List<LoaiSanPham> list = this.selectBySql(SELECT_BY_ID_SQL, id);
        if (list.isEmpty()) {
            return null;
        }
        return list.get(0);
    }   

    @Override
    public List<LoaiSanPham> selectAll() {
        return this.selectBySql(SELECT_ALL_SQL);
    }

    @Override
    protected List<LoaiSanPham> selectBySql(String sql, Object... args) {
        List<LoaiSanPham> list = new ArrayList<LoaiSanPham>();
        try {
            ResultSet rs = JDBCHelper.query(sql, args);
            while (rs.next()) {
                LoaiSanPham entity = new LoaiSanPham();
                entity.setMaLoaiSP(rs.getString("MaLoaiSP"));
                entity.setTenLoaiSP(rs.getString("TenLoaiSP"));
                list.add(entity);   
            }
            rs.getStatement().getConnection().close();
            return list;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    
}
