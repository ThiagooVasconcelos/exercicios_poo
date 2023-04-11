import java.util.Locale;
import java.util.Scanner;

public class nomeSobrenome {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        System.out.println("Nome, Sobrenome: ");
        String nome = sc.next();
        String sobrenome = sc.next();


        switch(nome) {
            case "Thiago":
                System.out.println("Bem-vindo, thiago!!!");
                break;
        }

        switch (sobrenome) {
            case "Thiago":
                System.out.println("Acesso livre!!!");
                break;
            case "Maia":
                System.out.println("Vazaaaa!");
                break;
        }
        System.out.println("Pula fora!");

    }

}
