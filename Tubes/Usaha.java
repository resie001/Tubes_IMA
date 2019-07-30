public class Usaha {
    public int rumus_pertama(int a, int b, int c){ return a*(c-b)/2; }
    public double rumus_kedua(int a,int b, int c){
        double h_sudut=Math.cos(b);
        return a*h_sudut*c;
    }
}