// package exercicios;

// import io.github.manoelcampos.examcorrection.ClassTest;

// import java.util.Map;

// /**
//  * @author Manoel Campos
//  */
// class CidadeTest extends ClassTest {
//     CidadeTest() {
//         super(Map.of("nome", "String"));
//     }
// }
public class Cidade {
    private String nome;

    public Cidade(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String novoNome) {
        this.nome = novoNome;
    }
}
