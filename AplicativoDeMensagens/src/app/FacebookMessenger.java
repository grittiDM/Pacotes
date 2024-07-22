package app;

public class FacebookMessenger extends ServicoDeMensagens {

    public void enviarMensagem() {
        validarConexaoInternet();
        System.out.println("Enviando mensagem pelo Facebook Messenger");
        
    }

    public void receberMensagem() {
        System.out.println("Recebendo mensagem pelo Facebook Messenger");
        
    }

    public void salvarHistoricoMensagem() {
        // TODO Auto-generated method stub
        
    }

}
