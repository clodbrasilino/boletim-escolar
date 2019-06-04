import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		double notas[][] = new double[5][7];
		String materias[] = new String[5];
		materias[0] = "Algoritmos 1";
		materias[1] = "Fundamentos ";
		materias[2] = "Ingles      ";
		materias[3] = "Hardware    ";
		materias[4] = "S.O.        ";
		
		final int algoritmos1 = 0;
		final int fundamentos = 1;
		final int ingles = 2;
		final int hardware = 3;
		final int so = 4;
		
		final int bimestral1 = 0;
		final int recuperacao1 = 1;
		final int bimestral2 = 2;
		final int recuperacao2 = 3;
		final int mediaSemestral = 4;
		final int exameFinal = 5;
		final int notaFinal = 6;
		
		
		
		while(true) {
			System.out.println();
			System.out.println(" --- BOLETIM ESCOLAR --- ");
			System.out.println(" 1 - Adicionar nota");
			System.out.println(" 2 - Imprimir boletim");
			System.out.println(" 3 - Sair");
			System.out.println();
			System.out.print(" Digite sua opção: ");
			String opcao = in.nextLine();
			// selecionar uma opcao
			switch(opcao) {
				case "1":
					// adicionar uma nota
					System.out.println();
					System.out.printf("%d - Algoritmos 1%n",algoritmos1);
					System.out.printf("%d - Fundamentos%n",fundamentos);
					System.out.printf("%d - Ingles%n",ingles);
					System.out.printf("%d - Hardware%n",hardware);
					System.out.printf("%d - Sistemas Operacionais%n",so);
					System.out.print("Selecione a disciplina: ");
					int disciplinaSelecionada = in.nextInt();
					in.nextLine();
					System.out.println();
					System.out.printf("%d - Bimestral 1%n",bimestral1);
					System.out.printf("%d - Recuperacao 1%n",recuperacao1);
					System.out.printf("%d - Bimestral 2%n",bimestral2);
					System.out.printf("%d - Recuperacao 2%n",recuperacao2);
					System.out.printf("%d - Exame Final%n",exameFinal);
					System.out.print("Selecione a nota: ");
					int avaliacaoSelecionada = in.nextInt();
					in.nextLine();
					System.out.println();
					System.out.print("Valor da nota: ");
					int valor = in.nextInt();
					in.nextLine();
					notas[disciplinaSelecionada][avaliacaoSelecionada] = valor;
					// Recalcular MS e MF
					// NB1 = maior(B1,R1), se B1 < 7. senão, B1
					// NB2 = maior(B2,R2), se B2 < 7. senão, B2
					// MS = media(NB1,NB2) = NB1 + NB2 / 2
					// MF = MS, se MS >=7. senão, ((MS*4)+(EF*6))/10
					break;
				case "2":
					// imprimir boletim
					System.out.println();
					System.out.println("Materia\t\tB1\tR1\tB2\tR2\tMS\tEF\tMF");
					for(int materia = 0; materia < 5; ++materia) {
						System.out.printf("%s\t",materias[materia]);
						for(int avaliacao = 0; avaliacao < 7; ++avaliacao) {
							System.out.printf("%.1f\t", notas[materia][avaliacao]);
						}
						System.out.println();
					}
					break;
				case "3":
					in.close();
					return;
				default:
					System.out.println();
					System.out.println(" Opção Inválida!");
			}
		}
	}
}
