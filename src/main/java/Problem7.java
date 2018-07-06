import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Problem7 {
    public static void main(String[] args) throws IOException{
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(in.readLine());
        ArrayList<String> nama = new ArrayList<>();

        for(int i=0; i<n ; i++){
            String perintah = in.readLine();
            String[] perintahPerKata = perintah.split(" ");

            if(perintahPerKata[0].equalsIgnoreCase("add")){
                nama.add(perintahPerKata[1]);
            }
            else if(perintahPerKata[0].equalsIgnoreCase("find")){
                String substr = perintahPerKata[1];
                int lengthSubstr = substr.length();
                int jumlah = 0;

                for(String namas : nama){
                    if(namas.substring(0, lengthSubstr).equals(substr)) {
                        System.out.println(namas);
                        jumlah++;
                    }
                }

                System.out.println(jumlah);
            }
        }
    }
}
