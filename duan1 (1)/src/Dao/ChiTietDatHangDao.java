/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Dao;

import entity.ChiTietDatHang;
import java.util.List;
import ultils.JDBCHelper;

/**
 *
 * @author MSI8
 */
public class ChiTietDatHangDao extends duan1Dao<ChiTietDatHang, Object>{
    String INSERT_SQL = "INSERT INTO ChiTietDatHang(MaChiTietDonHang,  MaDonHang,MaSP, SoLuong, TongTien, MaKhuyenMai, id_NV)VALUES(?,?,?,?)";
    String UPDATE_SQL = "UPDATE ChiTietDatHang SET MaDonHang=?, MaSP=?,SoLuong=?, TongTien=?, MaKhuyenMai=?,id_NV=?  WHERE MaChiTietDonHang=?";
    String DELETE_SQL = "DELETE FROM ChiTietDatHang WHERE MaChiTietDonHang =?";
    String SELECT_ALL_SQL = "SELECT*FROM MaChiTietDonHang";
    String SELECT_BY_ID_SQL = "SELECT*FROM MaChiTietDonHang WHERE MaChiTietDonHang=?";
    @Override
    public void insert(ChiTietDatHang entity) {
        JDBCHelper.update(INSERT_SQL,
                entity.getMaChiTietDonHang(), entity.getMaDonHang(), entity.getMaSP(), entity.getSoLuong(),entity.getTongTien(),entity.getMaKhuyenMai(),entity.getId_NV());
    }

    @Override
    public void update(ChiTietDatHang entity) {
        JDBCHelper.update(UPDATE_SQL,
                entity.getMaChiTietDonHang(), entity.getMaDonHang(), entity.getMaSP(), entity.getSoLuong(),entity.getTongTien(),entity.getMaKhuyenMai(),entity.getId_NV());
       }

    @Override
    public void delete(Object id) {
        JDBCHelper.update(DELETE_SQL,id);    }

    @Override
    public ChiTietDatHang selectById(Object id) {
        List<ChiTietDatHang> list = this.selectBySql(SELECT_BY_ID_SQL, id);
        if (list.isEmpty()) {
            return null;
        }
        return list.get(0);    }

    @Override
    public List<ChiTietDatHang> selectAll() {
        return this.selectBySql(SELECT_ALL_SQL);    }

    @Override
    protected List<ChiTietDatHang> selectBySql(String sql, Object... args) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
