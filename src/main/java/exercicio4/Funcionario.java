package exercicio4;

public class Funcionario extends Pessoa{
    private double salario_inicial;
    private double percentual;
    private double salario_total;

    public void aplicaAumento(){
        this.salario_total = this.salario_total*this.percentual;
    }

    public double getSalario_inicial() {
        return salario_inicial;
    }

    public double getPercentual() {
        return percentual;
    }

    public void setPercentual(double percentual) {
        this.percentual = percentual;
    }

    public double getSalario_total() {
        return salario_total;
    }

    public void setSalario_total(double salario_total) {
        this.salario_total = salario_total;
    }

    public Funcionario(double salario_inicial, String nome, String rg) {
        this.salario_inicial = salario_inicial;
        this.salario_total = salario_inicial;
        this.setNome(nome);
        this.setRg(rg);
    }
}
