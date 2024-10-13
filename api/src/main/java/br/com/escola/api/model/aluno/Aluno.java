package br.com.escola.api.model.aluno;

import jakarta.persistence.*;
import lombok.*;

@Getter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "alunos")
@EqualsAndHashCode(of = "id")
public class Aluno {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;

    private String cpf;

    private String email;

    private String dataNascimento;

    private String telefone;

    private String curso;

    private String endereco;

    public Aluno(DadosCadastroAluno dados) {
        this.nome = dados.nome();
        this.cpf = dados.cpf();
        this.email = dados.email();
        this.dataNascimento = dados.dataNascimento();
        this.telefone = dados.telefone();
        this.curso = dados.curso();
        this.endereco = dados.endereco();
    }

}
