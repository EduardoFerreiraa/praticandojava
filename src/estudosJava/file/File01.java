package estudosJava.file;

import java.io.File;

public class File01 {
	public static void main(String[] args) {
		File arquivo = new File("exemplo.txt");
		
		if (arquivo.exists()) {
			System.out.println("O arquivo existe!");
		} else {
			System.out.println("O arquivo não existe!");
		}
		
	}
}
