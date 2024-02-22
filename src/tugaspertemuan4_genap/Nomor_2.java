/*Buatlah algoritma dalam bahasa Java, yang menerima tiga buah angka masukan dan
menampilkan nilai yang paling besar dari ketiga masukan.*/

package tugaspertemuan4_genap;

import java.util.Scanner;

public class Nomor_2 {
    public static void main (String[] args){
        int bil[] = new int[3];
        Scanner inp = new Scanner(System.in);
        
        for(int i=0;i<3;i++){
            System.out.print("Masukan angka ke-"  + (i+1)  +" :");
            bil[i] = inp.nextInt();
        }
        
        if(bil[0]>bil[1] && bil[0]>bil[2]){
            System.out.println("Bilangan terbesar dari ke 3 bilangan yg di input adalah " + bil[0]);
        }else if(bil[1]>bil[0] && bil[1]>bil[2]){
            System.out.println("Bilangan terbesar dari ke 3 bilangan yg di input adalah " + bil[1]);
        }else if(bil[2]>bil[0] && bil[2]>bil[1]){
            System.out.println("Bilangan terbesar dari ke 3 bilangan yg di input adalah " + bil[2]); 
        }
    }
}
