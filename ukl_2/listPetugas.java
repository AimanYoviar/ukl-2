/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ukl_2;

/**
 *
 * @author Aiman Yoviar
 */
public class listPetugas {
    Petugas[] listPetugas = {
        new Petugas(1, "Hari","Malang", "0812"),
        new Petugas(2, "Hira","Malang", "0813"),
        new Petugas(3, "Adi","Surabaya", "0843"),
        new Petugas(4, "Ida","Blitar", "0822"),
    };
    
    //method untuk menampilkan data list buku
    public void viewPetugas(){
        System.out.println("--- List Petugas ---");
        System.out.println("ID \t Nama \t\t Asal \t\t Telepon");
        for (int i = 0; i < listPetugas.length; i++) {
            System.out.println(listPetugas[i].getIdPetugas() + " \t " +
                    listPetugas[i].getNama() + " \t\t " +
                    listPetugas[i].getAlamat() + " \t\t " +
                    listPetugas[i].getTelepon());
        }
    }
    
    public int cariPetugas(int id){
        int found = 0;
        //pencarian data berdasarkan id
        for (int i = 0; i < listPetugas.length; i++) {
            if (listPetugas[i].getIdPetugas()== id) {
                found = i; 
                //menyimpan nilai index dari data yg ditemukan
            }
        }
        return found;        
    }
    

}
