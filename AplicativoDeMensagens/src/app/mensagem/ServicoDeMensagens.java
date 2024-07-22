package app.mensagem;

public class ServicoDeMensagens {
    public void enviarMensagem() {
        //primeiro confirmar há conexão com a internet
        validarConexaoInternet();
        System.out.println("Enviando mensagem");
        //depois salvar a mensagem no banco de dados (histórico)
        salvarMensagem();
    }

    public void receberMensagem() {
        System.out.println("Recebendo mensagem");
    }

    //métodos privados, visíveis apenas na classe
    private void validarConexaoInternet() {
        System.out.println("Validando conexão com a internet");
    }
    
    private void salvarMensagem() {
        System.out.println("Salvando mensagem no banco de dados");
    }
}
