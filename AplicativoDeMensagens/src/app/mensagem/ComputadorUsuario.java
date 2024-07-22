package app.mensagem;

public class ComputadorUsuario {
    public static void main(String[] args) {

        System.out.println("MSN Messenger");
        MsnMessenger msn = new MsnMessenger();
        msn.enviarMensagem();
        msn.receberMensagem();

        System.out.println("Facebook Messenger");
        FacebookMessenger fbm = new FacebookMessenger();
        fbm.enviarMensagem();
        fbm.receberMensagem();

        System.out.println("Telegram");
        Telegram tlg = new Telegram();
        tlg.enviarMensagem();
        tlg.receberMensagem();
    }
}
