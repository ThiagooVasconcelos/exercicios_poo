import java.util.Locale;
import java.util.Scanner;

public class calculadora {

    public static void main(String[] args) {
        System.out.println("\n");
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        System.out.println("||||\n1-Soma\n2-Subtração\n3-Multiplicação\n4-Divisão\n5-Potenciação\n6-Raiz cúbica\n7-Raiz Quadrada");
        int operacao = sc.nextInt();
        sc.nextLine();

        if (operacao>=1 && operacao<=5) {
            System.out.println("Digite o número para iniciar operação: ");
            float numero1 = sc.nextFloat();
            System.out.println("Digite outro número para continuar a  operação: ");
            float numero2 = sc.nextFloat();
            if(numero2==0) {
                System.out.println("Digite outro número(divisor não pode ser 0): ");
                numero2 = sc.nextFloat();
            }
            switch(operacao) {
                case 1:
                    System.out.println("Soma = " + (numero1+ numero2));
                    break;
                case 2:
                    System.out.println("Subtração = " + (numero1 - numero2));
                    break;
                case 3:
                    System.out.println("Multiplicação = " + (numero1*numero2));
                    break;
                case 4:
                    System.out.println("Divisão = " + (numero1/numero2));
                    break;
                case 5:
                    System.out.println("Potenciação = " + (Math.pow(numero1, numero2)));
                    break;
            }
        }
        if(operacao==6) {
            System.out.println("Digite um número para descobrir raiz cúbica: ");
            float numero1 = sc.nextFloat();
            System.out.printf("A raiz cúbica de %.1f é igual a %.1f", numero1, Math.cbrt(numero1));
        }
        if(operacao==7) {
            System.out.println("Digite um número para descobrir raiz quadrada: ");
            float numero1 = sc.nextFloat();
            System.out.printf("A raiz cúbica de %.1f é igual a %.1f", numero1, Math.cbrt(numero1));
        }




    }

}