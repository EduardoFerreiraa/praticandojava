package estudosJava.file;

import java.io.File;

public class File02 {
	public static void main(String[] args) {
		File arquivo02 = new File("exemploo.txt");
		
		try {
			boolean criado = arquivo02.createNewFile();
			if(criado) {
				System.out.println("Arquivo criado com sucesso!");
			} else {
				System.out.println("Arquivo já existe");
			}
		} catch(Exception e) {
			System.out.println("Erro ao criar o arquivo" + e.getMessage());
		}
	}
}
