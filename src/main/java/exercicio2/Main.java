package exercicio2;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        List<Integer> numerosApostados = numerosApostados(leitor);
        List<Integer> numerosSorteados = numerosSorteados();
        if (comparador(numerosApostados, numerosSorteados)){
            System.out.println("Parabéns, você ganhou!");
        } else {
            System.out.println("Que pena, quem sabe na próxima!");
        }
        leitor.close();
    }

    private static List<Integer> numerosSorteados(){
        Random sorteador = new Random();
        List<Integer> numeros = new ArrayList<>();
        Integer numeroSorteado = -1;
        while(numeros.size()<4) {
            numeroSorteado = sorteador.nextInt(21);
            if (!numeros.contains(numeroSorteado))
                numeros.add(numeroSorteado);
        }
        return numeros;
    }

    private static List<Integer> numerosApostados(Scanner leitor){
        List<Integer> numerosApostados = new ArrayList<>();
        System.out.println("Informe os 4 números nos quais deseja apostar:");
        Integer numeroLido;
        while (numerosApostados.size()<4) {
            numeroLido = leitor.nextInt();
            if (numeroLido >= 0 && numeroLido <= 20 && !numerosApostados.contains(numeroLido)) {
                numerosApostados.add(numeroLido);
            } else {
                System.out.println("Número inválido. Informe um número de 0 e 20 e no qual ainda não tenha apostado.");
            }
        }
        return numerosApostados;
    }

    private static boolean comparador(List<Integer> numerosApostados, List<Integer> numerosSorteados){
        System.out.println("Seus números da sorte são:");
        System.out.println(numerosApostados);
        System.out.println("Os números sorteados foram:");
        System.out.println(numerosSorteados);
        if (numerosSorteados.containsAll(numerosApostados)){
            return true;
        }
        return false;
    }


}
