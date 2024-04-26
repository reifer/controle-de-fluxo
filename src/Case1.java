import java.util.Locale;
import java.util.Scanner;

public class Case1 {
    public static void main(String[] args) {
        case1(2000.0, 1900.0);

        case1(2000.0, 2000.0);

        case1(1900.0, 2000.0);
        //double salarioBase = 2000;
        //Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        //System.out.println("Digite sua Pretensão Salarial: ");
        //double pretensaoSalarial = scanner.nextDouble();
    }

    static void case1(double salarioBase, double pretensaoSalarial) {
        if (salarioBase > pretensaoSalarial) {
            System.out.println("LIGAR PARA O CANDIDATO");
        } else if (salarioBase == pretensaoSalarial) {
            System.out.println("LIGAR PARA O CANDIDATO, COM CONTRA PROPOSTA");
        } else {
            System.out.println("AGUARDANDO RESULTADO DOS DEMAIS CANDIDATOS");
        }
    }
}
