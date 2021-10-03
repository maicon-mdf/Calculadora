package cursojava.executavel;

import javax.swing.JOptionPane;

import cursojava.classes.Aluno;

public class primeiraClassejava {

	public static void main(String[] args) {
	
		/*New Aluno() é uma Estancia (Criação de Objeto)*/
		Aluno aluno1 = new Aluno(); /*maicon*/
	
		String nome = JOptionPane.showInputDialog("nome ");
		String idade = JOptionPane.showInputDialog("Idade");
		String data = JOptionPane.showInputDialog("Data de Nascimento");
		String rigistroGeral = JOptionPane.showInputDialog("Rg");
		String numeroCpf = JOptionPane.showInputDialog("CPF");
		String nomeMae = JOptionPane.showInputDialog("Afiliação Mãe");
		String nomePai = JOptionPane.showInputDialog("Afiliação Pai");
		String dataMatricula = JOptionPane.showInputDialog("data de Matricula");
		String nomeEscola = JOptionPane.showInputDialog("Universidade");
		
		String note1 = JOptionPane.showInputDialog("Nota 1");
		String note2 = JOptionPane.showInputDialog("Nota 2");
		String note3 = JOptionPane.showInputDialog("Nota 3");
		String note4 = JOptionPane.showInputDialog("Nota 4");

		
		
		
		
		
		aluno1.setNome(nome);
		aluno1.setIdade(Integer.valueOf(idade));
		aluno1.setDataNascimento(data);
		aluno1.setRegistroGeral(rigistroGeral);
		aluno1.setNumeroCpf(numeroCpf);
		aluno1.setNomeMae(nomeMae);
		aluno1.setNomePai(nomePai);
		aluno1.setDataMatricula(dataMatricula);
		aluno1.setNomeEscola(nomeEscola);
		
		aluno1.setNota1(Integer.valueOf(note1));
		aluno1.setNota2(Integer.valueOf(note2));
		aluno1.setNota3(Integer.valueOf(note3));
		aluno1.setNota4(Integer.valueOf(note4));
		
		
		
		  System.out.println("Nome: " + aluno1.getNome());
		  System.out.println("Idade: " + aluno1.getIdade());
		  System.out.println("Data de Nascimento: " + aluno1.getDataNascimento());
		  System.out.println("RG: " + aluno1.getRegistroGeral());
		  System.out.println("CPF: " + aluno1.getNumeroCpf());
		  System.out.println("Nome da Mãe: " + aluno1.getNomeMae());
		  System.out.println("Nome do Pai: " + aluno1.getNomePai());
		  System.out.println("Data da Matricula: " + aluno1.getDataMatricula());
		  System.out.println("Escola: " + aluno1.getNomeEscola());
		  System.out.println("A nota do aluno é: " + aluno1.getMediaNota());
		  System.out.println("Resultado: " + (aluno1.getAlunoAprovado() ? "Aprovado" : "Reprovado"));
		
		
		
		
		
	}

}
