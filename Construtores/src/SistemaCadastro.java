public class SistemaCadastro {
    public static void main(String[] args) {
        //criamos uma pessoa no sistema
        Pessoa pessoa = new Pessoa("Murilo", "84632145");

        //definimos o endereço dela
        pessoa.setEndereco("Rua das Flores");

        //imprimimos as informações
        System.out.println("Nome: " + pessoa.getNome() + " CPF: " + pessoa.getCpf() + " Endereço: " + pessoa.getEndereco());

    }
}
