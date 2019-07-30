import java.util.Scanner;
import java.text.DecimalFormat;
public class Indonesia {
    public static void bhs_ind(){
        int choice,a,b,c,hasil;
        double hasil_2;
        DecimalFormat decimal=new DecimalFormat("#.##");
        Scanner tugas=new Scanner(System.in);
        Usaha usaha=new Usaha();
        Lingkaran lingkaran=new Lingkaran();
        Gerak_Parabola parabola=new Gerak_Parabola();
        Kalor kalor=new Kalor();
        do {
            System.out.println("1.  Rumus Menghitung Usaha Dengan Cara Pertama" + "\n2.  Rumus Menghitung Usaha Dengan Cara Kedua" + "\n3.  Rumus Menghitung Keliling Lingkaran" +
                    "\n4.  Rumus Menghitung Keliling Lingkaran" + "\n5.  Rumus Menghitung Kedudukan x Pada Parabola Tanpa Besar Sudut" + "\n6.  Rumus Menghitung Kedudukan x Pada Parabola Dengan Besar Sudut" +
                    "\n7.  Rumus Menghitung Kecepatan Awal Sumbu y Pada Parabola" + "\n8.  Rumus Menghitung Kecepatan Sumbu y Pada Parabola Setelah Waktu Tertentu Dengan Cara Pertama" +
                    "\n9.  Rumus Menghitung Kapasitas Kalor Cara Pertama"+"\n10. Rumus Menghitung Kapasitas Kalor Cara Kedua"+"\n11. Rumus Menghitung Kalor Jenis"+
                    "\n12. Ganti Bahasa"+"\n13. Tampilkan Tanggal dan Waktu"+"\n14. Keluar");
            System.out.print("Masukkan Pilihan : "); choice = tugas.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Rumus Menghitung Usaha Dengan Cara Pertama");
                    System.out.println("Usaha = ( Massa / 2)* ( Kecepatan Akhir - Kecepatan Awal )");
                    System.out.print("Masukkan Massa\t : "); a = tugas.nextInt();
                    System.out.print("Masukkan Kecepatan Awal\t : "); b = tugas.nextInt();
                    System.out.print("Masukkan Kecepatan Akhir\t :"); c = tugas.nextInt();
                    hasil = usaha.rumus_pertama(a, b, c);
                    System.out.println("Usaha = " + hasil + " Joule");
                    break;
                case 2:
                    System.out.println("Rumus Menghitung Usaha Dengan Cara Kedua");
                    System.out.println("Usaha = Gaya *Cos ( Sudu t) * Jarak");
                    System.out.print("Masukkan Gaya\t : "); a = tugas.nextInt();
                    System.out.print("Masukkan Besar Sudut\t : "); b = tugas.nextInt();
                    System.out.print("Masukkan Jarak\t : "); c = tugas.nextInt();
                    hasil_2 = usaha.rumus_kedua(a, b, c);
                    System.out.println("Usaha = " + decimal.format(hasil_2 ) + " Joule");
                    break;
                case 3:
                    System.out.println("Rumus Menghitung Keliling Lingkaran");
                    System.out.println("Keliling Lingkaran = 3.14 * Diameter");
                    System.out.print("Masukkan Diameter\t : "); a = tugas.nextInt();
                    hasil_2 = lingkaran.keliling(a);
                    System.out.println("Keliling Lingkaran = " + decimal.format(hasil_2 )+" m");
                    break;
                case 4:
                    System.out.println("Rumus Menghitung Luas Lingkaran");
                    System.out.println("Luas Lingkaran = 3.14 * Jari-Jari * Jari - Jari");
                    System.out.print("Masukkan Jari-Jari\t : "); a = tugas.nextInt();
                    hasil_2 = lingkaran.luas(a);
                    System.out.println("Luas Lingkaran = " + decimal.format(hasil_2 ) + " m2");
                    break;
                case 5:
                    System.out.println("Rumus Menghitung Kedudukan x Pada Parabola Tanpa Besar Sudut");
                    System.out.println("Kedudukan x = Kecepatan Awal Sumbu x * Tinggi");
                    System.out.print("Masukkan Kecepatan Awal Sumbu x\t : "); a = tugas.nextInt();
                    System.out.print("Masukkan Tinggi\t : "); b = tugas.nextInt();
                    hasil = parabola.sumbu_x(a, b);
                    System.out.println("Kedudukan x = "+ hasil + " m");
                    break;
                case 6:
                    System.out.println("Rumus Menghitung Kedudukan x Pada Parabola Dengan Besar Sudut");
                    System.out.println("Kedudukan x = Kecepatan Awal Sumbu x * Cos ( Sudut ) * Tinggi");
                    System.out.print("Masukkan Kecepatan Awal Sumbu x\t : "); a = tugas.nextInt();
                    System.out.print("Masukkan Besar Sudut\t : "); b = tugas.nextInt();
                    System.out.print("Masukkan Tinggi\t : "); c = tugas.nextInt();
                    hasil_2 = parabola.sumbu_x_sudut(a, b, c);
                    System.out.println("Kedudukan x = " + decimal.format(hasil_2 ) + " m");
                    break;
                case 7:
                    System.out.println("Rumus Menghitung Kecepatan Awal Sumbu y Pada Parabola");
                    System.out.println("Kecepatan Awal Sumbu y  = Kecepatan Awal * Sin ( Sudut )");
                    System.out.print("Masukkan Kecepatan Awal\t : "); a = tugas.nextInt();
                    System.out.print("Masukkan Besar Sudut\t : "); b = tugas.nextInt();
                    hasil_2 = parabola.kecepatan_awalY(a, b);
                    System.out.println("Kecepatan Awal Sumbu y = " + decimal.format(hasil_2 ) + " m/s");
                    break;
                case 8:
                    System.out.println("Rumus Menghitung Kecepatan Sumbu y Pada Parabola Setelah Waktu Tertentu Dengan Cara Pertama");
                    System.out.println("Kecepatan Sumbu y = Kecepatan Awal Sumbu y - ( Percepataan Gravitasi Bumi (10 m2/s) ) * Waktu )");
                    System.out.print("Masukkan Kecepatan Awal Sumbu y\t : "); a = tugas.nextInt();
                    System.out.print("Masukkan Waktu\t : "); b = tugas.nextInt();
                    hasil = parabola.kecepatan_Y(a, b);
                    System.out.println("Kecepatan Sumbu y = " + hasil + " m/s");
                    break;
                case 9:
                    System.out.println("Rumus Menghitung Kapasitas Kalor Cara Pertama");
                    System.out.println("Kapasitas Kalor = Massa Benda * Kalor Jenis Zat * Total Perubahan Suhu");
                    System.out.print("Masukkan Massa Benda\t : "); a = tugas.nextInt();
                    System.out.print("Masukkan Kalor Jenis Zat\t : "); b = tugas.nextInt();
                    System.out.print("Masukkan Total Perubahan Suhu\t : "); c=tugas.nextInt();
                    hasil=kalor.kapasitas_kalor(a,b,c);
                    System.out.println("Kapasitas Kalor = "+hasil+" Joule");
                    break;
                case 10:
                    System.out.println("Rumus Menghitung Kapasitas Kalor Cara Kedua");
                    System.out.println("Kapasitas Kalor = Jumlah Kalor / Total Perubahan Suhu");
                    System.out.print("Masukkan Jumlah Kalor\t : "); a = tugas.nextInt();
                    System.out.print("Masukkan Total Perubahan Suhu\t : "); b = tugas.nextInt();
                    hasil=kalor.kapasitas_kalor2(a,b);
                    System.out.println("Kapasitas Kalor = "+hasil+" Joule");
                    break;
                case 11:
                    System.out.println("Rumus Menghitung Kalor Jenis");
                    System.out.println("Kalor Jenis = Kapasitas Kalor / Masssa Benda * Total Perubahan Suhu");
                    System.out.print("Masukkan Kapasitas Kalor\t : "); a = tugas.nextInt();
                    System.out.print("Masukkan Masssa Benda\t : "); b = tugas.nextInt();
                    System.out.print("Masukkan Total Perubahan Suhu\t : "); c=tugas.nextInt();
                    hasil=kalor.kalor_jenis(a,b,c);
                    System.out.println("Kalor Jenis = "+hasil+" J/kg^C");
                    break;
                case 12:
                    Pemilihan_Bahasa.pilih_bahasa();
                    break;
                case 13:
                    Tanggal_Waktu.panggil();
                    break;
                case 14:
                    System.out.println("Terima Kasih Telah Menggunakan Aplikasi Sederhana Saya ^_^");
                    break;
                default:
                    System.out.println("Error!!!!!!!" + "\nAnda Memasukkan Jawaban di Luar Data");
            }
            System.out.println();
        }while (choice != 14) ;
        System.exit(0);
    }
}