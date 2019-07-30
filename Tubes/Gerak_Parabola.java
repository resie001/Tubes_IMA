public class Gerak_Parabola {
    public int sumbu_x(int a, int b){
        return a*b;
    }
    public double sumbu_x_sudut(int a, int b, int c){
        double h_sudut=Math.cos(b);
        return a*h_sudut*c;
    }
    public double kecepatan_awalY(int a, int b){
        double h_sudut=Math.sin(b);
        return a*h_sudut;
    }
    public int kecepatan_Y(int a, int b){ return a-(10*b); }
}