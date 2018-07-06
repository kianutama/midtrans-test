import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Problem3 {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String input;

        while((input = in.readLine()) != null) {
            checker(input);
        }
    }

    public static String checker(String input){
        if(input.equals("-")) return("'-'");
        else if(input.equals("0")) return("'0'");
        else if(input.equals("62")) return("'62'");
        else if(input.equals("(null)")) return ("'(null)'");
        else {
            if (input.contains("+")) input = input.replace("+", "");
            if (input.contains("(")) input = input.replace("(", "");
            if (input.contains(")")) input = input.replace(")", "");
            if (input.contains("/")) input = input.replace("/", "");
            if (input.contains("-")) input = input.replace("-", "");
            if (input.contains("?")) input = input.replace("?", "");
            if (input.contains("*")) input = input.replace("*", "");
            if (input.contains(".")) input = input.replace(".", "");
            if (input.contains(" ")) input = input.replace(" ", "");


            if (input.substring(0,1).equals("0")) input = "62"+input.substring(1);
            if (input.substring(0,3).equals("620")) input = "62"+input.substring(3);
            return ("'" + input + "'");
        }
    }
}
