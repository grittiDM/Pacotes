package app;

public abstract class ServicoDeMensagens {
    public abstract void enviarMensagem();
    public abstract void receberMensagem();
    public abstract void salvarHistoricoMensagem();

    protected void validarConexaoInternet(){
        System.out.println("Validando conexão com a internet");
    }
}
