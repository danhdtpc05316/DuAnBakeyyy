/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package duan1;


import Dao.NhanVienDao;
import entity.NhanVien;
import java.util.List;

/**
 *
 * @author ADMIN
 */
public class Test {
    public static void main(String[] args) {
        NhanVienDao dao = new NhanVienDao();
        List<NhanVien> ls = dao.selectAll();
        for(NhanVien nv:ls){
            System.out.println("=>"+nv.toString());
        }     
    }
}
