/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ukl_2;
import java.util.Scanner;
/**
 *
 * @author Aiman Yoviar
 */
public class Perpustakaan {
     public static void main(String[] args) {
        //pembuatanuntuk menangani input dari user
        Scanner input = new Scanner(System.in);
        
        //membuat variable utk mengondisikan program masih berjalan atau berhenti
        boolean stay = true;
        
        //pembuatan variabel utk menyimpan input user
        String key;
        
        //pembuatan object yg berisi daftar buku
        listBuku listBuku = new listBuku();
        
        //pembuatan object yg berisi daftar siswa
        listSiswa listSiswa = new listSiswa();
        
        //pembuatan object yg berisi daftar siswa
        listPetugas listPetugas = new listPetugas();
        
         //selama nilai "stay" = true maka program terus berjalan
        while (stay) {
            //tampilan menu
            System.out.println("----- Metic Library -----");
            System.out.println("1. List Buku");
            System.out.println("2. List Siswa");
            System.out.println("3. List Petugas");
            System.out.println("4. Transaksi");
            System.out.println("5. Pengembalian buku");
            System.out.println("6. Exit");
            
            System.out.print("Pilih menu: ");
            int menu = input.nextInt();
            
            if (menu == 1) {
                System.out.println("---------------------------");
                System.out.println("---------------------------\n");
                
                // menampilkan daftar buku
                listBuku.viewBuku();
                System.out.println("Press any key and enter...");
                key = input.next();
            } else if(menu == 2){
                System.out.println("---------------------------");
                System.out.println("---------------------------\n");
               
                //menampilkan daftar siswa
                listSiswa.viewSiswa();
                System.out.println("Press any key and enter...");
                key = input.next();
            } else if(menu == 3){
                System.out.println("---------------------------");
                System.out.println("---------------------------\n");
               
                //menampilkan daftar siswa
                listPetugas.viewPetugas();
                System.out.println("Press any key and enter...");
                key = input.next();
                
            } else if (menu == 4){
                System.out.println("---------------------------");
                System.out.println("---------------------------\n");
                System.out.println("--- Peminjaman Buku ---");
                 
            
                
                /** variabel "selectedIDSiswa" utk menyimpan data id siswa yg dipilih,
                 * variabel "selectedIDBuku" utk menyimpan data id buku yg dipilih
                 */
                int selectedIDSiswa, selectedIDBuku;
                
                System.out.print("Masukkan ID Siswa: ");
                selectedIDSiswa = input.nextInt();
                
                //"foundIndex" menyimpan posisi index dari data siswa yg dipilih
                int foundIndex = listSiswa.cariSiswa(selectedIDSiswa);
                
                //"selectedSiswa" menyimpan data client yg dipilih
                Siswa selectedSiswa = listSiswa.listSiswa[foundIndex];
                
                //Logika percabangan, jika true --> lanjut
                if (selectedSiswa.isStatus()) {
                    //proses perubahan status siswa
                    listSiswa.listSiswa[foundIndex].changeStatus();
                            
                    //menampilkan data buku
                    listBuku.viewBuku();

                    System.out.print("Pilih ID buku yang dipinjam: ");
                    selectedIDBuku = input.nextInt();
                    foundIndex = listBuku.cariBuku(selectedIDBuku);

                    //"selectedBuku" menyimpan data client yg dipilih
                    Buku selectedBuku = listBuku.listBuku[foundIndex];
                    
                    

                    System.out.println("--- List Peminjaman ---");
                    System.out.println("Judul Buku: " + selectedBuku.getJudulBuku());
                    System.out.println("Peminjam: " + selectedSiswa.getNama());
                    
                    //proses pengurangan stok
                    listBuku.listBuku[foundIndex].kurangiStok();
                    
                    
                } else {
                    System.out.println("Maaf anda masih punya tanggungan buku");
                }
                
                System.out.println("Press any key and enter...");
                key = input.next();
                
                
            } else if (menu == 5){
                System.out.println("---------------------------");
                System.out.println("---------------------------\n");
                System.out.println("--- Pengembalian Buku ---");
                
                int selectedIDSiswa, selectedIDBuku;
                
                System.out.print("Masukkan ID Siswa: ");
                selectedIDSiswa = input.nextInt();
                
                //"foundIndex" menyimpan posisi index dari data siswa yg dipilih
                int foundIndex = listSiswa.cariSiswa(selectedIDSiswa);
                
                //"selectedSiswa" menyimpan data client yg dipilih
                Siswa selectedSiswa = listSiswa.listSiswa[foundIndex];
                 
                //Logika percabangan, jika true --> lanjut
               if(selectedSiswa.isStatus()) {
                    //proses perubahan status siswa
                    listSiswa.listSiswa[foundIndex].changeStatus();
                    
                    listBuku.viewBuku();
                    //menampilkan data buku
                    
                    System.out.print("Pilih ID buku yang dikembalikan: ");
                    selectedIDBuku = input.nextInt();
                    foundIndex = listBuku.cariBuku(selectedIDBuku);
                    
                    
                    Buku selectedBuku = listBuku.listBuku[foundIndex];
                    

                    System.out.println("--- List Pengembalian ---");
                    System.out.println("Peminjam: " + selectedSiswa.getNama());
                    System.out.println("Judul Buku: " + selectedBuku.getJudulBuku());
                    
                    
                    //proses penambahan stok
                    listBuku.listBuku[foundIndex].tambahiStok();
                    
                    
                    }
                
               
                
            } else if(menu == 6){
                //variabel "stay" diset false menyebabkan program berhenti
                stay = false;
            }
        }
     }
     
     }
     
    


