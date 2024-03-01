package aula2;

import java.util.ArrayList;
import java.util.List;

public class Empresa {
    private List<Funcionario> Funcionario;

    // Construtor
    public Empresa() {
        this.Funcionario = new ArrayList<>();
    }

    
    public void adicionarFuncionario(Funcionario funcionario) {
        Funcionario.add(funcionario);
    }

   
    public double calcularFolhaSalarial() {
        double total = 0;
        for (Funcionario f : Funcionario) {
            total += f.getSalarioTotal();
        }
        return total;
    }

    @Override
    public String toString() {
        return "\nEmpresa [Funcionario=" + Funcionario + "]";
    }
}