import java.util.Scanner;

public class HargaBayar15 {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);

        int harga, jumlah, jml_Halaman;
        double dis, total, bayar, jmlDis;
        String merk_buku;

        System.out.println("Masukkan merk buku yang anda beli ");
        merk_buku=input.nextLine();
        System.out.println("Masukkan Jumlah Halaman Buku yang dibeli ");
        jml_Halaman=input.nextInt();
        System.out.println("Masukkan harga buku yang dibeli ");
        harga=input.nextInt();
        System.out.println("Masukkan Jumlah buku yang dibeli ");
        jumlah=input.nextInt();
        System.out.println("Masukkan diskon yang tersedia ");
        dis=input.nextDouble();

        total=harga*jumlah;
        jmlDis=total*dis;
        bayar=total-jmlDis;

        System.out.println("Merk Buku yang anda beli adalah " + merk_buku);
        System.out.println("Jumlah Halaman Buku yang anda beli adalah " + jml_Halaman);
        System.out.println("Diskon yang anda dapatkan adalah " + jmlDis);
        System.out.println("Jumlah yang harus dibayar adalah " +bayar);

 
    }
}
