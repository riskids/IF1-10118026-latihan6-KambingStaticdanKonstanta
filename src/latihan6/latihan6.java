/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihan6;

/**
 *
 * @author dwisr
 * NAMA      : RISKI DWI SABARIYANTO
 * KELAS     : IF -1 
 * NIM       : 10118026
 * Deskripsi : Program untuk belajar variabel statik dan konstanta
 * 
 */


public class latihan6 {
    public static int jumlahKambing;
    
   //nama_kambing sebagai konstanta
    public static final String nama_kambing = "UCOK";
    
    
    public static void main(String[] args) {
        // TODO code application logic here
        latihan6.jumlahKambing = 485000;
        System.out.println(nama_kambing+"memiliki kambing sebanyak " + latihan6.jumlahKambing);
    }
    
}
