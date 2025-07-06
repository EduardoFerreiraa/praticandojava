package estudosJava.file;

import java.io.File;

public class File03 {
	public static void main(String[] args) {
		File arquivo = new File("exemplo.txt");
		
		// Deletando arquivo
		
		if(arquivo.delete()) {
			System.out.println("Deletado com sucesso!");
		} else {
			System.out.println("Não foi deletado!");
		}
		
		// Verificando se o arquivo existe após tentar deletar
		
		if (arquivo.exists()) {
			System.out.println("Arquivo existe!");
		} else {
			System.out.println("Arquivo não existe.");
		}
		
	}
}
