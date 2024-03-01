package aula2;



public class Aplicativo {
    public static void main(String[] args) {
        Desenvolvedor desenvolvedor = new Desenvolvedor("Augusto", 1234,Desenvolvedor.salario);

        // System.out.println(desenvolvedor);

        Gerente gerente = new  Gerente("Marcos", 54321, Gerente.salario);

        // System.out.println(gerente);

        Suporte suporte = new Suporte("Thiago", 67890, Suporte.salario);

        // System.out.println(suporte);


        Empresa empresa = new Empresa();

        empresa.adicionarFuncionario(desenvolvedor);
        empresa.adicionarFuncionario(gerente);
        empresa.adicionarFuncionario(suporte);

        System.out.println(empresa);
        System.out.println("Folha Salarial Total: R$ " + empresa.calcularFolhaSalarial());
    }
    
}


