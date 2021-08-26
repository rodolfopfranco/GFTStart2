package exercicio1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        boolean continuar = true;
        menu(leitor);
        while (continuar){
            continuar = menu(leitor);
        }
        leitor.close();
    }

    private static boolean menu(Scanner leitor){
        System.out.println("Escolha uma opção:");
        System.out.println("1 - Adição \n2 - Subtração \n3 - Multiplicação \n4 - Divisão \n5 - Sair");
        String opcao;
        opcao = leitor.nextLine();
        boolean continuar = gerenciador(opcao,leitor);
        return continuar;
    }

    private static boolean gerenciador(String opcao, Scanner leitor){
        double numero1;
        double numero2;
        switch(opcao){
            case("1"):
                System.out.println("Informe os 2 números a serem somados:");
                numero1 = leitor.nextDouble();
                numero2 = leitor.nextDouble();
                System.out.println(adicao(numero1,numero2));
                leitor.nextLine();
                return true;
            case("2"):
                System.out.println("Informe os 2 números a serem subtraídos:");
                numero1 = leitor.nextDouble();
                numero2 = leitor.nextDouble();
                leitor.nextLine();
                System.out.println(subtracao(numero1,numero2));
                return true;
            case("3"):
                System.out.println("Informe os 2 números a serem multiplicados:");
                numero1 = leitor.nextDouble();
                numero2 = leitor.nextDouble();
                leitor.nextLine();
                System.out.println(multiplicacao(numero1,numero2));
                return true;
            case("4"):
                System.out.println("Informe os 2 números a serem divididos:");
                numero1 = leitor.nextDouble();
                numero2 = leitor.nextDouble();
                leitor.nextLine();
                System.out.println(divisao(numero1,numero2));
                return true;
            case("5"):
                System.out.println("Até a próxima!");
                return false;
        }
        System.out.println("Opção inválida! Informe uma válida.");
        return true;
    }

    private static double adicao(double numero1, double numero2){
        return numero1+numero2;
    }

    private static double subtracao(double numero1, double numero2){
        return numero1-numero2;
    }

    private static double multiplicacao(double numero1, double numero2){
        return numero1*numero2;
    }

    private static double divisao(double numero1, double numero2){
        return numero1/numero2;
    }


}
