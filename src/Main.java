// - new Scanner(System.in): cria um leitor de Entradas, com métodos úteis com prefixo "next";
// - System.out.println:.imprime um texto de Saída (Output) e pulando uma linha.  
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        // Lê o saldo inicial
        double saldoInicial = scanner.nextDouble();
        
        // Lê as três transações em uma única linha
        double transacao1 = scanner.nextDouble();
        double transacao2 = scanner.nextDouble();
        double transacao3 = scanner.nextDouble();
        
        // Calcula o saldo final
        double saldoFinal = saldoInicial + transacao1 + transacao2 + transacao3;
        
        // Imprime o saldo final com duas casas decimais
        System.out.printf("%.2f%n", saldoFinal);
        
        scanner.close();
    }
}
