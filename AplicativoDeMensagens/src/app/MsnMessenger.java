package app;

public class MsnMessenger extends ServicoDeMensagens{

    public void enviarMensagem() {
        validarConexaoInternet();
        System.out.println("Enviando mensagem pelo MSN Messenger");
        
    }

    public void receberMensagem() {
        System.out.println("Recebendo mensagem pelo MSN Messenger");
        
    }

    public void salvarHistoricoMensagem() {
        // TODO Auto-generated method stub
        
    }

}
