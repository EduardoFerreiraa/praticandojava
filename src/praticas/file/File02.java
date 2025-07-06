package praticas.file;

import java.io.File;

public class File02 {
	public static void main(String[] args) {
		File arquivo = new File("exemplo.txt");
		
		// Criando o arquivo 
		try {
			boolean criado = arquivo.createNewFile();
			if(criado) {
				System.out.println("Arquivo criado com sucesso!");
			} else {
				System.out.println("Arquivo não foi criado.");
			}
		} catch (Exception e) {
			System.out.println("Erro ao criar arquivo: " + e.getMessage());
		}
	}
}
