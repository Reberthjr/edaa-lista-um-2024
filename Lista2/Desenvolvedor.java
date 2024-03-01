package Lista2;

public class Desenvolvedor extends Funcionario {




    public Desenvolvedor(String nome, Integer id, double salario) {
        super(nome, id, salario = 1000);
    }

    @Override
    public double calcularSalario() {
        double salarioBase = this.getSalario();
        double bonus = salarioBase * 0.10;
        double salarioTotal = salarioBase + bonus;
        return salarioTotal;
    }
    
    @Override
    public String toString(){
        return "Nome:"+ this.getNome()+
                "\nId:" + this.getId()+
                "\nSalario:" + this.calcularSalario();
    }
    
}
