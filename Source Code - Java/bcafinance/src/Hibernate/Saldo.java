/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Hibernate;

/**
 *
 * @author GEMBUL
 */
public class Saldo {
    String id_saldo;
    String pemilik_saldo;
    float total_saldo;

    public Saldo(){
        
    }
    public Saldo(String id_saldo, String pemilik_saldo, float total_saldo) {
        this.id_saldo = id_saldo;
        this.pemilik_saldo = pemilik_saldo;
        this.total_saldo = total_saldo;
    }

    public String getId_saldo() {
        return id_saldo;
    }

    public void setId_saldo(String id_saldo) {
        this.id_saldo = id_saldo;
    }

    public String getPemilik_saldo() {
        return pemilik_saldo;
    }

    public void setPemilik_saldo(String pemilik_saldo) {
        this.pemilik_saldo = pemilik_saldo;
    }

    public float getTotal_saldo() {
        return total_saldo;
    }

    public void setTotal_saldo(float total_saldo) {
        this.total_saldo = total_saldo;
    }
    
    
}
