import java.util.Scanner;
public class Pemilihan_Bahasa {
    public static void pilih_bahasa(){
        Scanner tugas=new Scanner(System.in);
        String jawab;
        while(true) {
            System.out.print("Select Language ( English / Indonesian ) : "); jawab=tugas.next();
            if (jawab.equalsIgnoreCase("english")){
                System.out.println("Welcome To My Simple Application");
            } else if (jawab.equalsIgnoreCase("indonesian")){
                System.out.println("Selamat Datang Ke Aplikasi Sederhanaku");
            }
            System.out.println("==========================================");
            if (jawab.equalsIgnoreCase("english")){
                English.bhs_eng();
            } else if (jawab.equalsIgnoreCase("indonesian")){
                Indonesia.bhs_ind();
            } else {
                System.out.println("Error!!!!!!!"+"\nYour Choice's is out of Data");
            }
        }
    }
}
