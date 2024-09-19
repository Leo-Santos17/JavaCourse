package poo;

import java.util.ArrayList;
import java.util.List;

public class Curso {
    final String nome; // Nome do curso (imutável)
    final List<Aluno> alunos = new ArrayList<>(); // Lista de alunos matriculados no curso
    
    // Construtor que inicializa o curso com um nome
    Curso(String nome) {
        this.nome = nome;
    }
    
    // Método que adiciona o aluno à lista de alunos do curso e o curso à lista de cursos do aluno
    void adicionarAluno(Aluno aluno) {
        this.alunos.add(aluno);
        aluno.cursos.add(this);
    }
}

