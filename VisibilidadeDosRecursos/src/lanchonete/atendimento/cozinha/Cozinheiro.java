package lanchonete.atendimento.cozinha;

public class Cozinheiro {
    //pode ser default
    public void adicionarLancheNoBalcao() {
        System.out.println("Adicionando lanche no balcão");
    }
    //pode ser default
    public void adicionarSucoNoBalcao() {
        System.out.println("Adicionando suco no balcão");
    }
    //pode ser default
    public void adicionarComboNoBalcao() {
        adicionarLancheNoBalcao();
        adicionarSucoNoBalcao();
    }
    private void prepararLanche(){
        System.out.println("Preparando lanche");
    }
    private void prepararSuco(){
        System.out.println("Preparando suco");
    }
    private void prepararCombo(){
        prepararLanche();
        prepararSuco();
    }
    private void selecionarIngredientesLanche(){
        System.out.println("Selecionando ingredientes do lanche");
    }
    private void selecionarIngredientesSuco(){
        System.out.println("Selecionando ingredientes do suco");
    }
    private void lavarIngredientes(){
        System.out.println("Lavando ingredientes");
    }
    private void baterSucoLiquidificador(){
        System.out.println("Batendo suco no liquidificador");
    }
    private void fritarIngedientesLanche(){
        System.out.println("Fritando ingredientes do lanche");
    }
    void pedirParaTrocarGas(Almoxarife meuAmigo) {
        meuAmigo.trocarGas();
    }
    void pedirIngredientes(Almoxarife meuAmigo) {
        meuAmigo.entregarIngredientes();
    }
}
