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
public class PBO3_10117109_Latihan59_DetectifConan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("==DAFTAR KARAKTER DETEKTIF CONAN==");
          System.out.println("");
                  
        TokohUtama tu = new TokohUtama("","");
        tu.tampilTokohUtama();
        System.out.println("");
        TokohPendukung tp = new TokohPendukung("","");
        tp.tampilTokohPendukung();
        System.out.println("");
        DetectifKecil dk = new DetectifKecil("","");
        dk.tampilDetectif();
       
    }
    }

