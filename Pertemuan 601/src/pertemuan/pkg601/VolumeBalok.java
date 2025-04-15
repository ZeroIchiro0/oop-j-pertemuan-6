/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pertemuan.pkg601;

/**
 *
 * @author ZeroIchiro0
 * Selasa, 15 April 2025
 */
public class VolumeBalok {
    private int panjang,lebar,tinggi;
    private int hasil;
    
    public int volume(){
        this.hasil = panjang*lebar*tinggi;
                
        return hasil;          
    } 
    
    public void setpanjang(int pj){
        panjang = pj;
    }
    public void setlebar(int lb){
        lebar = lb;
    }
    public void settinggi(int ti){
        tinggi = ti;
    }
    
    public int getpanjang(){
        return panjang;
    }
    public int getlebar(){
        return lebar;
    }
    public int gettinggi(){
        return tinggi;
    }
    
}
