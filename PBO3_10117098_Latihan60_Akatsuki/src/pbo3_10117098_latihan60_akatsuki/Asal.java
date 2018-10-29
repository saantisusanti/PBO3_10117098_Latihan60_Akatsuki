/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo3_10117098_latihan60_akatsuki;

/**
 *
 * @author 
 * NAMA     : SANTI SUSANTI
 * KELAS    : PBO3
 * NIM      : 10117098
 * Deskripsi Program : program ini berisi program untuk menampilkan daftar tokoh
 *                     dan peran di akatsuki
 */
public class Asal extends Akatsuki {
    protected String asal;

    public String getAsal() {
        return asal;
    }

    public void setAsal(String asal) {
        this.asal = asal;
    }
    
    @Override
    public void tampilAkatsuki(){
        System.out.println("Asal : "+getAsal());
               
    } 
}
