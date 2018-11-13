/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TugasPBO;

/**
 *
 * @author ACER
 */

public class DataPemilikHP {
    public static void main(String args[]){
        PemilikHP a = new PemilikHP();
        a.nama = "Okta Dwi Rianto";
        System.out.println("Nama Pemilik    :" +a.nama);
        
        a.alamat = "Pontianak";
        System.out.println("Alamat Pemilik  :" +a.alamat);
        
        a.pekerjaan = "Mahasiswa";
        System.out.println("Pekerjaan       :" +a.pekerjaan);
        
        a.jeniskelamin = "Laki-Laki";
        System.out.println("Jenis Kelamin   :" +a.jeniskelamin);
        
        a.namaHP = "Xiaomi";
        System.out.println("Merk HP         :" +a.namaHP);
        
        a.typeHP = "Redmi S2";
        System.out.println("Type HP         :" +a.typeHP);
        
        a.setHargaHP(2000000);
        System.out.println("Harga HP        :" +a.getHargaHP());
        
    
    
}
}
