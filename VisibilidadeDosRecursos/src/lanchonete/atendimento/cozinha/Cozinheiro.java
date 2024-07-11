package lanchonete.atendimento.cozinha;

import lanchonete.atendimento.Atendente;

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
    public void prepararLanche(){
        System.out.println("Preparando lanche");
    }
    public void prepararSuco(){
        System.out.println("Preparando suco");
    }
    public void prepararCombo(){
        prepararLanche();
        prepararSuco();
    }
    public void selecionarIngredientesLanche(){
        System.out.println("Selecionando ingredientes do lanche");
    }
    public void selecionarIngredientesSuco(){
        System.out.println("Selecionando ingredientes do suco");
    }
    public void lavarIngredientes(){
        System.out.println("Lavando ingredientes");
    }
    public void baterSucoLiquidificador(){
        System.out.println("Batendo suco no liquidificador");
    }
    public void fritarIngedientesLanche(){
        System.out.println("Fritando ingredientes do lanche");
    }
    public void pedirParaTrocarGas(Atendente meuAmigo) {
        meuAmigo.trocarGas();
    }
    public void pedirParaTrocarGas(Almoxarife meuAmigo) {
        meuAmigo.trocarGas();
    }
    public void pedirIngredientes(Almoxarife meuAmigo) {
        meuAmigo.entregarIngredientes();
    }
}
