package entities;

public class Aluno {
	
	private String nome;
	private int serie;
	private double nota1, nota2, nota3, nota4;
	private double media;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getSerie() {
		return serie;
	}
	public void setSerie(int serie) {
		this.serie = serie;
	}
	public double getNota1() {
		return nota1;
	}
	public void setNota1(double nota1) {
		this.nota1 = nota1;
	}
	public double getNota2() {
		return nota2;
	}
	public void setNota2(double nota2) {
		this.nota2 = nota2;
	}
	public double getNota3() {
		return nota3;
	}
	public void setNota3(double nota3) {
		this.nota3 = nota3;
	}
	public double getNota4() {
		return nota4;
	}
	public void setNota4(double nota4) {
		this.nota4 = nota4;
	}
	public double getMedia() {
		return media;
	}
	public void setMedia(double media) {
		this.media = media;
	}
	
	public void pularLinha() {
		System.out.println();
	}
	
	public void media(double nota1, double nota2, double nota3, double nota4) {
		this.media = (nota1 + nota2 + nota3 + nota4) / 4;
		System.out.println(media);
		if(media >= 7) {
			System.out.println("Aprovado");
		}else if(media > 5 && media < 7) {
			System.out.println("Recuperação");
		}else {
			System.out.println("Reprovado");
		}
	}
	
	@Override
	public String toString() {
		return "Aluno [nome=" + nome + ", serie=" + serie + ", nota1=" + nota1 + ", nota2=" + nota2 + ", nota3=" + nota3
				+ ", nota4=" + nota4 + ", media=" + media + "]";
	}
	
	
	

}
