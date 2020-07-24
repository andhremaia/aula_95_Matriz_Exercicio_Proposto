package application;
import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);

		Scanner sc = new Scanner(System.in);

		int elemento; // numero a ser procurado na matriz
		int ocorrencia; // quantidade de vezes que o numero procurado aparece
		int row; // numero de linhas
		int column; // numero de colunas
		int matriz[][];// matriz a ser populada

		System.out.print("Entre com o numero de linhas ");
		row = sc.nextInt();

		System.out.print("Entre com o numero de colunas ");
		column = sc.nextInt();

		matriz = new int[row][column];

		preencheMatriz(matriz, row, column);
		imprimeMatriz(matriz, row, column);

		System.out.print("Digite um numero ");
		elemento = sc.nextInt();

		procuraElemento(matriz, row, column, elemento);

		System.out.print("Fim");

		sc.close();
	}

	public static void preencheMatriz(int matriz[][], int row, int column) {
		Scanner sc = new Scanner(System.in);
		int elemento;
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < column; j++) {
				matriz[i][j] = sc.nextInt();
			}
		}
	}

	public static void imprimeMatriz(int matriz[][], int row, int column) {
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < column; j++) {
				System.out.print(matriz[i][j] + " ");
			}
			System.out.println();
		}
	}

	public static int[] procura(int matriz[][], int row, int column, int elemento) {
		int ocorrencia = 0;
		int pos[] = new int[2];
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < column; j++) {
				if (matriz[i][j] == elemento) {
					pos[0] = elemento;
					pos[1] = row;
					pos[2] = column;
				}
				System.out.println();
			}
		}
		return pos;
	}

	public static void procuraElemento(int matriz[][], int row, int column, int elemento) {
		int ocorrencia = 0;
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < column; j++) {
				if (matriz[i][j] == elemento) {
					ocorrencia++;
					System.out.println("Ocorrencia #" + ocorrencia);
					System.out.println("Position of the element " + matriz[i][j] + " [" + i + j + "] ");
					if (i > 0)
						System.out.println("Elemento acima " + matriz[i - 1][j]);
					if (i < row - 1)
						System.out.println("Elemento abaixo " + matriz[i + 1][j]);
					if (j > 0)
						System.out.println("Elemento esquerda " + matriz[i][j - 1]);
					if (j < column - 1)
						System.out.println("Elemento direita " + matriz[i][j + 1]);
				}
				System.out.println();
			}
		}
		if (ocorrencia == 0) {
			System.out.println("Sem ocorrencias");
		}
	}
}

