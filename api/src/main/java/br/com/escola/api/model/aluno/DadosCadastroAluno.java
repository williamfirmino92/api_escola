package br.com.escola.api.model.aluno;

public record DadosCadastroAluno(

        String id,
        String nome,
        String cpf,
        String email,
        String dataNascimento,
        String telefone,
        String curso,
        String endereco) {

}
