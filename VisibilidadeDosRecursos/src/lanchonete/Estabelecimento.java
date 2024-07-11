package lanchonete;

public class Estabelecimento {
    public static void main(String[] args) {
        Cozinheiro cozinheiro = new Cozinheiro();
        //ações que não precisam estarem disponíveis para toda aplicação
        cozinheiro.lavarIngredientes();
        cozinheiro.baterSucoLiquidificador();
        cozinheiro.selecionarIngredientesLanche();
        cozinheiro.selecionarIngredientesSuco();
        cozinheiro.prepararLanche();
        cozinheiro.prepararSuco();
        cozinheiro.fritarIngedientesLanche();

        //ações que o estabelecimento precisa ter ciência
        cozinheiro.adicionarComboNoBalcao();
        cozinheiro.adicionarSucoNoBalcao();
        cozinheiro.adicionarLancheNoBalcao();

        Almoxarife almoxarife = new Almoxarife();
        //ações que não precisam estarem disponíveis para toda aplicação
        almoxarife.controlarEntrada();
        almoxarife.controlarSaida();
        //ações que somente o seu pacote cozinha precisa saber
        almoxarife.trocarGas();
        almoxarife.entregarIngredientes();

        Atendente atendente = new Atendente();
        atendente.servindoMesa();
        atendente.receberPagamento();
        atendente.pegarLancheCozinha();
        //ação que somente o seu pacote cozinha precisa conhecer
        atendente.trocarGas();

        Cliente cliente = new Cliente();
        cliente.escolherLanche();
        cliente.fazerPedido();
        cliente.pagarConta();

        // não deveria, mas o estabelecimetno ainda não definiu normas de atendimento
        cliente.pegarPedidoBalcao();

        //esta ação é muito sigilosa, que tal ser privada?
        cliente.consultarSaldoAplicativo();

        //Já pensou os clientes ouvindo que acabou o gás?
        cozinheiro.pedirParaTrocarGas(atendente);
        cozinheiro.pedirParaTrocarGas(almoxarife);

    }
}
