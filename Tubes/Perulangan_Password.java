import java.util.Scanner;
public class Perulangan_Password {
    public static void ulang_pass(){
        Scanner tugas=new Scanner(System.in);
        String user,pass,enkripsi;
        System.out.println("Login System"+
                "\nPS : You will blocked from my Application if You enter wrong Username/Password until 3 times");
        for (int loop=3;loop>=0;loop--){
            System.out.print("Username : "); user=tugas.next();
            System.out.print("Password : "); pass=tugas.next();
            Password password=new Password();
            enkripsi=password.enkripsi(pass);
            if (user.equals("resie")&&enkripsi.equals("xgngea")){
                System.out.println("Username and Password Correct");
                break;
            } else {
                if (loop > 0) {
                    if (loop==1){
                        System.out.println("This is the last chance to enter Your Username/Password again, if You enter wrong again then You will blocked from my Application");
                    } else {
                        System.out.println("Username/Password incorrect, You have "+(loop-1)+" chance to enter Your Username and Password again");
                        if (loop==3){
                            System.out.println("Please to careful to enter Your Username/Password");
                        } else {
                            System.out.println("Please to check Your Username/Password again");
                        }
                    }
                } else if (loop==0){
                    System.out.println("You have been block from this application!!");
                    System.exit(0);
                }
            }
        }
    }
}
