import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;
public class Tanggal_Waktu {
    public static void panggil(){
        String pola_t ="EEEE, dd/MMMM/yyyy";
        String pola_w ="HH : mm : ss";
        Scanner tugas=new Scanner(System.in);
        Tanggal_Waktu tgl=new Tanggal_Waktu();
        Date date=new Date();
        System.out.print("Select Number Locale System : ( 1. Spanyol / 2. Brazil / 3. New Zealand ) : "); int negara=tugas.nextInt();
        System.out.println("Date : "+tgl.tanggal(date,pola_t,negara));
        System.out.println("TIme : "+tgl.waktu(pola_w));
    }
    public String tanggal(Date date, String pola_t, int jawab){
        String hasil_tanggal;
        SimpleDateFormat tanggal=null;
        switch (jawab){
            case 1:
                tanggal=new SimpleDateFormat(pola_t, new Locale("ca","ES"));
                break;
            case 2:
                tanggal=new SimpleDateFormat(pola_t, new Locale("pt","BR"));
                break;
            case 3:
                tanggal=new SimpleDateFormat(pola_t, new Locale("en","NZ"));
                break;
            default:
                System.out.println("Error!!!!!!!"+"\nYour Choice's is out of Data");
                break;
            }
        hasil_tanggal=tanggal.format(date);
        return hasil_tanggal;
        }
    public String waktu(String pola_w){
        Date Waktu=new Date();
        SimpleDateFormat waktu=new SimpleDateFormat(pola_w);
        return waktu.format(Waktu);
    }
}