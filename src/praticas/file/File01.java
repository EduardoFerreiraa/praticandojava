package praticas.file;

import java.io.File;

public class File01 {
	public static void main(String[] args) {
		File arquivo01 = new File("exemplo.txt");
		
		if (arquivo01.exists()) {
			System.out.println("O arquivo existe!");
		} else {
			System.out.println("O arquivo não existe!");
		}
	}
}
