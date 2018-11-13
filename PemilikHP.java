package TugasPBO;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ACER
 */
public class PemilikHP {
    String nama;
    String alamat;
    String pekerjaan;
    String jeniskelamin;
    String namaHP;
    String typeHP;
    int hargaHP;
    
    PemilikHP(){
        
    }
    public void setNama(String nama){
        this.nama = nama;
    }
    public void setAlamat(String alamat){
        this.alamat = alamat;
    }
    public void setPekerjaan(String pekerjaan){
        this.pekerjaan = pekerjaan;
    }
    public void setJenisKelamin(String jeniskelamin){
        this.jeniskelamin = jeniskelamin;
    }
        public void setNamaHP(String namaHP){
        this.namaHP = namaHP;
    }
    public void setTypeHP(String typeHP){
        this.typeHP = typeHP;
    }
    public void setHargaHP(int hargaHP){
        this.hargaHP = hargaHP;
    }
    
    public String getNama(){
        return this.nama;
    }
    public String getAlamat(){
        return this.alamat;
    }
    public String getPekerjaan(){
        return this.pekerjaan;
    }
    public String getJenisKelamin(){
        return this.jeniskelamin;
    }
    public String getNamaHP(){
        return this.namaHP;
    }
    public String getTypeHP(){
        return this.typeHP;
    }
    public int getHargaHP(){
        return this.hargaHP;
    }

    
    
    }
    
