import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Problem6 {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String str1 = in.readLine();
        String str2 = in.readLine();

        ArrayList<Character> temp = new ArrayList<>();
        for(int i = 0; i<str1.length(); i++){
            for(int j = 0; j<str2.length(); j++){
                if(str1.charAt(i)==str2.charAt(j)){
                    temp.add(str1.charAt(i));
                }
            }
        }
        String hasil = str1+str2;

        for(Character i : temp){
            hasil = hasil.replace(String.valueOf(i), "");
        }
        System.out.println(hasil.length()+" # removing "+hasil);
    }
}
