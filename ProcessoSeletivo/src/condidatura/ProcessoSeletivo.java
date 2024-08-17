package condidatura;

import javax.swing.JOptionPane;

public class ProcessoSeletivo {

	public static void main(String[] args) {

		selecaoCandidatos();

	}

	public static void selecaoCandidatos() {
		double salario[] = new double[10];

		String candidatos[] = new String[10];

		String nome = "";
		String mensagem = "";

		String valorDigitado = "";

		int indice = 0;

		double salarioBase = 2000.00;

		while (!nome.equals("*")) {
			nome = JOptionPane.showInputDialog(null, "Informe o nome do candidato: Para cancelar digite '*' ");
			if (!nome.equals("*")) {
				candidatos[indice] = nome;

				valorDigitado = JOptionPane.showInputDialog(null, "Informe o salario pretendido: ");
				if (!valorDigitado.equals("0")) {
					salario[indice] = Integer.parseInt(valorDigitado);
				}
				indice++;
			} else if (nome.equals("*") && indice == 0) {
				candidatos = null;
				JOptionPane.showMessageDialog(null, "Processo Cancelado !!");
			}

		}

		if (candidatos != null) {
			for (int x = 0; x < candidatos.length; x++) {
				if (candidatos[x] != null) {
					if (!candidatos[x].equals("*")) {
						if (salarioBase > salario[x]) {
							mensagem = "Ligar para o condidato !! " + candidatos[x] + " Salário pretendido: "
									+ salario[x];
							JOptionPane.showMessageDialog(null, mensagem);
						} else if (salarioBase == salario[x]) {
							mensagem = "Ligar para candidato com contra proposta !! " + candidatos[x]
									+ " Salário pretendido: " + salario[x];
							JOptionPane.showMessageDialog(null, mensagem);
						} else {
							mensagem = "Aguardando demais candidatos!! " + candidatos[x] + " Salário pretendido: "
									+ salario[x];
							JOptionPane.showMessageDialog(null, mensagem);
						}

					} else {
						x = candidatos.length;
					}
				} else {
				   
					x = candidatos.length;
				}
			}
		}

		/*
		 * 
		 * while (!valorDigitado.equals("0")) { valorDigitado =
		 * JOptionPane.showInputDialog(null,
		 * "Informe o nome do candidato: Para cancelar digite '0' "); if
		 * (!valorDigitado.equals("0")) { salario[indice] =
		 * Integer.parseInt(valorDigitado); indice++; } }
		 * 
		 * for (int x = 0; x < salario.length; x++) { if(salario[x]!=0) {
		 * //JOptionPane.showMessageDialog(null, salario[x]);
		 * analisarCandidato(salario[x]); } else { break; }
		 * 
		 * }
		 */

		/*
		 * while (!nome.equals("*")) { nome = JOptionPane.showInputDialog(null,
		 * "Informe o nome do candidato: Para cancelar digite '0' "); if
		 * (!nome.equals("*")) { candidatos[indice] = nome; indice++; } }
		 * 
		 * for (int x = 0; x < candidatos.length; x++) { if(!candidatos[x].equals("*"))
		 * { JOptionPane.showMessageDialog(null, candidatos[x]); } else { x =
		 * candidatos.length; }
		 * 
		 * }
		 */

	}

	

}
