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
public class Petugas {
    private int idPetugas;
    private String nama, alamat, telepon;
   

    public Petugas(int idPetugas, String nama, String alamat, String telepon) {
        this.idPetugas = idPetugas;
        this.nama = nama;
        this.alamat = alamat;
        this.telepon = telepon;
        
    }

    //implementasi enkapsulasi dengan pembuatan method utk mengakses data private "idSiswa"
    public int getIdPetugas() {
        return idPetugas;
    }

    //implementasi enkapsulasi dengan pembuatan method utk mengakses data private "nama"
    public String getNama() {
        return nama;
    }

    //implementasi enkapsulasi dengan pembuatan method utk mengakses data private "alamat"
    public String getAlamat() {
        return alamat;
    }

    //implementasi enkapsulasi dengan pembuatan method utk mengakses data private "telepon"
    public String getTelepon() {
        return telepon;
    }
    
    //method untuk mengubah status peminjaman siswa
    
    //public void changeStatus(){
      //  this.status = !this.status;
    }

    //method untuk mendapatkan status peminjaman
    

    //implementasi enkapsulasi dengan pembuatan method utk mengakses data private "isStatus"
    
     

