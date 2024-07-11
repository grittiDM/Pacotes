public class SistemaIbege {
    public static void main(String[] args) {
        for (EstadoBrasileiro e : EstadoBrasileiro.values()) {
            System.out.println(e.getSigla() + " - " + e.getNome());
            System.out.println(e.getNomeMaiusculo());
            System.out.println(e.getNomeMinusculo());
            System.out.println(e.getIbge());
            System.out.println();
        }

        EstadoBrasileiro eb = EstadoBrasileiro.SAO_PAULO;

        System.out.println(eb.getNome());
        System.out.println(eb.getSigla());
        System.out.println(eb.getIbge());
        System.out.println(eb.getNomeMaiusculo());
        System.out.println(eb.getNomeMinusculo());
    }
}
