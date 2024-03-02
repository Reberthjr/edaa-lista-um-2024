package Lista2.Atividade2;

public class ModeloBasico implements Celular {
    

    @Override
    public void ligar() {
        System.out.println("Ligando Telefone Basico ...");
    }

    @Override
    public void desligar() {
        System.out.println("Desligando Telefone Basico ...'");
    }

    @Override
    public void fazerLigacao(String numero) {
        System.out.println("Fazendo Ligação para:" + numero + " usando celular Basico");
    }

    @Override
    public void enviarMensagem(String numero, String mensagem) {
        System.out.println("Enviando Mensgem para " + numero +": "+ mensagem);

    }

    
}
