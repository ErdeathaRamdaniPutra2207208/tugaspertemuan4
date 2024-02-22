/*Buatlah algoritma dalam bahasa Java, yang menerima masukan berupa 3 buah integer,
periksa apakah masukan adalah ribuan. */

package tugaspertemuan4_genap;

import java.util.Scanner;

public class Nomor_1 {

    public static void main(String[] args) {
        int[] bil =new int[3];
        Scanner inp = new Scanner(System.in);
        
        for(int i=0;i<3;i++){
            System.out.print("Masukan bilangan ke-"  + (i+1)  +" :");
            bil[i] = inp.nextInt();
        }
        
        for(int i=0;i<3;i++){
            if(bil[i]>=1000){
                System.out.println("Bilangan ke-" + (i+1) + " dengan value " +bil[i] + " adalah bilangan ribuan");
            }else{
                System.out.println("Bilangan ke-" + (i+1) + " dengan value " +bil[i] + " bukan bilangan ribuan");
            }
        }
            
    }
    
}
