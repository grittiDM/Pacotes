package app;

public class Telegram extends ServicoDeMensagens{

    public void enviarMensagem() {
        validarConexaoInternet();
        System.out.println("Enviando mensagem pelo Telegram");
        
    }

    public void receberMensagem() {
        System.out.println("Recebendo mensagem pelo Telegram");
        
    }

    public void salvarHistoricoMensagem() {
        // TODO Auto-generated method stub
        
    }

}
