package estudosJava.arquivosELeitura;

import java.io.FileWriter;
import java.io.IOException;

public class EscritaArquivo {
	public static void main(String[] args) {
		try {
			FileWriter escritor = new FileWriter("dados.txt");
			escritor.write("Olá! Essa é a primeira linha escrita no arquivo.\n");
			escritor.write("Aprendendo Java com arquivos!");
			escritor.close();
			
			System.out.println("Arquivo escrito com sucesso!");
		} catch (IOException e) {
			System.out.println("Ocorreu um erro ao escrever o arquivo.");
			e.printStackTrace();
		}
	}
}
