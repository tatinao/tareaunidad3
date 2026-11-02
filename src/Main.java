//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Arrays;

public class Main {
    public static boolean esAnagrama(String palabrita1,String palabra2) {
        palabrita1=palabrita1.toLowerCase();
        palabra2= palabra2.toLowerCase();
        if (palabrita1.length() != palabra2.length()) {
            return false;
        }
        char[] arreglo1 = palabrita1.toCharArray();
        char[] arreglo2 = palabra2.toCharArray();
        Arrays.sort(arreglo1);
        Arrays.sort(arreglo2);
        return Arrays.equals(arreglo1,arreglo2);
    }

    public static void main(String[] args) {
        System.out.println(esAnagrama("congreso", "sogrecon"));
    }
}

