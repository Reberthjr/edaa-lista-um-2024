package aula2;

public class Gerente extends Funcionario {

    public Gerente(String nome, Integer id, double salario) {
        super(nome, id,salario);
        
    }

    @Override
    public double calcularSalario() {
        double salarioBase = this.getSalario();
        double bonus = salarioBase * 0.20;
        double adicionalFixo = 1000.0;
        double salarioTotal = salarioBase + bonus + adicionalFixo;
        return salarioTotal;
    }

    @Override
    public String toString() {
        return "\nNome:" + this.getNome() +
                "\nId:" + this.getId() +
                "\nSalario:" + this.calcularSalario();
    }
}
