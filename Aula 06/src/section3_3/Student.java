package section3_3;

public class Student implements Comparable<Student>{

	
	private String nome;
	private String sobrenome; 
	private int nota;
	
	public Student(String nome, String sobrenome, int nota) {
		this.nome=nome;
		this.sobrenome=sobrenome;
		this.nota=nota;
		
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSobrenome() {
		return sobrenome;
	}

	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}

	public int getNota() {
		return nota;
	}

	public void setNota(int nota) {
		this.nota = nota;
	}

	@Override
	public String toString() {
		return "Detalhes do Estudante:\n"
				+ "nome=" + nome 
				+" "+ "sobrenome=" + sobrenome 
				+" "+ "nota=" + nota ;
	}

	@Override
	public int compareTo(Student stu) {
		if(Integer.valueOf(nota).compareTo(Integer.valueOf(stu.getNota())) <0) {
			return -1;
		}else if (Integer.valueOf(nota).compareTo(Integer.valueOf(stu.getNota()))>0) {
			return 1;
		}else {
			return 0;
		}
	}
	
}
