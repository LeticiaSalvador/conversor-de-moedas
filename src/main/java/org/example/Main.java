package org.example;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner leitura = new Scanner(System.in);
        ConsultaMoeda consulta = new ConsultaMoeda();
        Conversor conversor = new Conversor();

        int opcao = 0;

        while (opcao != 7) {

            System.out.println("""
                    
                    ------------------------
                    CONVERSOR DE MOEDAS
                    ------------------------
                    
                    1 - USD → BRL
                    2 - BRL → USD
                    3 - USD → ARS
                    4 - ARS → USD
                    5 - USD → COP
                    6 - COP → USD
                    7 - Sair
                    """);

            System.out.print("Escolha uma opção: ");
            opcao = leitura.nextInt();

            if (opcao == 7) {
                System.out.println("Encerrando programa...");
                break;
            }

            System.out.print("Digite o valor: ");
            double valor = leitura.nextDouble();

            String base = "";
            String destino = "";

            switch (opcao) {
                case 1 -> { base = "USD"; destino = "BRL"; }
                case 2 -> { base = "BRL"; destino = "USD"; }
                case 3 -> { base = "USD"; destino = "ARS"; }
                case 4 -> { base = "ARS"; destino = "USD"; }
                case 5 -> { base = "USD"; destino = "COP"; }
                case 6 -> { base = "COP"; destino = "USD"; }
                default -> {
                    System.out.println("Opção inválida!");
                    continue;
                }
            }

            double taxa = consulta.buscarTaxa(base, destino);
            double resultado = conversor.converter(valor, taxa);

            System.out.printf("Valor convertido: %.2f %s%n", resultado, destino);
        }

        leitura.close();
    }
}