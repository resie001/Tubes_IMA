import java.util.Scanner;
import java.text.DecimalFormat;
public class English {
    public static void bhs_eng(){
        int choice,a,b,c,hasil;
        double hasil_2;
        DecimalFormat decimal=new DecimalFormat("#.##");
        Scanner tugas=new Scanner(System.in);
        Usaha usaha=new Usaha();
        Lingkaran lingkaran=new Lingkaran();
        Gerak_Parabola parabola=new Gerak_Parabola();
        Kalor kalor=new Kalor();
        do {
            System.out.println("1.  Formula for Calculating Work With First Way" + "\n2.  Formula for Calculating Work With Second Way" + "\n3.  Formula of Calculating Circumference of a Circle" +
                    "\n4.  Formula of Calculating Area of Circle" + "\n5.  Formula for Calculating x Axis Positon on Parabola Without Elevation Angle" +
                    "\n6.  Formula for Calculating x Axis Positon on Parabola With Elevation Angle" + "\n7.  Formula for Calculating Initial Speed y Axis" +
                    "\n8.  The Formula for Calculating x Axis Speed After a Certain Time With the First Way" + "\n9.  Formula for Calculating Heat Capacity With First Way"+
                    "\n10. Formula for Calculating Heat Capacity With Second Way"+"\n11. Formula for Calculating Heat Type"+"\n12. Change Language"+"\n13. Show Date and Time"+"\n14. Exit");
            System.out.print("Input Your Choice : "); choice = tugas.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Formula for Calculating Work With First Way");
                    System.out.println("Work = ( Mass / 2 ) * ( Initial Speed - Final Speed )");
                    System.out.print("Input Mass\t : "); a = tugas.nextInt();
                    System.out.print("Input Initial Speed\t : "); b = tugas.nextInt();
                    System.out.print("Input Final Speed\t : "); c = tugas.nextInt();
                    hasil = usaha.rumus_pertama(a, b, c);
                    System.out.println("Work = " + hasil + " Joule");
                    break;
                case 2:
                    System.out.println("Formula for Calculating Work With Second Way");
                    System.out.println("Work = Energy * Cos ( Elevation Angle ) * Distance");
                    System.out.print("Input Energy\t : "); a = tugas.nextInt();
                    System.out.print("Input Elevation Angle\t : "); b = tugas.nextInt();
                    System.out.print("Input Distance\t : "); c = tugas.nextInt();
                    hasil_2 = usaha.rumus_kedua(a, b, c);
                    System.out.println("Work = " +decimal.format(hasil_2 )+ " Joule");
                    break;
                case 3:
                    System.out.println("Formula of Circumference of a Circle");
                    System.out.println("Circumference of a Circle = 3.14 * Diameter");
                    System.out.print("Input Diameter\t : "); a = tugas.nextInt();
                    hasil_2 = lingkaran.keliling(a);
                    System.out.println("Circumference of a Circle = " + decimal.format(hasil_2 ));
                    break;
                case 4:
                    System.out.println("Formula of Area of Circle");
                    System.out.println("Area of Circle = 3.14 * Radius * Radius");
                    System.out.print("Input Radius\t : "); a = tugas.nextInt();
                    hasil_2 = lingkaran.luas(a);
                    System.out.println("Area of Circle = " + decimal.format(hasil_2  )+ " m");
                    break;
                case 5:
                    System.out.println("Formula for Calculating x Axis Positon on Parabola Without Elevation Angle");
                    System.out.println("x Axis Position = Initial Speed on x Axis * Height");
                    System.out.print("Input Initial Speed on x Axis\t : "); a = tugas.nextInt();
                    System.out.print("Input Height\t : "); b = tugas.nextInt();
                    hasil = parabola.sumbu_x(a, b);
                    System.out.println("x Axis Position = " + hasil + " m");
                    break;
                case 6:
                    System.out.println("Formula for Calculating x Axis Positon on Parabola With Elevation Angle");
                    System.out.println("x Axis Positon = Initial Speed x Axis * Cos( Elevation Angle ) * Height");
                    System.out.print("Input Initial Speed on x Axis\t : "); a = tugas.nextInt();
                    System.out.print("Input Elevation Angle\t : "); b = tugas.nextInt();
                    System.out.print("Input Height\t : "); c = tugas.nextInt();
                    hasil_2 = parabola.sumbu_x_sudut(a, b, c);
                    System.out.println("x Axis Position = " + decimal.format(hasil_2 ) + " m");
                    break;
                case 7:
                    System.out.println("Formula for Calculating Initial Speed y Axis");
                    System.out.println("Initial Speed y Axis = Initial Speed * Sin( Elevation Angle )");
                    System.out.print("Input Initial Speed\t : "); a = tugas.nextInt();
                    System.out.print("Input Elevation Angle\t : "); b = tugas.nextInt();
                    hasil_2 = parabola.kecepatan_awalY(a, b);
                    System.out.println("Initial Speed y Axis = "+ decimal.format(hasil_2 ) + " m/s");
                    break;
                case 8:
                    System.out.println("The Formula for Calculating x Axis Speed After a Certain Time With the First Way");
                    System.out.println("Speed in y axis = Initial Speed in y Axis - ( Earth's Gravitational Acceleration (10 m2/s) * Time )");
                    System.out.print("Input Initial Speed y Axis\t : "); a = tugas.nextInt();
                    System.out.print("Input Time\t : "); b = tugas.nextInt();
                    hasil = parabola.kecepatan_Y(a, b);
                    System.out.println("Speed in y axis = " + hasil + " m/s");
                    break;
                case 9:
                    System.out.println("Formula for Calculating Heat Capacity With First Way");
                    System.out.println("Heat Capacity = Mass of Objects * Heat Type * Total Temperature Change");
                    System.out.print("Input Mass of Objects\t : "); a = tugas.nextInt();
                    System.out.print("Input Heat Type\t : "); b = tugas.nextInt();
                    System.out.print("Input Total Temperature Change\t : "); c=tugas.nextInt();
                    hasil=kalor.kapasitas_kalor(a,b,c);
                    System.out.println("Heat Capacity = "+hasil+" Joule");
                    break;
                case 10:
                    System.out.println("Formula for Calculating Heat Capacity With Second Way");
                    System.out.println("Heat Capacity = Amounts of Heat / Total Temperature Change");
                    System.out.print("Input Amounts of Heat\t : "); a = tugas.nextInt();
                    System.out.print("Input Total Temperature Change\t : "); b = tugas.nextInt();
                    hasil=kalor.kapasitas_kalor2(a,b);
                    System.out.println("Heat Capacity = "+hasil+" Joule");
                    break;
                case 11:
                    System.out.println("Formula for Calculating Heat Type");
                    System.out.println("Heat Type = Heat Capacity / Mass of Objects * Total Temperature Change");
                    System.out.print("Input Heat Capacity\t : "); a = tugas.nextInt();
                    System.out.print("Input Mass of Objects\t : "); b = tugas.nextInt();
                    System.out.print("Input Total Temperature Change\t : "); c=tugas.nextInt();
                    hasil=kalor.kalor_jenis(a,b,c);
                    System.out.println("Heat Type = "+hasil+" J/kg^C");
                    break;
                case 12:
                    Pemilihan_Bahasa.pilih_bahasa();
                    break;
                case 13:
                    Tanggal_Waktu.panggil();
                    break;
                case 14:
                    System.out.println("Thank You For Use My Simple Application ^_^");
                    break;
                default:
                    System.out.println("Error!!!!!!!" + "\nYour Choice's is out of Data");
            }
            System.out.println();
        }while (choice != 14) ;
        System.exit(0);
    }
}