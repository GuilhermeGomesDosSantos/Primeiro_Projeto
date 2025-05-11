package Desafio;

import java.util.Scanner;

public class Desafio {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);

        String nome = "Guilherme Gomes dos Santos";
        String tipoConta = "Corrente";
        double saldo = 2500;
        int opcao = 0;

        System.out.println("*****************************************" + '\n' +
                "Dados inciais do cliente:" + '\n');
        System.out.println("Nome:" + nome + '\n' +
                "Tipo conta: " + tipoConta + '\n' +
                "Saldo inicial: R$ " + String.format("%.2f", saldo));
        System.out.println("*****************************************");

        String menu = """
                *** Digite a sua opção ***
                
                Operações
                1 - Consultar saldos
                2 - Receber valor
                3 - Transferir valor
                4 - Sair"
                """;

        while (opcao != 4){
            System.out.println(menu);

            opcao = leitura.nextInt();

            if (opcao == 1 ) {
                System.out.println("O saldo atual é R$ "+saldo + '\n');

            } else if (opcao == 2) {
                System.out.println("Informe o valor a receber: ");
                double valorReceber = leitura.nextDouble();
                saldo += valorReceber;

                System.out.println("Saldo atualizado R$ " + saldo);
            } else if (opcao == 3 ) {
                System.out.println("Informe o valor que deseja transferir: ");
                double valorTransferir = leitura.nextDouble();

                if (valorTransferir > saldo){
                    System.out.println("Saldo insuficiente para transfêrencia");
                } else {
                    saldo -= valorTransferir;
                    System.out.println("Valor transferido com sucesso!" + '\n' +
                            "Novo saldo R$" + saldo);
                }

            } else if (opcao == 4) {
                System.out.println("Saindo...");
                break;
            } else {
                System.out.println("Opção inválida");
            }
        }
    }
}
