package app.mensagem;

import app.FacebookMessenger;
import app.MsnMessenger;
import app.ServicoDeMensagens;
import app.Telegram;

public class ComputadorUsuario {
    public static void main(String[] args) {
        ServicoDeMensagens sdm = null;
        /*
         * Não se sabe qual aplicativo será utilizado
         * Mas qualquer um que implemente a interface ServicoDeMensagens
         * poderá ser utilizado
         */
        String appEscolhido = "msn";

        if (appEscolhido.equals("msn"))
            sdm = new MsnMessenger();
        else if (appEscolhido.equals("fbm"))
            sdm = new FacebookMessenger();
        else if (appEscolhido.equals("tlg"))
            sdm = new Telegram();
        
        sdm.enviarMensagem();
        sdm.receberMensagem();
    }
}
