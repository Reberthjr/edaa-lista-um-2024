package Lista2.Atividade2;

public class Programa {
    public static void main(String[] args) {

        System.out.println("\n***********************  Telefone Basico  *************************\n");
        ModeloBasico celularBasico = new ModeloBasico();
        celularBasico.ligar();
        celularBasico.desligar();
        celularBasico.fazerLigacao("001852200");
        celularBasico.enviarMensagem("001852200", "Olá, tudo bem ?");


        System.out.println("\n***********************  Telefone Avançado  *************************\n");
        ModeloAvancado celularAvancado = new ModeloAvancado();
        celularAvancado.ligar();
        celularAvancado.ligar();
        celularAvancado.ligar();

        
        celularAvancado.desligar();
        celularAvancado.fazerLigacao("991852200");
        celularAvancado.fazerLigacao("001852200");
        celularAvancado.enviarMensagem("001852200", "Esse numero não existe!!!\n");
        System.out.println("\n=== Histórico do Modelo Avançado ===");
        celularAvancado.mostrarHistoricoLigacoes();
        celularAvancado.mostrarHistoricoMensagens();
        celularAvancado.mostrarHistoricoLigado();

    }
}
