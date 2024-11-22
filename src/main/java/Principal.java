// /**
//  * Classe para você testar suas implementações.
//  * Veja o README para mais detalhes.
//  */
// public class Principal {
//     public static void main(final String[] args) {

//     }
// }
public class Main {
    public static void main(String[] args) {

        CidadeRecord saoPaulo = new CidadeRecord("São Paulo");
        Cidade rioDeJaneiro = new Cidade("Rio de Janeiro");
        PessoaRecordShallow pessoa1 = new PessoaRecordShallow("Ariel", rioDeJaneiro);
        PessoaRecord pessoa2 = new PessoaRecord("Bela", saoPaulo  );

        // Alterando o nome da cidade de Ariel
        rioDeJaneiro.setNome("Rio"); // Isso afeta pessoa1, pois cidade é mutável

        // Tentando alterar a cidade de Bela (não é possível)
        // saoPaulo.setNome("São Paulo (SP)"); // Isso geraria um erro de compilação

        // Records: Uma forma concisa de definir classes que são principalmente dados.
        // São imutáveis por padrão e não requerem getters e setters explícitos.
        // Imutabilidade: Um objeto imutável não pode ser modificado após sua criação.
        // Isso significa que seus atributos não podem ser alterados.
        // Imutabilidade superficial (shallow immutability): O objeto em si é imutável,
        // mas ele pode conter referências a objetos mutáveis.
        // Imutabilidade profunda (deep immutability): O objeto em si é imutável
        // e todas as suas referências internas também são imutáveis.

    }
}
