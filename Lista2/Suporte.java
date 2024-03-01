package Lista2;

public class Suporte extends Funcionario {

    public Suporte(String nome, Integer id, double salario) {
        super(nome, id, salario);
    }

    @Override
    public double calcularSalario() {
        double salarioBase = this.getSalario();
        double bonus = salarioBase * 0.05;
        double salarioTotal = salarioBase + bonus;
        return salarioTotal;
    }
    
    @Override
    public String toString(){
        return "\nNome:"+ this.getNome()+
                "\nId:" + this.getId()+
                "\nSalario:" + this.calcularSalario();
    }
}
