/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entity;

/**
 *
 * @author MSI8
 */
public class catruc {
    private int id_CaTruc;
    private String ten_catruc;
    
    public catruc(int id_CaTruc, String ten_catruc){
        this.id_CaTruc = id_CaTruc;
        this.ten_catruc = ten_catruc;
    }

    public int getId_CaTruc() {
        return id_CaTruc;
    }

    public void setId_CaTruc(int id_CaTruc) {
        this.id_CaTruc = id_CaTruc;
    }

    public String getTen_catruc() {
        return ten_catruc;
    }

    public void setTen_catruc(String ten_catruc) {
        this.ten_catruc = ten_catruc;
    }
            
}
