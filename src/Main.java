// - new Scanner(System.in): cria um leitor de Entradas, com métodos úteis com prefixo "next";
// - System.out.println:.imprime um texto de Saída (Output) e pulando uma linha.  

import java.util.Scanner;

public class ClassificacaoCliente {
    public static void main(String[] args) {
        // Cria um objeto Scanner para leitura da entrada
        Scanner scanner = new Scanner(System.in);
        
        // Lê o saldo do cliente
        double saldo = scanner.nextDouble();
        
        // Classifica o cliente com base no saldo
        if (saldo < 0) {
            System.out.println("Negativado");
        } else if (saldo >= 0 && saldo <= 500) {
            System.out.println("Baixo");
        } else {
            System.out.println("Confortavel");
        }
        
        // Fecha o scanner
        scanner.close();
    }
}
