/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo3_10117109_latihan59_detectifconan;

/**
* Nama  : Stefanus Saputra
* NIM   : 10117109
* Kelas : IF 3
* Deskripsi Program : program ini berisi program untuk menampilkan tokoh tokoh
* dan peran dalam film Detektif Conan
 */
public class DetectifKecil extends Tokoh{
    
    public DetectifKecil(String nama, String peran) {
       super(nama,peran);
    }
  
    
    public void tampilDetectif(){
        
        DetectifKecil dk = new DetectifKecil("Conan Edogawa","Detectif Kecil");
        System.out.println(dk.peran);
        System.out.println("1. "+dk.nama);
        System.out.println("2. Ayumi Yoshida, teman dari "+dk.nama);
        System.out.println("3. Mitsuhiko Tsuburaya, teman Conan Edogawa yang"
                + " pintar dan juga penyuka teknologi ");
        System.out.println("4. Ai Haibara, seorang anggota Organisasi Berbaju"
                + " Hitam yang berkhianat pada organisasi tersebut");
        System.out.println("5. Genta Kojima, pendiri "+dk.peran);
        System.out.println("6. Sumiko Kobayashi, wali kelas Grup Detectif Kecil");
        System.out.println("7. Hiroshi Agasa, profesor linglung yang menemukan"
                + " beberapa perangkat untuk membantu Conan");
       

        
    }
}
