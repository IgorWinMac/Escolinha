package principal;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entities.Aluno;

public class Program {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		Aluno aluno;

		List<Aluno> alunos = new ArrayList<>();

		int opcao = 0;

		do {
			aluno = new Aluno();
			
			System.out.println("Digite o nome:");
			String nome = entrada.nextLine();
			aluno.setNome(nome);

			System.out.println("Digite a serie: ");
			int serie = entrada.nextInt();
			aluno.setSerie(serie);
			
			aluno.pularLinha();
			System.out.println("Entre com as notas: ");
			
			System.out.println("Nota1:");
			double nota1 = entrada.nextDouble();
			aluno.setNota1(nota1);
			
			System.out.println("Nota2: ");
			double nota2 = entrada.nextDouble();
			aluno.setNota2(nota2);

			System.out.println("Nota3: ");
			double nota3 = entrada.nextDouble();
			aluno.setNota3(nota3);

			System.out.println("Nota4: ");
			double nota4 = entrada.nextDouble();
			aluno.setNota4(nota4);

			aluno.media(nota1, nota2, nota3, nota4);

			aluno.pularLinha();
			System.out.println("Deseja continuar? [1s]/[2n]");
			opcao = entrada.nextInt();
			
			entrada.nextLine();

			alunos.add(aluno);

		} while (opcao == 1);

		for (Aluno a : alunos) {
			System.out.println(a);
		}

		entrada.close();
	}

}
