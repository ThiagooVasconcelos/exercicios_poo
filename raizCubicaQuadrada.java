import java.util.Locale;
import java.util.Scanner;

public class raizCubicaQuadrada {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        System.out.println("Digite o numero: ");
        double num = sc.nextDouble();

        if(num % 2 == 0) {
            System.out.println("Raiz cúbica de " + num + " é igual a " + (Math.cbrt(num)));
        }else {
            System.out.println("Raiz quadrada de " + num + " é igual a " + (Math.sqrt(num)));
        }

    }

}
