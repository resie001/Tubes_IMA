public class Password {
    public String enkripsi(String pass) {
        int key=6;
        String[] huruf = new String[26];
        for (char a = 'a'; a <= 'z'; a++){
            huruf[a - 97] = String.valueOf(a);
        }
        String enkripsi = "";
        loop1:
        for (int a = 0; a < pass.length(); a++) {
            int index_plain = -1;
            for (int b = 0; b < huruf.length; b++) {
                index_plain = (String.valueOf(pass.charAt(a)).equals(huruf[b])) ? b : -1;
                if (index_plain != -1) {
                    enkripsi += huruf[(index_plain + key) % 26];
                    continue loop1;
                }
            }
            enkripsi += pass.charAt(a);
        }
        return enkripsi;
    }
}