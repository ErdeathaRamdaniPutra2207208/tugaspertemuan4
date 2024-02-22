/*Menentukan biaya parkir berdasarkan lama parkir yang dihitung berdasarkan selisih
jam masuk dan jam keluar (dengan ketentuan seperti soal no 1). Biaya parkir 2 jam
pertama 1500 dan perjam berikutnya 1000.*/

package tugaspertemuan4_genap;

import java.util.Scanner;

public class Nomor_3 {
    public static void main (String[] args){
        int masuk, keluar, biaya;
        Scanner inp = new Scanner(System.in);
        
        System.out.print("Masukan Jam masuk anda :");
        masuk = inp.nextInt();
        System.out.print("Masukan Jam keluar anda :");
        keluar = inp.nextInt();
        
        if(keluar<masuk){
            biaya = (keluar + 12) - masuk;
            if(biaya >2){
                biaya = 1500 + (1000 * (biaya-2));
            }else{
                biaya = 1500;
            }
        }else{
            biaya = keluar - masuk;
            if(biaya>2){
                biaya = 1500 + (1000 * (biaya-2));
            }else{
                biaya = 1500;
            }
        }
        
        System.out.println("Tarif parkir anda adalah " + biaya);
    }
}
