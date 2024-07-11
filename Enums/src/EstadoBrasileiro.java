public enum EstadoBrasileiro {
    SAO_PAULO ("SP", "São Paulo", 11),
    RIO_JANEIRO ("RJ", "Rio de Janeiro", 12),
    PIAUI ("PI", "Piauí", 13),
    MARANHAO ("MA", "Maranhão", 14),
    CEARA ("CE", "Ceará", 15),
    RONDONIA ("RO", "Rondônia", 16),
    PARANA ("PR", "Paraná", 17),
    SANTA_CATARINA ("SC", "Santa Catarina", 18),
    ACRE ("AC", "Acre", 19);

    private String nome;
    private String sigla;
    private Integer ibge;

    private EstadoBrasileiro(String sigla, String nome, Integer ibge) {
        this.sigla = sigla;
        this.nome = nome;
        this.ibge = ibge;
    }

    public String getNome() {
        return nome;
    }

    public String getSigla() {
        return sigla;
    }

    public Integer getIbge() {
        return ibge;
    }

    public String getNomeMaiusculo() {
        return nome.toUpperCase();
    }

    public String getNomeMinusculo() {
        return nome.toLowerCase();
    }
}
