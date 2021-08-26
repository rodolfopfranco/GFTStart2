package exercicio3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        recebeDados(leitor);
        leitor.close();
    }

    private static void recebeDados(Scanner leitor){
        //Recebe os dados:
        System.out.println("Informe o número inicial:");
        int numeroInicial = leitor.nextInt();
        System.out.println("Informe o número final:");
        int numeroFinal = leitor.nextInt();
        //Verifica os dados:
        if (numeroFinal<numeroInicial){
            System.out.println("Número final maior que o inicial, não foi possível verificar os pares");
        } else {
            List<Integer> pares = verificaPares(numeroInicial,numeroFinal);
            imprimePares(pares);
        }
    }

    private static List<Integer> verificaPares(int numeroInicial, int numeroFinal){
        List<Integer> numerosPares = new ArrayList<>();
        for (int numeroAtual = numeroInicial; numeroAtual<=numeroFinal; numeroAtual++){
            if (numeroAtual%2 == 0)
                numerosPares.add(numeroAtual);
        }
        return numerosPares;
    }

    private static void imprimePares(List<Integer> numerosPares){
        int contador = 0;
        for(int par : numerosPares){
            System.out.print(par);
            contador++;
            if (contador<numerosPares.size()){
                System.out.print(" ");
            } else {
                System.out.println();
            }
        }
    }
}
