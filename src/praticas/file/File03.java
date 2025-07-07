package praticas.file;

import java.io.File;

public class File03 {
	public static void main(String[] args) {
		File arquivo = new File("exemploo.txt");
		
		if(arquivo.delete()) {
			System.out.println("Arquivo deletado com sucesso!");
		} else {
			System.out.println("Arquivo não deletado");
		}
		
	}
}
