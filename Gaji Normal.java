package javaapplication1;
import java.util.Scanner;
/**
 *
 * @author Yudha Prasetyo
 */
public class Gaji1 {

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        String nama;
        int jamker, hasil, hasil0 = 40, hasil1, gaji = 25000, lembur = 50000;
        
        System.out.println("\n=========================================");
        System.out.println("##     Program Penggajian Karyawan     ##");
        System.out.println("=========================================");
        System.out.print("Nama Karyawan\t : ");
        nama = scan.nextLine();
        System.out.print("Jumlah Jam Kerja : ");
        jamker = scan.nextInt();
        System.out.println("_________________________________________");
        System.out.println("\n##-------- Total Rincian Honor --------##");
        
        if (jamker <=40 ){
            hasil = jamker * 25000;
            System.out.println("Nama Karyawan\t : "+nama+"\nJumlah Jam Kerja : "+jamker+" Jam (Rp. "+gaji+"/Jam)\nTotal Honor\t : Rp. "+hasil);
        }
        else {
            hasil1 = (jamker - hasil0) * lembur;
            hasil = hasil1 + (hasil0 * gaji);
            System.out.println("Nama Karyawan\t : "+nama+"\nJumlah Jam Kerja : "+jamker+" Jam\nJam Kerja Normal : "+hasil0+" Jam (Rp. "+gaji+"/Jam)\n\t\t   ->(Rp. "
                    +(hasil0*gaji)+")\nJam Kerja Lembur : "+(jamker-hasil0)+" Jam (Rp. "+lembur+"/Jam)\n\t\t   ->(Rp. "+hasil1+")\nTotal Honor\t : Rp. "+hasil);
        }
        System.out.println("_________________________________________\n");
        System.out.println("Note :  Hanya Honor Mingguan,\n\tHonor Bulanan Coming Soon\n");
    }
}
