package api.conversordemoedas;


import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ConversorDeMoedas conversorDeMoedas = new ConversorDeMoedas();
        int opcao;

        do {
            System.out.println("++++++++++++++++++++++++++++++++++++++++++++");
            System.out.println("Seja bem-vindo ao Conversor de Moeda =]");
            System.out.println("++++++++++++++++++++++++++++++++++++++++++++");
            System.out.println("1) Dólar >>> Peso argentino");
            System.out.println("2) Peso argentino >>> Dólar");
            System.out.println("3) Dólar >>> Real brasileiro");
            System.out.println("4) Real brasileiro >>> Dólar");
            System.out.println("5) Dólar >>> Peso colombiano");
            System.out.println("6) Peso colombiano >>> Dólar");
            System.out.println("7) Sair");
            System.out.println("Escolha uma opção válida:");
            System.out.println("********************************************");

            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    converter(scanner, conversorDeMoedas, "USD", "ARS");
                    break;
                case 2:
                    converter(scanner, conversorDeMoedas, "ARS", "USD");
                    break;
                case 3:
                    converter(scanner, conversorDeMoedas, "USD", "BRL");
                    break;
                case 4:
                    converter(scanner, conversorDeMoedas, "BRL", "USD");
                    break;
                case 5:
                    converter(scanner, conversorDeMoedas, "USD", "COP");
                    break;
                case 6:
                    converter(scanner, conversorDeMoedas, "COP", "USD");
                    break;
                case 7:
                    System.out.println("Saindo... Até logo!");
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }

        } while (opcao != 7);

        scanner.close();
    }

    private static void converter(Scanner scanner, ConversorDeMoedas conversorDeMoedas, String moedaDe, String moedaPara) {
        System.out.printf("Informe o valor em %s que deseja converter para %s: ", moedaDe, moedaPara);
        double valor = scanner.nextDouble();

        double taxa = conversorDeMoedas.obterTaxaDeCambio(moedaDe, moedaPara);
        if (taxa == 0) {
            System.out.println("Não foi possível obter a taxa de câmbio.");
            return;
        }

        double convertido = valor * taxa;

        System.out.printf("%.2f %s equivale a %.2f %s%n", valor, moedaDe, convertido, moedaPara);
    }
}