package app.mensagem;

public class ComputadorUsuario {
    public static void main(String[] args) {
        MsnMessenger msn = new MsnMessenger();
        msn.enviarMensagem();
        msn.receberMensagem();

        FacebookMessenger fbm = new FacebookMessenger();
        fbm.enviarMensagem();
        fbm.receberMensagem();

        Telegram tlg = new Telegram();
        tlg.enviarMensagem();
        tlg.receberMensagem();
    }
}
