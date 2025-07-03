/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Hibernate;

import java.sql.Timestamp;
import java.time.LocalDateTime;
import java.util.*;

/**
 *
 * @author GEMBUL
 */
public class Transaksi {
    private String id;
    private float nominal;
    private String jenis;
    private Timestamp tanggal;
    private String id_saldo;
    private float total_harga;
    
   public Transaksi(){
        
    }
    public Transaksi(String id, float nominal, String jenis, Timestamp tanggal, String id_saldo, float total_harga) {
        this.id = id;
        this.nominal = nominal;
        this.jenis = jenis;
        this.tanggal = tanggal;
        this.id_saldo = id_saldo;
        this.total_harga = total_harga;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public float getNominal() {
        return nominal;
    }

    public void setNominal(float nominal) {
        this.nominal = nominal;
    }

    public String getJenis() {
        return jenis;
    }

    public void setJenis(String jenis) {
        this.jenis = jenis;
    }

    public Timestamp getTanggal() {
        return tanggal;
    }

    public void setTanggal(Timestamp tanggal) {
        this.tanggal = tanggal;
    }

    public String getId_saldo() {
        return id_saldo;
    }

    public void setId_saldo(String id_saldo) {
        this.id_saldo = id_saldo;
    }

    public float getTotal_harga() {
        return total_harga;
    }

    public void setTotal_harga(float total_harga) {
        this.total_harga = total_harga;
    }

}
