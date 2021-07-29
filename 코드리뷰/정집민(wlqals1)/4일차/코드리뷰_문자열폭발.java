import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String string = br.readLine();
        String exp = br.readLine();
        while (string.contains(exp)) {
            string = string.replaceAll(exp, "");
        }
        if (string.length() == 0) {
            System.out.println("FRULA");
        } else {
            System.out.println(string);
        }
    }
}
