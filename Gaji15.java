import java.util.Scanner;
public class Gaji15 {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);

        int jmlMasuk, JmlTdkMasuk, TotGaji, gaji, potGaji;

        System.out.println("Masukkan Gaji ");
        gaji=input.nextInt();
        System.out.println("Masukkan Jumlah Hari Masuk Kerja  ");
        jmlMasuk=input.nextInt();
        System.out.println("Masukkan Jumlah Hari Tidak Masuk Kerja  ");
        JmlTdkMasuk=input.nextInt();
        System.out.println("Masukkan potongan gaji  ");
        potGaji=input.nextInt();

        TotGaji=(jmlMasuk*gaji)-(JmlTdkMasuk*potGaji);

        System.out.println("Total Gaji yang diterima adalah " + TotGaji);
    }
}
