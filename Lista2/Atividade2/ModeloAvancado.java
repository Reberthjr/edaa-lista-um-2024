package Lista2.Atividade2;

import java.util.ArrayList;

class ModeloAvancado implements Celular {
    private ArrayList<String> historicoLigacoes = new ArrayList<>();
    private ArrayList<String> historicoMensagens = new ArrayList<>();
    private ArrayList<String> hitoricoLigar = new ArrayList<>();

    @Override
    public void ligar() {
        hitoricoLigar.add(null);
        System.out.println("Celular avançado ligado.");
    }

    @Override
    public void desligar() {
        System.out.println("Celular avançado desligado.");
    }

    @Override
    public void fazerLigacao(String numero) {
        historicoLigacoes.add(numero);
        System.out.println("Fazendo ligação para " + numero + " (Celular avançado)");
    }

    @Override
    public void enviarMensagem(String numero, String mensagem) {
        historicoMensagens.add("Para: " + numero + ", Mensagem: " + mensagem);
        System.out.println("Enviando mensagem para " + numero + ": " + mensagem + " (Celular avançado)");
    }

    public void mostrarHistoricoLigacoes() {
        System.out.println("Histórico de Ligações:");
        for (String ligacao : historicoLigacoes) {
            System.out.println("- " + ligacao);
        }
    }

    public void mostrarHistoricoMensagens() {
        System.out.println("Histórico de Mensagens:");
        for (String mensagem : historicoMensagens) {
            System.out.println("- " + mensagem);
        }
    }

    int i;
    public void mostrarHistoricoLigado(){
        System.out.println("Historico de Vezes Ligado:");
        int vezes = hitoricoLigar.size();
        for (i=0; i<vezes;i++){
        }
        System.out.printf("O telefone foi ligado %d Vezes\n",i);
    }


}
