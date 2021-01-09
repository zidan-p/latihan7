
package latihanPBO;
import java.util.Scanner;   //mengimport scanner

public class latihan7 {


    public static void main(String[] args) {
        Scanner masukan = new Scanner(System.in); // membuat Scanner baru
        System.out.println("silahkan pilih angka 1 - 3 : "); // menampilkan kalimat
        int bil = masukan.nextInt(); //mendeklarasikan serta memberi nilai pada varibel
        switch (bil) { //menggunakan Switch untuk memperoleh opsi yang berniali bernar
            case 1 : System.out.println("satu"); //case 1 jika berniali bernar maka kode di dalamnya akan di jalankan
            break; //break agar kode di bawahnya ti iku di jalanakn
            case 2 : System.out.println("dua"); //case 1 jika berniali bernar maka kode di dalamnya akan di jalankan
            break; //break agar kode di bawahnya ti iku di jalanakn
            case 3 : System.out.println("tiga");    //case 1 jika berniali bernar maka kode di dalamnya akan di jalankan
            break; //break agar kode di bawahnya ti iku di jalanakan
        }
        
    
        
        
    }
    
}
