package poo;

import java.util.ArrayList;
import java.util.List;

public class Aluno {
    final String nome; // Nome do aluno (imutável)
    final List<Curso> cursos = new ArrayList<>(); // Lista de cursos em que o aluno está matriculado
    
    // Construtor que inicializa o aluno com um nome
    Aluno(String nome) {
        this.nome = nome;
    }
    
    // Método que adiciona o curso à lista de cursos do aluno e também adiciona o aluno ao curso
    void adicionarCurso(Curso curso) {
        this.cursos.add(curso);
        curso.alunos.add(this);
    }
    
    // Método que retorna um curso pelo nome, caso o aluno esteja matriculado nele
    Curso getCursobyName(String nome) {
        for(Curso curso: this.cursos) {
            if(curso.nome.equalsIgnoreCase(nome)) { // Compara os nomes, ignorando letras maiúsculas/minúsculas
                return curso; // Retorna o curso encontrado
            }
        }
        return null; // Retorna null se não encontrar o curso
    }
    
    // Método toString para retornar o nome do aluno quando for impresso
    public String toString() {
        return nome;
    }
}
