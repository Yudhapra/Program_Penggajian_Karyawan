package javaapplication1;
import java.util.Scanner;

/**
 *
 * @author Yudha Prasetyo
 */
public class Gaji2 {

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        String nama, gol;
        int jamker, gaji = 0, hasil, hasil0 = 40, hasil1, lembur = 50000;
        
        System.out.println("\n=========================================");
        System.out.println("##     Program Penggajian Karyawan     ##");
        System.out.println("=========================================");
        System.out.print("Nama Karyawan\t : ");
        nama = scan.nextLine();
        System.out.print("Golongan (A/B/C) : ");
        gol = scan.next();
        System.out.print("Jumlah Jam Kerja : ");
        jamker = scan.nextInt();
        System.out.println("_________________________________________");
        System.out.println("\n##-------- Total Rincian Honor --------##");
        
        switch (gol){
            case "A":
                gaji = 25000;
                break;
            case "B":
                gaji = 50000;
                break;
            case "C":
                gaji = 75000;
                break;
            default:
                break;
        }
        
        if (jamker <=40 ){
            hasil = jamker * gaji;
            System.out.println("Nama Karyawan\t : "+nama+"\nGolongan\t : "+gol+" (Rp. "+gaji+"/Jam)"
                    + "\nJumlah Jam Kerja : "+jamker+" Jam\n-----------------------------------------"
                            + "\nTotal Honor\t : Rp. "+hasil);
        }
        else {
            hasil1 = (jamker - hasil0) * lembur;
            hasil = hasil1 + (hasil0 * gaji);
            System.out.println("Nama Karyawan\t : "+nama+"\nGolongan\t : "+gol+" (Rp. "+gaji+"/Jam)"
                    + "\nJumlah Jam Kerja : "+jamker+" Jam\nJam Kerja Normal : "+hasil0+" Jam (Rp. "+(hasil0*gaji)+")"
                        + "\nJam Kerja Lembur : "+(jamker-hasil0)+" Jam (Rp. "+lembur+"/Jam)\n\t\t   ->(Rp. "+hasil1+")"
                            + "\n-----------------------------------------\nTotal Honor\t : Rp. "+hasil);
        }
        System.out.println("_________________________________________\n");
        System.out.println("Note :  Hanya Honor Mingguan,\n\tHonor Bulanan Coming Soon\n");
    }
}
