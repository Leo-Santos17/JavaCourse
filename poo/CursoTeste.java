package poo;

public class CursoTeste {
	public static void main(String[] args) {
	    // Criação de três objetos da classe Aluno com os nomes "João", "Maria" e "Pedro"
	    Aluno aluno1 = new Aluno("João");
	    Aluno aluno2 = new Aluno("Maria");
	    Aluno aluno3 = new Aluno("Pedro");
	    
	    // Criação de três objetos da classe Curso com os nomes "Java Completo", "Web 2023" e "React Native"
	    Curso curso1 = new Curso("Java Completo");
	    Curso curso2 = new Curso("Web 2023");
	    Curso curso3 = new Curso("React Native");
	    
	    // Adiciona os alunos "João" e "Maria" ao curso "Java Completo"
	    curso1.adicionarAluno(aluno1);
	    curso1.adicionarAluno(aluno2);
	    
	    // Adiciona os alunos "João" e "Pedro" ao curso "Web 2023"
	    curso2.adicionarAluno(aluno1);
	    curso2.adicionarAluno(aluno3);
	    
	    // Cada aluno é adicionado ao curso "React Native" usando o método `adicionarCurso`
	    aluno1.adicionarCurso(curso3);
	    aluno2.adicionarCurso(curso3);
	    aluno3.adicionarCurso(curso3);
	    
	    // Para cada aluno inscrito no curso1 (Java Completo), imprime o nome e uma mensagem
	    for(Aluno aluno: curso1.alunos) {
	        System.out.println("Estou matriculado no curso 1...");
	        System.out.println("e o meu nome é " + aluno.nome);
	        System.out.println();  // Quebra de linha para deixar a saída mais clara
	    }
	    
	    // Imprime a lista de alunos do primeiro curso do aluno1 (João)
	    System.out.println(aluno1.cursos.get(0).alunos);
	    
	    // Tenta encontrar o curso "Java Completo" para o aluno1, retornando-o se existir
	    aluno1.getCursobyName("Java Completo");
	    Curso cursoEncontrado = aluno1.getCursobyName("Java Completo");
	    
	    // Se o curso for encontrado, imprime o nome do curso e a lista de alunos matriculados
	    if(cursoEncontrado != null) {
	        System.out.println(cursoEncontrado.nome);
	        System.out.println(cursoEncontrado.alunos);
	    }
	}

}
