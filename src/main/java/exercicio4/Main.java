package exercicio4;

public class Main {
    public static void main(String[] args) {
        //Construtor recebendo dados do funcionário:
        Funcionario funcionario = new Funcionario(1000.00,"Alex da Silva","12.345.678-9");
        //Definindo o percentual de aumento:
        funcionario.setPercentual(1.5);
        //Aplicando em 2019 o percentual ao salário inicial:
        funcionario.aplicaAumento();
        //Iterando os anos 2020 e 2021 para exibir o resultado:
        for (int ano = 2020; ano <= 2021; ano++){
            funcionario.setPercentual(funcionario.getPercentual()*2);
            funcionario.aplicaAumento();
        }
        System.out.println("Funcionário:");
        System.out.println("Nome: "+funcionario.getNome());
        System.out.println("RG: "+funcionario.getRg());
        System.out.println("Salário após aplicado o aumento do ano de 2021: "+funcionario.getSalario_total());
    }
}
